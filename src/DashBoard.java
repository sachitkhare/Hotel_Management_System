import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DashBoard extends JFrame implements ActionListener{
JButton adm,rec;
	public DashBoard() {
		super("HOTEL MANAGEMENT SYSTEM"); 
	
		rec= new JButton("RECEPTION");
		rec.setBounds(425,510,140,30);
		rec.setFont(new Font("Tahoma",Font.BOLD,15));
		rec.setBackground(new Color(255,98,0));
		rec.setForeground(Color.WHITE);
		rec.addActionListener(this);
		add(rec);
		
		adm= new JButton("ADMIN");
		adm.setBounds(880,510,140,30);
		adm.setFont(new Font("Tahoma",Font.BOLD,15));
		adm.setBackground(new Color(255,98,0));
		adm.setForeground(Color.WHITE);
		adm.addActionListener(this);
		add(adm);
		
		ImageIcon imgIcon1= new ImageIcon("boss.png");
		Image im1= imgIcon1.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
		ImageIcon imgIcon3= new ImageIcon(im1);
		JLabel l2= new JLabel(imgIcon3);
		l2.setBounds(850,300,200,195);
		add(l2);
		
		ImageIcon img= new ImageIcon("reception.png");
		Image i= img.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
		ImageIcon imgI= new ImageIcon(i);
		JLabel l3= new JLabel(imgI);
		l3.setBounds(400,300,200,195);
		add(l3);
		
		ImageIcon imgIcon= new ImageIcon("Dashboard.gif");
		Image im= imgIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
		ImageIcon imgIcon2= new ImageIcon(im);
		JLabel l1= new JLabel(imgIcon2);
		l1.setBounds(0,0,1950,1090);
		add(l1);
		
		setLayout(null);
		setSize(1950,1090);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rec) {
			new Reception();
		}	
		if(e.getSource()==adm) {
			new Admin_Login();
		}
	}

	public static void main(String[] args) {
		new DashBoard();
		
		
	}

}
