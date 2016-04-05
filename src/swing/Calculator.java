package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MBCNEWMAIN on 05.04.2016.
 */
public class Calculator extends JFrame {
    private JPanel panel;
    private JTextField input;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton plusButton;
    private JButton a0Button;
    private JButton equalButton;

    public Calculator() {
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);

        ActionListener listener = new ActionListener() {
            private int value;

            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                switch (command) {
                    case "+":
                        value = Integer.parseInt(input.getText());
                        input.setText("");
                        break;
                    case "=":
                        int secondValue = Integer.parseInt(input.getText());
                        input.setText(Integer.toString(value + secondValue));
                        break;
                    default:
                        String text = input.getText();
                        input.setText(text + command);
                }

            }
        };

        a1Button.addActionListener(listener);
        a2Button.addActionListener(listener);
        a3Button.addActionListener(listener);
        a4Button.addActionListener(listener);
        a5Button.addActionListener(listener);
        a6Button.addActionListener(listener);
        a7Button.addActionListener(listener);
        a8Button.addActionListener(listener);
        a9Button.addActionListener(listener);
        plusButton.addActionListener(listener);
        a0Button.addActionListener(listener);
        equalButton.addActionListener(listener);

        a1Button.setActionCommand("1");
        a2Button.setActionCommand("2");
        a3Button.setActionCommand("3");
        a4Button.setActionCommand("4");
        a5Button.setActionCommand("5");
        a6Button.setActionCommand("6");
        a7Button.setActionCommand("7");
        a8Button.setActionCommand("8");
        a9Button.setActionCommand("9");
        plusButton.setActionCommand("+");
        a0Button.setActionCommand("0");
        equalButton.setActionCommand("=");

        input.setEnabled(false);


    }

    public static void main(String[] args) {
        new Calculator();
    }
}
