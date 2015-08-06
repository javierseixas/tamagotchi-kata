package com.softwarecraftmanship.tamagotchi;


public class Tamagotchi {

    public static final Integer VARIATION = 10;

    private Integer hungriness = 50;
    private Integer fullness = 50;
    private Integer tiredness = 50;
    private Integer happiness = 50;

    public void feed() {
        hungriness -= VARIATION;
        fullness += VARIATION;
    }

    public void iPutItToBed() {
        tiredness -= VARIATION;
    }

    public Integer hungriness() {
        return hungriness;
    }

    public Integer fullness() {
        return fullness;
    }

    public Integer tiredness() {
        return tiredness;
    }

    public void timePasses() {
        hungriness += VARIATION;
        tiredness += VARIATION;
        happiness -= VARIATION;
    }

    public Integer happiness() {
        return happiness;
    }
}
