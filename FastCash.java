package Bank_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class FastCash extends JFrame implements ActionListener{

    JLabel l1;
    JButton Btn_500,Btn_1000,Btn_1500,Btn_10000,Btn_15000,Btn_20000,Cancel_Btn;
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


        l1 = new JLabel("Please Select Your Amount");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        Btn_500 = new JButton("Tk. 500");
        Btn_1000 = new JButton("Tk. 1000");
        Btn_1500 = new JButton("Tk. 1500");
        Btn_10000 = new JButton("Tk. 1000");
        Btn_15000 = new JButton("Tk. 15000");
        Btn_20000 = new JButton("Tk. 20000");
        Cancel_Btn = new JButton("Cancel");
        

        
        l1.setBounds(235,300,700,35);
        image.add(l1);
        

        Btn_500.setBounds(150,350,150,35);
        Btn_500.setBackground(new Color(0, 225, 190));
        image.add(Btn_500);
        
        Btn_1000.setBounds(370,350,150,35);
        Btn_1000.setBackground(new Color(0, 225, 190));
        image.add(Btn_1000);

        
        Btn_1500.setBounds(150,400,150,35);
        Btn_1500.setBackground(new Color(0, 225, 190));
        image.add(Btn_1500);
        
        Btn_10000.setBounds(370,400,150,35);
        Btn_10000.setBackground(new Color(0, 225, 190));
        image.add(Btn_10000);

        
        Btn_15000.setBounds(150,450,150,35);
        Btn_15000.setBackground(new Color(0, 225, 190));
        image.add(Btn_15000);
        
        Btn_20000.setBounds(370,450,150,35);
        Btn_20000.setBackground(new Color(0, 225, 190));
        image.add(Btn_20000);
        

        Cancel_Btn.setBounds(370,510,150,35);
        image.add(Cancel_Btn);
        
        
        Btn_500.addActionListener(this);
        Btn_1000.addActionListener(this);
        Btn_1500.addActionListener(this);
        Btn_10000.addActionListener(this);
        Btn_15000.addActionListener(this);
        Btn_20000.addActionListener(this);
        Cancel_Btn.addActionListener(this);

        setLayout(null);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);


    }


    public void actionPerformed(ActionEvent ee){
        if (ee.getSource() == Cancel_Btn){
            new Transactions(PIN_Number);
        }
        else {

            try {
                String amount_btn = ((JButton) ee.getSource()).getText().substring(4);
                Connetctiondb c = new Connetctiondb();
                String Query = "";
                ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '"+PIN_Number+"'");
                int balance = 0;

                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }

                }

                if (ee.getSource() !=  Cancel_Btn && balance < Integer.parseInt(amount_btn)){
                    JOptionPane.showMessageDialog(null, "Invail Transection. Insufficent Balance.");
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values ('"+PIN_Number+"', '"+date+"', 'Withdrawl', '"+amount_btn+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Taka" +amount_btn+ " Debited Successfully.");

                setVisible(false);
                new Transactions(PIN_Number).setVisible(true);

            } catch (Exception e) {
                System.out.println("Fastcash Problem: " + e);
            }
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
