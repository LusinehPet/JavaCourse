package com.company.Homework8.Problem21;

public class TV {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOnOrOffTheTv() {
        on = !on;
    }

    public void increaseVolume() {
        volumeLevel++;
    }

    public void decreaseVolume() {
        volumeLevel--;
    }

    public void changeChannel(int channelNumber) {
        channel = channelNumber;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isOn() {
        return on;
    }
}
