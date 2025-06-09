package dev.beacon.startup;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3,5);
        assertEquals(8, result);
    }
}
