package com.company.Homework9;

public class Archer extends Warrior {

    private int hitCount = 0;

    @Override
    protected int getPower() {
        if (hitCount % 4 == 0) {
            return 15;
        } else {
            return 5;
        }
    }

    @Override
    public void hitWarrior(Warrior otherWarrior) {
        hitCount++;
        super.hitWarrior(otherWarrior);
    }
}
