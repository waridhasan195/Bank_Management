package Bank_Management;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame{

    Login(){
        setTitle("Sky Banking");

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("Bank_Management\\src\\icons\\logo.jpg"));
        JLabel label = new JLabel(il);
        add(label);
        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);

    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Login();

    }
    
}
