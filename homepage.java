import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class homepage extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel text, imgLabel1, imgLabel2, imgLabel3,imgLabel4,imgLabel5,imgLabel6,imgLabel7,imgLabel8;
	private JButton AboutUsBtn, backBtn, buyBtn1,buyBtn2,buyBtn3,buyBtn4,buyBtn5,buyBtn6,buyBtn7;
	Color myColor1, myColor2;
	Font font1,font2;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,icon;
	login lg;
	user u;
	homepage hp;
	
	public homepage(user u, login lg){
		super("Home Page");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.lg = lg;
		this.u = u;
		this.hp = hp;
		myColor1 = new Color(255,224,2);
		myColor2 = new Color(95, 26, 137);
		
		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(myColor2);
		panel.setBackground(Color.WHITE);
		
		/*AboutUsBtn = new JButton("About Us");
		AboutUsBtn.setBounds(285,10,100,25);
		AboutUsBtn.setBackground(Color.WHITE);
		AboutUsBtn.setForeground(Color.BLACK);
		AboutUsBtn.setOpaque(true);
		AboutUsBtn.addActionListener(this);
		panel.add(AboutUsBtn);*/
		
		icon = new ImageIcon("images/back-icon.png");
		backBtn = new JButton(icon);
		backBtn.setBounds(10,10,20,20);
		backBtn.setBackground(Color.WHITE);
		backBtn.setOpaque(true);
		backBtn.addActionListener(this);
		backBtn.setBorder(null);
		panel.add(backBtn);
		
		img1 = new ImageIcon("images/Animal.jpg");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(30,70,260,300);
		panel.add(imgLabel1);
		
		buyBtn1 = new JButton("Buy Ticket");
		buyBtn1.setBounds(100,380,100,25);
		buyBtn1.setBackground(myColor1);
		buyBtn1.setOpaque(true);
		buyBtn1.addActionListener(this);
		panel.add(buyBtn1);

		img2 = new ImageIcon("images/mujib.jpg");
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(310, 70, 207, 300);
		panel.add(imgLabel2);
		
		buyBtn2 = new JButton("Buy Ticket");
		buyBtn2.setBounds(370,380,100,25);
		buyBtn2.setBackground(myColor1);
		buyBtn2.setOpaque(true);
		buyBtn2.addActionListener(this);
		panel.add(buyBtn2);

		img3 = new ImageIcon("images/john-wick.jpg");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(525,70,260,300);
		panel.add(imgLabel3);
		
		buyBtn3 = new JButton("Buy Ticket");
		buyBtn3.setBounds(610,380,100,25);
		buyBtn3.setBackground(myColor1);
		buyBtn3.setOpaque(true);
		buyBtn3.addActionListener(this);
		panel.add(buyBtn3);
		
		img4 = new ImageIcon("images/vikings.jpg");
		imgLabel4 = new JLabel(img4);
		imgLabel4.setBounds(795,70,183,300);
		panel.add(imgLabel4);
		
		buyBtn4 = new JButton("Buy Ticket");
		buyBtn4.setBounds(845,380,100,25);
		buyBtn4.setBackground(myColor1);
		buyBtn4.setOpaque(true);
		buyBtn4.addActionListener(this);
		panel.add(buyBtn4);
		
		img5= new ImageIcon("images/ironman.jpg");
		imgLabel5 = new JLabel(img5);
		imgLabel5.setBounds(30,415,450,300);
		panel.add(imgLabel5);
		
		buyBtn5 = new JButton("Buy Ticket");
		buyBtn5.setBounds(200,730,100,25);
		buyBtn5.setBackground(myColor1);
		buyBtn5.setOpaque(true);
		buyBtn5.addActionListener(this);
		panel.add(buyBtn5);
		
		img6 = new ImageIcon("images/Fury.jpg");
		imgLabel6 = new JLabel(img6);
		imgLabel6.setBounds(510,415,203,300);
		panel.add(imgLabel6);
		
		buyBtn6 = new JButton("Buy Ticket");
		buyBtn6.setBounds(570,730,100,25);
		buyBtn6.setBackground(myColor1);
		buyBtn6.setOpaque(true);
		buyBtn6.addActionListener(this);
		panel.add(buyBtn6);
		
		img7 = new ImageIcon("images/dark-knight.jpg");
		imgLabel7 = new JLabel(img7);
		imgLabel7.setBounds(730,415,198,300);
		panel.add(imgLabel7);
		
		buyBtn7 = new JButton("Buy Ticket");
		buyBtn7.setBounds(780,730,100,25);
		buyBtn7.setBackground(myColor1);
		buyBtn7.setOpaque(true);
		buyBtn7.addActionListener(this);
		panel.add(buyBtn7);
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(buyBtn1.getText().equals(command)){
			ticket t = new ticket(this);
			t.setVisible(true);
			this.setVisible(false);
		}else if(AboutUsBtn.getText().equals(command)){
			aboutus au = new aboutus(this);
			au.setVisible(true);
			this.setVisible(false);
		}else if(backBtn.getText().equals(command)){
			lg.setVisible(true);
			this.setVisible(false);
		}else{}
	}
}