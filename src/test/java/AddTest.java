import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    @DisplayName("Testet, ob 1 und 99 addiert 100 gibt.")
    void shouldSumUpOneAnNinetynine(){
        //Given
        int value1 = 1;
        int value2 = 99;

        //When
        int result = Add.sum(value1, value2);

        //Then
        Assertions.assertTrue(result==100);
    }

    @Test
    @DisplayName("Testet, ob 100 kleiner ist, als 100.")
    void shouldTellIf100IsSmallerThan100(){
        //Given
        int value1 = 100;

        //When
        boolean result = Add.isSmallerThan100(value1);

        //Then
        Assertions.assertFalse(result);
    }

}