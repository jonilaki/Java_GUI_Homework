package com.rectcalarea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class UserInterface implements ActionListener {
	JFrame jf;
	JLabel jlm=new JLabel("Calculate the area of Rectangle");
	JLabel jlblw=new JLabel("Enter Width");
	JLabel jlblh=new JLabel("Enter Height");
	JLabel jlbla=new JLabel("Area");
	JTextField jtxw=new JTextField("");
	JTextField jtxh=new JTextField("");
	JTextField jtxa=new JTextField("");
	JButton jbsave=new JButton("Calculate");
	JButton jbrst=new JButton("Reset");
	JTextField jtres=new JTextField("");
		
	public UserInterface()
	{
		createWindow();
		setLocationAndSize();
		addComponentToFrame();
		addActionToEvent();
		
	}
	
	

	private void addActionToEvent() {
		jbsave.addActionListener(this);
		jbrst.addActionListener(this);
		
	}

	private void setLocationAndSize() {
		jlblw.setBounds(20, 100, 200, 30);
		jlblh.setBounds(20, 150, 200, 30);
		jlbla.setBounds(20, 200, 200, 30);
		jtxw.setBounds(120, 100, 200, 30);
		jtxh.setBounds(120, 150, 200, 30);
		jtxa.setBounds(120, 200, 200, 30);
		jbsave.setBounds(80, 250, 100, 30);
		jbrst.setBounds(220, 250, 100, 30);
		jlm.setBounds(80, 30, 400, 30);
		
		
	}
	

	private void addComponentToFrame() {
		jf.add(jtxw);
		jf.add(jtxh);
		jf.add(jlblw);
		jf.add(jlblh);
		jf.add(jbsave);
		jf.add(jbrst);
		jf.add(jtres);
		jf.add(jlbla);
		jf.add(jtxa);
		jf.add(jlm);
		
	}

	private void createWindow() {
		
		jf=new JFrame();
		jf.setTitle("Area of Rectangle Calculator");
		jf.setBounds(300, 100, 400, 400);
		jf.getContentPane().setBackground(Color.cyan);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbsave) {
		int w,h,area;
		w=Integer.parseInt(jtxw.getText());
		h=Integer.parseInt(jtxh.getText());
		area=w*h;
		jtxa.setText(String.valueOf(area));
		}
		if(e.getSource()==jbrst) {
			jtxw.setText("");
			jtxh.setText("");
			jtxa.setText("");
		}
		
	
		
	}
	public static void main(String[]args) {
		UserInterface usrin=new UserInterface();
		
	}
	

}
