package com.company.Homework11.Problem1;

public abstract class Drink {

    private int sugarCount;
    private boolean hasMilk;
    private StickType stickType;

    public Drink(int sugarCount, boolean hasMilk, StickType stickType) {
        this.sugarCount = sugarCount;
        this.hasMilk = hasMilk;
        this.stickType = stickType;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }

    public boolean hasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public StickType getStickType() {
        return stickType;
    }

    public void setStickType(StickType stickType) {
        this.stickType = stickType;
    }
}
