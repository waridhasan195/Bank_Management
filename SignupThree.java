package Bank_Management;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.smartcardio.Card;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame {

    JRadioButton Saving_acc, Fixed_acc, Current_acc, Recurring_acc;

    SignupThree(){

        setTitle("Account Type Information");
        setLayout(null);
        JLabel AccountDetails = new JLabel("Account Detaile: Page - 3");
        AccountDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        AccountDetails.setBounds(70, 0, 400, 100);
        add(AccountDetails);

        JLabel Account_Type = new JLabel("Account Type");
        Account_Type.setFont(new Font("Raleway", Font.BOLD, 20));
        Account_Type.setBounds(100, 100, 200, 20);
        add(Account_Type);

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

        JCheckBox ATM_Card = new JCheckBox("ATM CARD");
        ATM_Card.setBackground(Color.WHITE);
        ATM_Card.setBounds(150, 480, 100, 40);
        add(ATM_Card);

        JCheckBox Internet_Banking = new JCheckBox("Internet Banking");
        Internet_Banking.setBackground(Color.WHITE);
        Internet_Banking.setBounds(400, 480, 130, 40);
        add(Internet_Banking);

        JCheckBox Mobile_Banking = new JCheckBox("Mobile Banking");
        Mobile_Banking.setBackground(Color.WHITE);
        Mobile_Banking.setBounds(150, 520, 130, 40);
        add(Mobile_Banking);

        JCheckBox Email_SMS = new JCheckBox("EMAIL & SMS Alerts");
        Email_SMS.setBackground(Color.WHITE);
        Email_SMS.setBounds(400, 520, 160, 40);
        add(Email_SMS);

        JCheckBox Check_Book = new JCheckBox("Check Book");
        Check_Book.setBackground(Color.WHITE);
        Check_Book.setBounds(150, 560, 100, 40);
        add(Check_Book);

        JCheckBox E_Statement = new JCheckBox("E - Statement");
        E_Statement.setBackground(Color.WHITE);
        E_Statement.setBounds(400, 560, 130, 40);
        add(E_Statement);

        JCheckBox Aggrement_Check = new JCheckBox("I have declares that above entered details are correct to the best of my knowledge.");
        Aggrement_Check.setFont(new Font("raleway", Font.BOLD, 14));
        Aggrement_Check.setBounds(100, 620, 700, 40);
        Aggrement_Check.setBackground(Color.WHITE);
        add(Aggrement_Check);



        JButton Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setBounds(100, 690, 100, 30);
        add(Cancel);

        JButton Submit = new JButton("SUBMIT");
        Submit.setBackground(new Color(0, 225, 190));
        Submit.setForeground(Color.black);
        Submit.setBounds(230, 690, 100, 30);
        add(Submit);






        getContentPane().setBackground(Color.WHITE);
        setSize(800, 900);
        setVisible(true);


    }



    public static void main(String[] args) {
        new SignupThree();
    }
}
