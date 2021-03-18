package model;

public class SimpleCalculator implements ICalculator {
    private double lasAns;

    @Override
    public double sum(double a, double b) {
        double sum = a + b;
        lasAns = sum;
        return sum;
    }

    @Override
    public double subtract(double a, double b) {
        double subtract = a - b;
        lasAns = subtract;
        return subtract;
    }

    @Override
    public double lastAns() {
        return lasAns;
    }
}
