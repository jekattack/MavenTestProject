import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateStudentArrayTest {
    @Test
    void shouldGenerateStudentArray(){
        //Given
        int studentsAmount = 5;
        String expected = "Student 4";

        //When
        String[] result = GenerateStudentArray.generate(studentsAmount);
        String actual = result [3];

        //Then
        Assertions.assertEquals(expected, actual);

    }
}