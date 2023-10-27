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

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi vēlamo masīva garumu");
        int garums = sc.nextInt();

        int[] numMasīvs = new int[garums];

        for(int i = 0; i < numMasīvs.length; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            numMasīvs[i] = sc.nextInt();
        }

        System.out.println("---------------");
        for(int i = 0; i < numMasīvs.length; i++){
            System.out.print(numMasīvs[i] + ", ");
        }
        System.out.println();
    }
}
