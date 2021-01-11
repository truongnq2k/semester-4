package Controllers;

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

    //Format name
    public String formatName(String name) {
        // remove space head and foot
        name = name.trim();
        name = name.toLowerCase().replaceAll("\\s+", ",");
        String[] arr = name.split(",");
        StringBuilder sb = new StringBuilder();
        for (String a : arr) {
            sb.append(Character.toUpperCase(a.charAt(0))).append(a.substring(1)).append(" ");
        }
        return sb.toString();
    }

}
