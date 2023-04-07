package Bank_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener{

    JButton Exit_Btn_Withdrawl, Back_Btn, Withdrawl_btn;
    String PIN_Number;
    JTextField Deposit_Field_Area;


    Withdrawl(String PIN_Number){
        this.PIN_Number = PIN_Number;
        setTitle("Withdrawl Page");
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("Bank_Management\\src\\icons\\atm.jpg"));
        Image i2 = il.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);


        JLabel Withdrawl_Text = new JLabel("Enter your Withdrawl Amount: ");
        Withdrawl_Text.setFont(new Font("Raleway", Font.BOLD, 15));
        Withdrawl_Text.setForeground(Color.WHITE);
        Withdrawl_Text.setBounds(150,350,300,35);
        image.add(Withdrawl_Text);




        Deposit_Field_Area = new JTextField();
        Deposit_Field_Area.setBackground(Color.white);
        Deposit_Field_Area.setBounds(150, 385, 230, 25);
        image.add(Deposit_Field_Area);

        Withdrawl_btn = new JButton("WITHDRAWL");
        Withdrawl_btn.setBounds(230,420,140,25);

        image.add(Withdrawl_btn);


        Back_Btn = new JButton("Back");
        Back_Btn.setBounds(370,470,140,30);
        image.add(Back_Btn);


        Exit_Btn_Withdrawl = new JButton("Exit");
        Exit_Btn_Withdrawl.setBounds(370,510,150,35);
        image.add(Exit_Btn_Withdrawl);




        Exit_Btn_Withdrawl.addActionListener(this);
        Back_Btn.addActionListener(this);
        Withdrawl_btn.addActionListener(this);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);


    }



    public void actionPerformed(ActionEvent ee){
        if (ee.getSource() == Exit_Btn_Withdrawl){
            System.exit(0);
            JOptionPane.showMessageDialog(null, "System EXIT");
        }


        else if (ee.getSource() ==  Withdrawl_btn){
            String amount = Deposit_Field_Area.getText();
            Date date = new Date();
            System.out.println("Date: " + date);
            System.out.println("Withdrawl BUTTON CLICKED");
                if(amount.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter Your Valid Amount");
                }
                else{
                    try {
                        Connetctiondb c = new Connetctiondb();
                        String query = "insert into bank values ('"+PIN_Number+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                        c.s.executeUpdate(query);
                        setVisible(false);
                        new Transactions("").setVisible(true);
                        JOptionPane.showMessageDialog(null, "Withdrawl Successful." + "\n" + "Amount = " + amount);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Withdrawl Failed. Try Again");
                    }
                    
                }
        }


        else if(ee.getSource() == Back_Btn){
            setVisible(false);
            new Transactions("").setVisible(true);
        }

    }


    public static void main(String[] args) {
        new Withdrawl("");        
    }
     
}
