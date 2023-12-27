import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cardPayment extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel userLabel, passwordLabel,expireLabel,yearLabel,cwLabel,imgLabel, imgLabel1, imgLabel2, imgLabel3,imgLabel4;
	private JTextField userTF,passwordTF,expireTF,yearTF,cwTF;
	private JButton mobileBankingBtn,cardPaymentBtn,completePaymentBtn,backBtn;
	ImageIcon img, img1,img2,img3,img4,icon;
	Color myColor1,myColor2;
	//cardPayment cp;
	payment p;
	homepage hp;
	public cardPayment(payment p){
		super("Payment");
		this.setSize(1100,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.p = p;
		this.hp = hp;
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		myColor2 = new Color(61, 130, 196);
		
		img1 = new ImageIcon("images/payment.png");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(470,50,605,410);
		panel.add(imgLabel1);
		
		mobileBankingBtn = new JButton("Mobile Banking");
		mobileBankingBtn.setBounds(50,50,130,30);
		mobileBankingBtn.setBackground(Color.WHITE);
		mobileBankingBtn.setForeground(Color.BLACK);
		mobileBankingBtn.setOpaque(true);
		mobileBankingBtn.addActionListener(this);
		panel.add(mobileBankingBtn);
		
		cardPaymentBtn = new JButton("Card payment");
		cardPaymentBtn.setBounds(200,50,120,30);
		cardPaymentBtn.setBackground(myColor2);
		cardPaymentBtn.setForeground(Color.BLACK);
		cardPaymentBtn.setOpaque(true);
		cardPaymentBtn.addActionListener(this);
		panel.add(cardPaymentBtn);
		
		img = new ImageIcon("images/cardPayment.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(30,80,350,260);
		panel.add(imgLabel);
		
		img2 = new ImageIcon("images/profile1.png");
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(50,378,20,20);
		panel.add(imgLabel2);
		
		img3 = new ImageIcon("images/pass1.png");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(50,428,20,20);
		panel.add(imgLabel3);
		
		userLabel = new JLabel("Enter Card Holder Name");
		userLabel.setBounds(75,350,180,25);
		userLabel.setBackground(Color.WHITE);
		userLabel.setForeground(Color.BLACK);
		userLabel.setOpaque(true);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(75,375,285,25);
		panel.add(userTF);
		
		passwordLabel = new JLabel("Enter your Card Number");
		passwordLabel.setBounds(75,400,180,25);
		passwordLabel.setBackground(Color.WHITE);
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setOpaque(true);
		panel.add(passwordLabel);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(75,425,285,25);
		panel.add(passwordTF);
		
		img4 = new ImageIcon("images/icons-calendar.png");
		imgLabel4 = new JLabel(img4);
		imgLabel4.setBounds(50,475,20,20);
		panel.add(imgLabel4);
		
		expireLabel = new JLabel("Expire Date");
		expireLabel.setBounds(75,450,70,25);
		expireLabel.setBackground(Color.WHITE);
		expireLabel.setForeground(Color.BLACK);
		expireLabel.setOpaque(true);
		panel.add(expireLabel);
		
		expireTF = new JTextField();
		expireTF.setBounds(75,475,70,25);
		panel.add(expireTF);
		
		img4 = new ImageIcon("images/icons-calendar.png");
		imgLabel4 = new JLabel(img4);
		imgLabel4.setBounds(160,475,20,20);
		panel.add(imgLabel4);
		
		yearLabel = new JLabel("Year");
		yearLabel.setBounds(185,450,70,25);
		yearLabel.setBackground(Color.WHITE);
		yearLabel.setForeground(Color.BLACK);
		yearLabel.setOpaque(true);
		panel.add(yearLabel);
		
		yearTF = new JTextField();
		yearTF.setBounds(185,475,70,25);
		panel.add(yearTF);
		
		img3 = new ImageIcon("images/pass1.png");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(265,475,20,20);
		panel.add(imgLabel3);
		
		cwLabel = new JLabel("CW");
		cwLabel.setBounds(290,450,40,25);
		cwLabel.setBackground(Color.WHITE);
		cwLabel.setForeground(Color.BLACK);
		cwLabel.setOpaque(true);
		panel.add(cwLabel);
		
		cwTF = new JPasswordField();
		cwTF.setBounds(290,475,70,25);
		panel.add(cwTF);
		
		completePaymentBtn = new JButton("Complete the Payment");
		completePaymentBtn.setBounds(120,515,190,30);
		completePaymentBtn.setBackground(myColor2);
		completePaymentBtn.setForeground(Color.BLACK);
		completePaymentBtn.setOpaque(true);
		completePaymentBtn.addActionListener(this);
		panel.add(completePaymentBtn);
		
		icon = new ImageIcon("images/back-icon.png");
		backBtn = new JButton(icon);
		backBtn.setBounds(10,10,20,20);
		backBtn.setBackground(Color.WHITE);
		backBtn.setOpaque(true);
		backBtn.addActionListener(this);
		backBtn.setBorder(null);
		panel.add(backBtn);
		
		this.add(panel);
		this.setVisible(true);
	}
		public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(completePaymentBtn.getText().equals(command)){
			String name ="", pin="",expireDate="",year ="", cw="";
			name = userTF.getText();
			pin = passwordTF.getText();
			expireDate = expireTF.getText();
			year = yearTF.getText();
			cw = cwTF.getText();
			
			if(name.isEmpty() || pin.isEmpty() || expireDate.isEmpty() || year.isEmpty() || cw.isEmpty()){
				JOptionPane.showMessageDialog(this, "TextBox cannt be empty!");
			} else {
				JOptionPane.showMessageDialog(this, "Payment Successful!");
				//hp.setVisible(true);
				//this.setVisible(false);
			}

		}else if(backBtn.getText().equals(command)){
			//payment p = new payment(this);
			p.setVisible(true);
			this.setVisible(false);
		}else if(mobileBankingBtn.getText().equals(command)){
			p.setVisible(true);
			this.setVisible(false);
		}else{}
	}
}