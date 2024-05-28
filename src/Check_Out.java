import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Check_Out extends JFrame implements ActionListener{
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	Choice c;
	JButton b1,b2,b3;
	
	public Check_Out() {
		JPanel p= new JPanel();
		p.setBounds(5,5,790,390);
		p.setBackground(new Color(3,45,48));
		p.setLayout(null);
		add(p);
		
		ImageIcon imgIcon= new ImageIcon("checkout22.png");
		Image im= imgIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon imgIcon2= new ImageIcon(im);
		JLabel l= new JLabel(imgIcon2);
		l.setBounds(550,150,200,200);
		p.add(l);
		
		l1= new JLabel("Chech Out");
		l1.setBounds(100,20,120,30);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		p.add(l1);
		
		l2= new JLabel("Customer Id :");
		l2.setBounds(30,80,150,30);
		l2.setFont(new Font("Tahoma",Font.BOLD,14));
		l2.setForeground(Color.WHITE);
		p.add(l2);
		
		c= new Choice();
		c.setBounds(248,85,140,20);
		p.add(c);
		
		try {
			Conn co= new Conn();
			ResultSet re= co.s.executeQuery("select * from customer");
			
			while(re.next()) {
				c.add(re.getString("NUMBER"));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		l3= new JLabel("Room Number :");
		l3.setBounds(30,130,150,30);
		l3.setFont(new Font("Tahoma",Font.BOLD,14));
		l3.setForeground(Color.WHITE);
		p.add(l3);
		
		l4= new JLabel();
		l4.setBounds(200,130,200,30);
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		l4.setForeground(Color.WHITE);
		p.add(l4);
		
		l5= new JLabel("Check-In Time :");
		l5.setBounds(30,180,150,30);
		l5.setFont(new Font("Tahoma",Font.BOLD,14));
		l5.setForeground(Color.WHITE);
		p.add(l5);

		l6= new JLabel();
		l6.setBounds(200,180,200,30);
		l6.setFont(new Font("Tahoma",Font.BOLD,14));
		l6.setForeground(Color.WHITE);
		p.add(l6);
		
		l7= new JLabel("Check-out Time");
		l7.setBounds(30,230,150,30);
		l7.setFont(new Font("Tahoma",Font.BOLD,14));
		l7.setForeground(Color.WHITE);
		p.add(l7);
		
		Date date1= new Date();
		
		l8= new JLabel(""+date1);
		l8.setBounds(200,230,200,30);
		l8.setFont(new Font("Tahoma",Font.BOLD,14));
		l8.setForeground(Color.WHITE);
		p.add(l8);
		
		b1= new JButton("Chech-Out");
		b1.setBounds(30,300,120,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		p.add(b1);
		b1.addActionListener(this);

		b2= new JButton("Back");
		b2.setBounds(170,300,120,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		p.add(b2);
		b2.addActionListener(this);
		
		b3= new JButton("Check");
		b3.setBounds(300,300,120,30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		p.add(b3);
		b3.addActionListener(this);
		
		setUndecorated(true);
		setLayout(null);
		setLocation(500,210);
		setVisible(true);
		setSize(800,400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				Conn cv=new Conn();
				cv.s.executeUpdate("delete from customer where NUMBER='"+c.getSelectedItem()+"'");
				cv.s.executeUpdate("update room set availability=' Available' where roomnumber='"+l4.getText()+"'");
			} catch (Exception e2) {
				System.out.println(""+e);
			}
			
			
			JOptionPane.showMessageDialog(null, "Sucessfully Chech-Out");
		    setVisible(false);
			}
				
			if(e.getSource()==b2) {
			setVisible(false);
			}
			
			if(e.getSource()==b3) {
				Conn cn= new Conn();
				try {
				ResultSet resultset=cn.s.executeQuery("select * from customer where NUMBER='"+c.getSelectedItem()+"'");
				
				while(resultset.next()) {
					
					l4.setText(resultset.getString("Allocated_Room_Number"));
	                l6.setText(resultset.getString("CheckedIn"));
				}
				}
				catch (Exception e1) {
					// TODO: handle exception
				}
				JOptionPane.showMessageDialog(null, "Sucessfully Check");
				}
			}
	
	public static void main(String[] args) {
		new Check_Out();

	}

	
}
