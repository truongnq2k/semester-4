/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import model.Course;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hacken006
 */
public class Validation {

    //check code existed or not
    public boolean isExisted(String code, ArrayList<Course> lc) {
        for (Course c : lc) {
            if (code.equalsIgnoreCase(c.getCode())) {
                return true;
            }
        }
        return false;
    }

    //check credit is number and 0<credit<=33
    public String checkNumber(String cre, int min, int max) {
        while (true) {
            try {
                int credit = Integer.parseInt(cre);
                if (credit <= min || credit > max) {
                    throw new NumberFormatException();
                }
                return cre;
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    //check empty in form
    public String checkInputEmpty(String code, String name, String credit) {
        String str = "";
        if (code.equals("")) {
            str += " code";
        }
        if (name.equals("")) {
            str += " name";
        }
        if (credit.equals("")) {
            str += " credit";
        }
        return str;
    }

    public String formatName(String name) {
        name = name.toLowerCase();
        Matcher matcher = Pattern.compile("(?:^| )[^a-z]*[a-z]").matcher(name);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toUpperCase());
        }
        String nameFinal = matcher.appendTail(result).toString();
        nameFinal = nameFinal.replaceAll("And ", "and ");
        return nameFinal;
    }

}
