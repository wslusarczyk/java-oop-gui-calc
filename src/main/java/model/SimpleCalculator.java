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

    @Override
    public double multiply(double a, double b) {
        double multiplyResult = a * b;
        rememberAns(multiplyResult);
        return multiplyResult;
    }

    @Override
    public double divide(double a, double b) {
        double devideResult = a / b;
        rememberAns(devideResult);
        return devideResult;
    }


    protected void rememberAns(double ans) {
        lastAns = ans;
    }

    @Override
    public double lastAns() {
        return lastAns;
    }
}
