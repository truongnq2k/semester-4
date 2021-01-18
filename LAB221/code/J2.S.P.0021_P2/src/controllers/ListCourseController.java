/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.Collections;
import ui.ListCourse;

/**
 *
 * @author admin
 */
public final class ListCourseController {

    private final ListCourse l;

    public ListCourseController(ListCourse l, ArrayList<Course> lc) {
        this.l = l;
        
        l.getTaList().setText("");
        display(lc);
    }

    public void display(ArrayList<Course> lc) {
        Collections.sort(lc);
        for (Course c : lc) {
            l.getTaList().append(c.toString());
        }
    }

}
