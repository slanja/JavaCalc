import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CalcForm extends JFrame {
    private JPanel frame;
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
    private JButton krysaButton;
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

        final int[] numOne = {0};
        int numTwo = 0;
        double result = 0;

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numOne[0] = Integer.parseInt(one.getText());
                resultLabel.setText(Arrays.toString(numOne));
            }
        });
    }

    public static void main(String[] args) {
        new CalcForm();
    }
}
