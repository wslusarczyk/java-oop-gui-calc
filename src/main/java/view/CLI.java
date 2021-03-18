package view;

import model.OperationType;
import model.SimpleCalculator;

import java.util.List;
import java.util.Scanner;

public class CLI implements IUserInterface {

    private Scanner scanner;

    public CLI(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public OperationType getOperationType() {
        String message = "Podaj rodzaj operacji jaką chcesz wykonać: \n+ Dodawnie \n- Odejmowanie \n/ "+"" +
                "Ostatni zapamiętany wynik";
        System.out.println(message);
        String answer = scanner.nextLine();
        while (!answer.equals("+") && !answer.equals("-") && !answer.equals("/")){
            System.out.println(message);
            answer = scanner.nextLine();
        }
        if (answer.equals("+")) {
            return OperationType.ADDITION;
        }else if (answer.equals("-")) {
            return OperationType.SUBTRACTION;
        }else if (answer.equals("/")) {
            return OperationType.LAST_ANS;
        } else {
            System.out.println("Podana operacja jest niepoprawna");
        }
        return OperationType.INVALID;
    }

    @Override
    public List<Double> getArguments() {
        return null;
    }

    @Override
    public void showResult() {
        String resoultMessage = "Wynik działania to: ";
    }

    @Override
    public void showMessage() {
        String message = "Kalkulator";
    }

    @Override
    public void close() {

    }
}
