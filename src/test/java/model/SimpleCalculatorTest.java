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

        //then
        assertEquals( 3, firstResult,0.01);
        assertEquals( 1000, secondResult,0.01);
        assertEquals( 0, thirdResult,0.01);
        assertEquals( 0.999, fourthResult,0.01);
    }

    // odejmowanie

    // branie lastAns kilka razy
}
