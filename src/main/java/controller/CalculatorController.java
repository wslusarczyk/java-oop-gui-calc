package controller;

import model.ICalculator;
import model.OperationType;
import model.SimpleCalculator;
import view.CLI;
import view.IUserInterface;

import java.util.List;
import java.util.Random;

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
                    case LAST_ANS:
                        double lastAns = calculator.lastAns();
                        userInterface.showResult(lastAns);
                        break;
                }
            }catch (NumberFormatException e){
                userInterface.showMessage("Niepoprawny format liczby");
            }
            userInterface.showMessage("Podaj poprawną operacje");
            operationType = userInterface.getOperationType();
        }
        userInterface.close();
    }
}

