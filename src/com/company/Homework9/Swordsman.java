package com.company.Homework9;

public class Swordsman extends Warrior {

    @Override
    protected int getPower() {
        return 10;
    }

    @Override
    public void receiveDamage(Warrior fromWarrior, int damage) {
        life -= damage * 0.9;
    }
}

