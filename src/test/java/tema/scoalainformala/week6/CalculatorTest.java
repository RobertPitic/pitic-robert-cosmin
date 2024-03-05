package tema.scoalainformala.week6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAdditionSubstraction() {
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