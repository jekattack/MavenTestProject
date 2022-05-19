import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionLoopTest {
    @Test
    void shouldReturn6forInput0(){
        //Given
        int input = 0;
        //When
        int result = RecursionLoop.calculate(input);
        //Then
        assertEquals(1, result);
    }
    @Test
    void shouldReturn6forInput1(){
        //Given
        int input = 1;
        //When
        int result = RecursionLoop.calculate(input);
        //Then
        assertEquals(1, result);
    }

    @Test
    void shouldReturn6forInput2(){
        //Given
        int input = 2;
        //When
        int result = RecursionLoop.calculate(input);
        //Then
        assertEquals(2, result);
    }
    @Test
    void shouldReturn6forInput3(){
        //Given
        int input = 3;
        //When
        int result = RecursionLoop.calculate(input);
        //Then
        assertEquals(6, result);
    }

    @Test
    void shouldReturn5040forInput7(){
        //Given
        int input = 7;
        //When
        int result = RecursionLoop.calculate(input);
        //Then
        assertEquals(5040, result);
    }
}