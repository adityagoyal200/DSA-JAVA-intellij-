import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberConverter extends JFrame {

    private JTextField decimalField;
    private JTextField hexField;
    private JTextField binaryField;

    public NumberConverter() {
        super("Number Converter");

        // Create the decimal value input field and label
        JLabel decimalLabel = new JLabel("Decimal Value:");
        decimalField = new JTextField(10);
        decimalField.addActionListener(new ConvertListener());

        // Create the hex value output field and label
        JLabel hexLabel = new JLabel("Hex Value:");
        hexField = new JTextField(10);
        hexField.setEditable(false);

        // Create the binary value output field and label
        JLabel binaryLabel = new JLabel("Binary Value:");
        binaryField = new JTextField(10);
        binaryField.setEditable(false);

        // Create the button to clear the fields
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearListener());

        // Add the components to the content pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        inputPanel.add(decimalLabel);
        inputPanel.add(decimalField);
        contentPane.add(inputPanel, BorderLayout.NORTH);
        JPanel outputPanel = new JPanel();
        outputPanel.add(hexLabel);
        outputPanel.add(hexField);
        outputPanel.add(binaryLabel);
        outputPanel.add(binaryField);
        contentPane.add(outputPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(clearButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        setContentPane(contentPane);

        // Set the size and visibility of the frame
        pack();
        setVisible(true);
    }

    private class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String decimalString = decimalField.getText();
            try {
                // Convert the input decimal string to a BigInteger
                BigInteger decimal = new BigInteger(decimalString);

                // Convert the decimal to hex and set the hex output field
                String hex = decimal.toString(16);
                hexField.setText(hex.toUpperCase());

                // Convert the decimal to binary and set the binary output field
                String binary = decimal.toString(2);
                binaryField.setText(binary);
            } catch (NumberFormatException ex) {
                // If the input string is not a valid decimal, clear the output fields
                hexField.setText("");
                binaryField.setText("");
            }
        }
    }

    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            decimalField.setText("");
            hexField.setText("");
            binaryField.setText("");
        }
    }

    public static void main(String[] args) {
        new NumberConverter();
    }

}
