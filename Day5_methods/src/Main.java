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
//        String input1 = "aa";
//        String input2 = "bb";
//        String input3 = "cc";
//        sample4(input1, input2, input3);
//
//        sample4("aaaa", "bbbbbb", "cccccc");
        task2(8);

        String result;

        String input = "aaa";
        String b = "bb";

        if(input.length() > b.length()){
            result = input;
        }
    }

    public static void task2(int a){
        for(int i = 0; i < a; i++){
            System.out.println("&&&&");
        }
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

    static void sample4(String a, String b, String c){
        //uztaisīt metodi, lai tiktu iekšā padoti 3 string tipa mainīgie, kombinēt vertības un izvadīt
        System.out.println(a + b + c);
    }

    static void sample3(int a, int b){
        System.out.println("Summa ir " + (a + b));
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