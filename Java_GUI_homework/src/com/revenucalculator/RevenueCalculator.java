package com.revenucalculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RevenueCalculator implements ActionListener{
	JFrame jF;
	JLabel jbl1=new JLabel("Revenu Calculator");
	JLabel jblqty=new JLabel("Enter quantity Sold");
	JLabel jblprice=new JLabel("Enter the Unit Price");
	JLabel jblrevenue=new JLabel("Revenu");
	JTextField jtxtqty=new JTextField("");
	JTextField jtxtprice=new JTextField("");
	JTextField jtxtrevenu=new JTextField("");
	JButton jbtncalc=new JButton("Calculate");
	JButton jbtnreset=new JButton("Reset");
	JButton jbtnexit=new JButton("Exit");
		
	
	public RevenueCalculator()
	{
		createWindow();
		setLocationAndSize();
		addComponentToFrame();
		addActionEvent();
	}

	private void addActionEvent() {
		jbtncalc.addActionListener(this);
		jbtnreset.addActionListener(this);
		jbtnexit.addActionListener(this);
		
	}

	private void addComponentToFrame() {
		jF.add(jbl1);
		jF.add(jblprice);
		jF.add(jblqty);
		jF.add(jblrevenue);
		jF.add(jbtncalc);
		jF.add(jbtnexit);
		jF.add(jbtnreset);
		jF.add(jtxtprice);
		jF.add(jtxtqty);
		jF.add(jtxtrevenu);
		
		
	}

	private void setLocationAndSize() {
		jbl1.setBounds(100, 20, 300, 100);
		jblqty.setBounds(40, 100, 200, 30);
		jblprice.setBounds(40, 150, 200, 30);
		jblrevenue.setBounds(40, 200, 200, 30);
		jtxtqty.setBounds(180, 100, 150, 30);
		jtxtprice.setBounds(180, 150, 150, 30);
		jtxtrevenu.setBounds(180, 200, 150, 30);
		jbtncalc.setBounds(20, 250, 100, 50);
		jbtnreset.setBounds(140, 250, 100, 50);
		jbtnexit.setBounds(250, 250, 100, 50);
	}

	private void createWindow() {
		jF=new JFrame();
		jF.setTitle("Revenu Calculator");
		jF.setVisible(true);
		jF.setBounds(200, 100, 400, 400);
		jF.getContentPane().setBackground(Color.CYAN);
		jF.getContentPane().setLayout(null);
		jF.getContentPane().setForeground(Color.BLUE);
		jF.setResizable(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbtncalc) {
		int txt1=Integer.parseInt(String.valueOf(jtxtqty.getText()));
		int txt2=Integer.parseInt(String.valueOf(jtxtprice.getText()));
		int rev=txt1*txt2;
		jtxtrevenu.setText(String.valueOf(rev));
		}
		if(e.getSource()==jbtnreset) {
			jtxtqty.setText("");
			jtxtprice.setText("");
			jtxtrevenu.setText("");
		}
		if(e.getSource()==jbtnexit)
		{
			System.exit(0);
		}
	}
	public static void main(String[]args) {
		RevenueCalculator rCalculator=new RevenueCalculator();
		
	}

}
