public class ArraySamples {

    public static void sample2(){
        int[] nosaukums = {2, 4, 8, 12, 16, 18};

        for(int i = 0; i < nosaukums.length; i++){
            System.out.print(nosaukums[i] + ", ");
        }
        System.out.println();
    }
    public static void sample1(){
        int[] nosaukums = new int[6];
        nosaukums[0] = 2;
        nosaukums[1] = 4;
        nosaukums[2] = 8;
        nosaukums[3] = 12;
        nosaukums[4] = 16;
        nosaukums[5] = 18;

        System.out.println(nosaukums[0]);
        nosaukums[0] = 4;
        System.out.println("----");

        for(int i = 0; i < nosaukums.length; i++){
            System.out.println(nosaukums[i]);
        }

    }
}
