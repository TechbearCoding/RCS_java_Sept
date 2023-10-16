public class Main {
    public static void main(String[] args) {
        int a = 3;
        task1(a);
        task1(6);
    }

    static void task1(int number){
        if(number % 2 == 0){
            System.out.println("Pāra");
        }else{
            System.out.println("Nepāra");
        }
    }
}