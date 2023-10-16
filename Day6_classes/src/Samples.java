import java.util.Scanner;

public class Samples {

    public static void sample1(){
        System.out.println("Hello world!");
    }

    public static int sample2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int b = sc.nextInt();

        return a + b;
    }

    public static void sample3(String a, String b, String c){
        System.out.println(a + b + c);
    }

    public static int sample4(int a, int b){
        return a + b;
    }
}
