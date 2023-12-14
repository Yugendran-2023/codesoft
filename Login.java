package project1;
import javax.swing.*;
class Login extends JFrame
{
		JLabel l1,l2,l3;
		JTextField t1;
		JPasswordField t2;
		JButton b1;
		Login()
		{
		l1= new JLabel("LOGIN PAGE");
		l2= new JLabel("USER NAME");
		l1.setBounds(70,40,200,40);
		l2.setBounds(70,100,100,20);
		add(l1);
		add(l2);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		}
		public static void main(String[] args)
		{
			Login l=new Login();
		}
		
}