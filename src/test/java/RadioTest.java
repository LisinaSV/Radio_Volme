package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldRadioStationNumberMax() {
        Radio cond = new Radio();

        cond.setCurrentRadioStationNumber(11);

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumberMin() {
        Radio cond = new Radio();

        cond.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseRadioStationNumber() {
        Radio cond = new Radio();
        cond.setCurrentRadioStationNumber(9);
        cond.increaseRadioStationNumber();
        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumberMin() {
        Radio cond = new Radio();
        cond.setCurrentRadioStationNumber(0);
        cond.increaseRadioStationNumber();
        int expected = 1;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceNumberRadioStation() {
        Radio cond = new Radio();
        cond.setCurrentRadioStationNumber(0);
        cond.reduceNumberRadioStation();
        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceNumberRadioStationMax() {
        Radio cond = new Radio();
        cond.setCurrentRadioStationNumber(9);
        cond.reduceNumberRadioStation();
        int expected = 8;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        cond.incurrentVolume();
        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncurrentVolumeMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.incurrentVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        cond.reduceVolume();
        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolMax() {
        Radio cond = new Radio();

        cond.setCurrentVolume(102);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolMin() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}


