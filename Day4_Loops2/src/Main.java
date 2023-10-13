import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mdokt6();
    }

    public static void sample1(){
        int a = 7;
        for(int i = 0; i < a; i++){
            System.out.println(i);
            System.out.println("aaa");
        }
    }

    static void homework(){
        String sum = "&";
        System.out.println(sum);

        for(int i = 0; i < 3; i++){
            sum = sum + "&";
            System.out.println(sum);
        }
    }

    static void homework2(){
        for (int i = 1; i <= 4; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }

    public static void mdokt6() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("&");
            }
            System.out.println();
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