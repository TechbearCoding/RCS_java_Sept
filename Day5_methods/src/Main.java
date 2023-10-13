import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sample1();
//
//        for(int i = 0; i < 5; i++){
//            sample1();
//        }
//        int a = sample2();
//        int b = a  + 4;
//
//        System.out.println(sample2());

        String a = task1();
        System.out.println(a);
    }

    public static String task1(){
        Scanner sc = new Scanner(System.in);

        String result = "";
        for(int i = 0; i < 3; i++){
            System.out.println("Ievadiet frāzi!");
            String input = sc.nextLine();
            result = result + input;
        }
        return result;
    }

    public static int sample2(){
        //Uztaisīt metodi, kas paprasa lietotājam ievadit divus skaitļus un ar return atgriež  summu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        int result = sk1 + sk2;
        return result;
    }

    public static void sample1(){
        System.out.println("aaaa");
    }
}