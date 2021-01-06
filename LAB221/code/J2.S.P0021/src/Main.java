
import UI.*;
import Controllers.*;

public class Main {

    public static void main(String[] args) {
        MenuGUIController m = new MenuGUIController(
                new MenuGUI(),
                new AddCourse(),
                new ListCourse(),
                new SearchCourse()
        );

    }
}
