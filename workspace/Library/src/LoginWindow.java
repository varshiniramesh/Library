import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class LoginWindow implements ActionListener{
    static int no_trials=1;
	JFrame jf=new JFrame("Login");
		
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\varshini\\workspace\\Library\\images\\login_window_bg.png"));
	JLabel jl=new JLabel("ENTER ADMIN ID AND PASSWORD");
	JLabel jl1=new JLabel("ADMIN ID:");
	JLabel jl2=new JLabel("PASSWORD: ");
	JTextField id=new JTextField(20);
	JPasswordField password=new JPasswordField(20);
	JButton jb=new JButton("login");
	JButton jb1=new JButton("logout");
	
	
	public void verify_password(String s,String s1)throws PasswordMatch
	{  
		
		if(!s.equals("library"))
		{
			throw new PasswordMatch(no_trials++);
			
		}
		else if(s.equals("library")&&(s1.equals("admin")))
		{
			System.out.println("window 1");
			Window1 w1=new Window1();
			w1.jf1.setVisible(true);
			 
		}
		
	}
	LoginWindow()
	{
		jl.setForeground(new Color(255,255,255));
		jl1.setForeground(new Color(255,255,255));
		jl2.setForeground(new Color(255,255,255));
		id.setForeground(new Color(255,255,255));
		password.setForeground(new Color(255,255,255));
		id.setBackground(new Color(30,70,40));
		password.setBackground(new Color(30,70,40));
		id.setFont(new Font("Verdana", Font.BOLD, 12));
		jl.setFont(new Font("Verdana", Font.BOLD, 20));
		jl1.setFont(new Font("Verdana", Font.BOLD, 20));
		jl2.setFont(new Font("Verdana", Font.BOLD, 20));
		jf.setSize(400,400);
		jb.setBackground(new Color(92,185,114));
		jb1.setBackground(new Color(92,185,114));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setLayout(new BorderLayout());
		jf.setContentPane(background);
	    background.setLayout(new FlowLayout());
	    background.setSize(400,400);
	
	    
	    background.add(jl);
	 
	    background.add(jl1);
	    background.add(id);
	    background.add(jl2);
	    background.add(password);
	    background.add(jb);
	    background.add(jb1);
	    jb.addActionListener(this);
	    jb1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==jb)
		{
			String id_=id.getText();
			try
			{
			
			if(id_.equals(null)||(!id_.equals("Admin")))
				throw new AdminId();
								
			}
			catch(AdminId e)
			{
				id.setBackground(new Color(249,139,29));
			}
			String password_=password.getText();
			try {
				verify_password(password_,id_);
			} 
			
			catch (PasswordMatch e) {
			
				if(e.a==1)
				{
				password.setText(null);
				password.setBackground(new Color(249,139,29));
				}
				else if(e.a==2)
				{
					password.setText(null);
					password.setBackground(new Color(9,115,76));
				}
			}
			}
		else if(arg0.getSource()==jb1)
		{
			jf.dispose();
		}
	}

}
