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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Update_Room extends JFrame implements ActionListener{
	
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t1,t2,t3;
		Choice c;
		JButton b1,b2,b3;
			public Update_Room() {
				JPanel p= new JPanel();
				p.setBounds(5,5,940,490);
				p.setBackground(new Color(3,45,48));
				p.setLayout(null);
				add(p);
				
				ImageIcon imgIcon= new ImageIcon("update.png");
				Image im= imgIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
				ImageIcon imgIcon2= new ImageIcon(im);
				JLabel l= new JLabel(imgIcon2);
				l.setBounds(550,150,200,200);
				p.add(l);
				
				l1= new JLabel("Update Room Status");
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
				
				l4= new JLabel("Availability :");
				l4.setBounds(25,174,97,14);
				l4.setFont(new Font("Tahoma",Font.BOLD,14));
				l4.setForeground(Color.WHITE);
				p.add(l4);
				
				t2 = new JTextField();
				t2.setBounds(248,174,140,20);
				p.add(t2);
				
				l5= new JLabel("Clean Status :");
				l5.setBounds(25,216,150,14);
				l5.setFont(new Font("Tahoma",Font.BOLD,14));
				l5.setForeground(Color.WHITE);
				p.add(l5);
				
				t3 = new JTextField();
				t3.setBounds(248,216,140,20);
				p.add(t3);
				
				b1= new JButton("Update");
				b1.setBounds(120,315,89,23);
				b1.setBackground(Color.BLACK);
				b1.setForeground(Color.WHITE);
				p.add(b1);
				b1.addActionListener(this);

				b2= new JButton("Back");
				b2.setBounds(180,355,89,23);
				b2.setBackground(Color.BLACK);
				b2.setForeground(Color.WHITE);
				p.add(b2);
				b2.addActionListener(this);
				
				b3= new JButton("Check");
				b3.setBounds(60,355,89,23);
				b3.setBackground(Color.BLACK);
				b3.setForeground(Color.WHITE);
				p.add(b3);
				b3.addActionListener(this);
				
				setUndecorated(true);
				setLayout(null);
				setLocation(400,200);
				setVisible(true);
				setSize(950,450);
			}
			@Override
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				try {
					Conn c3=new Conn();
					String status= t3.getText();
					c3.s.executeUpdate("update room set status='"+status+"' where roomnumber='"+t1.getText()+"'");

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
						
									
					}
					
					ResultSet res1= c1.s.executeQuery("select * from room where roomnumber= '"+t1.getText()+"'");
					
					while(res1.next()) {
						t2.setText(res1.getString("availability"));
						t3.setText(res1.getString("status"));
					}
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				JOptionPane.showMessageDialog(null, "Sucessfully Check");
				}
			}

			

	public static void main(String[] args) {
          new Update_Room();
		 
	}

}
