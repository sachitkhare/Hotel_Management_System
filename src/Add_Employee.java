    import javax.swing.*;
	import java.awt.*;
	import java.awt.color.ColorSpace;
	import java.awt.event.*;
		
	public class Add_Employee extends JFrame implements ActionListener{
		    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
		    JTextField t1,t2,t3,t5,t6,t7;
		    JComboBox t4,t8;
		    JButton b1,b2;
		    Add_Employee(){
		    	JPanel pa= new JPanel();
		    	pa.setBounds(5,5,890,490);
		    	 pa.setBackground(new Color(3,45,48));
		    	 pa.setLayout(null);
		    	 add(pa);
		    	 
		    	 l =new JLabel("ADD EMPLOYEE DETAILS");
		    	 l.setBounds(450,24,445,35);
		    	 l.setFont(new Font("Tahoma",Font.BOLD,31));
		    	 l.setForeground(Color.WHITE);
		    	 pa.add(l);
		    	 
		    	 l1 =new JLabel("NAME");
		    	 l1.setBounds(60,30,150,27);
		    	 l1.setFont(new Font("Serif",Font.BOLD,15));
		    	 l1.setForeground(Color.WHITE);
		    	 pa.add(l1);
		    	 
		    	 t1 =new JTextField();
		    	 t1.setBounds(200,30,150,27);
		    	 t1.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t1.setForeground(Color.WHITE);
		    	 t1.setBackground(new Color(16,108,115)); 
		    	 pa.add(t1);
		    	 
		    	 l2 =new JLabel("AGE");
		    	 l2.setBounds(60,80,150,27);
		    	 l2.setFont(new Font("Serif",Font.BOLD,15));
		    	 l2.setForeground(Color.WHITE);
		    	 pa.add(l2);
		    	 
		    	 t2 =new JTextField();
		    	 t2.setBounds(200,80,150,27);
		    	 t2.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t2.setForeground(Color.WHITE);
		    	 t2.setBackground(new Color(16,108,115)); 
		    	 pa.add(t2);
		    	 
		    	 l3 =new JLabel("GENDER");
		    	 l3.setBounds(60,120,150,27);
		    	 l3.setFont(new Font("Serif",Font.BOLD,15));
		    	 l3.setForeground(Color.WHITE);
		    	 pa.add(l3);
		    	 
		    	 t8 =new JComboBox(new String[] {"Male","Female"});
		    	 t8.setBounds(200,120,150,27);
		    	 t8.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t8.setForeground(Color.WHITE);
		    	 t8.setBackground(new Color(16,108,115)); 
		    	 pa.add(t8);

			     l4 =new JLabel("JOB");
		    	 l4.setBounds(60,170,150,27);
		    	 l4.setFont(new Font("Serif",Font.BOLD,15));
		    	 l4.setForeground(Color.WHITE);
		    	 pa.add(l4);
		    	 
		    	 t4 =new JComboBox(new String[] {"Front Desk","Housekeeping","Kitchen staff","Room Service","Manager","Accountant","cheff"});
		    	 t4.setBounds(200,170,150,30);
		    	 t4.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t4.setForeground(Color.WHITE);
		    	 t4.setBackground(new Color(16,108,115)); 
		    	 pa.add(t4);
		    	 
		    	 l5 =new JLabel("SALARY");
		    	 l5.setBounds(60,220,150,27);
		    	 l5.setFont(new Font("serif",Font.BOLD,15));
		    	 l5.setBackground(new Color(16,108,115)); 
		    	 l5.setForeground(Color.WHITE);
		    	 pa.add(l5);
		    	 
		    	 t3 =new JTextField();
		    	 t3.setBounds(200,220,150,27);
		    	 t3.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t3.setForeground(Color.WHITE);
		    	 t3.setBackground(new Color(16,108,115)); 
		    	 pa.add(t3);
		    	 
		    	 l6 =new JLabel("PHONE");
		    	 l6.setBounds(60,270,150,27);
		    	 l6.setFont(new Font("serif",Font.BOLD,15));
		    	 l6.setBackground(new Color(16,108,115)); 
		    	 l6.setForeground(Color.WHITE);
		    	 pa.add(l6);
		    	 
		    	 t5 =new JTextField();
		    	 t5.setBounds(200,270,150,27);
		    	 t5.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t5.setForeground(Color.WHITE);
		    	 t5.setBackground(new Color(16,108,115)); 
		    	 pa.add(t5);
		    	
		    	 l7 =new JLabel("AADHAR");
		    	 l7.setBounds(60,320,150,27);
		    	 l7.setFont(new Font("serif",Font.BOLD,15));
		    	 l7.setBackground(new Color(16,108,115)); 
		    	 l7.setForeground(Color.WHITE);
		    	 pa.add(l7);
		    	 
		    	 t6 =new JTextField();
		    	 t6.setBounds(200,320,150,27);
		    	 t6.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t6.setForeground(Color.WHITE);
		    	 t6.setBackground(new Color(16,108,115)); 
		    	 pa.add(t6);
		    	 
		    	 l8 =new JLabel("EMAIL");
		    	 l8.setBounds(60,370,150,27);
		    	 l8.setFont(new Font("serif",Font.BOLD,15));
		    	 l8.setBackground(new Color(16,108,115)); 
		    	 l8.setForeground(Color.WHITE);
		    	 pa.add(l8);
		    	 
		    	 t7 =new JTextField();
		    	 t7.setBounds(200,370,150,27);
		    	 t7.setFont(new Font("Tahoma",Font.BOLD,15));
		    	 t7.setForeground(Color.WHITE);
		    	 t7.setBackground(new Color(16,108,115)); 
		    	 pa.add(t7);
		    	 
		    	 
		    	 b1= new JButton("Add");
		    	 b1.setBounds(80,420,100,30);
		    	 b1.setBackground(Color.BLACK);
		    	 b1.setForeground(Color.WHITE);
		    	 b1.addActionListener(this);
		    	 pa.add(b1);
		    	 
		    	 b2= new JButton("Back");
		    	 b2.setBounds(200,420,100,30);
		    	 b2.setBackground(Color.BLACK);
		    	 b2.setForeground(Color.WHITE);
		    	 b2.addActionListener(this);
		    	 pa.add(b2);
		    	 
		    	 ImageIcon img= new ImageIcon("addemp.png");
		    	 Image i =img.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
		    	 ImageIcon img1= new ImageIcon(i);
		    	 
		    	 l6=new JLabel(img1);
		    	 l6.setBounds(500,100,300,300);
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
						String gender =(String)t8.getSelectedItem();
						String job=(String)t4.getSelectedItem();
						String salary=(String)t3.getText();
						String phone=(String)t5.getText();
						String aadhar=(String)t6.getText();
						String egmail=(String)t7.getText();
				String q= "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"', '"+phone+"', '"+aadhar+"', '"+egmail+"')";
						c.s.executeUpdate(q);
						
		        	   JOptionPane.showMessageDialog(null, "Employee Sucessfully Added");
			            setVisible(false);
		        	} catch (Exception e2) {
						System.out.println(""+e2);
					}
		        }
		       if(e.getSource()==b2)
		        {
		            setVisible(false);
		        } 
		    }
		    
		    public static void main(String args [])
		    {
		        new Add_Employee();
		    }
		}

