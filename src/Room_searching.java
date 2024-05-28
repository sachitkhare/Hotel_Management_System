import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Room_searching extends JFrame implements ActionListener{
	JLabel l1,l2;
	JCheckBox c;
	Choice h;
	JTable jt;
	JButton b1,b2;
	DefaultTableModel model;
	
	public Room_searching() {
		JPanel p= new JPanel();
		p.setBounds(5,5,690,490);
		p.setBackground(new Color(3,45,48));
		p.setLayout(null);
		add(p);
		
		setUndecorated(false);
		setLayout(null);
		setLocation(500,200);
		setSize(700,500);
		setVisible(true);
		
		l1= new JLabel("Search For Room");
		l1.setBounds(250,11,186,31);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		l1.setForeground(Color.WHITE);
		p.add(l1);
		
		c=new JCheckBox("Only Display Available");
		c.setBounds(400,69,285,23);
		c.setFont(new Font("Tahoma",Font.BOLD,14));
		c.setForeground(Color.WHITE);
		c.setBackground(new Color(3,45,48));
		p.add(c);
		
		l2= new JLabel("Room Bed Type:");
		l2.setBounds(50,73,120,14);
		l2.setFont(new Font("Tahoma",Font.BOLD,14));
		l2.setForeground(Color.WHITE);
		p.add(l2);
		
		h= new Choice();
		h.add("Single Bed");
		h.add("Double Bed");
		h.setBounds(172,70,120,20);
		p.add(h);
		
		b1= new JButton("Search");
		b1.setBounds(200,400,120,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		p.add(b1);
		
		b2= new JButton("Back");
		b2.setBounds(380,400,120,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		p.add(b2);
		
		model = new DefaultTableModel();
		jt = new JTable(model);
     	jt.setBounds(10,40,250,400);
    	jt.setBackground(new Color(3,45,48));
   	    jt.setForeground(Color.WHITE);
        p.add(jt);
		jt.setPreferredScrollableViewportSize(new Dimension(550,300));
		JScrollPane jsp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setBounds(50,115,600,250);
		p.add(jsp);
		
	
	try {
		Conn c=new Conn();
		String Roominfo="select * from room";
		ResultSet rs=c.s.executeQuery(Roominfo);
		ResultSetMetaData rsmd=rs.getMetaData();
		 model =(DefaultTableModel)jt.getModel();
		
		int cols=rsmd.getColumnCount();
		String[] colName= new String[cols];
		for(int k=0;k<cols;k++) {
			colName[k]=rsmd.getColumnName(k+1);
		model.setColumnIdentifiers(colName);	
		}
		
		String roomnumber,availability,price,status,bed_type;
		
		while(rs.next()) {
			roomnumber=rs.getString(1);
			availability=rs.getString(2);
			price=rs.getString(3);
			status =rs.getString(4);
			bed_type=rs.getString(5);
			String[] row= {roomnumber,availability,price,status,bed_type};
			model.addRow(row);	
		}
	}
	
	catch (Exception e) {
		System.out.println(""+e);
	}
	}

	public void actionPerformed(ActionEvent e1) {
		
		if(e1.getSource()==b1) {
			String q="select * from room where bed_type='"+h.getSelectedItem()+"'";
			String q1="select * from room where availability='Available' bed_type='"+h.getSelectedItem()+"'";
		
		try {
			Conn c1 = new Conn();
			ResultSet resultset= c1.s.executeQuery(q);
			//jt.setModel(DbUtils.resultsetToTableModel(resultset));
			ResultSetMetaData rsmd=resultset.getMetaData();
			 model =(DefaultTableModel)jt.getModel();
			
			int cols=rsmd.getColumnCount();
			String[] colName= new String[cols];
			for(int p=0;p<cols;p++) {
				colName[p]=rsmd.getColumnName(p+1);
			model.setColumnIdentifiers(colName);	
			}
			
			String roomnumber,availability,price,status,bed_type;
			
			while(resultset.next()) {
				roomnumber=resultset.getString(1);
				availability=resultset.getString(2);
				price=resultset.getString(3);
				status =resultset.getString(4);
				bed_type=resultset.getString(5);
				String[] row= {roomnumber,availability,price,status,bed_type};
				model.addRow(row);	
			}
			
			if(c.isSelected()) {
				ResultSet resultset1=c1.s.executeQuery(q1);
				ResultSetMetaData rsm=resultset.getMetaData();
				 model =(DefaultTableModel)jt.getModel();
				
				int col=rsmd.getColumnCount();
				String[] colNam= new String[cols];
				for(int p=0;p<cols;p++) {
					colName[p]=rsmd.getColumnName(p+1);
				model.setColumnIdentifiers(colName);	
				}
				
				String room_number,Availability,Price,Status,Bed_type;
				
				while(resultset.next()) {
					roomnumber=resultset1.getString(1);
					availability=resultset1.getString(2);
					price=resultset1.getString(3);
					status =resultset1.getString(4);
					bed_type=resultset1.getString(5);
					String[] row= {roomnumber,availability,price,status,bed_type};
					model.addRow(row);	
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
		
		if(e1.getSource()==b2) {
			setVisible(false);
			}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Room_searching();
	}

	
}
