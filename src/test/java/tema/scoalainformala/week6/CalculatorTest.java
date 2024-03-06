package tema.scoalainformala.week6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @CsvSource({
          // mm  , cm , dm, m, km,    expectedSum
            "1000, 100, 10, 1, 0.001, 5000",
            "0, 0, 0, 0, 1, 1",
            "100, 10, 1, 0.1, 0, 400"
    })

    public void testCalculate(float mm, float cm, float dm, float m, float km, float expectedSum) {
        Calculator calculator = new Calculator();
        calculator.calculate(mm, cm, dm, m, km);
        assertEquals(expectedSum, calculator.getSum());
    }

    @Test
    public void testAdditionSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(1090, calculator.calculate(-10, 10, 0, 1, 0));
    }

    @Test
    public void testSimpleAddition() {
        Calculator calculator = new Calculator();
        assertEquals(100, calculator.calculate(0, 10 + 90, 0, 0, 0));
    }

    @Test
    public void testSimpleSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(90, calculator.calculate(0, -10, 0, 1, 0));
    }

    @Test
    public void testMixedUnitsAddition() {
        Calculator calculator = new Calculator();
        assertEquals(105, calculator.calculate(0, 5, 0, 1, 0));
    }

    @Test
    public void testMixedUnitsSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(95, calculator.calculate(0, -5, 0, 1, 0));
    }

    @Test
    public void testComplexExpression() {
        Calculator calculator = new Calculator();
        assertEquals(1090, calculator.calculate(-10, 10, 0, 1, 0));
    }

    @Test
    public void testLargeUnitsConversion() {
        Calculator calculator = new Calculator();
        assertEquals(1001, calculator.calculate(0, 0, 0, 1, 1));
    }
}