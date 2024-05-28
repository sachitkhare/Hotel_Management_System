import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

class FrameW extends JFrame implements ActionListener{
   JRadioButton c1,c2,c3;
   ButtonGroup cbg;
   JMenuBar mbar;
   JToolBar toolbar;
   JMenu m1,m2,m3;
   JMenuItem item1,item2,item3,item4,item5,item6,item7,item8;
   JRadioButtonMenuItem item9,item10,item11,item12;
   JButton b1,b2,b3,b4,b5,b6,b7;
   
   FrameW(){
	   setTitle("HOTEl MANAGEMENT");
	   setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	   setSize(Toolkit.getDefaultToolkit().getScreenSize());
	   setLayout(new BorderLayout());
	   Image Icon = Toolkit.getDefaultToolkit().getImage("");
	   createmenubar();
	   createtoolbar();
	   add(toolbar,BorderLayout.NORTH);
	   item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		item6.addActionListener(this);
		item7.addActionListener(this);
		item8.addActionListener(this);
		item9.addActionListener(this);
		item10.addActionListener(this);
		item11.addActionListener(this);
		item12.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
   }

   public void createmenubar() {
	   mbar =new JMenuBar();
	   setJMenuBar(mbar);
	   m1 = new JMenu("Menu");
		//m1.setMnemonic(KeyEvent.VK_B);
		item1 = new JMenuItem("Registration ",new ImageIcon("New.gif"));
		item1.setMnemonic(KeyEvent.VK_L);
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK ));
		item2 = new JMenuItem("Booking");
		item2.setMnemonic(KeyEvent.VK_T);
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.ALT_MASK ));
	
		item3 = new JMenuItem("Add Rooms");		
		item3.setMnemonic(KeyEvent.VK_B);
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.ALT_MASK ));//+ActionEvent.ALT_MASK  ));
		
		item4 = new JMenuItem("Confirm Booking",new ImageIcon("PrintPreview.gif"));
		item5 = new JMenuItem("Pending Payment");

		m1.add(item1);
		m1.add(item2);
		m1.addSeparator();
		m1.add(item3);
		m1.add(item4);
		m1.add(item5);

		mbar.add(m1);

		m2 = new JMenu("Home");
		
		item6 = new JMenuItem("Rating");
		item6.setMnemonic(KeyEvent.VK_C);
		item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK +ActionEvent.ALT_MASK  ));
		item7 = new JMenuItem("About");
		item8 = new JMenuItem("Contact us");
		m2.add(item6);		
		m2.add(item7);
		m2.add(item8);
		mbar.add(m2);
		
m3 = new JMenu("Rooms Types");
		ButtonGroup bg = new ButtonGroup();
		
		item9 = new JRadioButtonMenuItem("Luxury Rooms");
		bg.add(item9);
		
		item10 = new JRadioButtonMenuItem("A/c Rooms");
		bg.add(item10);
		
		item11 = new JRadioButtonMenuItem("Non A/c Rooms");
		bg.add(item11);
		item12 = new JRadioButtonMenuItem("Staff Room");
		bg.add(item12);
		
		m3.add(item9);
		m3.add(item10);
		m3.add(item11);
		m3.add(item12);
		mbar.add(m3);
   }
	
	public void createtoolbar()
	{
		toolbar = new JToolBar();
		toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolbar.setBorder(BorderFactory.createEtchedBorder());

		b1 = new JButton("Ragistration",new ImageIcon("New.gif"));
		
		b1.setBorderPainted(true);


	    b1.setToolTipText("Ragistration");
		b1.setFocusPainted(true);
		
		b2 = new JButton("checkout");
		b2.setToolTipText("checkout");
		b2.setBackground(Color.pink);
		
		b3 = new JButton("checkin");
		b3.setToolTipText("checkin");
		b3.setForeground(Color.white);
		b4 = new JButton(new ImageIcon("Save.gif"));
		
		b5 = new JButton("Employee");		
		
		b6 = new JButton("Update check");
		b7 = new JButton("Pickup Service",new ImageIcon("Print.gif"));
		cbg = new ButtonGroup();
		c1=new JRadioButton("Add Rooms",true);
		c2=new JRadioButton("Add Employee",true);
		c3=new JRadioButton("Dashboard",true);
		cbg.add(c1);	
		cbg.add(c2);
		cbg.add(c3);
		
		toolbar.add(b1);
		toolbar.add(b2);
		toolbar.add(b3);		
		toolbar.add(b4);
		toolbar.add(b5);
		toolbar.add(b6);
		toolbar.add(b7);
		toolbar.add(c1);
		toolbar.add(c2);
		toolbar.add(c3);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == item1 || ae.getSource() == b1) {
			System.out.println("kuch nahi hai b1 m");
		}
		if (ae.getSource() == item2 || ae.getSource() == b2) {
			System.out.println("kuch nahi hai b2 m");
		}
		if (ae.getSource() == item3 || ae.getSource() == b3) {
			getth();
		}
		if (ae.getSource() == item4 || ae.getSource() == b4) {
			System.out.println("kuch nahi hai b4 m");
		}
		if (ae.getSource() == item5 || ae.getSource() == b5) {
			System.out.println("kuch nahi hai b5 m");
		}
		if (ae.getSource() == item6 || ae.getSource() == b6) {
			System.out.println("kuch nahi hai b5 m");
		}
		if (ae.getSource() == item7 || ae.getSource() == b7) {
			System.out.println("kuch nahi hai b6 m");
		}
		if (ae.getSource() == item8) {
			System.out.println("kuch nahi hai b7 m");
		}
		
	}
	

void getth() {
	Add_Rooms a1= new Add_Rooms();
	a1.setVisible(true);
	a1.setLocation(500,200);
}
}
class MyWindowAdapter extends WindowAdapter
{
	FrameW mf1;
	public MyWindowAdapter(FrameW mf) 
	{
		mf1 = mf;
	}
	public void windowClosing(WindowEvent we)
	{
		int a=JOptionPane.showConfirmDialog(mf1,"Are you sure?");  
		if(a==JOptionPane.YES_OPTION)
		{  
		    mf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}

public class FrameWork {
	public static void main(String[] args) {
		FrameW mf= new FrameW();
		mf.addWindowListener(new MyWindowAdapter(mf));
        mf.setVisible(true);
	}}
