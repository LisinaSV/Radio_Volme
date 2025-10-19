package ru.netology.stats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int maxRadioStationNumber = 10;
    private int minRadioStationNumber = 0;
    private int currentRadioStationNumber = minRadioStationNumber;
    private int maxVolume = 1_00;
    private int minVolume = 0;
    private int currentVolume = minVolume;

}