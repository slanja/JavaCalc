import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm extends JFrame {
    private JPanel frame;
    private JTextField numTwo;
    private JTextField numOne;
    private JComboBox symbol;
    private JButton krysaButton;
    private JLabel resultLabel;
    private JButton plus;
    private JButton minus;
    private JButton astaris;
    private JButton three;
    private JButton six;
    private JButton nine;
    private JButton del;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton zero;
    private JButton seven;
    private JButton four;
    private JButton one;
    private JButton slash;
    private JLabel resultText;

    private void initComponents() {
        setContentPane(frame);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 500);
        setTitle("JavaCalc");
        setVisible(true);
        frame.setBackground(Color.decode("#2b2b2b"));
    }

    public CalcForm() {
        initComponents();
    }

    public static void main(String[] args) {
        new CalcForm();
    }
}
