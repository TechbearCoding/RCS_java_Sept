import java.util.ArrayList;
import java.util.Random;

public class ListSamples {
    public static void sample1(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        numbers.add(3);
        numbers.add(6);

        for(int i = 0; i < 5; i++){
            numbers.add(rand.nextInt(7));
        }

        System.out.println(numbers);

        for(int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

}
