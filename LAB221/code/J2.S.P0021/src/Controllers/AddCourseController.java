package Controllers;

import UI.*;
import java.util.ArrayList;
import javax.swing.JButton;

class AddCourseController {

    public AddCourse a;

    public AddCourseController(AddCourse a, ArrayList<Course> listCourses) {
        this.a = a;

        JButton clear = a.getBtnClear();
        clear.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressClear();
            }
        });
    }

    public void pressClear() {
        a.getTfCode().setText("");
        a.getTfName().setText("");
        a.getTfCredit().setText("");
    }

    public void addCourses() {

    }

}
