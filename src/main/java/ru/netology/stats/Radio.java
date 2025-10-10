package ru.netology.stats;

public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;

    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 10) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void increaseRadioStationNumber() {
        int next = currentRadioStationNumber;
        if (next >= 9) {
            setCurrentRadioStationNumber(0);
        } else {
            setCurrentRadioStationNumber(next + 1);
        }
    }

    public void reduceNumberRadioStation() {
        int prev = currentRadioStationNumber;
        if (prev <= 0) {
            setCurrentRadioStationNumber(9);
        } else {
            setCurrentRadioStationNumber(prev - 1);
        }
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void incurrentVolume() {
        int sound = currentVolume;
        if (sound >= 100) {
            setCurrentVolume(100);
        } else {
            setCurrentVolume(sound + 1);
        }
    }

    public void reduceVolume() {
        int vol = currentVolume;
        if (vol <= 0) {
            setCurrentVolume(0);
        } else {
            setCurrentVolume(vol - 1);
        }


    }

}

