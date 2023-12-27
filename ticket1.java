import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ticket1 extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton purchaseBtn, backBtn;
	private JLabel text,imgLabel;
	ImageIcon img,icon;
	Color myColor1;
	Font myFont,myFont2;
	//login lg;
	//user u;
	ticket t;
	ticket1 t1;
	//homepage hp;
	public ticket1(ticket t){
		super("Ticket Summary");
		this.setSize(500,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.t1=t1;
		this.t=t;
		myColor1 = new Color(255,224,2);
		myFont = new Font("Serif", Font.PLAIN, 20);
		myFont2 = new Font("Century", Font.PLAIN, 17);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		img = new ImageIcon("images/Animal_ticket.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(20,70,130,150);
		panel.add(imgLabel);
		
		purchaseBtn = new JButton("Purchase Ticket");
		purchaseBtn.setBounds(170,350,150,25);
		purchaseBtn.setBackground(myColor1);
		purchaseBtn.setForeground(Color.BLACK);
		purchaseBtn.setOpaque(true);
		purchaseBtn.addActionListener(this);
		panel.add(purchaseBtn);
		
		icon = new ImageIcon("images/back-icon.png");
		backBtn = new JButton(icon);
		backBtn.setBounds(10,10,20,20);
		backBtn.setBackground(Color.WHITE);
		backBtn.setOpaque(true);
		backBtn.addActionListener(this);
		backBtn.setBorder(null);
		panel.add(backBtn);
		
		text = new JLabel("2D");
		text.setBounds(160,90,40,25);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Animal");
		text.setBounds(160,115,80,25);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Duration- 202 Min");
		text.setBounds(160,135,160,25);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Ticket Summary");
		text.setBounds(10,30,150,30);
		text.setFont(myFont);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Location: ");
		text.setBounds(20,210,150,30);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Bashundhara ");
		text.setBounds(190,210,150,30);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Show Date: ");
		text.setBounds(20,245,150,30);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("27 Dec 2023");
		text.setBounds(190,245,150,30);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Hall: ");
		text.setBounds(20,280,150,30);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel(" 1 ");
		text.setBounds(190,280,40,30);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
	
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(purchaseBtn.getText().equals(command)){
			payment p = new payment(this);
			p.setVisible(true);
			this.setVisible(false);
		}else if(backBtn.getText().equals(command)){
			t.setVisible(true);
			this.setVisible(false);
		}else{}
	}
}