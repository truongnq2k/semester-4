package bean;

import java.io.Serializable;

/**
 *
 * @author hacken006
 */
public class Calculator implements Serializable {

    private int num1 = 0, num2 = 0;
    private String op = "cong";

    public Calculator() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getResult() {
        String t = "";
        switch (op) {
            case "cong":
                t = "Sum: " + (num1 + num2);
                break;
            case "tru":
                t = "Sum: " + (num1 - num2);
                break;
            case "nhan":
                t = "Sum: " + (num1 * num2);
                break;
            case "chia":
                if (num2 == 0) {
                    t = "Can't div for zero!!";
                } else {
                    t = "Sum: " + (num1 / num2);
                }
                break;
        }
        return t;
    }

}
