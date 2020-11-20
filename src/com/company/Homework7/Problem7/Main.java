package com.company.Homework7.Problem7;

public class Main {

    public static void main(String[] args) {

        Dram dram = new Dram(100);
        Dollar dollar = new Dollar();
        Ruble ruble = new Ruble();


        CurrencyConverter.convert(dram,dollar);
        System.out.println("dram = " + dram.getAmount() + " " + "dollar = " + dollar.getAmount());

        CurrencyConverter.convert(dollar,ruble);
        System.out.println("dollar = " + dollar.getAmount() + " " + "ruble = " + ruble.getAmount());

        CurrencyConverter.convert(ruble,dollar);
        System.out.println("ruble = " + ruble.getAmount() + " " + "dollar = " + dollar.getAmount());

        CurrencyConverter.convert(dollar,dram);
        System.out.println("dollar = " + dollar.getAmount() + " " + "dram = " + dram.getAmount());

    }
}
