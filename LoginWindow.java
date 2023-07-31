import javax.swing.*;
import java.awt.event.*;
public class login {
	public static void main(String[] args) {
		JFrame f = new JFrame("Login Example");
		final JLabel label= new JLabel();
		label.setBounds(20,150,200,150);
		JLabel l1= new JLabel("Username: ");
		l1.setBounds(20,20,80,30);
		JLabel l2= new JLabel("Password: ");
		l2.setBounds(20,75,80,30);
		JTextField text= new JTextField();
		text.setBounds(100,20,100,30);
		JPasswordField pwd= new JPasswordField();
		pwd.setBounds(100,75,100,30);
		JButton b = new JButton("Login");
		b.setBounds(100,120,80,30);
		f.add(label);
		f.add(l1);
		f.add(l2);
		f.add(text);
		f.add(pwd);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent ae)
			{
			
				String data="" +text.getText();
				data += ""+new String(pwd.getPassword());
				label.setText(data);
			}
		});

}
}
