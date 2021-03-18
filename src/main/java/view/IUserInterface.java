package view;

import model.OperationType;

import java.util.List;

public interface IUserInterface {
    OperationType getOperationType();
    List<Double> getArguments();
    void showResult();
    void showMessage();
    void close();
}
