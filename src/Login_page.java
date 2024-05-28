import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_page extends JFrame implements ActionListener{
   JTextField t1;
   JPasswordField p1;
   JButton b1,b2;
	public Login_page() {
	JLabel l1 =new JLabel("User name");
	l1.setBounds(40,20,100,30);
	l1.setFont(new Font("Tahoma",Font.BOLD,16));
	l1.setForeground(Color.WHITE);
	add(l1);
	
	JLabel l2 =new JLabel("Password");
	l2.setBounds(40,70,100,30);
	l2.setFont(new Font("Tahoma",Font.BOLD,16));
	l2.setForeground(Color.WHITE);
	add(l2);
	
      t1=new JTextField();
      t1.setBounds(150,20,150,30);
      t1.setForeground(Color.WHITE);
      setFont(new Font("Thoma",Font.PLAIN,15));
      t1.setBackground(new Color(26,104,110));
	  add(t1);
	  
	  p1 = new JPasswordField();
	  p1.setBounds(150,70,150,30);
	  p1.setBackground(new Color(26,104,110));
	  p1.setForeground(Color.WHITE);
	  add(p1);
	  
	  ImageIcon log =new ImageIcon("ganeshji.gif");
	  Image i1 = log.getImage().getScaledInstance(255, 300,Image.SCALE_DEFAULT);
	  JLabel l3 = new JLabel(log);
	  l3.setIcon(log);
	  l3.setBounds(318,-10,255,300);
	  add(l3);
	  
	  b1 = new JButton("Login");
	  b1.setBounds(40,140,120,30);
	  b1.setFont(new Font("serif",Font.PLAIN,15));
	  b1.setBackground(Color.BLACK);
	  b1.setForeground(Color.WHITE);
	  add(b1);
	  
	  b2 = new JButton("Cancel");
	  b2.setBounds(180,140,120,30);
	  b2.setFont(new Font("serif",Font.PLAIN,15));
	  b2.setBackground(Color.BLACK);
	  b2.setForeground(Color.WHITE);
	  add(b2);
	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	
	  getContentPane().setBackground(new Color(3,45,48));
	setLayout(null);
    setLocation(400,270);
	setSize(600, 300);
	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
    	
    	if(e.getSource()==b1)
    		{
    		try {
    			Conn c= new Conn();
    			String user=t1.getText();
    	        String pass=p1.getText();
    	        
    	        //String q= "select * from login where username='"+user+"'and password ='"+pass+"'";
    	        ResultSet rese =  c.s.executeQuery("select * from login where username='"+user+"'and password ='"+pass+"'");
               if(rese.next())
       		{
       		   new DashBoard();
                  setVisible(false);
       		}
           	else
    		{
    			JOptionPane.showMessageDialog(this,"UserName or Password do not Match" );
    			t1.setText("");
    			p1.setText("");
    			t1.requestFocus();
    		}	
    	
			} catch (Exception e2) {
				System.out.println(""+e2);
			}
    		
    		
    		}
    	
        if(e.getSource()==b2)
        {
            setVisible(false);
            System.exit(1);
        }
    }
	
	public static void main(String[] args) {
	new Login_page();
	}
}
