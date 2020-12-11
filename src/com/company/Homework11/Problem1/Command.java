package com.company.Homework11.Problem1;

public class Command {

    private DrinkType drinkType;
    private int sugarCount;
    private boolean includeMilk;

    public Command(DrinkType drinkType, int sugarCount, boolean includeMilk) {
        this.drinkType = drinkType;
        this.sugarCount = sugarCount;
        this.includeMilk = includeMilk;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }

    public boolean isIncludeMilk() {
        return includeMilk;
    }

    public void setIncludeMilk(boolean includeMilk) {
        this.includeMilk = includeMilk;
    }
}

