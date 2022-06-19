//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.src.domain;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolum = 0;
    private int currentStation;
    private int currentVolume;

    public Radio(int maxStation) {
        this.currentStation = this.minStation;
        this.currentVolume = this.minVolum;
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= this.maxStation && newCurrentStation >= this.minStation) {
            this.currentStation = newCurrentStation;
        }
    }

    public int pressNextStation() {
        if (this.currentStation == this.maxStation) {
            this.setCurrentStation(this.minStation);
        } else {
            this.setCurrentStation(this.currentStation + 1);
        }

        return 0;
    }

    public void pressPrevStation() {
        if (this.currentStation == this.minStation) {
            this.setCurrentStation(this.maxStation);
        } else {
            this.setCurrentStation(this.currentStation - 1);
        }

    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolum) {
            if (newCurrentVolume <= this.maxVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        } else {
            this.currentVolume = 0;
        }

    }

    public void downgradeVolume() {
        if (this.currentVolume > this.minVolum) {
            --this.currentVolume;
        } else {
            this.currentVolume = 0;
        }

    }

    public Radio(int maxStation, int minStation, int maxVolume, int minVolum, int currentStation, int currentVolume) {
        this.currentStation = this.minStation;
        this.currentVolume = this.minVolum;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolum = minVolum;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public Radio() {
        this.currentStation = this.minStation;
        this.currentVolume = this.minVolum;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getMinVolum() {
        return this.minVolum;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolum(int minVolum) {
        this.minVolum = minVolum;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getMaxVolume() != other.getMaxVolume()) {
                return false;
            } else if (this.getMinVolum() != other.getMinVolum()) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else {
                return this.getCurrentVolume() == other.getCurrentVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getMaxVolume();
        result = result * 59 + this.getMinVolum();
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getCurrentVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getMaxStation();
        return "Radio(maxStation=" + var10000 + ", minStation=" + this.getMinStation() + ", maxVolume=" + this.getMaxVolume() + ", minVolum=" + this.getMinVolum() + ", currentStation=" + this.getCurrentStation() + ", currentVolume=" + this.getCurrentVolume() + ")";
    }
}
