package Servises;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorServiceImplTest {
    IOService openedConsoleIOService = new OpenedConsoleIOService(new ConsoleContext());
    CalculatorServiceImpl calc = new CalculatorServiceImpl(openedConsoleIOService);

    @Test
    public void testMultiplyAndOutResultPos() {
        Assert.assertEquals(25, calc.multiplyAndOutResult(5, 5), "Результат умножения неверный");
    }

    @Test
    public void testMultiplyAndOutResultNeg() {
        Assert.assertFalse(25 == calc.multiplyAndOutResult(5, 6), "Неправильно");
    }

    @Test
    public void testDivideAndOutResultPos() {
        Assert.assertEquals(5, calc.divideAndOutResult(25, 5), "Результат деления неверный");
    }

    @Test
    public void testDivideAndOutResultNeg() {
        Assert.assertFalse(4 == calc.divideAndOutResult(25, 5), "Неправильно");
    }

    @Test
    public void testAddAndOutResultPos() {
        Assert.assertEquals(20, calc.addAndOutResult(12, 8), "Результат сложения неверный");
    }

    @Test
    public void testAddAndOutResultNeg() {
        Assert.assertFalse(20 == calc.addAndOutResult(12, 6), "Неправильно");
    }

    @Test
    public void testSubtractAndOutResultPos() {
        Assert.assertEquals(12, calc.subtractAndOutResult(32, 20), "Результат вычитания неверный");
    }

    @Test
    public void testSubtractAndOutResultNeg() {
        Assert.assertFalse(12 == calc.subtractAndOutResult(32, 10), "Неправильно");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideAndOutResultEx() {
        Assert.assertEquals(5, calc.divideAndOutResult(25, 0), "Не получено исключение");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testMultiplyAndOutResultEx() {
        Assert.assertEquals(25, calc.multiplyAndOutResult(2147483647, 2), "Не получено исключение");
    }

}