
import Controllers.Course;
import java.util.ArrayList;

public class Validate {

    //Check code exist or not
    public boolean isExist(String code, ArrayList<Course> listCourses) {
        for (Course c : listCourses) {
            if (code.equalsIgnoreCase(c.getCode())) {
                return true;
            }
        }
        return false;
    }
}
