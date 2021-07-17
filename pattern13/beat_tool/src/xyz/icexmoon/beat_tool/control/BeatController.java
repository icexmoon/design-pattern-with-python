package xyz.icexmoon.beat_tool.control;

import xyz.icexmoon.beat_tool.model.BeatModelInterface;
import xyz.icexmoon.beat_tool.view.DJView;

public class BeatController implements ControllerInterface {

    private BeatModelInterface model;
    private DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.init();
    }

    @Override
    public void start() {
        model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

}
