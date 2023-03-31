package Bank_Management;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

    JButton SignInButton, ClearButton, SignUPButton;
    JTextField cardTextField;
    JPasswordField pinTextField;
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
        Card_Number_Text.setFont(new Font("Osward", Font.PLAIN, 18));
        Card_Number_Text.setBounds(180, 85, 700, 40);
        add(Card_Number_Text);

        cardTextField = new JTextField();
        cardTextField.setBounds(330, 95, 200, 25);
        add(cardTextField);

        JLabel PinNumber_Text = new JLabel("PIN: ");
        PinNumber_Text.setFont(new Font("Osward", Font.PLAIN, 15));
        PinNumber_Text.setBounds(180, 120, 700, 40);
        add(PinNumber_Text);

        Color Orange_color = new Color(255, 51, 0);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(330, 130, 200, 25);
        add(pinTextField);

        SignInButton = new JButton("SIGN IN");
        SignInButton.setBounds(290, 230, 110, 30);
        SignInButton.setFont(new Font("Osward", Font.BOLD, 15));
        SignInButton.setBackground(Color.blue);
        SignInButton.setForeground(Color.white);
        SignInButton.addActionListener(this);
        add(SignInButton);

        ClearButton = new JButton("CLEAR");
        ClearButton.setBounds(420, 230, 90, 30);
        ClearButton.setBackground(Color.GRAY);
        ClearButton.setForeground(Color.WHITE);
        ClearButton.addActionListener(this);
        add(ClearButton);

        SignUPButton = new JButton("SIGN UP");
        SignUPButton.setBounds(300, 300, 190, 30);
        SignUPButton.setBackground(Orange_color);
        SignUPButton.setFont(new Font("Osward", Font.BOLD, 18));
        SignUPButton.setForeground(Color.white);
        SignUPButton.addActionListener(this);
        add(SignUPButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
 
    }

    public void actionPerformed(ActionEvent e_login_Page){
        if (e_login_Page.getSource() == ClearButton){
            cardTextField.setText(null);
            pinTextField.setText(null);

        }
        else if(e_login_Page.getSource() == SignInButton){
            String Card_Number = cardTextField.getText();
            String PIN_Number = pinTextField.getText();
            Connetctiondb c = new Connetctiondb();
            String query = "Select * from login where cardNumber = '"+Card_Number+"' and pinNumber = '"+PIN_Number+"'";

            try {
                ResultSet rs = c.s.executeQuery(query);
                System.out.println(rs);
                if(rs.next()){
                    setVisible(false);
                    new Transactions().setVisible(true);
                };


            } catch (Exception e) {

                System.out.println("Login ERROR");
                JOptionPane.showMessageDialog(null, "Login ERROR");
            }

        }
        else if(e_login_Page.getSource() == SignUPButton){
            setVisible(false);
            new SignupOne().setVisible(true);

        }
    }



    public static void main(String[] args) {
        System.out.println("Hello World");
        new Login();

    }
    
}
