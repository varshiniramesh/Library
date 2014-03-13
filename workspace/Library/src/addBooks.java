import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class addBooks extends database implements ActionListener {

	//ArrayList <Books> al1=new ArrayList<Books>();
	JFrame jf3=new JFrame("add boooks");
	JPanel jp1=new JPanel();
	JPanel jp2=new JPanel();
	JPanel jp3=new JPanel();
	JPanel jp4=new JPanel();
	JPanel jp5=new JPanel();
    JPanel jp6=new JPanel();
	JLabel l1=new JLabel("ISBN:");
	JLabel l2=new JLabel("title:");
	JLabel l3=new JLabel("author:");
	JLabel l4=new JLabel("category");
	JLabel l5=new JLabel("price");
	JTextField t1=new JTextField(10);
	JTextField t2=new JTextField(10);
	JTextField t3=new JTextField(10);
	JTextField t4=new JTextField(10);
	JTextField t5=new JTextField(10);
    JButton b1=new JButton("exit");
	JButton b2=new JButton("submit");
	addBooks()
	{
		jp1.add(l1);
		jp1.add(t1);
		jp2.add(l2);
		jp2.add(t2);
		jp3.add(l3);
		jp3.add(t3);
		jp4.add(l4);
		jp4.add(t4);
		jp5.add(l5);
		jp5.add(t5);
		jp6.add(b2);
		jp6.add(b1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		jf3.setLayout(new GridLayout(5,1));
	jf3.add(jp1);
	jf3.add(jp2);
	jf3.add(jp3);
	jf3.add(jp4);
	jf3.add(jp5);
	jf3.add(jp6);
	jf3.setVisible(true);
	jf3.setSize(400,400);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			jf3.dispose();
		}
		if(e.getSource()==b2)
		{
			String ISBN=t1.getText().toString();
			String title=t2.getText().toString();
			String author=t3.getText().toString();
			int price=Integer.parseInt(t5.getText());
			String category=t4.getText().toString();
			System.out.println(ISBN+title+author+price);
			al1.add(new Books(ISBN,title,author,category,price));
					
		
		}
	}

}
