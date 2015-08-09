package com.softwarecraftmanship.tamagotchi;


public class Tamagotchi {

    public static final Integer VARIATION = 10;

    private Integer hungriness = 50;
    private Integer fullness = 50;
    private Integer tiredness = 50;
    private Integer happiness = 50;

    public Tamagotchi() {

    }

    public Tamagotchi(Integer happiness, Integer hungriness, Integer tiredness, Integer fullness) {
        this.happiness = happiness;
        this.hungriness = hungriness;
        this.tiredness = tiredness;
        this.fullness = fullness;
    }

    public void getsFeeded() {
        hungriness -= VARIATION;
        fullness += VARIATION;

        if (hungriness < 0) hungriness = 0;
        if (fullness > 100) fullness = 100;
    }

    public void plays() {
        if (tiredness >= 100) {
            return;
        }
        happiness += VARIATION;
        tiredness += VARIATION;
    }

    public void goesToBed() {
        if (tiredness <= 0) {
            return;
        }
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

    public void poops() {
        if (fullness <= 0) return;
        fullness -= VARIATION;
    }
}
