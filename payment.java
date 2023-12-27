import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class payment extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel userLabel, passwordLabel,imgLabel, imgLabel1, imgLabel2, imgLabel3;
	private JTextField userTF,passwordTF;
	private JButton mobileBankingBtn,cardPaymentBtn,completePaymentBtn,backBtn;
	private JRadioButton r1,r2,r3;
	private ButtonGroup bg;
	ImageIcon img, img1,img2,img3,icon;
	Color myColor1,myColor2;
	Font myFont;
	ticket1 t1;
	payment p;
	//homepage hp;
	public payment(ticket1 t1){
		super("Payment");
		this.setSize(1100,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.t1 = t1;
		this.p = p;
		//this.hp = hp;
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		myColor1 = new Color(255,224,2);
		myColor2 = new Color(61, 130, 196);
		
		myFont = new Font("Century", Font.PLAIN,25);
		
		mobileBankingBtn = new JButton("Mobile Banking");
		mobileBankingBtn.setBounds(50,65,130,30);
		mobileBankingBtn.setBackground(myColor2);
		mobileBankingBtn.setForeground(Color.BLACK);
		//mobileBankingBtn.setFont(myFont);
		mobileBankingBtn.setOpaque(true);
		//mobileBankingBtn.addActionListener(this);
		panel.add(mobileBankingBtn);
		
		cardPaymentBtn = new JButton("Card Payment");
		cardPaymentBtn.setBounds(200,65,120,30);
		cardPaymentBtn.setBackground(Color.WHITE);
		cardPaymentBtn.setForeground(Color.BLACK);
		cardPaymentBtn.setOpaque(true);
		cardPaymentBtn.addActionListener(this);
		panel.add(cardPaymentBtn);
		
		img1 = new ImageIcon("images/card.png");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(470,50,630,410);
		panel.add(imgLabel1);
		
		img = new ImageIcon("images/bKash.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(20,105,113,100);
		panel.add(imgLabel);
		
		img = new ImageIcon("images/nagad.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(140,125,115,50);
		panel.add(imgLabel);
		
		img = new ImageIcon("images/upai.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(300,110,115,110);
		panel.add(imgLabel);
		
		r1 = new JRadioButton("bKash");
		r1.setBounds(50,230,80,25);
		r1.setBackground(Color.WHITE);
		panel.add(r1);
		
		r2 = new JRadioButton("Nagad");
		r2.setBounds(155,230,80,25);
		r2.setBackground(Color.WHITE);
		panel.add(r2);
		
		r3 = new JRadioButton("Upay");
		r3.setBounds(335,230,80,25);
		r3.setBackground(Color.WHITE);
		panel.add(r3);
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		img2 = new ImageIcon("images/profile1.png");
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(70,327,20,20);
		panel.add(imgLabel2);
		
		img3 = new ImageIcon("images/pass1.png");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(70,377,20,20);
		panel.add(imgLabel3);
		
		userLabel = new JLabel("Enter your Phone Number");
		userLabel.setBounds(95,300,180,25);
		userLabel.setBackground(Color.WHITE);
		userLabel.setForeground(Color.BLACK);
		userLabel.setOpaque(true);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(95,325,170,25);
		panel.add(userTF);
		
		passwordLabel = new JLabel("Enter your AC pin");
		passwordLabel.setBounds(95,350,160,25);
		passwordLabel.setBackground(Color.WHITE);
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setOpaque(true);
		panel.add(passwordLabel);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(95,375,170,25);
		panel.add(passwordTF);
		
		completePaymentBtn = new JButton("Complete the Payment");
		completePaymentBtn.setBounds(85,420,190,30);
		completePaymentBtn.setBackground(myColor2);
		completePaymentBtn.setForeground(Color.BLACK);
		completePaymentBtn.setOpaque(true);
		completePaymentBtn.addActionListener(this);
		panel.add(completePaymentBtn);
		
		icon = new ImageIcon("images/private back-icon.png");
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
	public void mouseClicked(MouseEvent me){
		if(me.getSource() == cardPaymentBtn){
			cardPaymentBtn.setBackground(myColor2);
			cardPaymentBtn.setForeground(Color.BLACK);
		}else{}
	}
	public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();

        if (cardPaymentBtn.getText().equals(command)) {
            cardPayment cpayment = new cardPayment(this);
            cpayment.setVisible(true);
            this.setVisible(false);
        } else if (completePaymentBtn.getText().equals(command)) {
            String name = userTF.getText();
            String pin = passwordTF.getText();

            if (name.isEmpty() || pin.isEmpty()) {
                JOptionPane.showMessageDialog(this, "TextBox cannt be empty!");
            } else {
                JOptionPane.showMessageDialog(this, "Payment Successful!");
                // Add return function here if needed
                this.setVisible(true);
            }
        } else if (backBtn.getText().equals(command)) {
            t1.setVisible(true);
			this.setVisible(false);
        }
    }
}	