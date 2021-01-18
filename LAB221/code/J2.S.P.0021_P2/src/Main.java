
import controllers.Course;
import controllers.CourseManagementController;
import java.util.ArrayList;
import ui.AddCourse;
import ui.CourseManagement;
import ui.ListCourse;
import ui.SearchCourse;

/**
 *
 * @author hacken006
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Course> lc = new ArrayList<>();
        CourseManagementController c = new CourseManagementController(
                new AddCourse(null, true),
                new ListCourse(null, true),
                new CourseManagement(),
                new SearchCourse(null, true), lc);
    }
}
