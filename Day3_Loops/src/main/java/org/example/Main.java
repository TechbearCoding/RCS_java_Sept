package org.example;

public class Main {
    public static void main(String[] args) {
        sample2();
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