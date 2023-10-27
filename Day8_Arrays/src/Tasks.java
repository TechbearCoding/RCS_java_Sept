import java.util.Scanner;

public class Tasks {
    public static void task1(){
        String[] virknes = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < virknes.length; i++){
            System.out.println("Lūdzu ievadiet vērtību!");
            virknes[i] = sc.nextLine();
        }

        System.out.println("---------------");
        for(int i = 0; i < virknes.length; i++){
            System.out.print(virknes[i] + ", ");
        }
        System.out.println();
    }
}
