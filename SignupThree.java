package Bank_Management;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.smartcardio.Card;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame implements ActionListener{

    JRadioButton Saving_acc, Fixed_acc, Current_acc, Recurring_acc;
    JCheckBox ATM_Card, Internet_Banking, Mobile_Banking, Email_SMS, Check_Book, E_Statement, Aggrement_Check;
    JButton Cancel, Submit;
    String formNumber2;

    SignupThree(String formNumber2){

        this.formNumber2 = formNumber2;
        setTitle("Account Type Information");
        setLayout(null);
        JLabel AccountDetails = new JLabel("Account Detaile: Page - 3");
        AccountDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        AccountDetails.setBounds(70, 0, 400, 100);
        add(AccountDetails);

        JLabel Account_Type_Text = new JLabel("Account Type");
        Account_Type_Text.setFont(new Font("Raleway", Font.BOLD, 20));
        Account_Type_Text.setBounds(100, 100, 200, 20);
        add(Account_Type_Text);

        Saving_acc = new JRadioButton("Saving Account");
        Saving_acc.setFont(new Font("Raleway", Font.BOLD, 15));
        Saving_acc.setBounds(150, 150, 250, 25);
        Saving_acc.setBackground(Color.WHITE);
        add(Saving_acc);

        Current_acc = new JRadioButton("Current Account");
        Current_acc.setFont(new Font("Raleway", Font.BOLD, 15));
        Current_acc.setBounds(400, 150, 250, 25);
        Current_acc.setBackground(Color.WHITE);
        add(Current_acc);

        Fixed_acc = new JRadioButton("Fixed Deposit");
        Fixed_acc.setFont(new Font("Raleway", Font.BOLD, 15));
        Fixed_acc.setBounds(150, 190, 250, 25);
        Fixed_acc.setBackground(Color.WHITE);
        add(Fixed_acc);

        Recurring_acc = new JRadioButton("Recurring Deposit Account");
        Recurring_acc.setFont(new Font("Raleway", Font.BOLD, 15));
        Recurring_acc.setBounds(400, 190, 300, 25);
        Recurring_acc.setBackground(Color.WHITE);
        add(Recurring_acc);

        ButtonGroup Account_Type_Group = new ButtonGroup();
        Account_Type_Group.add(Saving_acc);
        Account_Type_Group.add(Current_acc);
        Account_Type_Group.add(Fixed_acc);
        Account_Type_Group.add(Recurring_acc);

        JLabel Card_Text = new JLabel("Card Number: ");
        Card_Text.setFont(new Font("Raleway", Font.BOLD, 20));
        Card_Text.setBounds(100, 250, 200, 40);
        add(Card_Text);

        JLabel Card_Number = new JLabel("XXXX-XXXX-XXXX-4168");
        Card_Number.setFont(new Font("Raleway", Font.BOLD, 15));
        Card_Number.setBounds(280, 250, 250, 40);
        add(Card_Number);

        JLabel Card_Number_Hints = new JLabel("Your 16 Digits Card Number");
        Card_Number_Hints.setFont(new Font("Raleway", Font.PLAIN, 12));
        Card_Number_Hints.setBounds(280, 267, 250, 40);
        add(Card_Number_Hints);


        JLabel PIN_Text = new JLabel("PIN Number: ");
        PIN_Text.setFont(new Font("Raleway", Font.BOLD, 20));
        PIN_Text.setBounds(100, 340, 200, 40);
        add(PIN_Text);

        JLabel PIN_Number = new JLabel("XXXX");
        PIN_Number.setFont(new Font("Raleway", Font.BOLD, 15));
        PIN_Number.setBounds(280, 340, 250, 40);
        add(PIN_Number);

        JLabel PIN_Number_Hints = new JLabel("Your 4 Digits Password");
        PIN_Number_Hints.setFont(new Font("Raleway", Font.PLAIN, 12));
        PIN_Number_Hints.setBounds(280, 357, 250, 40);
        add(PIN_Number_Hints);


        JLabel Service_Text = new JLabel("Service Required");
        Service_Text.setFont(new Font("Raleway", Font.BOLD, 20));
        Service_Text.setBounds(100, 430, 200, 40);
        add(Service_Text);

        ATM_Card = new JCheckBox("ATM CARD");
        ATM_Card.setBackground(Color.WHITE);
        ATM_Card.setBounds(150, 480, 100, 40);
        add(ATM_Card);

        Internet_Banking = new JCheckBox("Internet Banking");
        Internet_Banking.setBackground(Color.WHITE);
        Internet_Banking.setBounds(400, 480, 130, 40);
        add(Internet_Banking);

        Mobile_Banking = new JCheckBox("Mobile Banking");
        Mobile_Banking.setBackground(Color.WHITE);
        Mobile_Banking.setBounds(150, 520, 130, 40);
        add(Mobile_Banking);

        Email_SMS = new JCheckBox("EMAIL & SMS Alerts");
        Email_SMS.setBackground(Color.WHITE);
        Email_SMS.setBounds(400, 520, 160, 40);
        add(Email_SMS);

        Check_Book = new JCheckBox("Check Book");
        Check_Book.setBackground(Color.WHITE);
        Check_Book.setBounds(150, 560, 100, 40);
        add(Check_Book);

        E_Statement = new JCheckBox("E - Statement");
        E_Statement.setBackground(Color.WHITE);
        E_Statement.setBounds(400, 560, 130, 40);
        add(E_Statement);

        Aggrement_Check = new JCheckBox("I have declares that above entered details are correct to the best of my knowledge.");
        Aggrement_Check.setFont(new Font("raleway", Font.BOLD, 14));
        Aggrement_Check.setBounds(100, 620, 700, 40);
        Aggrement_Check.setBackground(Color.WHITE);
        add(Aggrement_Check);



        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setBounds(100, 690, 100, 30);
        Cancel.addActionListener(this);
        add(Cancel);

        Submit = new JButton("SUBMIT");
        Submit.setBackground(new Color(0, 225, 190));
        Submit.setForeground(Color.black);
        Submit.setBounds(230, 690, 100, 30);
        Submit.addActionListener(this);
        add(Submit);



        getContentPane().setBackground(Color.WHITE);
        setSize(800, 900);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent aa){
        if (aa.getSource() == Submit){
            String Account_Type = null;

            if (Saving_acc.isSelected()){
                Account_Type = "Saving Account";
            }
            else if (Current_acc.isSelected()){
                Account_Type = "Current Account";
            }
            else if (Fixed_acc.isSelected()){
                Account_Type = "Fixed Deposit Account";
            }
            else if (Recurring_acc.isSelected()){
                Account_Type = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);


            String facility = "";
            if (ATM_Card.isSelected()){
                facility = facility + "ATM Card";
            }
            else if(Internet_Banking.isSelected()){
                facility = facility + "Internet Banking";
            }
            else if(Mobile_Banking.isSelected()){
                facility = facility + "Mobile Banking";
            }
            else if(Email_SMS.isSelected()){
                facility = facility + "Email & SMS Alerts Service";
            }
            else if(Check_Book.isSelected()){
                facility = facility + "Check Book";
            }
            else if(E_Statement.isSelected()){
                facility = facility + "E Statement";
            }

            try {
                if(Account_Type.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }

                else {
                    Connetctiondb c = new Connetctiondb();
                    String query = "insert into signupthree values('"+formNumber2+"', '"+Account_Type+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNumber2+"', '"+cardNumber+"', '"+pinNumber+"')";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "SignUP Three Complete.");
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\nPIN Number:  " + pinNumber);

                }
                
            } 
            catch (Exception e) {
                System.out.println("SignUP Three Error" + e);
                // TODO: handle exception
            }


        }
        else if(aa.getSource() == Cancel){

        }
    }



    public static void main(String[] args) {
        new SignupThree("");
    }
}
