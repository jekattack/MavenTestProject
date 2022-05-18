import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerCheckTest {

    @Test
    void shouldSetOffAlarmWithAtLeast30Customers(){
        //Given
            int costumerAmount = 32;
            String alarmLevel = "Gelb";
        //When
            boolean result = CustomerCheck.customerCheckMethod(alarmLevel,costumerAmount);
        //Then
            assertTrue(result);

    }

    @Test
    void shouldNotSetOffAlarm(){
        //Given
            int customerAmount = 29;
            String alarmLevel = "Rot";
        //When
            boolean result = CustomerCheck.customerCheckMethod(alarmLevel, customerAmount);
        //Then
            assertTrue(result);
    }
}