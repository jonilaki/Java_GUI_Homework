package com.returncalc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReturnAmountCalc implements ActionListener{
	JFrame jFrame;
	JLabel mnJLabel=new JLabel("Return Amount Calculator");
	JLabel amtJLabel=new JLabel("Enter Principal Amount:");
	JLabel rateJLabel=new JLabel("Enter  interest rate per time period:");
	JLabel peridJLabel=new JLabel("Enter number of Period:");
	JLabel retnJLabel=new JLabel("Return Amount:");
	JTextField amtTextField=new JTextField("");
	JTextField rateTextField=new JTextField("");
	JTextField peridTextField=new JTextField("");
	JTextField retnTextField=new JTextField("");
	JButton btcalc=new JButton("Calculate");
	JButton btrest=new JButton("Reset");
	JButton btext=new JButton("Exit");
	
	public ReturnAmountCalc()
	{
		createWindow();
		setLocationAndSize();
		addComponentToFrime();
		addActionEvent();
		
	}

	private void createWindow() {
		jFrame=new JFrame();
		jFrame.setTitle("Return Amount Calculator");
		jFrame.setBounds(150, 40, 500, 400);
		jFrame.setVisible(true);
		jFrame.getContentPane().setBackground(Color.cyan);
		jFrame.getContentPane().setLayout(null);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		
	}

	private void setLocationAndSize() {
		mnJLabel.setBounds(150, 10, 400, 30);
		amtJLabel.setBounds(10, 80, 300, 30);
		amtTextField.setBounds(250, 80, 100,30);
		peridJLabel.setBounds(10, 120, 300, 30);
		peridTextField.setBounds(250, 120, 100,30);
		rateJLabel.setBounds(10, 160, 300, 30);
		rateTextField.setBounds(250, 160, 100,30);
		retnJLabel.setBounds(10, 200, 300, 30);
		retnTextField.setBounds(250, 200, 100, 30);
		btcalc.setBounds(80, 250, 100, 30);
		btrest.setBounds(200, 250, 100, 30);
		btext.setBounds(350, 250, 100, 30);
		
	}

	private void addComponentToFrime() {
		jFrame.add(mnJLabel);
		jFrame.add(amtJLabel);
		jFrame.add(amtTextField);
		jFrame.add(btcalc);
		jFrame.add(btext);
		jFrame.add(btrest);
		jFrame.add(peridJLabel);
		jFrame.add(peridTextField);
		jFrame.add(rateJLabel);
		jFrame.add(rateTextField);
		jFrame.add(retnJLabel);
		jFrame.add(retnTextField);
		
	}

	private void addActionEvent() {
		btcalc.addActionListener(this);
		btrest.addActionListener(this);
		btext.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btcalc)
		{
			int amt=Integer.parseInt(String.valueOf(amtTextField.getText()));
			int pd=Integer.parseInt(String.valueOf(peridTextField.getText()));
			int rt=Integer.parseInt(String.valueOf(rateTextField.getText()));
			float rev=amt*pd*rt;
			retnTextField.setText(String.valueOf(rev));
			
		}
		if(e.getSource()==btrest)
		{
			amtTextField.setText("");
			rateTextField.setText("");
			peridTextField.setText("");
			retnTextField.setText("");
			
		}
		if(e.getSource()==btext)
		{
			System.exit(0);
		}
		
	}
	public static void main(String[]args)
	{
		ReturnAmountCalc rtCalc=new ReturnAmountCalc();
	}

}
