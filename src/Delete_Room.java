import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;

public class Delete_Room extends JFrame implements ActionListener {
    JLabel l,l1,l2,l3,l4,l5,l6;
    JTextField t1,t3;
    JComboBox t2,t4,t5;
    JButton b1,b2;
    Delete_Room (){
    	 JPanel pa= new JPanel();
    	 pa.setBounds(5,5,875,490);
    	 pa.setBackground(new Color(3,45,48));
    	 pa.setLayout(null);
    	 add(pa);
    	 
    	 l =new JLabel("Delete Room");
    	 l.setBounds(194,10,160,22);
    	 l.setFont(new Font("Tahoma",Font.BOLD,22));
    	 l.setForeground(Color.WHITE);
    	 pa.add(l);
    	 
    	 l1 =new JLabel("Room Number");
    	 l1.setBounds(64,90,152,20);
    	 l1.setFont(new Font("Tahoma",Font.BOLD,17));
    	 l1.setForeground(Color.WHITE);
    	 pa.add(l1);
    	 
    	 t1 =new JTextField();
    	 t1.setBounds(250,90,156,25);
    	 t1.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t1.setForeground(Color.WHITE);
    	 t1.setBackground(new Color(16,108,115)); 
    	 pa.add(t1);
    	 
    	 l2 =new JLabel("Check Availability");
    	 l2.setBounds(64,150,152,22);
    	 l2.setFont(new Font("Tahoma",Font.BOLD,17));
    	 l2.setForeground(Color.WHITE);
    	 pa.add(l2);
    	 
    	 t2 =new JComboBox(new String[] {"Available","Occupied"});
    	 t2.setBounds(250,150,156,25);
    	 t2.setFont(new Font("Tahoma",Font.BOLD,17));
    	 t2.setForeground(Color.WHITE);
    	 t2.setBackground(new Color(16,108,115)); 
    	 pa.add(t2);
    	 /*
    	 l3 =new JLabel("Price");
    	 l3.setBounds(64,150,152,22);
    	 l3.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l3.setForeground(Color.WHITE);
    	 pa.add(l3);
    	 
    	 t3 =new JTextField();
    	 t3.setBounds(200,150,156,20);
    	 t3.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t3.setForeground(Color.WHITE);
    	 t3.setBackground(new Color(16,108,115)); 
    	 pa.add(t3);
    	 
    	 
    	 l4 =new JLabel("Cleaning Status");
    	 l4.setBounds(64,190,152,22);
    	 l4.setFont(new Font("Tahoma",Font.BOLD,15));
    	 l4.setForeground(Color.WHITE);
    	 pa.add(l4);
    	 
    	 t4 =new JComboBox(new String[] {"Cleaned","Dirty"});
    	 t4.setBounds(200,190,156,20);
    	 t4.setFont(new Font("Tahoma",Font.BOLD,15));
    	 t4.setForeground(Color.WHITE);
    	 t4.setBackground(new Color(16,108,115)); 
    	 pa.add(t4);
    	 */
    	 
    	 l5 =new JLabel("Bed Types");
    	 l5.setBounds(64,220,152,22);
    	 l5.setFont(new Font("Tahoma",Font.BOLD,17));
    	 l5.setForeground(Color.WHITE);
    	 pa.add(l5);
    	 
    	 t5 =new JComboBox(new String[] {"Single","Double"});
    	 t5.setBounds(250,220,156,25);
    	 t5.setFont(new Font("Tahoma",Font.BOLD,17));
    	 t5.setForeground(Color.WHITE);
    	 t5.setBackground(new Color(16,108,115)); 
    	 pa.add(t5);
    	 
    	 b1= new JButton("Delete");
    	 b1.setBounds(64,321,111,33);
    	 b1.setBackground(Color.BLACK);
    	 b1.setForeground(Color.WHITE);
    	 b1.addActionListener(this);
    	 pa.add(b1);
    	 
    	 b2= new JButton("Back");
    	 b2.setBounds(198,321,111,33);
    	 b2.setBackground(Color.BLACK);
    	 b2.setForeground(Color.WHITE);
    	 b2.addActionListener(this);
    	 pa.add(b2);
    	 
    	 ImageIcon img= new ImageIcon("roomser.png");
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
        	   Conn c=new Conn();
        	   String q="delete from room where roomnumber='"+ t1.getText()+"'";
        	   c.s.executeUpdate(q);
        	  
        	   JOptionPane.showMessageDialog(null, "Room Sucessfully Deleted ");
	            setVisible(false);
           }
           catch (Exception e1) {
			
		}
        }
       if(e.getSource()==b2)
        {
            setVisible(false);
        } 
    }
    
    public static void main(String args [])
    {
        new Delete_Room ();
    }}
