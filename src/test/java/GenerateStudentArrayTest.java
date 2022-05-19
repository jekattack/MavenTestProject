import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateStudentArrayTest {
    @Test
    void shouldGenerateStudentArray(){
        //Given
        int studentsAmount = 5;
        String expected = "Student 4";
        String[] expected2 = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};

        //When
        String[] result = GenerateStudentArray.generate(studentsAmount);
        String actual = result [3];
        String[] actual2 = result;

        //Then
        Assertions.assertEquals(expected, actual);
        Assertions.assertArrayEquals(expected2, actual2);
    }
}