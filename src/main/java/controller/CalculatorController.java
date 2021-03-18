package controller;

import model.ICalculator;
import model.OperationType;
import model.SimpleCalculator;
import view.CLI;
import view.IUserInterface;

import java.util.Random;

public class CalculatorController {

    private ICalculator calculator;

    private IUserInterface userInterface;

    public CalculatorController(ICalculator calculator, IUserInterface userInterface) {
        this.calculator = calculator;
        this.userInterface = userInterface;
    }

    public void start(){
        userInterface.getOperationType();
        


    }


}
