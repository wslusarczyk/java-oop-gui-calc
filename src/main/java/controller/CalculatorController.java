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
            if (operationType.equals(OperationType.ADDITION)) {
                List<Double> arguments = userInterface.getArguments();
                double sum = calculator.sum(arguments.get(0), arguments.get(1));
                userInterface.showResult(sum);
            }
        operationType = userInterface.getOperationType();
        }


    }


}
