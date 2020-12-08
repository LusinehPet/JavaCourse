package com.company.Homework11.Problem2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();

        Company company1 = new Company("PicsArt", "Halabyan16", 500, 6.5, 5.5, "https://picsart.com/");
        Company company2 = new Company("10Web", "Baghramyan", 40, 4.6, 3.2, "https://10Web.com/");

        HashMap<String, Company> hashMap = new HashMap<>();

        hashMap.put("PicsArt", company1);
        hashMap.put("10Web", company2);

        Company company = hashMap.get(companyName);
        if (company == null) {
            System.out.println("Company not found");
        } else {
            System.out.println(company);
        }

    }
}
