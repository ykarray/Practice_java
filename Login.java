import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JTextField;  
import javax.swing.JPasswordField;  
public class Login implements ActionListener {
private static JLabel success ;
private static JLabel passlabel;
private static JTextField userText;
private static JLabel userlabel ; 
private static JButton button;
private static JPasswordField passText;
public static void main(String[] args){
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(100,100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);
    panel.setLayout(null);
    userlabel = new JLabel("user"); 
    userlabel.setBounds(10,20,80,25);
    panel.add(userlabel);
    userText = new JTextField(20);
    userText.setBounds(100,20,165,25);
    panel.add(userText);
    
    passlabel = new JLabel("password "); 
    passlabel.setBounds(10,50,80,25);
    panel.add(passlabel);
    passText = new JPasswordField();
    passText.setBounds(100,50,165,25);
    panel.add(passText);
    button=new JButton("login");
    button.setBounds(10,80,80,25);
    button.addActionListener(new Login());
    panel.add(button);
    success = new JLabel("");
    success.setBounds(10,110,300,25);
    panel.add(success);
    frame.setVisible(true);
    
    
    
    }
    public void actionPerformed (ActionEvent e)
    {
     String user = userText.getText(); 
     System.out.println(user);
     if(user.equals("yasmine"))
     {
      success.setText("login successful ! ");
     }
    
    
    }

}
