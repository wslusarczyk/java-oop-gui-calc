package model;

public class SimpleCalculator implements ICalculator {

    private double lastAns;

    @Override
    public double sum(double a, double b) {
        double sum = a + b;
        rememberAns(sum);
        return sum;
    }

    @Override
    public double subtract(double a, double b) {
        double subtract = a - b;
        rememberAns(subtract);
        return subtract;
    }

    protected void rememberAns(double ans) {
        lastAns = ans;
    }

    @Override
    public double lastAns() {
        return lastAns;
    }
}
