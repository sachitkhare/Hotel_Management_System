        import javax.swing.*;
		import java.awt.*;
		import java.awt.color.ColorSpace;
		import java.awt.event.*;

		public class Add_Driver extends JFrame implements ActionListener{
			    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
			    JTextField t1,t2,t3,t6,t,t9;
			    JComboBox t4,t5,t7;
			    
			    ButtonGroup bg;
			    JButton b1,b2;
			    Add_Driver(){
			    JPanel pa= new JPanel();
			    pa.setBounds(5,5,890,490);
			    pa.setBackground(new Color(3,45,48));
			    pa.setLayout(null);
			    add(pa);
			    	 
			     l =new JLabel("ADD DRIVER");
			     l.setBounds(194,10,200,27);
			     l.setFont(new Font("Tahoma",Font.BOLD,22));
			     l.setForeground(Color.WHITE);
			     pa.add(l);
			    	 
			     l1 =new JLabel("NAME");
			     l1.setBounds(64,70,102,27);
			     l1.setFont(new Font("Serif",Font.BOLD,15));
			     l1.setForeground(Color.WHITE);
			     pa.add(l1);
			    	 
			     t1 =new JTextField();
			     t1.setBounds(174,70,156,27);
			     t1.setFont(new Font("Tahoma",Font.BOLD,15));
			     t1.setForeground(Color.WHITE);
			     t1.setBackground(new Color(16,108,115)); 
			     pa.add(t1);
			    	 
			     l2 =new JLabel("AGE");
			     l2.setBounds(64,110,102,27);
			     l2.setFont(new Font("Serif",Font.BOLD,15));
			     l2.setForeground(Color.WHITE);
			     pa.add(l2);
			    	 
			     t2 =new JTextField();
			     t2.setBounds(174,110,156,27);
			     t2.setFont(new Font("Tahoma",Font.BOLD,15));
			     t2.setForeground(Color.WHITE);
			     t2.setBackground(new Color(16,108,115)); 
			     pa.add(t2);
			    	 
			    	 l3 =new JLabel("GENDER");
			    	 l3.setBounds(64,150,102,27);
			    	 l3.setFont(new Font("Serif",Font.BOLD,15));
			    	 l3.setForeground(Color.WHITE);
			    	 pa.add(l3);
			    	 
			    	 t4 =new JComboBox(new String[] {"MALE","FEMALE"});
			    	 t4.setBounds(174,150,156,27);
			    	 t4.setFont(new Font("Tahoma",Font.BOLD,15));
			    	 t4.setForeground(Color.WHITE);
			    	 t4.setBackground(new Color(16,108,115)); 
			    	 pa.add(t4); 
			    	 
				     l4 =new JLabel("CAR NUMBER");
			    	 l4.setBounds(60,190,130,25);
			    	 l4.setFont(new Font("Serif",Font.BOLD,15));
			    	 l4.setForeground(Color.WHITE);
			    	 pa.add(l4);
			    	
			    	 t =new JTextField();
			    	 t.setBounds(176,190,156,25);
			    	 t.setFont(new Font("Tahoma",Font.BOLD,15));
			    	 t.setForeground(Color.WHITE);
			    	 t.setBackground(new Color(16,108,115)); 
			    	 pa.add(t);
			    	 
			    	 l5 =new JLabel("CAR NAME");
			    	 l5.setBounds(64,230,102,27);
			    	 l5.setFont(new Font("Serif",Font.BOLD,15));
			    	 l5.setForeground(Color.WHITE);
			    	 pa.add(l5);
			    	
			    	 t3 =new JTextField();
			    	 t3.setBounds(174,230,156,27);
			    	 t3.setFont(new Font("Tahoma",Font.BOLD,15));
			    	 t3.setForeground(Color.WHITE);
			    	 t3.setBackground(new Color(16,108,115)); 
			    	 pa.add(t3);
			    	 
			    	 l6 =new JLabel("AVAILABLE");
			    	 l6.setBounds(64,270,102,27);
			    	 l6.setFont(new Font("Serif",Font.BOLD,15));
			    	 l6.setForeground(Color.WHITE);
			    	 pa.add(l6);
			    	 
			    	 t5 =new JComboBox(new String[] {"YES","NO"});
			    	 t5.setBounds(174,270,156,27);
			    	 t5.setFont(new Font("Tahoma",Font.BOLD,15));
			    	 t5.setForeground(Color.WHITE);
			    	 t5.setBackground(new Color(16,108,115)); 
			    	 pa.add(t5); 
			    	 
			    	 l7 =new JLabel("LOCATION");
			    	 l7.setBounds(64,310,102,27);
			    	 l7.setFont(new Font("Serif",Font.BOLD,15));
			    	 l7.setForeground(Color.WHITE);
			    	 pa.add(l7);
			    	
			    	 t6 =new JTextField();
			    	 t6.setBounds(174,310,156,27);
			    	 t6.setFont(new Font("Tahoma",Font.BOLD,15));
			    	 t6.setForeground(Color.WHITE);
			    	 t6.setBackground(new Color(16,108,115)); 
			    	 pa.add(t6);
			    	 
			    	 l8 =new JLabel("SHIFT");
			    	 l8.setBounds(64,350,102,27);
			    	 l8.setFont(new Font("Serif",Font.BOLD,15));
			    	 l8.setForeground(Color.WHITE);
			    	 pa.add(l8);
			    	 
			    	 t7 =new JComboBox(new String[] {"Day","Night"});
			    	 t7.setBounds(174,350,156,27);
			    	 t7.setFont(new Font("Tahoma",Font.BOLD,15));
			    	 t7.setForeground(Color.WHITE);
			    	 t7.setBackground(new Color(16,108,115)); 
			    	 pa.add(t7);
			    	 
			    	 b1= new JButton("Add");
			    	 b1.setBounds(70,420,111,33);
			    	 b1.setBackground(Color.BLACK);
			    	 b1.setForeground(Color.WHITE);
			    	 b1.addActionListener(this);
			    	 pa.add(b1);
			    	 
			    	 b2= new JButton("Back");
			    	 b2.setBounds(200,420,111,33);
			    	 b2.setBackground(Color.BLACK);
			    	 b2.setForeground(Color.WHITE);
			    	 b2.addActionListener(this);
			    	 pa.add(b2);
			    	 
			    	 ImageIcon img= new ImageIcon("license.png");
			    	 Image i =img.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
			    	 ImageIcon img1= new ImageIcon(i);
			    	 
			    	 l6=new JLabel(img1);
			    	 l6.setBounds(500,60,300,300);
			    	 pa.add(l6);
			    	 	    	 
			    	 setUndecorated(true);
			        setLayout(null);
			        setLocation(20,200);
			        getContentPane().setBackground(Color.white);        
			        setSize(900,500);
			        setVisible(true);
			    }
			    
			    
			    public void actionPerformed(ActionEvent e) 
			    {
			        if(e.getSource()==b1)
			        {
			           try {
							Conn c= new Conn();
							String name=(String)t1.getText();
							String age=(String)t2.getText();
							String gender =(String)t4.getSelectedItem();
							String carno=(String)t.getText();
							String carname=(String)t3.getText();
							String ava=(String)t5.getSelectedItem();
							String location=(String)t6.getText();
							String shift=(String)t7.getSelectedItem();
					String q= "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+carno+"', '"+carname+"', '"+ava+"', '"+location+"', '"+shift+"')";
							c.s.executeUpdate(q);
							
			        	   JOptionPane.showMessageDialog(null, "Room Sucessfully Added");
				            setVisible(false);
			           }
			           catch (Exception e1) {
						
					}
			        }
			       if(e.getSource()==b2)
			        {
			            setVisible(false);
			        } 
			    }
			    
			    public static void main(String args [])
			    {
			        new Add_Driver();
			    }
			}

