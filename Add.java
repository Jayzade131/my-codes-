package proadd;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Add {

	public static void main(String[] args) {
          JFrame f=new JFrame("ADDITION SOFTWARE");
          f.setSize(900,900);
          JTextField t1=new JTextField();
          t1.setBounds(300,300,100,40);
          f.add(t1);
  		t1.setBackground(Color.yellow);

          JTextField t2=new JTextField();
          t2.setBounds(600,300,100,40);
          f.add(t2);
  		t2.setBackground(Color.yellow);

          JLabel l1=new JLabel();
          l1.setBounds(450,600,100,40);
          f.add(l1);
           JButton b1=new JButton("CLICK");
           b1.setBounds(450,450,100,40);
           f.add(b1);
   		

      b1.addActionListener(new ActionListener() {
		
		 
		public void actionPerformed(ActionEvent e) {
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
		int	n=n1+n2;
			l1.setText("Addition = "+n);
			
		}
	});
     
          f.setLayout(null);
          f.setVisible(true);
          
          
		
	}

}
