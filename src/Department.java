import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Department extends JFrame implements ActionListener{
	JLabel l;
	JTable jt;
	DefaultTableModel model;
	JButton b1;
	public Department() {
		JPanel aPanel2= new JPanel();
		aPanel2.setBounds(5,5,890,590);
		aPanel2.setBackground(new Color(3,45,48));
		add(aPanel2);
		
		 ImageIcon img= new ImageIcon("roomser.png");
    	 Image i =img.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
    	 ImageIcon img1= new ImageIcon(i);
		
    	 l= new JLabel(img1);
    	 l.setBounds(600,200,200,200);
    	 aPanel2.add(l);

    		jt = new JTable(model);
         //	jt.setBounds(700,100,300,200);
        	jt.setBackground(new Color(3,45,48));
       	    jt.setForeground(Color.WHITE);
    
    		jt.setPreferredScrollableViewportSize(new Dimension(850,300));
    		JScrollPane jsp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    		//jsp.setBounds(800,100,500,400);
    		aPanel2.add(jsp);
    		
    	  	try {
        		Conn c=new Conn();
        		String Roominfo="select * from department";
        		ResultSet rs=c.s.executeQuery(Roominfo);
        		ResultSetMetaData rsmd=rs.getMetaData();
        		DefaultTableModel model =(DefaultTableModel)jt.getModel();
        		
        		int cols=rsmd.getColumnCount();
        		String[] colName= new String[cols];
        		for(int k=0;k<cols;k++) {
        			colName[k]=rsmd.getColumnName(k+1);
        		model.setColumnIdentifiers(colName);	
        		}
        		
        		String  DEPARTMENT,BUDGET,SPEND,REMAINING;
        		
        		while(rs.next()) {
        			DEPARTMENT=rs.getString(1);
        			BUDGET=rs.getString(2);
        			SPEND=rs.getString(3);
        			REMAINING =rs.getString(4);
        			String[] row= {DEPARTMENT,BUDGET,SPEND,REMAINING};
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
    /*	 
		setUndecorated(true);
		setLayout(null);
		setLocation(500,100);
		setSize(900,600);
		setVisible(true);
		
		*/
		setUndecorated(true);
		setLayout(null);
		setLocation(550,150);
	    setSize(900,600);
	    setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			setVisible(false);
		}
		
		
	}

	public static void main(String[] args) {
		new Department();

	}


}
