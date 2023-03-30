package Bank_Management;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
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

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 800);
        setVisible(true);


    }


    public static void main(String[] args) {
        new SignupThree();
    }
}
