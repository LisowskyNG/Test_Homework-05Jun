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
            assertEquals(0, service.plus(0,0));
        }

        @Test
        void testminus() {
            assertEquals(-1, service.minus(1, 2));
            assertEquals(1, service.minus(-1, -2));
            assertEquals(-3, service.minus(-1, 2));
            assertEquals(3, service.minus(1, -2));
            assertEquals(0, service.minus(0,0));
        }

    @Test
    void testMultiply() {
        assertEquals(2, service.multiply(1, 2));
        assertEquals(2, service.multiply(-1, -2));
        assertEquals(-2, service.multiply(-1, 2));
        assertEquals(-2, service.multiply(1, -2));
        assertEquals(0, service.multiply(0,0));
    }

    @Test
    void testDivide() {
        assertEquals(2 , service.divide(4, 2));
        assertEquals(2, service.divide(-4, -2));
        assertEquals(-2, service.divide(-4, 2));
        assertEquals(-2, service.divide(4, -2));
        assertEquals(0, service.divide(0,4));


        assertThrows(ArithmeticException.class, () -> service.divide(4, 0));
        try {
            service.divide(4, 0);
            fail();
        } catch (ArithmeticException ignored) {
        }
    }

}





