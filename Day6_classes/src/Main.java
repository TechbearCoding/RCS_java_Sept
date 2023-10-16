public class Main {
    public static void main(String[] args) {
//        int a = 3;
//        task1(a);
//        task1(6);

//        Samples.sample1();

//        int result = Samples.sample2();
//        System.out.println(result);

//        Samples.sample3("aa", "yy", "xx");

        int result = Tasks.task2();
        System.out.println(result);
    }

    public static void task1(int number){
        if(number % 2 == 0){
            System.out.println("Pāra");
        }else{
            System.out.println("Nepāra");
        }
    }
}