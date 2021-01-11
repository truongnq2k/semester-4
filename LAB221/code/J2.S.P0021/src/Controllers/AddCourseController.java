package Controllers;

import UI.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class AddCourseController {

    Validate v = new Validate();

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

        JButton add = a.getBtnAdd();
        add.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourses(listCourses);
            }
        });

    }

    public void pressClear() {
        a.getTfCode().setText("");
        a.getTfName().setText("");
        a.getTfCredit().setText("");
    }

    public void addCourses(ArrayList<Course> listCourses) {
        if (a.getTfCode().getText().isEmpty()
                || a.getTfName().getText().isEmpty()
                || a.getTfCredit().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Input All!");
        } else {

            String code = a.getTfCode().getText();
            String name = a.getTfName().getText();
            //format name
            name = v.formatName(name);

            int credit = Integer.parseInt(a.getTfCredit().getText());

            if (v.isExist(code, listCourses)) {
                JOptionPane.showMessageDialog(null, "Code Is Existed!");
            } else {
                Course nc = new Course(code, name, credit);
                listCourses.add(nc);
                JOptionPane.showMessageDialog(null, "Add Course Successfully!");
            }
        }
    }
}
