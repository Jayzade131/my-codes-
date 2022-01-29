package projectSwing;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;


public class Book {

	public static void main(String[] args)
	{
		JFrame f=new JFrame("Student Resister Form");
		
		f.setSize(800,2000);
		JLabel l=new JLabel("Resister a new Student");
		l.setBounds(110,40,250,35);
		f.add(l);
		JTextField t1=new JTextField();
		t1.setBounds(200,90,250,35);
		f.add(t1);
		JLabel l1=new JLabel("Name");
		l1.setBounds(110,90,250,35);
		f.add(l1);
		JTextField t2=new JTextField();
		t2.setBounds(200,155,250,35);
 		f.add(t2);
		JLabel l2=new JLabel("DOB");
		l2.setBounds(110,155,250,35);
		f.add(l2);
		JLabel l3=new JLabel("Gender");
		l3.setBounds(110,205,250,35);
		f.add(l3);
		JRadioButton r1 =new JRadioButton();
		r1.setBounds(200,205,20,35);
		f.add(r1);
		JLabel l4=new JLabel("Male");
		l4.setBounds(225,205,250,35);
		f.add(l4);
		JRadioButton r2=new JRadioButton();
		r2.setBounds(315,205,20,35);
		f.add(r2);
		JLabel l5=new JLabel("Female");
		l5.setBounds(340,205,250,35);
		f.add(l5);
		JLabel l6=new JLabel("Mail Id");
		l6.setBounds(110,245,250,35);
		f.add(l6);
		JTextField t3=new JTextField();
		t3.setBounds(200,245,250,35);
		f.add(t3);
		JLabel l7=new JLabel("Mobile No");
		l7.setBounds(110,310,250,35);
		f.add(l7);
		JTextField t4=new JTextField();
		t4.setBounds(200,310,250,35);
		f.add(t4);
		JLabel l8=new JLabel("Password");
		l8.setBounds(110,370,250,35);
		f.add(l8);
		JPasswordField p1=new JPasswordField();
		p1.setBounds(200,370,250,35);
		f.add(p1);
		
		JLabel l9=new JLabel("Re Password");
		l9.setBounds(110,430,250,35);
		f.add(l9);
		JPasswordField p2=new JPasswordField();
		p2.setBounds(200,430,250,35);
		f.add(p2);
		JLabel l10=new JLabel("Course");
		l10.setBounds(110,500,250,35);
		f.add(l10);   
		String cou[]={"B.Tech","BE","M.Tech"};        
		JComboBox c1=new JComboBox(cou);    
		c1.setBounds(200, 500,250,35);    
		    f.add(c1);
		
		    JLabel l11=new JLabel("Branch");
			l11.setBounds(110,570,250,35);
			f.add(l11);   
			String bra[]={"CSE","IT","ME","ETC","CE"};        
			JComboBox c2=new JComboBox(bra);    
			c2.setBounds(200, 570,250,35);    
			    f.add(c2);
			
			    JLabel l12=new JLabel("Semester");
				l12.setBounds(110,630,250,35);
				f.add(l12);   
				String sem[]={"1","2","3","4","5","6","7","8"};        
				JComboBox c3=new JComboBox(sem);    
				c3.setBounds(200,630,250,35);    
				    f.add(c3);
				    JButton b=new JButton("Submit");  
				    b.setBounds(400,700,95,30);  
				  f.add(b);
				   
		 f.setLayout(null);
			f.setVisible(true);
		
	}

}
