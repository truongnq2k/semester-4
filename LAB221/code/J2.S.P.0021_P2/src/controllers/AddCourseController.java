package controllers;

import model.Course;
import validate.Validation;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ui.AddCourse;

/**
 *
 * @author admin
 */
public class AddCourseController {

    Validation v = new Validation();
    private final AddCourse a;

    public AddCourseController(AddCourse a, ArrayList<Course> lc) {
        this.a = a;

        //Add
        a.getBtnAdd().addActionListener((java.awt.event.ActionEvent evt) -> {
            addCourse(lc);
        });

        //Clear form
        a.getBtnClear().addActionListener((java.awt.event.ActionEvent evt) -> {
            pressClear();
        });

    }

    //Add
    public void addCourse(ArrayList<Course> lc) {
        String code = a.getTfCode().getText();
        String name = a.getTfName().getText();
        String cre = a.getTfCredit().getText();

        String checkin = v.checkInputEmpty(code, name, cre);
        if (!checkin.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input" + checkin);
        } else {
            name = v.formatName(name);
            cre = v.checkNumber(cre, 0, 33);
            if (v.isExisted(code, lc)) {
                JOptionPane.showMessageDialog(null, "Code is existed !");
            } else if (cre == null) {
                JOptionPane.showMessageDialog(null, "Credit is number and in rang (0-33] !");
            } else {
                int credit = Integer.parseInt(cre);
                Course c = new Course(code, name, credit);
                lc.add(c);
                JOptionPane.showMessageDialog(null, "Add course successfully !");
            }
        }

    }

    //Clear button
    public void pressClear() {
        a.getTfCode().setText("");
        a.getTfName().setText("");
        a.getTfCredit().setText("");
    }

}
