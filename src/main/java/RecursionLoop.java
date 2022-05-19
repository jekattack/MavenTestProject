
public class RecursionLoop {
    public static int calculate(int value){

        if(value<1){
            return 1;
        } else {
            return calculate(value-1)*value;
        }

    }
}
