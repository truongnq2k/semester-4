package controllers;

import java.util.ArrayList;
import ui.*;

/**
 *
 * @author admin
 */
public class CourseManagementController {

    private final AddCourse a;
    private final ListCourse l;
    private final CourseManagement c;
    private final SearchCourse s;

    public CourseManagementController(AddCourse a, ListCourse l, CourseManagement c, SearchCourse s, ArrayList<Course> lc) {
        this.a = a;
        this.l = l;
        this.c = c;
        this.s = s;

        c.setVisible(true);
        c.setLocationRelativeTo(null);
        //show add dialog
        c.getBtnAdd().addActionListener((java.awt.event.ActionEvent evt) -> {
            a.setTitle("Add Course");
            a.setVisible(true);
        });

        //show list dialog
        c.getBtnList().addActionListener((java.awt.event.ActionEvent evt) -> {
            ListCourseController list = new ListCourseController(l, lc);
            l.setTitle("List All Course");
            l.setVisible(true);
        });

        //show search dialog
        c.getBtnSearch().addActionListener((java.awt.event.ActionEvent evt) -> {
            SearchCourseController search = new SearchCourseController(s, lc);
            s.setTitle("Search Course");
            s.setVisible(true);
        });
        //exit app
        c.getBtnExit().addActionListener((java.awt.event.ActionEvent evt) -> {
            System.exit(0);
        });

        AddCourseController add = new AddCourseController(a, lc);
    }

}
