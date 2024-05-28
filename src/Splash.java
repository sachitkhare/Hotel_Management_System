import javax.swing.*;
import javax.swing.JFrame;
public class Splash extends JFrame {

	public Splash() {
		JLabel l1 = new JLabel();
		ImageIcon imgIcon= new ImageIcon("splash.gif");
		l1.setIcon(imgIcon);
		l1.setBounds(100,100,300,300);
		add(l1);	
		
		setUndecorated(true);
		setLocation(300,80);//axis x and y
		setSize(858,680);//width and height
		setVisible(true);
		
		try {
			Thread.sleep(6000);
			new Login_page();
			setVisible(false);
		}
		catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new Splash();

	}

}
