package view;

import model.OperationType;

import java.util.List;

public interface IUserInterface {
    OperationType getOperationType();
    List<Double> getArguments();
    void showResult(double operationResoult);
    void showMessage(String message);
    void close();
}
