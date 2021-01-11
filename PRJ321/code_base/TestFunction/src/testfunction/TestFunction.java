/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfunction;

/**
 *
 * @author hacken006
 */
public class TestFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "     nQyuean kjafDka aJANSK       ";
        name = name.trim();
        name = name.toLowerCase().replaceAll("\\s+", ",");
        String arr[] = name.split(",");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            sb.append(Character.toUpperCase(arr[j].charAt(0)))
                    .append(arr[j].substring(1)).append(" ");
        }
        System.out.println(sb.toString());
    }

}
