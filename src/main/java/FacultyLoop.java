public class FacultyLoop {

    public static int calculate(int value){

        int result = 1;
        for (int i=1; i <= value; i++){
            result = result * i;
            System.out.println(result);
        }
        return result;

    }
}
