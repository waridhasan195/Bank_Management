
package Bank_Management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField Pass_field_1,Pass_field_2;
    JButton Change_btn,Back_btn;                               
    JLabel l1,l2,l3;
    String PIN_Number;
    PinChange(String PIN_Number){
        this.PIN_Number = PIN_Number;
        System.out.println("Reference PIN_Number: " + PIN_Number);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Bank_Management\\src\\icons\\atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 960, 1080);
        add(l4);
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);
        
        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);
        Pass_field_1 = new JPasswordField();
        Pass_field_1.setFont(new Font("Raleway", Font.BOLD, 25));
        Pass_field_1.setBounds(350,390,180,25);
        l4.add(Pass_field_1);


        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);
        Pass_field_2 = new JPasswordField();
        Pass_field_2.setFont(new Font("Raleway", Font.BOLD, 25));
        Pass_field_2.setBounds(350,440,180,25);
        l4.add(Pass_field_2);
        
        Change_btn = new JButton("CHANGE");
        Back_btn = new JButton("BACK");
        
        Change_btn.addActionListener(this);
        Back_btn.addActionListener(this);
        
        setLayout(null);
        
        l1.setBounds(280,330,800,35);
        l4.add(l1);
        
        l2.setBounds(180,390,150,35);
        l4.add(l2);
        
        l3.setBounds(180,440,200,35);
        l4.add(l3);
        
        
        Change_btn.setBounds(390,588,150,35);
        l4.add(Change_btn);
        
        Back_btn.setBounds(390,633,150,35);
        l4.add(Back_btn);
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(false);
        setVisible(true);
    
    }
    
    public void  actionPerformed(ActionEvent rr){
        String Pass_1 = (String) Pass_field_1.getText();
        String Pass_2 = (String) Pass_field_2.getText();

        try {

                if (rr.getSource() == Change_btn){
                    if(Pass_1.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Your First New Password");
                        System.out.println("Please Enter Your First New Password");
                    }
                    else if(Pass_2.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Your Second New Password");
                        System.out.println("Please Enter Your Second New Password");
                    }
                    else if (!Pass_1.equals(Pass_2)){
                        System.out.println("Please Enter Same Password");
                        JOptionPane.showMessageDialog(null, "Please Enter Same Password");
                        Pass_field_1.setText("");
                        Pass_field_2.setText("");
                    }

                    else if(Pass_1.equals(Pass_2) && Pass_1 != "" && Pass_2 !=""){
                        String PIN = Pass_1;
                        System.out.println("PIN: "+ PIN);
                        Connetctiondb c = new Connetctiondb();
                        String Query_1 = "Update bank set pin = '"+Pass_1+"' where pin = '"+PIN_Number+"'";
                        String Query_2 = "Update login set pin = '"+Pass_1+"' where pinNumber = '"+PIN_Number+"'";
                        String Query_3 = "Update signupthree set pin = '"+Pass_1+"' where pinNumber = '"+PIN_Number+"'";

                        c.s.executeUpdate(Query_1);
                        c.s.executeUpdate(Query_2);
                        c.s.executeUpdate(Query_3);
                        JOptionPane.showMessageDialog(null, "Password Update Successfully");
                        System.out.println("Password Updated.");
                    } 
                }
            }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password Update Problem. Please Fix IT.");
            System.out.println("Password Update Problem.");
            Pass_field_1.setText("");
            Pass_field_2.setText("");
        };

        if (rr.getSource() == Back_btn){
            setVisible(false);
            new Transactions(PIN_Number).setVisible(true);
            Pass_field_1.setText("");
            Pass_field_2.setText("");
        }
    }
    
    public static void main(String[] args){
        new PinChange("").setVisible(true);
    }
}
