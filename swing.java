import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing extends JFrame implements ActionListener {
     
    JTextField textField1;
    JTextField textField2;
    JButton reverseButton;
    JButton clearButton;
    JLabel l1;
    JLabel l2;

    swing() {
        setTitle("String Reversal");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField2.setEditable(false); // Make textField2 read-only

        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        l1 = new JLabel("String1");
        l2 = new JLabel("String2");

        add(l1);
        add(textField1);
        add(l2);
        add(textField2);
        add(reverseButton);
        add(clearButton);
        pack(); // Adjust frame size to fit components
        setVisible(true);
    }

    public static void main(String[] args) {
        swing s = new swing();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reverseButton) {
            String original = textField1.getText();
            StringBuilder reversed = new StringBuilder(original).reverse();
            textField2.setText(reversed.toString());
        } else if (e.getSource() == clearButton) {
            textField1.setText("");
            textField2.setText("");
        }
    }
}
