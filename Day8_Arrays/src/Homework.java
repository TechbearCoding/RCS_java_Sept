import java.util.Scanner;

public class Homework {

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi vēlamo masīva garumu");
        int garums = sc.nextInt();

        double[] numMasivs = new double[garums];
        double sum = 0;

        for(int i = 0; i < numMasivs.length; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            numMasivs[i] = sc.nextDouble();
            sum = sum + numMasivs[i];
        }

        System.out.println("Vidējā vērtība- " + (sum/ numMasivs.length));

    }

    public static void task2(){
        int[] a = {1, 6, 7, 9, 10, 1, 6};
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli, ko gribat atrast!");
        int sk = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == sk){
                System.out.println("Skaitlis atrodas- " + i);
                found = true;
            }
        }
        if(found == false){
            System.out.println("Skaitlis nav atrasts");
        }

    }

}
