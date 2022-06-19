//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.src.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    public RadioTest() {
    }

    @ParameterizedTest
    @CsvSource(
            value = {"9; 0; 9", "9; 1; 0", "9; 5; 4"},
            delimiter = ';'
    )
    public void increaseMixStation(int pastStation, int stationNow, int expected) {
        Radio radio = new Radio(pastStation);
        radio.setCurrentStation(stationNow);
        radio.pressPrevStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"9; 5; 6", "9; 8; 9", "9; 9; 0"},
            delimiter = ';'
    )
    public void increaseMaxStation(int pastStation, int stationNow, int expected) {
        Radio radio = new Radio(pastStation);
        radio.setCurrentStation(stationNow);
        radio.pressNextStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"0; 0", "1; 0", "5; 4"},
            delimiter = ';'
    )
    public void increaseMinVolume(int volumeNow, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volumeNow);
        radio.downgradeVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"5; 6", "99; 100", "100; 0"},
            delimiter = ';'
    )
    public void increaseMaxVolume(int volumeNow, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volumeNow);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"1; 1", "5; 5", "10; 10", "101; 0", "-1; 0"},
            delimiter = ';'
    )
    public void intervalVolume(int soundVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(soundVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"9; 1; 1", "9; 5; 5", "9; 9; 9", "9; 10; 0", "9; 0; 0", "9; -1; 0"},
            delimiter = ';'
    )
    public void intervalStation(int pastStation, int stationNumber, int expected) {
        Radio radio = new Radio(pastStation);
        radio.setCurrentStation(stationNumber);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
