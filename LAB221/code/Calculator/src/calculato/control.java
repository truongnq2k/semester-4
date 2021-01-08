/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author longd
 */
public class control implements ActionListener {

    private GUI g;
    private boolean process = false;
    private boolean reset;
    private int operate = 0;
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private BigDecimal memory = new BigDecimal("0");

    public control(GUI g) {
        this.g = g;
        g.setVisible(true);
        pressNumber();
        JButton b = g.getBtnadd();
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator(1);
            }
        });
        JButton c = g.getBtnsub();
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator(2);
            }
        });
        JButton d = g.getBtnmul();
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator(3);
            }
        });
        JButton e = g.getBtndive();
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operator(4);
            }
        });
        JButton btnequal = g.getBtneq();
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressEqual();
            }
        });
        JLabel reset = g.getJreset();
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pressReset();
            }
        });
        JButton btndot = g.getBtndi();
        JTextField text = g.getTxtscreen();
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressDot(text);
            }
        });
        JButton btnsqr = g.getBtnsqrt();
        btnsqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressSqrt();
            }
        });
        JButton btnne = g.getBtnnega();
        btnne.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressNegate();
            }
        });
        JButton btnPe = g.getBtnPer();
        btnPe.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressPercent();
            }
        });
        JButton btninver = g.getBtninvert();
        btninver.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressInvert();
            }
        });
        JButton btnMcc = g.getBtnMC();
        btnMcc.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressMC();
            }
        });
        JButton btnMr = g.getBtnMr();
        btnMr.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressMR();
            }
        });
        JButton btnMa = g.getBtnMa();
        btnMa.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressMAdd();
            }
        });
        JButton btnMs = g.getBtnMs();
        btnMs.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressMSub();
            }
        });
    }

    public void pressNumber() {
        g.getBtn0().addActionListener(this);
        g.getBtn1().addActionListener(this);
        g.getBtn2().addActionListener(this);
        g.getBtn3().addActionListener(this);
        g.getBtn4().addActionListener(this);
        g.getBtn5().addActionListener(this);
        g.getBtn6().addActionListener(this);
        g.getBtn7().addActionListener(this);
        g.getBtn8().addActionListener(this);
        g.getBtn9().addActionListener(this);

    }

    public void pressReset() {
        operate = 0;
        firstNumber = new BigDecimal("0");
        process = false;
        g.getTxtscreen().setText("0");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String txt = ae.getActionCommand();
        if (process || reset) {
            g.getTxtscreen().setText("0");
            process = false;
            reset = false;
        }
        String temp = g.getTxtscreen().getText() + txt;
        BigDecimal number = new BigDecimal(temp);
        g.getTxtscreen().setText(number.toPlainString() + "");
    }

    public void operator(int operate) {
        calculator();
        this.operate = operate;
        process = true;
    }

    public BigDecimal getNumber() {
        BigDecimal num;
        try {
            num = new BigDecimal(g.getTxtscreen().getText());

        } catch (Exception e) {
            return firstNumber;
        }
        return num;
    }

    public void pressEqual() {
        calculator();
        operate = 0;    
    }

    public void pressDot(JTextField text) {
        if (process || reset) {
            text.setText("0");
            process = false;
            reset = false;
        }
        if (!text.getText().contains(".")) {
            text.setText(text.getText() + ".");
        }
    }

    public void pressInvert() {
        pressEqual();
       
        BigDecimal result = getNumber();
        if (result != BigDecimal.ZERO) {
            result = BigDecimal.ONE.divide(result);
            g.getTxtscreen().setText(result.stripTrailingZeros().toPlainString());
            process = false;
        } else {
            g.getTxtscreen().setText("ERROR");
        }
        reset = true;
        
    }

    public void pressSqrt() {
        pressEqual();
      
        BigDecimal result = getNumber();
        if (result.doubleValue() >= 0) {
            String display = Math.sqrt(result.doubleValue()) + "";
            if (display.endsWith(".0")) {
                display = display.replace(".0", "");
            }
            g.getTxtscreen().setText(display);
            process = false;
        } else {
            g.getTxtscreen().setText("ERROR");
        }
        reset = true;
        
    }

    public void pressNegate() {
        pressEqual();
        g.getTxtscreen().setText(getNumber().negate() + "");
        process = false;
        reset = true;
        
    }

    public void pressPercent() {
       pressEqual();
        double result = getNumber().doubleValue() / 100;
        String display =  result + "";
            if (display.endsWith(".0")) {
                display = display.replace(".0", "");
            }
        g.getTxtscreen().setText(display + "");
         process = false;
        reset = true;
        
    }

    public void calculator() {       
            // take only 1 operate
            if (process == false) {
                // codition take first number
                if (operate == 0) {
                    firstNumber = getNumber();
                } else {
                    secondNumber = getNumber();
                    switch (operate) {
                        case 1:
                            firstNumber = firstNumber.add(secondNumber);
                            break;
                        case 2:
                            firstNumber = firstNumber.subtract(secondNumber);
                            break;
                        case 3:
                            firstNumber = firstNumber.multiply(secondNumber);
                            break;
                        case 4:
                            if (secondNumber.doubleValue() == 0) {
                                g.getTxtscreen().setText("ERROR");  
                              process = true;
                                return;
                            }
                            firstNumber = firstNumber.divide(secondNumber, 15, RoundingMode.HALF_UP).stripTrailingZeros();
                            break;
                    }

                }
          
                g.getTxtscreen().setText(firstNumber.stripTrailingZeros().toPlainString() + "");
               process = true;
            }
    }

    public void pressMR() {
        g.getTxtscreen().setText(memory + "");

    }

    public void pressMC() {
        memory = new BigDecimal("0");
    }

    public void pressMAdd() {
        memory = memory.add(getNumber());
        process = false;
        reset = true;
       
    }

    public void pressMSub() {
        memory = memory.add(getNumber().negate());
        process = false;
        reset = true;
       
    }

}
