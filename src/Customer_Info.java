import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Customer_Info extends JFrame implements ActionListener {
JButton b1;
JLabel l1;
JLabel l;
JTable jt;
DefaultTableModel model;
	public Customer_Info() {
		JPanel aPanel2= new JPanel();
		aPanel2.setBounds(5,5,890,490);
		aPanel2.setBackground(new Color(3,45,48));
		add(aPanel2);
		
		l1= new JLabel("CUSTOMER INFORMATION");
		l1.setBounds(118,11,260,53);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
	    l1.setForeground(Color.WHITE);
	    aPanel2.add(l1);
		
    		model = new DefaultTableModel();
    		jt = new JTable(model);
         	jt.setBounds(800,100,500,400);
        	jt.setBackground(new Color(3,45,48));
       	    jt.setForeground(Color.WHITE);
    
    		jt.setPreferredScrollableViewportSize(new Dimension(850,300));
    		JScrollPane jsp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    		jsp.setBounds(800,100,500,400);
    		jsp.setBackground(new Color(3,45,48));
    		aPanel2.add(jsp);
    		  
    		try {
        		Conn c=new Conn();
        		String Roominfo="select * from customer";
        		ResultSet rs=c.s.executeQuery(Roominfo);
        		ResultSetMetaData rsmd=rs.getMetaData();
        		 model =(DefaultTableModel)jt.getModel();
        		
        		int cols=rsmd.getColumnCount();
        		String[] colName= new String[cols];
        		for(int k=0;k<cols;k++) {
        			colName[k]=rsmd.getColumnName(k+1);
        		model.setColumnIdentifiers(colName);	
        		}
        		
        		String DOCUMENT,NAME,NUMBER,GENDER,Country,Allocated_Room_Number,CheckedIn,Deposite;
        		
        		while(rs.next()) {
        			DOCUMENT=rs.getString(1);
        			NAME=rs.getString(2);
        			NUMBER=rs.getString(3);
        			GENDER =rs.getString(4);
        			Country=rs.getString(5);
        			Allocated_Room_Number=rs.getString(6);
        			CheckedIn=rs.getString(7);
        			Deposite=rs.getString(8);
        	
        			String[] row= {DOCUMENT,NAME,NUMBER,GENDER,Country,Allocated_Room_Number,CheckedIn,Deposite};
        			model.addRow(row);
        		}
        	}
        	
        	catch (Exception e) {
    			// TODO: handle exception
    		}
    	
    		b1=new JButton("Back");
    		b1.setBackground(Color.BLACK);
    		b1.setForeground(Color.WHITE);
    		//b1.setBounds(850,550,150,50);
    		b1.addActionListener(this);
    		aPanel2.add(b1);
    	 
		setUndecorated(true);
		setLayout(null);
		setLocation(500,100);
		setSize(900,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			setVisible(false);
		}		
	}

	public static void main(String[] args) {
		new Customer_Info();
 
	}
}
