import java.util.Scanner;

public class Samples {
    public static void sample1() {
        int[] a = {1, 6, 7, 9, 10, 1, 6};
        int[] b = {11, 62, 76, 92, 11};

        printArr(a);
        printArr(b);
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi vēlamo masīva garumu");
        int garums = sc.nextInt();

        double[] numMasivs = new double[garums];

        for(int i = 0; i < numMasivs.length; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            numMasivs[i] = sc.nextDouble();
        }

        avarageValue(numMasivs);
    }

    public static void sample3(){
        //Uztaisit metodi, kas ar return padod masivu, kuru ir ievadijis lietotajs
        int[] a = genArr();

        printArr(a);
    }

    private static int[] genArr(){
        Scanner sc = new Scanner(System.in);

        int[] numMasivs = new int[3];

        for(int i = 0; i < numMasivs.length; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            numMasivs[i] = sc.nextInt();
        }

        return numMasivs;
    }

    private static void avarageValue(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Vidējā vērtība- " + (sum/ arr.length));
    }

    private static double avarageWithReturn(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum/ arr.length;
    }



    private static void printArr(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
