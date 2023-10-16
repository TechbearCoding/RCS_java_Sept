public class Tools {
    public static int Power(int base, int pow){
        int result = base;

        for(int i = 0; i < pow; i++){
            result = result * base;
        }

        return result;
    }
}
