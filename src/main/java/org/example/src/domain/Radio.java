package org.example.src.domain;

public class Radio {

    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolum = 0;
    private int currentStation = minStation;
    private int currentVolume = minVolum;

    public Radio() {

    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

//    public int getMaxStation() {
//        return maxStation;
//    }
//
//    public int getMinStation() {
//        return minStation;
//    }
//
//    public int getMaxVolume() {
//        return maxVolume;
//    }
//
//    public int getMinVolume() {
//        return minVolum;
//    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation || newCurrentStation < minStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int pressNextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
        return 0;
    }

    public void pressPrevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolum) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
        return;
    }

    public void downgradeVolume() {
        if (currentVolume > minVolum) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return;
    }
}
