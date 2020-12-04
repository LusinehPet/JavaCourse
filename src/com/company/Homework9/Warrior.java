package com.company.Homework9;

public abstract class Warrior {

    protected int life = 100;

    protected abstract int getPower();

    public void hitWarrior(Warrior otherWarrior) {
        otherWarrior.receiveDamage(this, getPower());
    }

    protected void receiveDamage(Warrior fromWarrior, int damage) {
       life -= damage;

    }

    public int getLife() {
        return life;
    }
}
