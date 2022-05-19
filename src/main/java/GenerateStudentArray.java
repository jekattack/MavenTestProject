import java.util.Arrays;

public class GenerateStudentArray {

    public static String[] generate(int amountStudents){

        String[] studentArray = new String[amountStudents];

        for (int i=0; i < studentArray.length; i++){
            studentArray[i] = "Student " + (i + 1);
        }

        System.out.println(studentArray);

        for(String i : studentArray){
            System.out.println(i);
        }


        return studentArray;
    }
}
