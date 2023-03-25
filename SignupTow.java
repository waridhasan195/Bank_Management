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


     JRadioButton Senior_Citizen_yes, Senior_Citizen_no, Existing_Account_yes, Existing_Account_no;
     JDateChooser dateChooser;
     JButton Signup_Registration_Button;
ButtonGroup Existing_Account_Group;
     JComboBox religion_combo, category_combo, Income_combo, Education_combo, Occupation_combo;
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
        JLabel Category = new JLabel("Category: ");
        Category.setBounds(50, 180, 150, 20);
        Category.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Category);

        String category_value[] = {"General", "OBC", "SC", "ST", "Others"};
        category_combo = new JComboBox<>(category_value);
        category_combo.setBounds(200, 180, 150, 20);
        category_combo.setBackground(Color.white);
        add(category_combo);

// Income
        JLabel Income = new JLabel("Income: ");
        Income.setBounds(50, 230, 150, 20);
        Income.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Income);

        String Income_Value[] = {"Null", "<1,50,000", "< 2,50,0000", "< 5,00,000", "UpTo 10,00,000"};
        Income_combo = new JComboBox<>(Income_Value); 
        Income_combo.setBounds(200, 230, 200, 25);
        Income_combo.setBackground(Color.WHITE);
        add(Income_combo);

   

// Education
        JLabel Education = new JLabel("Education ");
        Education.setBounds(50, 280, 150, 20);
        Education.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Education);

        String Education_Value[] = {"Non - Graduate", "Graduate", "POST Graduate", "Doctrate", "Doctor", "Others"};
        Education_combo = new JComboBox<>(Education_Value); 
        Education_combo.setBounds(200, 280, 200, 20);
        Education_combo.setBackground(Color.white);
        add(Education_combo);



// Occupation        
        JLabel Occupation = new JLabel("Occupation: ");
        Occupation.setBounds(50, 330, 150, 20);
        Occupation.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Occupation);
        
        String Occupation_Value[] = {"Soldier", "Self Employed", "Bussiness", "Student", "Retired", "Others"};
        Occupation_combo = new JComboBox<>(Occupation_Value);
        Occupation_combo.setBounds(200, 330, 150, 20);
        Occupation_combo.setBackground(Color.white);
        add(Occupation_combo);        

// Marital Status
        JLabel Senior_Citizen = new JLabel("Senior Citizen: ");
        Senior_Citizen.setBounds(50, 380, 150, 20);
        Senior_Citizen.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Senior_Citizen);


        Senior_Citizen_yes = new JRadioButton("Yes");
        Senior_Citizen_yes.setBounds(200, 380, 100, 20);
        Senior_Citizen_yes.setBackground(Color.white);
        add(Senior_Citizen_yes);

        Senior_Citizen_no = new JRadioButton("No");
        Senior_Citizen_no.setBounds(300, 380, 100, 20);
        Senior_Citizen_no.setBackground(Color.white);
        add(Senior_Citizen_no);
        
        
        ButtonGroup Senior_Citizen_radio_Group = new ButtonGroup();
        Senior_Citizen_radio_Group.add(Senior_Citizen_yes);         
        Senior_Citizen_radio_Group.add(Senior_Citizen_no);         
        


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

// Existing_Account
        JLabel Existing_Account = new JLabel("Existing Account: ");
        Existing_Account.setBounds(50, 530, 150, 20);
        Existing_Account.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Existing_Account);
        
        Existing_Account_yes = new JRadioButton("Yes");
        Existing_Account_yes.setBounds(200, 530, 50, 20);
        Existing_Account_yes.setBackground(Color.white);
        add(Existing_Account_yes);

        Existing_Account_no = new JRadioButton("No");
        Existing_Account_no.setBounds(280, 530, 50, 20);
        Existing_Account_no.setBackground(Color.white);
        add(Existing_Account_no);

        Existing_Account_Group = new ButtonGroup();
        Existing_Account_Group.add(Existing_Account_yes);
        Existing_Account_Group.add(Existing_Account_no);


// // Pin Code
//         JLabel Pin_Code = new JLabel("Existing Account: ");
//         Pin_Code.setBounds(50, 580, 150, 20);
//         Pin_Code.setFont(new Font("Raleway", Font.BOLD, 15));
//         add(Pin_Code);
        
//         Pin_Code_Field = new JTextField();
//         Pin_Code_Field.setBounds(200, 580, 150, 20);
//         Pin_Code_Field.setBackground(Color.white);
//         add(Pin_Code_Field);
        
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
