package model;

import org.junit.Test;
import sun.java2d.pipe.SpanShapeRenderer;

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
        assertEquals( 3, firstResult,0.01);
        assertEquals( 1000, secondResult,0.01);
        assertEquals( 0, thirdResult,0.01);
        assertEquals( 0.999, fourthResult,0.01);

        assertEquals(fourthResult,lastAns,0.01);


    }

    // odejmowanie

    @Test
    public void calculatorShouldSubtractNumber(){

        //given
        ICalculator cal = new SimpleCalculator();

        //when
        double firstResoult = cal.subtract(2,3);
        double secondResoult = cal.subtract(5,0.1);
        double thirdResoult = cal.subtract(0,0.2);
        double fourResoult = cal.subtract(3.2,0);
        double fiveResoult = cal.subtract(3.2,0.2);

        //then
        assertEquals(-1,firstResoult,0.01);
        assertEquals(4.9,secondResoult,0.01);
        assertEquals(-0.2,thirdResoult,0.01);
        assertEquals(3.2,fourResoult,0.01);
        assertEquals(3,fiveResoult,0.01);
    }


    // branie lastAns kilka razy
    @Test
    public void checkLastAns(){

        //given
        ICalculator cal = new SimpleCalculator();

        //when
        double firstResoult = cal.subtract(2,3);
        double firstLastAns = cal.lastAns();
        double secondLastAns = cal.lastAns();

        //then
        assertEquals(-1,firstResoult,0.01);
        assertEquals(firstResoult,firstLastAns,0.01);
        assertEquals(firstLastAns,secondLastAns,0.01);
    }
}
