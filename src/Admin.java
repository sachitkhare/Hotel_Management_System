import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Admin extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5;
    
	public Admin() {
		b1= new JButton("Employee");
		b1.setBounds(250,230,200,30);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Tahoma",Font.BOLD,15));
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("Room");
		b2.setBounds(250,380,200,30);
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Tahoma",Font.BOLD,15));
		b2.addActionListener(this);
		add(b2);
		
		b3= new JButton("Driver");
		b3.setBounds(250,530,200,30);
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Tahoma",Font.BOLD,15));
		b3.addActionListener(this);
		add(b3);
		
		b4= new JButton("Logout");
		b4.setBounds(350,700,95,30);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Tahoma",Font.BOLD,15));
		b4.addActionListener(this);
		add(b4);
		
		b5= new JButton("Back");
		b5.setBounds(110,700,95,30);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Tahoma",Font.BOLD,15));
		b5.addActionListener(this);
		add(b5);
		
		ImageIcon imgIcon1= new ImageIcon("employees.png");
		Image im1= imgIcon1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon imgIcon3= new ImageIcon(im1);
		JLabel l2= new JLabel(imgIcon3);
		l2.setBounds(70,180,150,120);
		add(l2);
		
		ImageIcon imgIcon12= new ImageIcon("room.png");
		Image im= imgIcon12.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
		ImageIcon imgIcon= new ImageIcon(im);
		JLabel l= new JLabel(imgIcon);
		l.setBounds(70,340,120,120);
		add(l);
		
		ImageIcon imgIcon11= new ImageIcon("driver.png");
		Image i= imgIcon11.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
		ImageIcon imgI= new ImageIcon(i);
		JLabel l3= new JLabel(imgI);
		l3.setBounds(70,500,120,120);
		add(l3);
		
		ImageIcon img= new ImageIcon("Logo (1).gif");
		Image i1= img.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
		ImageIcon imgI1= new ImageIcon(i1);
		JLabel l4= new JLabel(imgI1);
		l4.setBounds(1000,250,400,400);
		add(l4);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setSize(1950,1090);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		new Admin_Employee();
		}	
		if(e.getSource()==b2) {
			new Admin_Room();
		}
		if(e.getSource()==b3) {
			new Admin_Driver();
		}	
		if(e.getSource()==b4) {
			System.exit(102);
		}
		if(e.getSource()==b5) {
			setVisible(false);
		}	
					
}

	public static void main(String[] args) {
		
      new Admin();
	}
}
