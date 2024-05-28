import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Admin_Employee extends JFrame implements ActionListener{
	 JButton b1,b2,b3,b4,b5,b6;
	public Admin_Employee() {
		b1= new JButton("Add Employee");
		b1.setBounds(250,200,200,30);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Tahoma",Font.BOLD,15));
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("Modify Employee");
		b2.setBounds(250,300,200,30);
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Tahoma",Font.BOLD,15));
		b2.addActionListener(this);
		add(b2);
		
		b3= new JButton("Delete Employee");
		b3.setBounds(250,400,200,30);
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Tahoma",Font.BOLD,15));
		b3.addActionListener(this);
		add(b3);
		
		b4= new JButton("Display Employee");
		b4.setBounds(250,500,200,30);
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Tahoma",Font.BOLD,15));
		b4.addActionListener(this);
		add(b4);
		
		b6= new JButton("Logout");
		b6.setBounds(350,700,95,30);
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("Tahoma",Font.BOLD,15));
		b6.addActionListener(this);
		add(b6);
		
		b5= new JButton("Back");
		b5.setBounds(110,700,95,30);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Tahoma",Font.BOLD,15));
		b5.addActionListener(this);
		add(b5);
		
		ImageIcon img= new ImageIcon("emp.jpeg");
		Image i1= img.getImage().getScaledInstance(550,550,Image.SCALE_DEFAULT);
		ImageIcon imgI1= new ImageIcon(i1);
		JLabel l4= new JLabel(imgI1);
		l4.setBounds(850,150,550,550);
		add(l4);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setSize(1950,1090);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		    new	Add_Employee();
			}	
			if(e.getSource()==b2) {
		     new Modify_Employee();
			}
			if(e.getSource()==b3) {
		     new Delete_Employee();
			}	
			if(e.getSource()==b4) {
			new Display_Employee();
			}	
			if(e.getSource()==b6) {
				System.exit(102);
			}
			if(e.getSource()==b5) {
				setVisible(false);
			}	
	}
	public static void main(String[] args) {
		new Admin_Employee();

	}
}
