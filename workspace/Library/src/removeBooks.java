import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
public class removeBooks extends database implements ActionListener {

	//ArrayList <Books> al1=new ArrayList<Books>();
	JFrame jf3=new JFrame("remove books");
	JPanel jp1=new JPanel();
	JPanel jp2=new JPanel();
	JPanel jp3=new JPanel();
	
	JLabel l1=new JLabel("ISBN:");
	JLabel l2=new JLabel("details");
	
	JTextField t1=new JTextField(10);
	JTextArea ta=new JTextArea();
    JButton b1=new JButton("exit");
	JButton b2=new JButton("Remove");
	JScrollPane scrollPane = new JScrollPane(ta); 
	
	removeBooks()
	{

		ta.setEditable(false);
		ta.setFont(new Font("Serif", Font.ITALIC, 16));
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		ta.setSize(200,200);
		jp1.add(l1);
		jp1.add(t1);

		jp2.add(l2);
		jp2.add(ta);
		
		jp3.add(b1);
		jp3.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		jf3.setLayout(new GridLayout(3,1));
	jf3.add(jp1);
	jf3.add(jp2);
	jf3.add(jp3);
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
			
			ta.setText("");
			System.out.println(al1.size());
		int f=0;
		String ISBN=t1.getText().toString();
		Iterator <Books> i=al1.iterator();
		while(i.hasNext())
		{
			ta.setBackground(new Color(112,145,19));
			ta.setForeground(new Color(255,255,255));
			Books obj=i.next();
			System.out.println(obj.ISBN+"\n");
			if(ISBN.equals(obj.ISBN))
			{f=1;
				String text="ISBN: "+obj.ISBN+"\ntitle: "+obj.title+"\nauthor: "+obj.author+"\nprice: "+obj.price;
				ta.setText("Successfully deleted !! \n "+text);
				
			}
		}
		if(f==0)
		{
			ta.setBackground(new Color(215,63,17));
			ta.setForeground(new Color(255,255,255));
			ta.append("not found!!");
		}
					
		
		}
	}

}
