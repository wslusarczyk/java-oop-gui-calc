package view;

import model.OperationType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI implements IUserInterface {

    private Scanner scanner;

    public CLI() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public OperationType getOperationType() {
        String messageOperation = "Podaj rodzaj operacji jaką chcesz wykonać: \n+ Dodawnie \n- Odejmowanie \n* Mnożenie \n/ Dzielenie \na" +
                " " + "" +
                "Ostatni zapamiętany wynik \nz Zakończ program";
        System.out.println(messageOperation);
        String answer = scanner.nextLine();

        if (answer.equals("+")) {
            return OperationType.ADDITION;
        } else if (answer.equals("-")) {
            return OperationType.SUBTRACTION;
        } else if (answer.equals("a")) {
            return OperationType.LAST_ANS;
        } else if (answer.equals("z")) {
            return OperationType.FINISH;
        } else if (answer.equals("*")) {
            return OperationType.MULTIPLY;
        } else if (answer.equals("/")) {
            return OperationType.DIVIDE;
        }
        return OperationType.INVALID;
    }

    @Override
    public List<Double> getArguments() {
        List<Double> list = new ArrayList<>();

        for (int i = 1; i < 3; i++) {

            System.out.println("Podaj " + i + " liczbę ");
            double number = Double.parseDouble(scanner.nextLine());
            list.add(number);

        }
        return list;
    }

    @Override
    public void showResult(double operationResult) {
        System.out.println("Wynik działania to: " + operationResult);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void close() {
        scanner.close();
    }
}
