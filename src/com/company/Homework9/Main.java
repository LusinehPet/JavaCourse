package com.company.Homework9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("choose first player");
        Warrior warrior1 = getNewWarrior();
        System.out.println("choose second player");
        Warrior warrior2 = getNewWarrior();

        int step = 0;

        while (true) {
            if (step % 2 == 0) {
                warrior1.hitWarrior(warrior2);
            } else {
                warrior2.hitWarrior(warrior1);
            }

            if (warrior1.getLife() == 0 || warrior2.getLife() == 0) {
                break;
            }
            step ++;
            System.out.println("Warrior1 life: " + warrior1.getLife());
            System.out.println("Warrior2 life: " + warrior2.getLife());
        }

        if (warrior1.getLife() != 0) {
            System.out.println("Warrior1 Won");
        } else {
            System.out.println("warrior2 Won");
        }
    }

    public static Warrior getNewWarrior() {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        Warrior warrior;
        if (player.equals("Wizard")) {
            warrior = new Wizard();
        } else if (player.equals("Archer")) {
            warrior = new Archer();
        } else {
            warrior = new Swordsman();
        }
        return warrior;

    }

}
