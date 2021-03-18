package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
