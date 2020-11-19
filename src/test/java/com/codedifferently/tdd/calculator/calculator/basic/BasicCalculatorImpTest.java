package com.codedifferently.tdd.calculator.calculator.basic;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorImpTest {
    @Test
    public void testAdd(){

        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        Double expected = 7.0;
        Double actual = basicCalculatorImp.add(2.0);

        Assert.assertEquals(expected, actual, 0.0);

    }
    @Test
    public void testSubtract() {

        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        Double expected = 3.0;
        Double actual = basicCalculatorImp.subtract(2.0);

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testMultiply() {

        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);

        Double expected = 10.0;
        Double actual = basicCalculatorImp.multiply(2.0);

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testDivide() {

        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(6.0);

        Double expected = 3.0;
        Double actual = basicCalculatorImp.divide(2.0);

        Assert.assertEquals(expected, actual, 0.0);
    }
}


