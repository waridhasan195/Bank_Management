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

     String formNumber2;
     JTextField Pan_Number_Field, AdharNumber_Field;


     JRadioButton Senior_Citizen_yes, Senior_Citizen_no, Existing_Account_yes, Existing_Account_no;
     JDateChooser dateChooser;
     JButton Signup_Registration_Button;
     ButtonGroup Existing_Account_Group;
     JComboBox religion_combo, category_combo, Income_combo, Education_combo, Occupation_combo;


     SignupTow(String formNumber2){
        this.formNumber2 = formNumber2;

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
        JLabel Category_text = new JLabel("Category: ");
        Category_text.setBounds(50, 180, 150, 20);
        Category_text.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Category_text);

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
        JLabel Occupation_Text = new JLabel("Occupation: ");
        Occupation_Text.setBounds(50, 330, 150, 20);
        Occupation_Text.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Occupation_Text);
        
        String Occupation_Value[] = {"Soldier", "Self Employed", "Bussiness", "Student", "Retired", "Others"};
        Occupation_combo = new JComboBox<>(Occupation_Value);
        Occupation_combo.setBounds(200, 330, 150, 20);
        Occupation_combo.setBackground(Color.white);
        add(Occupation_combo);        

// Senior Citizen
        JLabel Senior_Citizen_Text = new JLabel("Senior Citizen: ");
        Senior_Citizen_Text.setBounds(50, 380, 150, 20);
        Senior_Citizen_Text.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Senior_Citizen_Text);


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
        


// PAN Number Field
        JLabel PanNumber_Text = new JLabel("PAN Number: ");
        PanNumber_Text.setBounds(50, 430, 150, 20);
        PanNumber_Text.setFont(new Font("Raleway", Font.BOLD, 15));
        add(PanNumber_Text);
        
        Pan_Number_Field = new JTextField();
        Pan_Number_Field.setBounds(200, 430, 300, 30);
        Pan_Number_Field.setBackground(Color.white);
        add(Pan_Number_Field);  


// Aadhar Number
        JLabel AdharNumber_Text = new JLabel("Aadhar Number: ");
        AdharNumber_Text.setBounds(50, 480, 150, 20);
        AdharNumber_Text.setFont(new Font("Raleway", Font.BOLD, 15));
        add(AdharNumber_Text);
        
        AdharNumber_Field = new JTextField();
        AdharNumber_Field.setBounds(200, 480, 150, 20);
        AdharNumber_Field.setBackground(Color.white);
        add(AdharNumber_Field);  

// Existing_Account
        JLabel Existing_Account_Text = new JLabel("Existing Account: ");
        Existing_Account_Text.setBounds(50, 530, 150, 20);
        Existing_Account_Text.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Existing_Account_Text);
        
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

                String Religion = (String) religion_combo.getSelectedItem();
                String Category = (String) category_combo.getSelectedItem();
                String Income = (String) Income_combo.getSelectedItem();
                String education = (String) Education_combo.getSelectedItem();
                String Occupation = (String) Occupation_combo.getSelectedItem();
                
 
                String Senior_Citizen = null;

                if (Senior_Citizen_yes.isSelected()){
                        Senior_Citizen = "Yes";
                }
                else if (Senior_Citizen_no.isSelected()){
                        Senior_Citizen = "No";
                }


                String PAN_Number = Pan_Number_Field.getText();
                String Aadhar_Number = AdharNumber_Field.getText();

                String Existing_Account = null;

                if (Existing_Account_yes.isSelected()){
                        Existing_Account = "Yes";
                }
                else if (Existing_Account_no.isSelected()){
                        Existing_Account = "No";
                }
    


                try {

                        Connetctiondb c = new Connetctiondb();
                        String query = "insert into signuptow values('"+formNumber2+"', '"+Religion+"', '"+Category+"', '"+Income+"', '"+education+"', '"+Occupation+"', '"+PAN_Number+"', '"+Aadhar_Number+"', '"+Senior_Citizen+"', '"+Existing_Account+"')";
                        c.s.executeUpdate(query);
                        setVisible(false);
                        JOptionPane.showMessageDialog(null, "SignUP Complete.");

                } catch (Exception eee) {
                        System.out.println("Error in Database: " + eee);
                }


        }
    
    
    



    public static void main(String[] args) {
        new SignupTow("");
    }
    
}
