import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class customerCheckTest {

    @Test
    void shouldSetOffAlarmWithAtLeast30Customers(){
        //Given
            int costumerAmout = 32;
        //When
            String result = customerCheck.customerCheckMethod(32);
        //Then
            assertEquals(result,"Es sind zu viele Personen im Laden.");

    }

    @Test
    void shouldNotSetOffAlarm(){
        //Given
        int customerAmount = 29;
        //When
        String result = customerCheck.customerCheckMethod(customerAmount);
        //Then
        assertEquals(result, "Es sind maximal 30 Leute im Laden.");
    }
}