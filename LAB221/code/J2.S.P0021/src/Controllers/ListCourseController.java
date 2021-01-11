package Controllers;

import UI.*;
import java.util.ArrayList;

public final class ListCourseController {
    
    public ListCourse l;
    
    public ListCourseController(ListCourse l, ArrayList<Course> listCourses) {
        this.l = l;
        l.getTaListAll().setText("");
        Display(listCourses);
    }
    
    public void Display(ArrayList<Course> listCourses) {
        for (Course c : listCourses) {
            l.getTaListAll().append(c.toString());
        }
    }
}
