package View;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CLI implements IUserInterface {
    @Override
    public Enum getOperationType() {
        return null;
    }

    @Override
    public List getArguments(int a, int b) {
        List list = new ArrayList();
        list.add(a,b);
        return list;
    }

    @Override
    public String showResult() {
        return null;
    }

    @Override
    public String showMessage() {
        return null;
    }

    @Override
    public void close() {

    }
}
