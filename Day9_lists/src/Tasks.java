import java.util.Scanner;

public class Tasks {
    public static void task1() {
        Scanner sc = new Scanner(System.in);

        String[] array = new String[8];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Lūdzu ievadi masīva datus");
            array[i] = sc.nextLine();
        }

        symbolLength(array);
    }

    private static void symbolLength(String[] array) {
        int count = 0;

        for(int i = 0; i < array.length; i++){
            count = count + array[i].length();
        }
        System.out.println(count);
    }

}
