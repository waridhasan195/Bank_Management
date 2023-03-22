package Bank_Management;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.jar.JarEntry;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {

    SignupOne(){

        setLayout(null);

// APPLICATION FORM
        JLabel FormName = new JLabel("APPLICATION FORM");
        FormName.setFont(new Font("Raleway", Font.BOLD, 25));
        FormName.setBounds(70, 10, 400, 100);;
        add(FormName);


// Serial Number
        Random randomFormNumber = new Random();
        long randomNumber = Math.abs((randomFormNumber.nextLong() % 9000L) + 1000L);
        System.out.println(randomNumber);

        JLabel Form_No = new JLabel("Serial Number: " + randomNumber);
        Form_No.setBounds(500, 50, 200, 30);
        add(Form_No);
        


// Name
        JLabel Name = new JLabel("Name: ");
        Name.setBounds(50, 100, 150, 20);
        Name.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Name);

        JTextField Name_Field = new JTextField();
        Name_Field.setBounds(200, 100, 150, 20);
        Name_Field.setBackground(Color.white);
        add(Name_Field);

// First Name
        JLabel Fathers_Name = new JLabel("Fathers's Name: ");
        Fathers_Name.setBounds(50, 150, 150, 20);
        Fathers_Name.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Fathers_Name);

        JTextField Fathers_Name_Field = new JTextField();
        Fathers_Name_Field.setBounds(200, 150, 150, 20);
        Fathers_Name_Field.setBackground(Color.white);
        add(Fathers_Name_Field);

// Date of Birth
        JLabel Date_of_Birth = new JLabel("Date of Birth: ");
        Date_of_Birth.setBounds(50, 200, 150, 20);
        Date_of_Birth.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Date_of_Birth);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(200, 200, 200, 25);
        dateChooser.setForeground(Color.red);
        add(dateChooser);

   

// Gender
        JLabel Gender = new JLabel("Gender: ");
        Gender.setBounds(50, 250, 150, 20);
        Gender.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(200, 250, 70, 20);
        male.setBackground(Color.white);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(270, 250, 100, 20);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup male_and_female = new ButtonGroup();
        male_and_female.add(male);
        male_and_female.add(female);

        

// Email        
        JLabel Email = new JLabel("Email: ");
        Email.setBounds(50, 300, 150, 20);
        Email.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Email);
        
        JTextField Email_Field = new JTextField();
        Email_Field.setBounds(200, 300, 150, 20);
        Email_Field.setBackground(Color.white);
        add(Email_Field);        

// Marital Status
        JLabel Marital_Status = new JLabel("Marital Status : ");
        Marital_Status.setBounds(50, 350, 150, 20);
        Marital_Status.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Marital_Status);


        JRadioButton married = new JRadioButton("Married");
        married.setBounds(200, 350, 100, 20);
        married.setBackground(Color.white);
        add(married);

        JRadioButton Unmarried = new JRadioButton("UnMarried");
        Unmarried.setBounds(300, 350, 100, 20);
        Unmarried.setBackground(Color.white);
        add(Unmarried);
        
        JRadioButton Others = new JRadioButton("Others");
        Others.setBounds(400, 350, 100, 20);
        Others.setBackground(Color.white);
        add(Others);
        
        ButtonGroup marital_Status = new ButtonGroup();
        marital_Status.add(married);         
        marital_Status.add(Unmarried);         
        marital_Status.add(Others);         


// Address
        JLabel Address = new JLabel("Address : ");
        Address.setBounds(50, 400, 150, 20);
        Address.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Address);
        
        JTextField Address_Field = new JTextField();
        Address_Field.setBounds(200, 400, 300, 30);
        Address_Field.setBackground(Color.white);
        add(Address_Field);  


// City
        JLabel City = new JLabel("City : ");
        City.setBounds(50, 450, 150, 20);
        City.setFont(new Font("Raleway", Font.BOLD, 15));
        add(City);
        
        JTextField City_Field = new JTextField();
        City_Field.setBounds(200, 450, 150, 20);
        City_Field.setBackground(Color.white);
        add(City_Field);  

// State
        JLabel State = new JLabel("State : ");
        State.setBounds(50, 500, 150, 20);
        State.setFont(new Font("Raleway", Font.BOLD, 15));
        add(State);
        
        JTextField State_Field = new JTextField();
        State_Field.setBounds(200, 500, 150, 20);
        State_Field.setBackground(Color.white);
        add(State_Field);

// Pin Code
        JLabel Pin_Code = new JLabel("Pin Code : ");
        Pin_Code.setBounds(50, 550, 150, 20);
        Pin_Code.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Pin_Code);
        
        JTextField Pin_Code_Field = new JTextField();
        Pin_Code_Field.setBounds(200, 550, 150, 20);
        Pin_Code_Field.setBackground(Color.white);
        add(Pin_Code_Field);
        
        JButton Signup_Registration_Button = new JButton("SignUP");
        Signup_Registration_Button.setBackground(new Color(0, 225, 157));
        Signup_Registration_Button.setForeground(Color.black);
        Signup_Registration_Button.setFont(new Font("Osward", Font.BOLD, 20));
        Signup_Registration_Button.setBounds(200, 600, 200, 40);
        add(Signup_Registration_Button);



// Layout
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 800);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SignupOne();
    }
    
}
