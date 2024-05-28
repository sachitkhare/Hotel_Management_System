import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class Display_Driver extends JFrame implements ActionListener{
JLabel l;
JTable jt;
DefaultTableModel model;
JButton b1;
	public Display_Driver() {
		JPanel aPanel2= new JPanel();
		aPanel2.setBounds(5,5,890,590);
		aPanel2.setBackground(new Color(3,45,48));
		add(aPanel2);
		
		 ImageIcon img= new ImageIcon("roomm.png");
    	 Image i =img.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
    	 ImageIcon img1= new ImageIcon(i);
		
    	 l= new JLabel(img1);
    	 l.setBounds(600,200,200,200);
    	 aPanel2.add(l);
    	
    		model = new DefaultTableModel();
    		jt = new JTable(model);
         	jt.setBounds(800,100,500,400);
        	jt.setBackground(new Color(3,45,48));
       	    jt.setForeground(Color.WHITE);
    
    		jt.setPreferredScrollableViewportSize(new Dimension(850,300));
    		JScrollPane jsp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    		jsp.setBounds(800,100,500,400);
    		aPanel2.add(jsp);
    		
    		add(aPanel2);
    		
    		try {
        		Conn c=new Conn();
        		String q="select * from driver";
        		ResultSet rs=c.s.executeQuery(q);
        		ResultSetMetaData rsmd=rs.getMetaData();
        		 model =(DefaultTableModel)jt.getModel();
        		
        		int cols=rsmd.getColumnCount();
        		String[] colName= new String[cols];
        		for(int k=0;k<cols;k++) {
        			colName[k]=rsmd.getColumnName(k+1);
        		model.setColumnIdentifiers(colName);	
        		}
        		
        		String name,age,gender,carno,carname,ava,location,shift;
        		
        		while(rs.next()) {
        			name=rs.getString(1);
        			age=rs.getString(2);
        			gender=rs.getString(3);
        			carno =rs.getString(4);
        			carname=rs.getString(5);
        			ava=rs.getString(6);
        			location=rs.getString(7);
        			shift=rs.getString(8);
        	
        			String[] row= {name,age,gender,carno,carname,ava,location,shift};
        			model.addRow(row);
        		}
        	}
        	
        	catch (Exception e1) {
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
		setSize(900,600);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			setVisible(false);
		}
		
	}
	public static void main(String[] args) {
		new Display_Driver();

	}

	
}
