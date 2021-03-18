package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorWithHistoryTest {
    @Test
    public void checkAns(){
        //given
        ICalculator cal = new CalculatorWithHistory();

        //when
        double firstResult = cal.subtract(2,3);
        double secondResult = cal.divide(4,2);
        double thirdResult = cal.sum(2,3);
        double lastAns = cal.lastAns();
        double secondLastAns = cal.lastAns();
        double thirdLastAns = cal.lastAns();
        double fourthLastAns = cal.lastAns();

        //then
        assertEquals(-1,firstResult,0.01);
        assertEquals(2,secondResult,0.01);
        assertEquals(5,thirdResult,0.01);
        assertEquals(thirdResult,lastAns,0.01);
        assertEquals(secondResult,secondLastAns,0.01);
        assertEquals(firstResult,thirdLastAns,0.01);
        assertEquals(0,fourthLastAns,0.01);
    }
}
