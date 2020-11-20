package com.company.Homework7.Problem7;

public class CurrencyConverter {

    public static void convert(Dram from, Ruble to) {
        to.setAmount(6.3 * from.getAmount());
    }

    public static void convert(Dram from, Dollar to) {
        to.setAmount(0.0021 * from.getAmount());

    }

    public static void convert(Dollar from, Ruble to) {
        to.setAmount(76.11 * from.getAmount());
    }

    public static void convert(Dollar from, Dram to) {
        to.setAmount(500.82 * from.getAmount());
    }


    public static void convert(Ruble from, Dram to) {
        to.setAmount(6.58 * from.getAmount());
    }

    public static void convert(Ruble from, Dollar to) {
       to.setAmount(0.013 * from.getAmount());

    }
}
