package com.bridgelabz;
import org.junit.jupiter.api.*;

public class MathUtilsTest {
    private MathUtils mathUtils;
    @BeforeEach
    void setup() {
        mathUtils = new MathUtils();
    }

    @Test
    public void shouldReturnQuotient() {
        Assertions.assertEquals(2, mathUtils.divide(10, 5));
    }

    @Test
    public void shouldThrowException() {
        Assertions.assertThrows(ArithmeticException.class,()->{
            mathUtils.divide(10, 0);
        });
    }
}
