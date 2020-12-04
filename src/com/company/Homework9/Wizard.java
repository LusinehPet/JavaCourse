package com.company.Homework9;

public class Wizard extends Warrior {

    @Override
    protected int getPower() {
        return 7;
    }

    @Override
    protected void receiveDamage(Warrior fromWarrior, int damage) {
        fromWarrior.receiveDamage(this, damage);
    }
}
