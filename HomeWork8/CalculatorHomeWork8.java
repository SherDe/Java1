package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(150, 50, 400, 500);
        setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(4, 5));
        add(bottomPanel, BorderLayout.CENTER);

        ButtonActionListener digitButtonActionListener = new ButtonActionListener(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.addActionListener(digitButtonActionListener);
            bottomPanel.add(jButton);
        }


        JButton plus = new JButton("+");
        plus.addActionListener(digitButtonActionListener);
        bottomPanel.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(digitButtonActionListener);
        bottomPanel.add(minus);

        JButton umn = new JButton("*");
        umn.addActionListener(digitButtonActionListener);
        bottomPanel.add(umn);

        JButton del = new JButton("/");
        del.addActionListener(digitButtonActionListener);
        bottomPanel.add(del);

        JButton kor= new JButton("√");
        kor.addActionListener(digitButtonActionListener);
        bottomPanel.add(kor);

        JButton calc = new JButton("=");
        calc.addActionListener(new CalcActionListener(inputField));
        bottomPanel.add(calc);

        JButton clear = new JButton("C");
        ActionListener clearAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        };

        clear.addActionListener(clearAction);
        bottomPanel.add(clear);

        JButton na = new JButton("N\\A");
        bottomPanel.add(na);



        setVisible(true);
    }
}

