package controller;

import model.ICalculator;
import model.OperationType;
import view.IUserInterface;

import java.util.List;

public class CalculatorController {

    private ICalculator calculator;

    private IUserInterface userInterface;

    public CalculatorController(ICalculator calculator, IUserInterface userInterface) {
        this.calculator = calculator;
        this.userInterface = userInterface;
    }

    public void start() {
        OperationType operationType = userInterface.getOperationType();
        while (!operationType.equals(OperationType.FINISH)) {
            try {
                switch (operationType) {
                    case ADDITION:
                        List<Double> arguments = userInterface.getArguments();
                        double sumResult = calculator.sum(arguments.get(0), arguments.get(1));
                        userInterface.showResult(sumResult);
                        break;
                    case SUBTRACTION:
                        List<Double> argumentsSubtract = userInterface.getArguments();
                        double subtractResult = calculator.subtract(argumentsSubtract.get(0), argumentsSubtract.get(1));
                        userInterface.showResult(subtractResult);
                        break;
                    case MULTIPLY:
                        List<Double> argumentsMultiply = userInterface.getArguments();
                        double multiplyResult = calculator.multiply(argumentsMultiply.get(0), argumentsMultiply.get(1));
                        userInterface.showResult(multiplyResult);
                        break;
                    case DIVIDE:
                        List<Double> argumentsDivide = userInterface.getArguments();
                        if (argumentsDivide.get(1) == 0 || argumentsDivide.get(0) == 0) {
                            userInterface.showMessage("Pamietaj nie dziel przez 0");
                        } else {
                            double divideResult = calculator.divide(argumentsDivide.get(0), argumentsDivide.get(1));
                            userInterface.showResult(divideResult);
                        }
                        break;
                    case LAST_ANS:
                        double lastAns = calculator.lastAns();
                        userInterface.showResult(lastAns);
                        break;
                }
            } catch (NumberFormatException e) {
                userInterface.showMessage("Niepoprawny format liczby");
            }
            operationType = userInterface.getOperationType();
        }
        userInterface.close();
    }
}

