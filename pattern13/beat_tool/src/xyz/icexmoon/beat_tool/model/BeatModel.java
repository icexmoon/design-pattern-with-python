package xyz.icexmoon.beat_tool.model;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import xyz.icexmoon.beat_tool.common.BPMObserver;
import xyz.icexmoon.beat_tool.common.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    private Sequencer sequencer;
    private List<BPMObserver> bpmObservers = new ArrayList<>();
    private List<BeatObserver> beatObservers = new ArrayList<>();
    private int bpm = 90;
    private Sequence sequence;
    private Track track;

    @Override
    public void init() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();

    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registeObserver(BeatObserver observer) {
        this.beatObservers.add(observer);
    }

    @Override
    public void registeObserver(BPMObserver observer) {
        this.bpmObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        this.beatObservers.remove(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        this.bpmObservers.remove(observer);
    }

    private void beatEvent(){
        notifyBeatObservers();
    }

    @Override
    public void meta(MetaMessage meta) {
        if(meta.getType() == 47){
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = { 35, 0, 46, 0 };
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        makeTracks(trackList);
        track.add(makeEnvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEnvent(144, 9, key, 100, 1));
                track.add(makeEnvent(128, 9, key, 100, i + 1));
            }
        }
    }

    public MidiEvent makeEnvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        ShortMessage shortMessage = new ShortMessage();
        try {
            shortMessage.setMessage(comd, chan, one, two);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        event = new MidiEvent(shortMessage, tick);
        return event;
    }

    public void notifyBPMObservers(){
        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.notifyObserver();
        }
    }

    public void notifyBeatObservers(){
        for (BeatObserver beatObserver : beatObservers) {
            beatObserver.notifyObserver();
        }
    }

}
