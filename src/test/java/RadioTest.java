package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testRadioStationNumber() {
        Radio cond = new Radio(10);
        Assertions.assertEquals(10, cond.getMaxRadioStationNumber());
        Assertions.assertEquals(0, cond.getMinRadioStationNumber());
        Assertions.assertEquals(0, cond.getCurrentRadioStationNumber());
    }

    @Test
    public void BasicTestRadioStationNumber() {
        Radio cond = new Radio(10, 0, 0, 100);

        Assertions.assertEquals(10, cond.getMaxRadioStationNumber());
        Assertions.assertEquals(0, cond.getMinRadioStationNumber());
        Assertions.assertEquals(0, cond.getCurrentRadioStationNumber());
    }


    @Test
    public void shouldRadioStationNumberMax() {
        Radio cond = new Radio(11);
        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNumberMin() {
        Radio cond = new Radio(5);

        cond.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseRadioStationNumber() {
        Radio cond = new Radio(0);
        cond.getCurrentRadioStationNumber();
        cond.increaseRadioStationNumber();
        int expected = 0;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumberMin() {
        Radio cond = new Radio(1);

        cond.increaseRadioStationNumber();
        int expected = 1;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceNumberRadioStation() {
        Radio cond = new Radio(10);
        cond.setCurrentRadioStationNumber(10);
        cond.reduceNumberRadioStation();
        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceNumberRadioStationMax() {
        Radio cond = new Radio(10);
        cond.setCurrentRadioStationNumber(11);
        cond.reduceNumberRadioStation();
        int expected = 9;
        int actual = cond.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio cond = new Radio(100);
        Assertions.assertEquals(100, cond.getMaxVolume());
        Assertions.assertEquals(0, cond.getMinVolume());
        Assertions.assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    public void BasicTestVolume() {
        Radio cond = new Radio(10, 0, 0, 100);
        Assertions.assertEquals(100, cond.getMaxVolume());
        Assertions.assertEquals(0, cond.getMinVolume());
        Assertions.assertEquals(0, cond.getCurrentVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio cond = new Radio(100);
        cond.incurrentVolume();
        int expected = 100;
        int actual = cond.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio cond = new Radio(0);
        cond.incurrentVolume();
        int expected = 0;
        int actual = cond.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncurrentVolume() {
        Radio cond = new Radio(1);
        cond.setCurrentVolume(0);
        cond.incurrentVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncurrentVolumeMin() {
        Radio cond = new Radio(0);
        cond.setCurrentVolume(-1);
        cond.incurrentVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolume() {
        Radio cond = new Radio(0);
        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMax() {
        Radio cond = new Radio(100);
        cond.setCurrentVolume(100);
        cond.reduceVolume();
        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolMax() {
        Radio cond = new Radio(100);

        cond.setCurrentVolume(102);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void shouldVolMin() {
        Radio cond = new Radio(0);
        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}


