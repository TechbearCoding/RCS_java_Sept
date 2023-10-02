package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        uzd4();
    }

    static void uzd4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet 1. skaitli!");
        int skaitlis = sc.nextInt();

        System.out.println("Ievadiet 2. skaitli!");
        int skaitlis2 = sc.nextInt();

        int result = skaitlis + skaitlis2;

        if(result >= 5 && result <= 15){
            System.out.println("Ievade veiksmīga!");
        }else{
            System.out.println("Kļūda!");
        }
    }

    public static void sample3(){
        int a = 6;
        int b = 5;

        //un &&
        //vai ||

        if(a == 5 && b == 5){
            //ir jaizpildas abiem nosacijumiem
        }


        if(a == 5 || b == 5){
            //ir jaizpildas vienam
        }

        if(a == 5 && b == 5 || a == 6 && b == 5){

        }
    }

    public static void uzd3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet simbolu virkni!");
        String virkne = sc.nextLine();

        if(virkne.length() >= 5){
            System.out.println("Ievade veiksmīga!");
        }else{
            System.out.println("Kļūda!");
        }
    }

    public static void uzd2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet 1. skaitli!");
        int skaitlis = sc.nextInt();

        System.out.println("Ievadiet 2. skaitli!");
        int skaitlis2 = sc.nextInt();

        int result = skaitlis + skaitlis2;

        if(result > 10){
            System.out.println("###");
        }else{
            System.out.println("####");
        }
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();
        int b = 5;
        // > < <= >= == !=

        if(a > b){
            System.out.println("a ir lielaks par b");
        }else if(a < b){
            System.out.println("a nav lielaks par b");
        }else{
            System.out.println("a ir vienads ar b");
        }

        // String- == !=
        String c = "abcd";
        String d = "aaaa";

        if(c.equals(d)){
            System.out.println("Virknes ir vienadas");
        }
    }

    public static void uzd1(){
        //#1
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet 1. skaitli!");
        int skaitlis = sc.nextInt();

        System.out.println("Ievadiet 2. skaitli!");
        int skaitlis2 = sc.nextInt();

        System.out.println("Rezultats ir " + (skaitlis + skaitlis2));
    }

    public static void sample1(){
        System.out.println("Mani sauc Mārtiņš");

        Scanner sc = new Scanner(System.in);
        System.out.println("Kā Jūs sauc?");

        String name = sc.nextLine();

        System.out.println("Sveiki, " + name );

        int a = 5;
        System.out.println(a+6);

        System.out.println("Ievadiet skaitli!");
        int b = sc.nextInt();
    }
}