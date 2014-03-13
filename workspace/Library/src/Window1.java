import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
	
class Window1 implements ActionListener {

	JFrame jf1=new JFrame();
	JPanel mainPanel = new JPanel(new GridLayout(3,2));
	
	JButton b1 = createSquareJButton(new Color(165,42,42), 50,50,"Add Books");
    JButton b2 = createSquareJButton(new Color(255,215,0), 50,50,"Remove Books");
    JButton b3 = createSquareJButton(new Color(255,215,0), 50,50,"Issue");
    JButton b4= createSquareJButton(new Color(165,42,42), 50,50,"Return");
    JButton b5 = createSquareJButton(new Color(165,42,42), 50,50,"Browse Books");
       JButton b6 = createSquareJButton(new Color(255,215,0),50,50,"exit");
   
    public JButton createSquareJButton(Color color, int size1,int size2, String s)
    {
        JButton tempButton = new JButton();
        tempButton.setBackground(color);
        tempButton.setText(s);
        tempButton.setMinimumSize(new Dimension(size1, size2));
        tempButton.setMaximumSize(new Dimension(size1, size2));
        tempButton.setPreferredSize(new Dimension(size1, size2));
        return tempButton;
    }
	Window1()
	{
		
		 mainPanel.add(b1);
	        mainPanel.add(b2);
	        mainPanel.add(b3);
	        mainPanel.add(b4);
	        mainPanel.add(b5);
	        mainPanel.add(b6);
	        
	       
            jf1.add(mainPanel);		
            jf1.setSize(190,300);          
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         
         JFrame.setDefaultLookAndFeelDecorated(true);
           
         
           
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
            System.out.println("Add books");
			addBooks obj1=new addBooks();
			
		}
		if(e.getSource()==b2)
		{
			System.out.println("remove books");
		    removeBooks obj2=new removeBooks();	
		}
		if(e.getSource()==b3)
		{
			System.out.println("browse books");
			BrowseBooks obj3=new BrowseBooks();
		}
		if(e.getSource()==b4)
		{
			System.out.println("issue books");
			
		}
		if(e.getSource()==b5)
		{
			System.out.println("return books");
			
		}
		if(e.getSource()==b6)
		{
			System.out.println("exit :)");
		    jf1.dispose();
		}
		
	}

}
