package controllers;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import ui.SearchCourse;

/**
 *
 * @author admin
 */
public class SearchCourseController {

    private final SearchCourse s;

    public SearchCourseController(SearchCourse s, ArrayList<Course> lc) {
        this.s = s;
        s.getBtnSearch().addActionListener((java.awt.event.ActionEvent evt) -> {
            String code = s.getTfCode().getText();
            search(code, lc);
        });
    }

    public void search(String code, ArrayList<Course> lc) {
        int check = 0;
        for (Course c : lc) {
            if (c.getCode().equalsIgnoreCase(code)) {
                s.getTfName().setText(c.getName());
                s.getTfCredit().setText(c.getCredit() + "");
                check++;
                break;
            }
        }
        if (check == 0) {
            JOptionPane.showMessageDialog(null, "Code doesn't exist !");
        }
    }

}
