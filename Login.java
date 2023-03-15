package Bank_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame{

    Login(){
        setTitle("Sky Banking");
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("Bank_Management\\src\\icons\\logo.jpg"));
        Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel Bank_text = new JLabel("Welcome to SKY Banking");
        Bank_text.setFont(new Font("Osward", Font.BOLD, 20));
        Bank_text.setBounds(180, 45, 700, 40);
        add(Bank_text);

        JLabel Card_Number_Text = new JLabel("Card Number: ");
        Card_Number_Text.setFont(new Font("Osward", Font.BOLD, 18));
        Card_Number_Text.setBounds(180, 85, 700, 40);
        add(Card_Number_Text);

        JLabel PinNumber_Text = new JLabel("PIN: ");
        PinNumber_Text.setFont(new Font("Osward", Font.BOLD, 15));
        PinNumber_Text.setBounds(180, 110, 700, 40);
        add(PinNumber_Text);


        getContentPane().setBackground(Color.WHITE);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
 
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Login();

    }
    
}
