import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableDemo extends JFrame 
{
JTable jt;
DefaultTableModel model;
	public TableDemo() {
	setTitle("hello table");
	setSize(300,300);
	setLayout(new BorderLayout());
	Vector v = new Vector();
	v.addElement("Rollno");
	v.addElement("Namr");
	v.addElement("Marks");
	model = new DefaultTableModel(new Vector(),v);
	jt = new JTable(model);
	jt.setPreferredScrollableViewportSize(new Dimension(200,200));
	JScrollPane jsp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JPanel jp = new JPanel();
	jp.setBorder(BorderFactory.createTitledBorder("hello"));
	jp.add(jsp);
	
	Vector v1 = new Vector();
	v1.addElement(101);
	v1.addElement("Apna Raju");
	v1.addElement(55);
	model.addRow(v1);
	add(jp,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		TableDemo td = new TableDemo();
		td.setVisible(true);
	}

}
