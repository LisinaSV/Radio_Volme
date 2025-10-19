package ru.netology.stats;

public class Radio {

    private int maxRadioStationNumber = 10;
    private int minRadioStationNumber = 0;
    private int currentRadioStationNumber = minRadioStationNumber;
    private int maxVolume = 1_00;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int maxRadioStationNumber, int minRadioStationNumber, int minVolume, int maxVolume) {
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.minRadioStationNumber = minRadioStationNumber;
        this.currentRadioStationNumber = minRadioStationNumber;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int size) {
        maxRadioStationNumber = minRadioStationNumber + size;
        maxVolume = minVolume + size;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void increaseRadioStationNumber() {
        int next = currentRadioStationNumber;
        if (next >= maxRadioStationNumber) {
            setCurrentRadioStationNumber(0);
        } else {
            setCurrentRadioStationNumber(next + 1);
        }
    }

    public void reduceNumberRadioStation() {
        int prev = currentRadioStationNumber;
        if (prev <= minRadioStationNumber) {
            setCurrentRadioStationNumber(9);
        } else {
            setCurrentRadioStationNumber(prev - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void incurrentVolume() {
        int sound = currentVolume;//0
        if (sound >= maxVolume) {
            setCurrentVolume(0);
        } else {
            setCurrentVolume(sound + 1);
        }
    }

    public void reduceVolume() {
        int vol = currentVolume;
        if (vol <= minVolume) {
            setCurrentVolume(100);
        } else {
            setCurrentVolume(vol - 1);
        }
    }
}
