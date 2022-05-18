public class RecursionLoop {
    public static int calculate(int value){
        if(value < 1) {
            return 0;
        }
        return calculateSum(value - 1) + value;
    }
}
