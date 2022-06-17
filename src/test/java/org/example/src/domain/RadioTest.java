package org.example.src.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 0",
                    "1; 0",
                    "5; 4"
            }
            , delimiter = ';'
    )
    public void increaseMixStation(int stationNow, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(stationNow);

        radio.pressPrevStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "5; 6",
                    "8; 9",
                    "9; 0"
            }
            , delimiter = ';'
    )
    public void increaseMaxStation(int stationNow, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(stationNow);

        radio.pressNextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 0",
                    "1; 0",
                    "5; 4"
            }
            , delimiter = ';'
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
            value = {
                    "5; 6",
                    "9; 10",
                    "10; 0"
            }
            , delimiter = ';'
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
            value = {
                    "1; 1",
                    "5; 5",
                    "10; 10",
                    "11; 0",
                    "-1; 0"
            }
            , delimiter = ';'
    )
    public void intervalVolume(int soundVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(soundVolume);

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "1; 1",
                    "5; 5",
                    "9; 9",
                    "10; 0",
                    "-1; 0"
            }
            , delimiter = ';'
    )
    public void intervalStation(int stationNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(stationNumber);

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldSetStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(5);
//
//        int expected = 5;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void shouldSetToMaxStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldNotSetStationAboveMax() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(10);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetToMinStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(0);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldNotSetStationAboveMin() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
}



