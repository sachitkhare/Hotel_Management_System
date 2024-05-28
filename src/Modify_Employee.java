import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;

public class Modify_Employee   extends JFrame implements ActionListener{
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t7,t5,t2,t6,t8;
    JComboBox t3,t4;
    JButton b1,b2;
    Modify_Employee(){
    	 JPanel pa= new JPanel();
    	 pa.setBounds(5,5,875,490);
    	 pa.setBackground(new Color(3,45,48));
    	 pa.setLayout(null);
    	 add(pa);
    	 
    	 l =new JLabel("Modify Employee");
    	 l.setBounds(194,10,200,22);
    	 l.setFont(new Font("Tahoma",Font.BOLD,22));
    	 l.setForeground(Color.WHITE);
    	 pa.add(l);
    	 
    	 l1 =new JLabel("Employee Name");
    	 l1.setBounds(64,70,152,22);
    	 l1.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l1.setForeground(Color.WHITE);
    	 pa.add(l1);
    	 
    	 t1 =new JTextField();
    	 t1.setBounds(200,70,156,20);
    	 t1.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t1.setForeground(Color.WHITE);
    	 t1.setBackground(new Color(16,108,115)); 
    	 pa.add(t1);
    	 
    	 l2 =new JLabel("Job");
    	 l2.setBounds(64,110,152,22);
    	 l2.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l2.setForeground(Color.WHITE);
    	 pa.add(l2);
    	
    	 t4 =new JComboBox(new String[] {"Front Desk","Kitchen staff","Room Service","Manager","Accountant","chief","Cleaning Staff","Driver"});
    	 t4.setBounds(200,110,156,20);
    	 t4.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t4.setForeground(Color.WHITE);
    	 t4.setBackground(new Color(16,108,115)); 
    	 pa.add(t4);
    	 
    	 l3 =new JLabel("Salary");
    	 l3.setBounds(64,150,152,22);
    	 l3.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l3.setForeground(Color.WHITE);
    	 pa.add(l3);
    	 
    	 t5 =new JTextField();
    	 t5.setBounds(200,150,156,20);
    	 t5.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t5.setForeground(Color.WHITE);
    	 t5.setBackground(new Color(16,108,115)); 
    	 pa.add(t5);
    	 
    	 l4 =new JLabel("aadhar");
    	 l4.setBounds(64,190,152,22);
    	 l4.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l4.setForeground(Color.WHITE);
    	 pa.add(l4);
    	 
    	 t7 =new JTextField();
    	 t7.setBounds(200,190,156,20);
    	 t7.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t7.setForeground(Color.WHITE);
    	 t7.setBackground(new Color(16,108,115)); 
    	 pa.add(t7);
    	 
    	 l5 =new JLabel("Gender");
    	 l5.setBounds(64,230,152,22);
    	 l5.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l5.setForeground(Color.WHITE);
    	 pa.add(l5);
    	 
    	 t3 =new JComboBox(new String[] {"Male","Female"});
    	 t3.setBounds(200,230,156,20);
    	 t3.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t3.setForeground(Color.WHITE);
    	 t3.setBackground(new Color(16,108,115)); 
    	 pa.add(t3);
    	 
    	 l7 =new JLabel("Phone Number");
    	 l7.setBounds(64,270,152,22);
    	 l7.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l7.setForeground(Color.WHITE);
    	 pa.add(l7);
    	 
    	 t6 =new JTextField();
    	 t6.setBounds(200,270,156,20);
    	 t6.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t6.setForeground(Color.WHITE);
    	 t6.setBackground(new Color(16,108,115)); 
    	 pa.add(t6);
    	 
    	 l8 =new JLabel("age");
    	 l8.setBounds(64,310,152,22);
    	 l8.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l8.setForeground(Color.WHITE);
    	 pa.add(l8);
    	 
    	 t2 =new JTextField();
    	 t2.setBounds(200,310,156,20);
    	 t2.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t2.setForeground(Color.WHITE);
    	 t2.setBackground(new Color(16,108,115)); 
    	 pa.add(t2);
    	 
   
    	 l9 =new JLabel("gmail");
    	 l9.setBounds(64,350,152,22);
    	 l9.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l9.setForeground(Color.WHITE);
    	 pa.add(l9);
    	 
    	 t8 =new JTextField();
    	 t8.setBounds(200,350,156,20);
    	 t8.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t8.setForeground(Color.WHITE);
    	 t8.setBackground(new Color(16,108,115)); 
    	 pa.add(t8);
    	 
    	 
    	 b1= new JButton("Modify");
    	 b1.setBounds(64,445,111,33);
    	 b1.setBackground(Color.BLACK);
    	 b1.setForeground(Color.WHITE);
    	 b1.addActionListener(this);
    	 pa.add(b1);
    	 
    	 b2= new JButton("Back");
    	 b2.setBounds(198,445,111,33);
    	 b2.setBackground(Color.BLACK);
    	 b2.setForeground(Color.WHITE);
    	 b2.addActionListener(this);
    	 pa.add(b2);
    	 
    	 ImageIcon img= new ImageIcon("emp.jpeg");
    	 Image i =img.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
    	 ImageIcon img1= new ImageIcon(i);
    	 
    	 l6=new JLabel(img1);
    	 l6.setBounds(500,60,300,300);
    	 pa.add(l6);
    	 
    	 
    	 setUndecorated(true);
        setLayout(null);
        setLocation(20,200);
        getContentPane().setBackground(Color.white);        
        setSize(885,500);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
           try {
        	   Conn c= new Conn();
        	   String name=t1.getText();
        	   String age =t2.getText();
        	   String gender=(String)t3.getSelectedItem();
			   String job=(String)t4.getSelectedItem();
			   String slry =t5.getText();
			   String ph =t6.getText();	
			   String addh=t7.getText();
			   String gmail =t8.getText();
				
				c.s.executeUpdate("update employee set age='"+age+"' , gender='"+gender+"',job='"+job+"', salary='"+slry+"', phone='"+ph+"', aadhar='"+addh+"',egmail='"+gmail+"' where name ="+name);
		      	JOptionPane.showMessageDialog(null, "Employee Sucessfully Modify ");
	            setVisible(false);
           }
           catch (Exception e1) {
			System.out.println("error"+e);
		}
        }
       if(e.getSource()==b2)
        {
            setVisible(false);
        } 
    }
    
    public static void main(String args [])
    {
        new Modify_Employee();
    }
}



























