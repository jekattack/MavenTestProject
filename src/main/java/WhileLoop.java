public class WhileLoop {

    public static int calculate(int value){

        int result = 1;
        int i = 1;

        if (value == 0){
            return result;
        } else {

            while(i<=value){
                result = result * i;
                System.out.println(result);
                i++;
            }

            return result;
        }

    }

}
