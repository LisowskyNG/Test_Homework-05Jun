package pro.sky.skyprohomeworktest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

        @Test
        void testPlus() {
            assertEquals(3, service.plus(1, 2));
            assertEquals(-3, service.plus(-1, -2));
            assertEquals(1, service.plus(-1, 2));
            assertEquals(-1, service.plus(1, -2));
        }

        @Test
        void testMinus() {
            assertEquals(-1, service.minus(1, 2));
            assertEquals(1, service.minus(-1, -2));
            assertEquals(-3, service.minus(-1, 2));
            assertEquals(3, service.minus(1, -2));
        }

}





