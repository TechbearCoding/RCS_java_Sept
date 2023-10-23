import java.util.Scanner;

public class Main {
    private static int a = 3;
    public static void main(String[] args) {
        Student st = new Student("Mārtiņš", "Leitarts",
                2, "AAAA");
        st.print();
        System.out.println("---------");

        Student st2 = new Student("Anna", "Liepa",
                2, "AAAA");
        st2.print();

        System.out.println("---------");

        Student st3 = new Student("Jānis", "Ābele",
                2, "AAAA");
        st3.print();
    }

    public static void rectangleSample(){
//        sampleVar();
//        System.out.println(a);
        Rectangle rec1 = new Rectangle(2, 5, 2, 5);
        System.out.println(rec1.perimeter());

        Rectangle rec2 = new Rectangle(200, 99, 200, 99);
        System.out.println(rec2.perimeter());
    }

    public static void sampleVar(){
        int a = 5;
        System.out.println(a);
        System.out.println(Main.a);
    }

    public static void sampleCalling1(){
        Scanner sc = new Scanner(System.in);

        //static
        Sample1.sample2();

        //non static-> Objekts
        Sample1 sampleObject = new Sample1();
        sampleObject.sample1();
    }
}