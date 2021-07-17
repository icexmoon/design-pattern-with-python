package xyz.icexmoon.beat_tool.model;

import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;
import javax.sound.sampled.Line;

import xyz.icexmoon.beat_tool.common.BPMObserver;
import xyz.icexmoon.beat_tool.common.BeatObserver;

public class BeatModel2 implements Runnable, BeatModelInterface {
    List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    public void init() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception ex) {
            System.out.println("Error: Can't load clip");
            System.out.println(ex);
        }
    }

    public void on() {
        bpm = 90;
        // notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    public void off() {
        stopBeat();
        stop = true;
    }

    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBPM());
            } catch (Exception e) {
            }
        }
    }

    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    public int getBPM() {
        return bpm;
    }

    public void notifyBeatObservers() {
        for (int i = 0; i < beatObservers.size(); i++) {
            BeatObserver observer = (BeatObserver) beatObservers.get(i);
            observer.notifyObserver();
        }
    }

    public void notifyBPMObservers() {
        for (int i = 0; i < bpmObservers.size(); i++) {
            BPMObserver observer = (BPMObserver) bpmObservers.get(i);
            observer.notifyObserver();
        }
    }

    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    public void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }

    @Override
    public void registeObserver(BeatObserver observer) {
        this.beatObservers.add(observer);
    }

    @Override
    public void registeObserver(BPMObserver observer) {
        this.bpmObservers.add(observer);
    }
}
