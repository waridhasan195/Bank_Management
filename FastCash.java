package Bank_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{

    JLabel l1;
    JButton Deposit_Btn,Cash_with_Btn,Fast_cash_Btn,Mini_Stae_Btn,PIN_Cng_Btn,Balane_Enq_Btn,Exit_Btn;
    String PIN_Number;

    FastCash(String PIN_Number){
        this.PIN_Number = PIN_Number;
        setLayout(null);
        setTitle("ATM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Bank_Management\\src\\icons\\atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);


        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        Deposit_Btn = new JButton("Tk. 500");
        Cash_with_Btn = new JButton("Tk. 500");
        Fast_cash_Btn = new JButton("FAST CASH");
        Mini_Stae_Btn = new JButton("MINI STATEMENT");
        PIN_Cng_Btn = new JButton("PIN CHANGE");
        Balane_Enq_Btn = new JButton("BALANCE ENQUIRY");
        Exit_Btn = new JButton("EXIT");
        

        
        l1.setBounds(235,300,700,35);
        image.add(l1);
        

        Deposit_Btn.setBounds(150,350,150,35);
        Deposit_Btn.setBackground(new Color(0, 225, 190));
        image.add(Deposit_Btn);
        
        Cash_with_Btn.setBounds(370,350,150,35);
        Cash_with_Btn.setBackground(new Color(0, 225, 190));
        image.add(Cash_with_Btn);

        
        Fast_cash_Btn.setBounds(150,400,150,35);
        Fast_cash_Btn.setBackground(new Color(0, 225, 190));
        image.add(Fast_cash_Btn);
        
        Mini_Stae_Btn.setBounds(370,400,150,35);
        Mini_Stae_Btn.setBackground(new Color(0, 225, 190));
        image.add(Mini_Stae_Btn);

        
        PIN_Cng_Btn.setBounds(150,450,150,35);
        PIN_Cng_Btn.setBackground(new Color(0, 225, 190));
        image.add(PIN_Cng_Btn);
        
        Balane_Enq_Btn.setBounds(370,450,150,35);
        Balane_Enq_Btn.setBackground(new Color(0, 225, 190));
        image.add(Balane_Enq_Btn);
        

        Exit_Btn.setBounds(370,510,150,35);
        image.add(Exit_Btn);
        
        
        Deposit_Btn.addActionListener(this);
        Cash_with_Btn.addActionListener(this);
        Fast_cash_Btn.addActionListener(this);
        Mini_Stae_Btn.addActionListener(this);
        PIN_Cng_Btn.addActionListener(this);
        Balane_Enq_Btn.addActionListener(this);
        Exit_Btn.addActionListener(this);

        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);


    }


    public void actionPerformed(ActionEvent ee){
        if (ee.getSource() == Exit_Btn){
            System.exit(0);
            JOptionPane.showMessageDialog(null, "System EXIT");
        }
        else if(ee.getSource() == Deposit_Btn){
            setVisible(false);
            new Deposit(PIN_Number).setVisible(true);
        }
        else if(ee.getSource() == Cash_with_Btn){
            setVisible(false);
            new Withdrawl(PIN_Number).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
