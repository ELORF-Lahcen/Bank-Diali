package bank.diali;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUp extends JFrame {
    JTextField textName;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);
    SignUp() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(100, 190, 100, 30);
        add(textName);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 700);
        setLocation(250, 20);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
