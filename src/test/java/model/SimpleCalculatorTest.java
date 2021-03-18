package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void calculatorShouldAddNumbersAndRememberAnswers() {
        //given
        ICalculator calc = new SimpleCalculator();

        //when
        double firstResult = calc.sum(1, 2);
        double secondResult = calc.sum(999, 1);
        double thirdResult = calc.sum(-1000, 1000);
        double fourthResult = calc.sum(0.333, 0.666);
        double lastAns = calc.lastAns();

        //then
        assertEquals(3, firstResult, 0.01);
        assertEquals(1000, secondResult, 0.01);
        assertEquals(0, thirdResult, 0.01);
        assertEquals(0.999, fourthResult, 0.01);

        assertEquals(fourthResult, lastAns, 0.01);


    }

    // odejmowanie

    @Test
    public void calculatorShouldSubtractNumber() {

        //given
        ICalculator cal = new SimpleCalculator();

        //when
        double firstResult = cal.subtract(2, 3);
        double secondResult = cal.subtract(5, 0.1);
        double thirdResult = cal.subtract(0, 0.2);
        double fourResult = cal.subtract(3.2, 0);
        double fiveResult = cal.subtract(3.2, 0.2);

        //then
        assertEquals(-1, firstResult, 0.01);
        assertEquals(4.9, secondResult, 0.01);
        assertEquals(-0.2, thirdResult, 0.01);
        assertEquals(3.2, fourResult, 0.01);
        assertEquals(3, fiveResult, 0.01);
    }


    // branie lastAns kilka razy
    @Test
    public void checkLastAns() {

        //given
        ICalculator cal = new SimpleCalculator();

        //when
        double firstResult = cal.subtract(2, 3);
        double firstLastAns = cal.lastAns();
        double secondLastAns = cal.lastAns();

        //then
        assertEquals(-1, firstResult, 0.01);
        assertEquals(firstResult, firstLastAns, 0.01);
        assertEquals(firstLastAns, secondLastAns, 0.01);
    }

    //mnożenie
    @Test
    public void checkMultiply() {

        //given
        ICalculator cal = new SimpleCalculator();

        //when
        double firstResult = cal.multiply(2, 3);
        double secondResult = cal.multiply(1, -1);
        double thirdResult = cal.multiply(0, 1);
        double fourResult = cal.multiply(-2, 0);
        double fiveResult = cal.multiply(-2, -2);

        //then
        assertEquals(6, firstResult, 0.01);
        assertEquals(-1, secondResult, 0.01);
        assertEquals(0, thirdResult, 0.01);
        assertEquals(0, fourResult, 0.01);
        assertEquals(4, fiveResult, 0.01);

    }

    //dzielenie
    @Test
    public void checkDevide() {
        //given
        ICalculator cal = new SimpleCalculator();

        //when
        double firstResult = cal.divide(2,1);
        double thirdResult = cal.divide(-4,2);
        double fourResult = cal.divide(-6,-3);

        //then
        assertEquals(2,firstResult,0.01);
        assertEquals(-2,thirdResult,0.01);
        assertEquals(2,fourResult,0.01);
    }
}
