package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample4();
    }

    public static void sample4(){
        //Lietotajs ievada 7 skaitlus- izvadit skaitlu summu
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Lūdzu ievadi skaitli");
            int num1 = sc.nextInt();
            sum = sum + num1;
        }

        System.out.println(sum);

    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Lūdzu ievadi skaitli");
            int num1 = sc.nextInt();

            if (num1 % 2 == 0) {
                System.out.println(num1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void sample3(){
        int a = 9;

        int b = a % 2;

        System.out.println(b);
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);

        //cikls
        //ciklā ievade
        //ciklā saskaitīšana
        //ciklā izvade

        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet skaitli!");
            int sk = sc.nextInt();

            System.out.println("Rezultats ir " + (sk + 2));
        }
    }

    public static void sample2(){
        for(int i = 0; i < 5; i++){
            if(i != 1){
                System.out.println("Hello world!");
            }else{
                System.out.println("aaa");
            }
        }
    }

    public static void sample1(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello world!");
            System.out.println(i);
        }
    }
}