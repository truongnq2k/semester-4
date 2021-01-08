
import Controllers.Course;
import UI.*;
import Controllers.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Course> listCourses = new ArrayList<>();

        MenuGUIController m = new MenuGUIController(
                new MenuGUI(),
                new AddCourse(),
                new ListCourse(),
                new SearchCourse(),
                listCourses
        );

    }
}
