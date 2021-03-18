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
        // switcha dodac
            if (operationType.equals(OperationType.ADDITION)) {
                List<Double> arguments = userInterface.getArguments();
                double sumResoult = calculator.sum(arguments.get(0), arguments.get(1));
                userInterface.showResult(sumResoult);
            } else if(operationType.equals(OperationType.SUBTRACTION)){
                List<Double> arguments = userInterface.getArguments();
                double substractResoult = calculator.subtract(arguments.get(0), arguments.get(1));
                userInterface.showResult(substractResoult);
            }else if(operationType.equals(OperationType.LAST_ANS)){
                double lastAns = calculator.lastAns();
                userInterface.showResult(lastAns);
            }
            userInterface.showMessage("Podaj poprawną operacje2");
        operationType = userInterface.getOperationType();
        }

        userInterface.close();
    }
}
