import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void sample1(){
        int a = 7;
        for(int i = 0; i < a; i++){
            System.out.println(i);
            System.out.println("aaa");
        }
    }

    static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Izvēlies cik skaitļus gribi ievadīt!");
        int number = sc.nextInt();

        double sum = 0;
        for(int i = 0; i < number; i++){
            System.out.println("Ievadiet skaitli!");
            double input = sc.nextDouble();
            sum = sum + input;
        }
        System.out.println("Vidējais ir " + (sum/number));
    }

//    Lietotājs izvēlas, cik skaitļus viņš gribēs ievadīt.
//    Lietotājs ievada skaitļus (for cikls) un
//    beigās tiek izvadīta (1x) skaitļu vidējā vērtība
//    izmantot double
}