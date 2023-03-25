package Bank_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignupTow extends JFrame implements ActionListener{

     long randomNumber;
     JTextField Name_Field, Fathers_Name_Field, Email_Field, Address_Field, City_Field, State_Field, Pin_Code_Field;


     JRadioButton male, female, married, Unmarried, Others;
     JDateChooser dateChooser;
     JButton Signup_Registration_Button; 
     JComboBox religion_combo, category_combo;
     SignupTow(){

        setLayout(null);
        setTitle("Additional Informantion");

// APPLICATION FORM Second Page

        JLabel FormName = new JLabel("APPLICATION FORM PAGE - 2");
        FormName.setFont(new Font("Raleway", Font.BOLD, 25));
        FormName.setBounds(70, 0, 400, 100);;
        add(FormName);

        JLabel additionalDetails = new JLabel("Additional Information");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
        additionalDetails.setBounds(50, 50, 400, 100);
        add(additionalDetails);

        


// Religion
        JLabel religion_name = new JLabel("Religion: ");
        religion_name.setBounds(50, 130, 150, 20);
        religion_name.setFont(new Font("Raleway", Font.BOLD, 15));
        add(religion_name);

        String religion_Values[] = {"Muslim", "Hindu", "Christan", "Others"};
        religion_combo = new JComboBox<>(religion_Values);
        religion_combo.setBounds(200, 130, 150, 20);
        religion_combo.setBackground(Color.WHITE);
        add(religion_combo);

// Category
        JLabel Fathers_Name = new JLabel("Category: ");
        Fathers_Name.setBounds(50, 180, 150, 20);
        Fathers_Name.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Fathers_Name);

        String category_value[] = {"General", "OBC", "SC", "ST", "Others"};
        category_combo = new JComboBox<>(category_value);
        category_combo.setBounds(200, 180, 150, 20);
        category_combo.setBackground(Color.white);
        add(category_combo);

// Income
        JLabel Date_of_Birth = new JLabel("Income: ");
        Date_of_Birth.setBounds(50, 230, 150, 20);
        Date_of_Birth.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Date_of_Birth);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(200, 230, 200, 25);
        dateChooser.setForeground(Color.red);
        add(dateChooser);

   

// Gender
        JLabel Gender = new JLabel("Last Education ");
        Gender.setBounds(50, 280, 150, 20);
        Gender.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Gender);

        male = new JRadioButton("Male");
        male.setBounds(200, 280, 70, 20);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(270, 280, 100, 20);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup male_and_female = new ButtonGroup();
        male_and_female.add(male);
        male_and_female.add(female);

        

// Email        
        JLabel Email = new JLabel("Qualification: ");
        Email.setBounds(50, 330, 150, 20);
        Email.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Email);
        
        Email_Field = new JTextField();
        Email_Field.setBounds(200, 330, 150, 20);
        Email_Field.setBackground(Color.white);
        add(Email_Field);        

// Marital Status
        JLabel Marital_Status = new JLabel("Occupation: ");
        Marital_Status.setBounds(50, 380, 150, 20);
        Marital_Status.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Marital_Status);


        married = new JRadioButton("Married");
        married.setBounds(200, 380, 100, 20);
        married.setBackground(Color.white);
        add(married);

        Unmarried = new JRadioButton("UnMarried");
        Unmarried.setBounds(300, 380, 100, 20);
        Unmarried.setBackground(Color.white);
        add(Unmarried);
        
        Others = new JRadioButton("Others: ");
        Others.setBounds(400, 380, 100, 20);
        Others.setBackground(Color.white);
        add(Others);
        
        ButtonGroup marital_Status = new ButtonGroup();
        marital_Status.add(married);         
        marital_Status.add(Unmarried);         
        marital_Status.add(Others);         


// Address
        JLabel Address = new JLabel("PAN Number: ");
        Address.setBounds(50, 430, 150, 20);
        Address.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Address);
        
        Address_Field = new JTextField();
        Address_Field.setBounds(200, 430, 300, 30);
        Address_Field.setBackground(Color.white);
        add(Address_Field);  


// City
        JLabel City = new JLabel("Aadhar Number: ");
        City.setBounds(50, 480, 150, 20);
        City.setFont(new Font("Raleway", Font.BOLD, 15));
        add(City);
        
        City_Field = new JTextField();
        City_Field.setBounds(200, 480, 150, 20);
        City_Field.setBackground(Color.white);
        add(City_Field);  

// State
        JLabel State = new JLabel("Senior Citizen: ");
        State.setBounds(50, 530, 150, 20);
        State.setFont(new Font("Raleway", Font.BOLD, 15));
        add(State);
        
        State_Field = new JTextField();
        State_Field.setBounds(200, 530, 150, 20);
        State_Field.setBackground(Color.white);
        add(State_Field);

// Pin Code
        JLabel Pin_Code = new JLabel("Existing Account: ");
        Pin_Code.setBounds(50, 580, 150, 20);
        Pin_Code.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Pin_Code);
        
        Pin_Code_Field = new JTextField();
        Pin_Code_Field.setBounds(200, 580, 150, 20);
        Pin_Code_Field.setBackground(Color.white);
        add(Pin_Code_Field);
        
        Signup_Registration_Button = new JButton("NEXT");
        Signup_Registration_Button.setBackground(new Color(0, 225, 190));
        Signup_Registration_Button.setForeground(Color.black);
        Signup_Registration_Button.setFont(new Font("Osward", Font.BOLD, 20));
        Signup_Registration_Button.setBounds(200, 630, 200, 40);
        Signup_Registration_Button.addActionListener(this);
        add(Signup_Registration_Button);




// Layout
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 800);
        setVisible(true);

    }



        public void actionPerformed(ActionEvent e){

                String name = Name_Field.getText();
                String fathers_name = Fathers_Name_Field.getText();
                String date_of_birth = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

                String gender = null;

                if (male.isSelected()){
                        gender = "Male";
                }
                else if (female.isSelected()){
                        gender = "Female";
                }


                String emial = Email_Field.getText();

                String marid_Status = null;

                if (married.isSelected()){
                        marid_Status = "Married";
                }
                else if (Unmarried.isSelected()){
                        marid_Status = "Unmarried";
                }
                else if (Others.isSelected()){
                        marid_Status = "Others";
                }

                String address = Address_Field.getText();
                String city = City_Field.getText();
                String state = State_Field.getText();
                String pin = Pin_Code_Field.getText();

                try {
                        if (name.equals("")){
                                JOptionPane.showMessageDialog(null, "Name Must Requred");
                        }
                        else{
                                Connetctiondb c = new Connetctiondb();
                                String query = "insert into signup values('"+name+"', '"+fathers_name+"', '"+date_of_birth+"', '"+gender+"', '"+emial+"', '"+marid_Status+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                                c.s.executeUpdate(query);

                        }
                        
                } catch (Exception eee) {
                        System.out.println("Error in Database: " + eee);
                }


        }
    
    
    



    public static void main(String[] args) {
        new SignupTow();
    }
    
}
