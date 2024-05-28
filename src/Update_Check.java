import java.awt.Choice;
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
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.cj.util.DnsSrv.SrvRecord;

public class Update_Check extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1,t2,t3,t4,t5;
Choice c;
JButton b1,b2,b3;
	public Update_Check() {
		JPanel p= new JPanel();
		p.setBounds(5,5,940,490);
		p.setBackground(new Color(3,45,48));
		p.setLayout(null);
		add(p);
		
		ImageIcon imgIcon= new ImageIcon("updated.png");
		Image im= imgIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon imgIcon2= new ImageIcon(im);
		JLabel l= new JLabel(imgIcon2);
		l.setBounds(550,150,200,200);
		p.add(l);
		
		l1= new JLabel("Chech-In details");
		l1.setBounds(124,11,222,25);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		p.add(l1);
		
		l2= new JLabel("ID :");
		l2.setBounds(25,88,46,14);
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
		l3.setBounds(25,129,120,14);
		l3.setFont(new Font("Tahoma",Font.BOLD,14));
		l3.setForeground(Color.WHITE);
		p.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(248,129,140,20);
		p.add(t1);
		
		l4= new JLabel("Name :");
		l4.setBounds(25,174,97,14);
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		l4.setForeground(Color.WHITE);
		p.add(l4);
		
		t2 = new JTextField();
		t2.setBounds(248,174,140,20);
		p.add(t2);
		
		l5= new JLabel("Checked-In :");
		l5.setBounds(25,216,97,14);
		l5.setFont(new Font("Tahoma",Font.BOLD,14));
		l5.setForeground(Color.WHITE);
		p.add(l5);
		
		t3 = new JTextField();
		t3.setBounds(248,216,140,20);
		p.add(t3);
		
		l6= new JLabel("Amount Paid (Rs) :");
		l6.setBounds(25,261,160,14);
		l6.setFont(new Font("Tahoma",Font.BOLD,14));
		l6.setForeground(Color.WHITE);
		p.add(l6);
		
		t4 = new JTextField();
		t4.setBounds(248,261,140,20);
		p.add(t4);
		
		l7= new JLabel("Pending Amount(Rs) :");
		l7.setBounds(25,302,160,14);
		l7.setFont(new Font("Tahoma",Font.BOLD,14));
		l7.setForeground(Color.WHITE);
		p.add(l7);
		
		t5 = new JTextField();
		t5.setBounds(248,302,140,20);
		p.add(t5);
		
		b1= new JButton("Update");
		b1.setBounds(56,378,89,23);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		p.add(b1);
		b1.addActionListener(this);

		b2= new JButton("Back");
		b2.setBounds(168,378,89,23);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		p.add(b2);
		b2.addActionListener(this);
		
		b3= new JButton("Check");
		b3.setBounds(281,378,89,23);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		p.add(b3);
		b3.addActionListener(this);
		
		setUndecorated(true);
		setLayout(null);
		setLocation(400,200);
		setVisible(true);
		setSize(950,500);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		try {
			Conn c3=new Conn();
			String q =c.getSelectedItem();
			String room= t1.getText();
			String name=t2.getText();
			String check=t3.getText();
			String amount=t4.getText();
			c3.s.executeUpdate("update customer set Allocated_Room_Number='"+room+"',NAME='"+name+"', CheckedIn='"+check+"',Deposite='"+amount+"' where NUMBER='"+q+"'");

		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	JOptionPane.showMessageDialog(null, "Sucessfully Updated");
    setVisible(false);
	}
		
	if(e.getSource()==b2) {
	setVisible(false);
	}
	
	if(e.getSource()==b3) {
		String id=c.getSelectedItem();
		String q="select * from customer where NUMBER='"+id+"'";
		try {
			Conn c1=new Conn();
			ResultSet re= c1.s.executeQuery(q);
			
			while(re.next()) {
				t1.setText(re.getString("Allocated_Room_Number"));
				t2.setText(re.getString("NAME"));
				t3.setText(re.getString("CheckedIn"));
				t4.setText(re.getString("Deposite"));
				
			}
			
			ResultSet res1= c1.s.executeQuery("select * from room where roomnumber= '"+t1.getText()+"'");
			
			while(res1.next()) {
				String price=res1.getString("price");
				int am=0;
				//am =Integer.parseInt(price)-Integer.getInteger(t4.getText());
				am =Integer.parseInt(price)-Integer.parseInt(t4.getText());
				t5.setText(""+am);
			}
			
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		JOptionPane.showMessageDialog(null, "Sucessfully Check");
		}
	}

	public static void main(String[] args) {
		new Update_Check();
	}
}
