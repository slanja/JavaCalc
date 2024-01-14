import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm extends JFrame {
    private JPanel frame;
    private JButton plus;
    private JButton minus;
    private JButton times;
    private JButton three;
    private JButton six;
    private JButton nine;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton zero;
    private JButton seven;
    private JButton four;
    private JButton one;
    private JButton division;
    private JButton equal;
    private JButton del;
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
            String operation;
            double result;
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource() == zero) resultLabel.setText(resultLabel.getText() + zero.getText());
                else if (actionEvent.getSource() == one) resultLabel.setText(resultLabel.getText() + one.getText());
                else if (actionEvent.getSource() == two) resultLabel.setText(resultLabel.getText() + two.getText());
                else if (actionEvent.getSource() == three) resultLabel.setText(resultLabel.getText() + three.getText());
                else if (actionEvent.getSource() == four) resultLabel.setText(resultLabel.getText() + four.getText());
                else if (actionEvent.getSource() == five) resultLabel.setText(resultLabel.getText() + five.getText());
                else if (actionEvent.getSource() == six) resultLabel.setText(resultLabel.getText() + six.getText());
                else if (actionEvent.getSource() == seven) resultLabel.setText(resultLabel.getText() + seven.getText());
                else if (actionEvent.getSource() == eight) resultLabel.setText(resultLabel.getText() + eight.getText());
                else if (actionEvent.getSource() == nine) resultLabel.setText(resultLabel.getText() + nine.getText());

                else if (actionEvent.getSource() == plus) {
                    resultLabel.setText(resultLabel.getText() + plus.getText());
                    operation = plus.getText();

                    disableOperation();
                }

                else if (actionEvent.getSource() == minus) {
                    resultLabel.setText(resultLabel.getText() + minus.getText());
                    operation = minus.getText();

                    disableOperation();
                }

                else if (actionEvent.getSource() == times) {
                    resultLabel.setText(resultLabel.getText() + times.getText());
                    operation = "\\%s".formatted(times.getText());

                    disableOperation();
                }

                else if (actionEvent.getSource() == division) {
                    resultLabel.setText(resultLabel.getText() + division.getText());
                    operation = "\\%s".formatted(division.getText());

                    disableOperation();
                }

                else if (actionEvent.getSource() == equal) {
                    // ZDEmagie
                    String[] resultText = resultLabel.getText().split(operation);

                    switch (operation) {
                        case "+":
                            result = Double.parseDouble(resultText[0]) + Double.parseDouble(resultText[1]);
                            resultLabel.setText(String.valueOf(result));
                            break;
                        case "-":
                            result = Double.parseDouble(resultText[0]) - Double.parseDouble(resultText[1]);
                            resultLabel.setText(String.valueOf(result));
                            break;
                        case "\\*":
                            result = Double.parseDouble(resultText[0]) * Double.parseDouble(resultText[1]);
                            resultLabel.setText(String.valueOf(result));
                            break;
                        case "\\/":
                            if (Double.parseDouble(resultText[0]) != 0 || Double.parseDouble(resultText[1]) != 0) {
                                result = Double.parseDouble(resultText[0]) / Double.parseDouble(resultText[1]);
                                resultLabel.setText(String.valueOf(result));
                            } else resultLabel.setText("Zero division");
                            break;
                        default:
                            throw new IllegalStateException("ERROR");
                    }
                    enableOperation();
                }
            }
        };

        zero.addActionListener(buttonListener);
        one.addActionListener(buttonListener);
        two.addActionListener(buttonListener);
        three.addActionListener(buttonListener);
        four.addActionListener(buttonListener);
        five.addActionListener(buttonListener);
        six.addActionListener(buttonListener);
        seven.addActionListener(buttonListener);
        eight.addActionListener(buttonListener);
        nine.addActionListener(buttonListener);

        plus.addActionListener(buttonListener);
        minus.addActionListener(buttonListener);
        times.addActionListener(buttonListener);
        division.addActionListener(buttonListener);

        equal.addActionListener(buttonListener);
    }

    public void disableOperation() {
        plus.setEnabled(false);
        minus.setEnabled(false);
        times.setEnabled(false);
        division.setEnabled(false);
    }

    public void enableOperation() {
        plus.setEnabled(true);
        minus.setEnabled(true);
        times.setEnabled(true);
        division.setEnabled(true);
    }

    public static void main(String[] args) {
        new CalcForm();
    }
}