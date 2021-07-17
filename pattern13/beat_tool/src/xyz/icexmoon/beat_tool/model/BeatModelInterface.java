package xyz.icexmoon.beat_tool.model;

import xyz.icexmoon.beat_tool.common.BPMObserver;
import xyz.icexmoon.beat_tool.common.BeatObserver;

public interface BeatModelInterface {
    public void init();

    public void on();

    public void off();

    public void setBPM(int bpm);

    public int getBPM();

    public void registeObserver(BeatObserver observer);

    public void registeObserver(BPMObserver observer);

    public void removeObserver(BeatObserver observer);

    public void removeObserver(BPMObserver observer);
}
