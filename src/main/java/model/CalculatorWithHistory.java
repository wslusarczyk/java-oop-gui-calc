package model;

import java.util.LinkedList;

public class CalculatorWithHistory extends SimpleCalculator {

    LinkedList<Double> list = new LinkedList<>();

    @Override
    protected void rememberAns(double ans) {
        list.add(ans);
    }

    @Override
    public double lastAns() {
        return list.removeLast();
    }
}
