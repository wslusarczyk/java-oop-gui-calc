package app;

import controller.CalculatorController;
import model.CalculatorWithHistory;
import model.ICalculator;
import view.GUI;
import view.IUserInterface;

public class CalculatorApp{

    public static void main(String[] args) {
        ICalculator cal = new CalculatorWithHistory();
        IUserInterface ui = new GUI();
        CalculatorController controller = new CalculatorController(cal, ui);
        controller.start();
    }
}
