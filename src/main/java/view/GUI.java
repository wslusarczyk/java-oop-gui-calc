package view;

import model.OperationType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI implements IUserInterface {

    private JFrame frame;

    public GUI() {
        frame = new JFrame("FrameDemo");
        frame.setMinimumSize(new Dimension(800, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel myLabel = new JLabel("SUPER KALKULATOR", SwingConstants.CENTER);
        myLabel.setFont(new Font("Serif", Font.BOLD, 22));
        myLabel.setBackground(Color.blue);
        myLabel.setOpaque(true);
        myLabel.setPreferredSize(new Dimension(100, 80));

        frame.getContentPane().add(myLabel, BorderLayout.NORTH);
        frame.setVisible(true);


    }

    @Override
    public OperationType getOperationType() {
        Object[] possibilities = {"Dodawanie", "Odejmowanie","Mnozenie","Dzielenie", "Ostatnie dzialanie", "Zamknij program"};
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Wybierz rodzaj operacji",
                "Rodzaj operacji",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "Zamknij program");
        switch (s) {
            case "Dodawanie":
                return OperationType.ADDITION;
            case "Odejmowanie":
                return OperationType.SUBTRACTION;
            case "Mnozenie":
                return OperationType.MULTIPLY;
            case "Dzielenie":
                return OperationType.DIVIDE;
            case "Ostatnie dzialanie":
                return OperationType.LAST_ANS;
            case "Zamknij program":
                return OperationType.FINISH;
            default:
                return OperationType.INVALID;
        }
    }

    @Override
    public List<Double> getArguments() {
        List<Double> list = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            String sTwo = (String) JOptionPane.showInputDialog(
                    frame,
                    "Podaj "+ i +" liczbe ",
                    "Podaj liczbe",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    "");

            list.add(Double.parseDouble(sTwo));
        }

        return list;
    }

    @Override
    public void showResult(double operationResoult) {

        JOptionPane.showMessageDialog(frame, "Wynik dzialania to: " + operationResoult);
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);

    }

    @Override
    public void close() {
        frame.dispose();
    }
}
