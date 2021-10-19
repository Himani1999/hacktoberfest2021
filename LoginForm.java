package hacktober;


	// Custom Layout
	import java.awt.*;
	import java.awt.event.*;
	public class LoginForm extends Frame implements ActionListener  //Step-1 implements ActionListener
	{
	   Button b1 = new Button("Sign In");
	   Button b2 = new Button("Exit");
	   TextField t1 = new TextField();
	   TextField t2 = new TextField();
	   Label a1 = new Label("User Id");
	   Label a2 = new Label("Password");

	   LoginForm()
	   {
	     setBackground(new Color(240,220,186));
	     setLayout(null); //remove the default layout also - for set the custom layout 
	     setFont(new Font("verdana",0,15));
	     a1.setBounds(100,100,90,24);
	     a2.setBounds(100,150,90,24);
	     t1.setBounds(190,100,170,24);
	     t2.setBounds(190,150,130,24);
	     b1.setBounds(150,200,80,27);
	     b2.setBounds(240,200,80,27);
	     t2.setEchoChar('$'); // echo char = display char - for password field. 
	     add(a1);
	     add(a2);
	     add(t1);
	     add(t2);
	     add(b1);
	     add(b2);
		 
		 
		 //Step -2
	     b1.addActionListener(this);
	     b2.addActionListener(this);
		 
		 
	     setResizable(false);
	     setBounds(150,150,500,300);
		 
		 
		 
	     setVisible(true);
	     addWindowListener(new Win()); 
	   }
	   class Win extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent e)
	      {
	         dispose();
	      }
	   }
	   
	   
	   
	   
	   
	   //Step-3
	   public void actionPerformed(ActionEvent e)
	   {
	      if(e.getSource()==b1) 
	      {
	         String ps = t2.getText(); 
	         if(ps.equals("ipem@"))
	         {
	            new LoginF();
	            dispose();
	         }
	         else
	         {
	            javax.swing.JOptionPane.showMessageDialog(this,"Sorr this is Invalid Login Id & Password, re-enter Plz....");
	            t1.setText("");
	            t2.setText("");
	         }
	      }
	      else
	         dispose();
	    }
		
	   public static void main(String aa[])
	   {
	      new LoginForm();
	   }
	}

