/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzlegam;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author longd
 */
public class Controller {

    GUI g;
    private int size = 0;
    private JButton[][] matrix;
    private int countMove = 0;
    private Timer timer;
    private boolean isGameStart = true;
    private int NORMAL_MARGIN = 10;
    private int sizeButton = 60 ;

    public Controller(GUI g) {
        this.g = g;
        g.setVisible(true);
        g.setLocationRelativeTo(null);
        addButton();
        JButton b = g.getBtnNewgame();
        runGame();
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGame();
            }
        });
    }

    public void addButton() {
        String txt = g.cbxSize.getSelectedItem().toString();
        String[] s = txt.split("x");
        size = Integer.parseInt(s[0]);
        
        int width = sizeButton * size +(size-1)*NORMAL_MARGIN;
        int height = sizeButton * size+(size-1)*NORMAL_MARGIN;
        g.pnLayout.removeAll();
        g.pnLayout.setLayout(new GridLayout(size, size, NORMAL_MARGIN, NORMAL_MARGIN));
        // xet do rong cho button
        g.pnLayout.setPreferredSize(new Dimension(width, height));
        // get value it size  3x3 4x4 5x5
        matrix = new JButton[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //set so trong button
                JButton button = new JButton(i * size + j + 1 + "");   //0 0 -> 1//0 1 ->2
                //dung mang 2 chieu control(dieu khien) button tren pannel
                matrix[i][j] = button;
                g.pnLayout.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (isGameStart) {
                            if (checkMove(button)) {
                                moveButton(button);
                                moveCountIncrease();
                                if (checkWin()) {
                                    timer.stop();
                                    JOptionPane.showMessageDialog(null, "you win");
                                    Component t[] = g.pnLayout.getComponents();
                                    for (int i = 0; i < t.length; i++) {
                                        t[i].setEnabled(false);
                                    }

                                }
                            }
                        }
                    }
                });

            }
        }
        matrix[size - 1][size - 1].setText("");
        randomMatrix();
        g.setResizable(false);
        g.pack();//de panel can xung voi khung ben ngoai

    }

    public Point getPositonEmptyButton() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j].getText().equals("")) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    public void randomMatrix() {
        Random rd = new Random();
        for (int i = 0; i < 1000; i++) {
            Point p = getPositonEmptyButton();
            int choose = rd.nextInt(4);
            switch (choose) {
                // up
                case 0:
                    if (p.x > 0) {
                        matrix[p.x][p.y].setText(matrix[p.x - 1][p.y].getText());
                        matrix[p.x - 1][p.y].setText("");
                    }
                    break;
                //right
                case 1:
                    if (p.y < size - 1) {
                        matrix[p.x][p.y].setText(matrix[p.x][p.y + 1].getText());
                        matrix[p.x][p.y + 1].setText("");
                    }
                    break;
                //down
                case 2:
                    if (p.x < size - 1) {
                        matrix[p.x][p.y].setText(matrix[p.x + 1][p.y].getText());
                        matrix[p.x + 1][p.y].setText("");
                    }
                    break;
                //left
                case 3:
                    if (p.y > 0) {
                        matrix[p.x][p.y].setText(matrix[p.x][p.y - 1].getText());
                        matrix[p.x][p.y - 1].setText("");
                    }
                    break;

            }
        }
    }

    public boolean checkMove(JButton btn) {
        if (btn.getText().equals("")) {
            return false;
        }
        Point p = getPositonEmptyButton();  //lay vi tri rong
        Point clickedPoint = null;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j].getText().equals(btn.getText())) {
                    clickedPoint = new Point(i, j);  //lay vi tri clicked button
                }
            }
        }
        if (p.x == clickedPoint.x && Math.abs(p.y - clickedPoint.y) == 1) {
            return true;
        }

        if (p.y == clickedPoint.y && Math.abs(p.x - clickedPoint.x) == 1) {
            return true;
        }

        return false;
    }

    public void moveButton(JButton btn) {
        Point p = getPositonEmptyButton(); //lay vi tri cua button rong
        matrix[p.x][p.y].setText(btn.getText());
        btn.setText("");

    }

    public void moveCountIncrease() {
        countMove++;
        g.lblcountmove.setText(countMove + "");
    }

    public boolean checkWin() {
        if (!matrix[size - 1][size - 1].getText().equalsIgnoreCase("")) {
            return false;
        }
        int number = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size - 1 && j == size - 1) {
                    break;
                }
                if (!matrix[i][j].getText().equalsIgnoreCase(number + "")) {
                    return false;
                }
                number++;
            }
        }
        return true;
    }

    public void moveCountTimeIncrease() {
        countMove = 0;
        timer = new Timer(1000, new ActionListener() {
            int second = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                second++;
                g.lblcounttime.setText(String.valueOf(second));
            }
        });
        timer.start();

    }

    public void runGame() {
        g.lblcounttime.setText("0");
        g.lblcountmove.setText("0");
        moveCountTimeIncrease();
        addButton();
        isGameStart = true;
    }

    public void newGame() {

        if (isGameStart) {
            timer.stop();
            int confirm = JOptionPane.showConfirmDialog(null, "Do you must"
                    + " be want to make new game?", "New Game", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                runGame();
            } else {
                timer.start();
            }
            if(checkWin()){
                timer.stop();
            }
        } 
    }
}
