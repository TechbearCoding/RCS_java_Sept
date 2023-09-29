package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world!");
        System.out.println(2);
        System.out.println(2.5);
        System.out.println('a');
        System.out.println(2+3);
        System.out.println("2 + 3");

        String nosaukums = "Mums ir 1. nodarbība!";
        String nosaukumsArExtra = "aaaa";

        System.out.println(nosaukums);
        System.out.println("nosaukums");

        int skaitlis = 2+3;
        System.out.println(skaitlis);

        String ievade = sc.nextLine();
        System.out.println(ievade);
        ievade = "aaaa " + nosaukums;
        System.out.println(ievade);

        //#1
        System.out.println("Ievadiet savu vārdu!");
        String name = sc.nextLine();

        System.out.println("Sveiki, " + name);

        //#2
        System.out.println("Ievadiet simbolu virkni!");
        String virkne = sc.nextLine();

        System.out.println(virkne + " " + virkne + " " + virkne + " " + virkne);
    }
}