import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reception extends JFrame implements ActionListener{
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	
	public Reception() {
		JPanel pa= new JPanel();
		pa.setLayout(null);
		pa.setBounds(280,5,1238,820);
		pa.setBackground(new Color(3,45,48));
		add(pa);
		
		JPanel p1= new JPanel();
		p1.setLayout(null);
		p1.setBounds(5,5,270,820);
		p1.setBackground(new Color(3,45,48));
		add(p1);
		
		ImageIcon imgIcon= new ImageIcon("Logo (1).gif");
		Image im= imgIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
		ImageIcon imgIcon2= new ImageIcon(im);
		JLabel l1= new JLabel(imgIcon2);
		l1.setBounds(300,50,500,500);
		pa.add(l1);
		
		ImageIcon imgIcon1= new ImageIcon("logopic.png");
		Image im1= imgIcon1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		ImageIcon imgIcon22= new ImageIcon(im1);
		JLabel l2= new JLabel(imgIcon22);
		l2.setBounds(5,530,250,250);
		p1.add(l2);
		
		b1=new JButton("New Customer Form");
		b1.setBounds(30,30,200,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2=new JButton("Room");
		b2.setBounds(30,70,200,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3=new JButton("Department");
		b3.setBounds(30,110,200,30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4=new JButton("All Employee Info");
		b4.setBounds(30,150,200,30);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5=new JButton("Customer Info");
		b5.setBounds(30,190,200,30);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.addActionListener(this);
		p1.add(b5);
		
		b6=new JButton("Manager Info");
		b6.setBounds(30,230,200,30);
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		b6.addActionListener(this);
		p1.add(b6);
		
		b7=new JButton("Check Out");
		b7.setBounds(30,270,200,30);
		b7.setBackground(Color.BLACK);
		b7.setForeground(Color.WHITE);
		b7.addActionListener(this);
		p1.add(b7);
		
		b8=new JButton("Update Check-In Details");
		b8.setBounds(30,310,200,30);
		b8.setBackground(Color.BLACK);
		b8.setForeground(Color.WHITE);
		b8.addActionListener(this);
		p1.add(b8);
		
		b9=new JButton("Update Room Status");
		b9.setBounds(30,350,200,30);
		b9.setBackground(Color.BLACK);
		b9.setForeground(Color.WHITE);
		b9.addActionListener(this);
		p1.add(b9);

//		b10=new JButton("Pick-Up Service");
//		b10.setBounds(30,390,200,30);
//		b10.setBackground(Color.BLACK);
//		b10.setForeground(Color.WHITE);
//		b10.addActionListener(this);
//     	p1.add(b10);
// 	
//		b11=new JButton("Search Room");
//		b11.setBounds(30,430,200,30);
//		b11.setBackground(Color.BLACK);
//		b11.setForeground(Color.WHITE);
//		b11.addActionListener(this);
//		p1.add(b11);
		
		b12=new JButton("Log Out");
		b12.setBounds(30,470,90,30);
		b12.setBackground(Color.BLACK);
		b12.setForeground(Color.WHITE);
		b12.addActionListener(this);
     	p1.add(b12);
 	
		b13=new JButton("Back");
		b13.setBounds(140,470,90,30);
		b13.setBackground(Color.BLACK);
		b13.setForeground(Color.WHITE);
		b13.addActionListener(this);
		p1.add(b13);
		
		getContentPane().setBackground(Color.WHITE);;
		setLayout(null);
		setSize(1950,1090);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b1) {
		try {
			new New_Customer();
		}
	catch (Exception ae) {
		ae.printStackTrace();
	    }	
		}
	
		if(e.getSource()==b2) {
			try {
				new Room_RE();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b3) {
			try {
				new Department();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b4) {
			try {
				new All_Employee();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b5) {
			try {
				new Customer_Info();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b6) {
			try {
			new	Manager_Info();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b7) {
			try {
				new Check_Out();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b8) {
			try {
				new Update_Check();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
		
		if(e.getSource()==b9) {
			try {
		 new Update_Room();
			}
		catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}
//		
//		if(e.getSource()==b10) {
//			try {
//				
//			}
//		catch (Exception ae) {
//			ae.printStackTrace();
//		    }	
//			}
//		
//		if(e.getSource()==b11) {
//			try {
//				new Room_searching();
//			}
//	catch (Exception ae) {
//			ae.printStackTrace();
//		    }	
//			}	
		
		if(e.getSource()==b12) {
			try {
				System.exit(ABORT);
			}
	catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}	
		
		if(e.getSource()==b13) {
			try {
				setVisible(false);
			}
	catch (Exception ae) {
			ae.printStackTrace();
		    }	
			}	
	}
 
	public static void main(String[] args) {
	new Reception();
	}
}
