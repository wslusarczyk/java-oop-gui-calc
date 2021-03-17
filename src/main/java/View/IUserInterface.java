package View;

import java.util.List;

public interface IUserInterface {
    Enum getOperationType();
    List getArguments(int a, int b);
    String showResult();
    String showMessage();
    void close();
}
