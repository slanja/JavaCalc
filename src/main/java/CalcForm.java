import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CalcForm extends JFrame {
    private JPanel frame;
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
    private JButton krysaButton;
    private JTextField resultLabel;

    private void initComponents() {
        setContentPane(frame);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 500);
        setMinimumSize(new Dimension(350, 500));
        setMaximumSize(new Dimension(350, 500));
        setTitle("JavaCalc");
        setVisible(true);
        frame.setBackground(Color.decode("#2b2b2b"));
    }

    public CalcForm() {
        initComponents();

        buttonListener();
    }

    public void buttonListener() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource() == one) resultLabel.setText(resultLabel.getText() + one.getText());
                else if (actionEvent.getSource() == two) resultLabel.setText(resultLabel.getText() + two.getText());
                else if (actionEvent.getSource() == three) resultLabel.setText(resultLabel.getText() + three.getText());
                else if (actionEvent.getSource() == four) resultLabel.setText(resultLabel.getText() + four.getText());
                else if (actionEvent.getSource() == five) resultLabel.setText(resultLabel.getText() + five.getText());
                else if (actionEvent.getSource() == six) resultLabel.setText(resultLabel.getText() + six.getText());
                else if (actionEvent.getSource() == seven) resultLabel.setText(resultLabel.getText() + seven.getText());
                else if (actionEvent.getSource() == eight) resultLabel.setText(resultLabel.getText() + eight.getText());
                else if (actionEvent.getSource() == nine) resultLabel.setText(resultLabel.getText() + nine.getText());
            }
        };

        one.addActionListener(buttonListener);
        two.addActionListener(buttonListener);
        three.addActionListener(buttonListener);
        four.addActionListener(buttonListener);
        five.addActionListener(buttonListener);
        six.addActionListener(buttonListener);
        seven.addActionListener(buttonListener);
        eight.addActionListener(buttonListener);
        nine.addActionListener(buttonListener);
    }

    public static void main(String[] args) {
        new CalcForm();
    }
}
