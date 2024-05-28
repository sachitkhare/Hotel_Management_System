import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class New_Customer extends JFrame implements ActionListener{
JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,date;
JTextField t1,t2,t3,t4;
JComboBox c1,c2,c3,r1;
JButton b1,b2;
	public New_Customer(){
		JPanel p = new JPanel();
		p.setBounds(5,5,840,540);
		p.setLayout(null);
		p.setBackground(new Color(3,45,48));
		add(p);
		
		ImageIcon imgIcon= new ImageIcon("customer200.png");
		Image im= imgIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon imgIcon2= new ImageIcon(im);
		JLabel l= new JLabel(imgIcon2);
		l.setBounds(550,150,200,200);
		p.add(l);
		
		l1= new JLabel("CUSTOMER FORM");
		l1.setBounds(118,11,260,53);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
	    l1.setForeground(Color.WHITE);
	    p.add(l1);
		
		l2= new JLabel("ID :");
		l2.setBounds(35,76,200,14);
		l2.setFont(new Font("Tahoma",Font.PLAIN,14));
	    l2.setForeground(Color.WHITE);
	    p.add(l2);
		
		c1= new JComboBox(new String[] {"Passport","Aadhar Card","Voter Id","Driving License"});
	    c1.setBounds(271,73,150,20);
	    c1.setBackground(new Color(3,45,48));
		c1.setFont(new Font("Tahoma",Font.PLAIN,14));
	    c1.setForeground(Color.WHITE);
	    p.add(c1);
	    
	    l3= new JLabel("NAME :");
		l3.setBounds(35,111,200,14);
		l3.setFont(new Font("Tahoma",Font.PLAIN,14));
	    l3.setForeground(Color.WHITE);
	    p.add(l3);
	    
	    t1=new JTextField();
	    t1.setBounds(271,111,150,20);
	    p.add(t1);
	    
	    l4= new JLabel("ID NUMBER:");
		l4.setBounds(35,151,200,14);
		l4.setFont(new Font("Tahoma",Font.PLAIN,14));
	    l4.setForeground(Color.WHITE);
	    p.add(l4);
	    
	    t2=new JTextField();
	    t2.setBounds(271,151,150,20);
	    p.add(t2);
	    
	    l5= new JLabel("GENDER :");
		l5.setBounds(35,191,200,14);
		l5.setFont(new Font("Tahoma",Font.PLAIN,14));
	    l5.setForeground(Color.WHITE);
	    p.add(l5);

	    r1=new JComboBox(new String[] {"Male","Female"});
	    r1.setFont(new Font("Tahoma",Font.BOLD,14));
	    r1.setForeground(Color.WHITE);
	    r1.setBackground(new Color(3,45,48));
	    r1.setBounds(271,191,150,20);
	    p.add(r1);
	    
	    l6= new JLabel("Country :");
		l6.setBounds(35,231,200,14);
		l6.setFont(new Font("Tahoma",Font.PLAIN,14));
	    l6.setForeground(Color.WHITE);
	    p.add(l6);
	    
	    t3=new JTextField();
	    t3.setBounds(271,231,150,20);
	    p.add(t3);
	    
	    l7= new JLabel("Allocated Room Number :");
		l7.setBounds(35,274,200,14);
		l7.setFont(new Font("Tahoma",Font.PLAIN,14));
	    l7.setForeground(Color.WHITE);
	    p.add(l7);
		
		c2= new JComboBox(new String[] {"101","102","103","104","105","106","107","108","109"});
	    c2.setBounds(271,274,150,20);
	    c2.setBackground(new Color(3,45,48));
		c2.setFont(new Font("Tahoma",Font.PLAIN,14));
	    c2.setForeground(Color.WHITE);
	    p.add(c2);
	    
	    l8= new JLabel("Checked-In:");
	  	l8.setBounds(35,316,200,14);
	  	l8.setFont(new Font("Tahoma",Font.PLAIN,14));
	  	l8.setForeground(Color.WHITE);
	  	p.add(l8);
	    
	    Date date1= new Date();
	  	
	  	date=new JLabel(""+date1);
	  	date.setBounds(271,316,200,14);
	  	date.setFont(new Font("Tahoma",Font.PLAIN,14));
	  	date.setForeground(Color.WHITE);
	  	p.add(date);
	  	
	    l9= new JLabel("Deposite :");
	  	l9.setBounds(35,359,200,14);
	  	l9.setFont(new Font("Tahoma",Font.PLAIN,14));
	  	l9.setForeground(Color.WHITE);
	  	p.add(l9);
	  	    
	  	
	  	
	  	    t4=new JTextField();
	  	    t4.setBounds(271,359,150,20);
	  	    p.add(t4);
	  	    
	  	 b1= new JButton("Add");
	  	 b1.setBounds(100,430,120,30);
	  	 b1.setBackground(Color.BLACK);
	  	 b1.setForeground(Color.WHITE);
	  	 b1.addActionListener(this);
	  	 p.add(b1);
	  	    
	  	b2= new JButton("Back");
	  	 b2.setBounds(260,430,120,30);
	  	 b2.setBackground(Color.BLACK);
	  	 b2.setForeground(Color.WHITE);
	  	 b2.addActionListener(this);
	  	 p.add(b2);   
	  	 
	    setLayout(null);
		setLocation(500,150);
		setSize(850,550);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				Conn c= new Conn();
				String id=(String)c1.getSelectedItem();
			String name =t1.getText();
			String idnum =t2.getText();
				String gender=(String)r1.getSelectedItem();
				String country =t3.getText();
				String room=(String)c2.getSelectedItem();
				String checkin =date.getText();
				String deposite=(String)t4.getText();
		String q= "insert into customer values('"+id+"', '"+name+"', '"+idnum+"', '"+gender+"', '"+country+"','"+room+"','"+checkin+"','"+deposite+"')";
		String q1="update room set availability='Occupied' where roomnumber="+room;		
		c.s.executeUpdate(q);
		c.s.executeUpdate(q1);
				
        	   JOptionPane.showMessageDialog(null, "Added Sucessfully");
	            setVisible(false);
        	} catch (Exception e2) {
				System.out.println(""+e2);
			}
		}
      if(e.getSource()==b2) {
    	  setVisible(false);
		}
	}
	public static void main(String[] args) {
		new New_Customer();
	}

	

}
