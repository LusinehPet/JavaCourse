package com.company.Homework8.Problem19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = getUsers();
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> usersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            Role role;
            if (i <= 7) {
                role = Role.ADMIN;
            } else {
                role = Role.CUSTOMER;
            }
            User user = new User(username, password, role);
            usersList.add(user);
        }
        return usersList;
    }
}
