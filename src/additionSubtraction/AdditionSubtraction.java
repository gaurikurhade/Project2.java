package additionSubtraction;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdditionSubtraction {

    private JFrame frame;
    private JTextField addvalue;
    private JTextField subvalue;
    private JTextField txtDisplay;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdditionSubtraction window = new AdditionSubtraction();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AdditionSubtraction() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        addvalue = new JTextField();
        addvalue.setFont(new Font("Tahoma", Font.BOLD, 25));
        addvalue.setBounds(72, 41, 153, 64);
        frame.getContentPane().add(addvalue);
        addvalue.setColumns(10);

        subvalue = new JTextField();
        subvalue.setFont(new Font("Tahoma", Font.BOLD, 25));
        subvalue.setColumns(10);
        subvalue.setBounds(467, 41, 153, 64);
        frame.getContentPane().add(subvalue);

        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int num1, num2, ans;
                try {
                    num1 = Integer.parseInt(addvalue.getText());
                    num2 = Integer.parseInt(subvalue.getText());
                    ans = num1 + num2;
                    txtDisplay.setText(Integer.toString(ans));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers are accepted");
                }
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAdd.setBounds(223, 171, 108, 51);
        frame.getContentPane().add(btnAdd);

        JButton btnSub = new JButton("SUB");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int num1, num2, ans;
                try {
                    num1 = Integer.parseInt(addvalue.getText());
                    num2 = Integer.parseInt(subvalue.getText());
                    ans = num1 - num2;
                    txtDisplay.setText(Integer.toString(ans));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers are accepted");
                }
            }
        });
        btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSub.setBounds(329, 171, 108, 51);
        frame.getContentPane().add(btnSub);

        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 25));
        txtDisplay.setBounds(136, 251, 401, 64);
        frame.getContentPane().add(txtDisplay);
        txtDisplay.setColumns(10);
    }
}
