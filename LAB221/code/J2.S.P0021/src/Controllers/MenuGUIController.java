package Controllers;

import UI.*;
import java.util.ArrayList;

public class MenuGUIController {

    private final MenuGUI m;
    private final AddCourse a;
    private final ListCourse l;
    private final SearchCourse s;

    public MenuGUIController(MenuGUI m, AddCourse a, ListCourse l, SearchCourse s, ArrayList<Course> listCourses) {

        this.m = m;
        this.a = a;
        this.l = l;
        this.s = s;
        m.setVisible(true);

        // Call Add Course
        m.getBtnAdd().addActionListener((java.awt.event.ActionEvent evt) -> {
            a.setVisible(true);
        });

        //Call List Course
        m.getBtnDisplay().addActionListener((java.awt.event.ActionEvent evt) -> {
            ListCourseController listCourse = new ListCourseController(l, listCourses);
            l.setVisible(true);
        });

        //Call Search Course
        m.getBntSearch().addActionListener((java.awt.event.ActionEvent evt) -> {
            s.setVisible(true);
        });

        //EXIT
        m.getBtnExit().addActionListener((java.awt.event.ActionEvent evt) -> {
            System.exit(0);
        });

        AddCourseController addCourse = new AddCourseController(a, listCourses);

    }
}
