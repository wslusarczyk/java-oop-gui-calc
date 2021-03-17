package model;

public class SimpleCalculator implements ICalculator {
    @Override
    public double sum(double a, double b) {
        double sum = a + b;
        sum = rememberAns();
        return sum;
    }

    @Override
    public double subtract(double a, double b) {
        double subtract = a - b;
        subtract = rememberAns();
        return subtract;
    }

    @Override
    public double multiply(double a, double b) {
        double multiply = a * b;
        multiply = rememberAns();
        return multiply;
    }

    @Override
    public double divide(double a, double b) {
        double divide = a / b;
        divide = rememberAns();
        return divide;
    }

    @Override
    public double lastAns() {
        return rememberAns();
    }

    protected Double rememberAns() {
        double lastAns = 0;
        return lastAns;
    }
}
