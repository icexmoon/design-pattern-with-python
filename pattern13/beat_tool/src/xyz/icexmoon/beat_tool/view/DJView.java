package xyz.icexmoon.beat_tool.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import xyz.icexmoon.beat_tool.common.BPMObserver;
import xyz.icexmoon.beat_tool.common.BeatObserver;
import xyz.icexmoon.beat_tool.control.ControllerInterface;
import xyz.icexmoon.beat_tool.model.BeatModelInterface;

public class DJView implements ActionListener {
    DJBeatObserver beatObserver = new DJBeatObserver();
    DJBPMObserver bpmobserver = new DJBPMObserver();
    private BeatModelInterface model;
    private ControllerInterface controller;
    private JPanel viewPanel;
    private JFrame viewFrame;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;
    private JFrame controlFrame;
    private JPanel controlPanel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;
    private JTextField bpmTextField;
    private JLabel bpmLabel;
    private JButton setBPMButton;
    private JButton increaseBPMButton;
    private JButton decreaseBPMButton;

    public DJView(ControllerInterface controllerInterface, BeatModelInterface beatModelInterface) {
        this.controller = controllerInterface;
        this.model = beatModelInterface;
        beatModelInterface.registeObserver(beatObserver);
        beatModelInterface.registeObserver(bpmobserver);
    }

    public void createView() {
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));
        controlPanel = new JPanel(new GridLayout(1, 2));
        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener((event) -> controller.start());
        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener((event) -> controller.stop());
        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener((event) -> System.exit(0));

        menu.add(exit);
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10, 40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);
        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    class DJBeatObserver implements BeatObserver {

        @Override
        public void notifyObserver() {
            if (beatBar != null) {
                beatBar.setValue(100);
           }
        }

    }

    class DJBPMObserver implements BPMObserver {

        @Override
        public void notifyObserver() {
            if (model != null) {
                int bpm = model.getBPM();
                if (bpm == 0) {
                    if (bpmOutputLabel != null) {
                        bpmOutputLabel.setText("offline");
                    }
                } else {
                    if (bpmOutputLabel != null) {
                        bpmOutputLabel.setText("Current BPM: " + model.getBPM());
                    }
                }
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = 90;
            String bpmText = bpmTextField.getText();
            if (bpmText == null || bpmText.contentEquals("")) {
                bpm = 90;
            } else {
                bpm = Integer.parseInt(bpmTextField.getText());
            }
            controller.setBPM(bpm);
        } else if (event.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }

}
