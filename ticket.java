import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ticket extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton nextBtn, backBtn,a4,a5,a6,a7,a8,a9,a10,b11,b12,b13,b14,b15,b16,b17,c3,c4,c5,c6,c7,c8,c9;
	private JLabel text,imgLabel;
	ImageIcon img,icon;
	Color myColor1;
	Font myFont,myFont2;
	private JRadioButton r1,r2,r3,r4,r5;
	private ButtonGroup bg;
	login lg;
	user u;
	ticket t;
	homepage hp;
	public ticket(homepage hp){
		super("Ticket Booking");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.hp=hp;
		this.t=t;
		
		myColor1 = new Color(255,224,2);
		myFont = new Font("Serif", Font.PLAIN, 20);
		myFont2 = new Font("Century", Font.PLAIN, 17);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		text = new JLabel("Select Show Time");
		text.setBounds(10,50,170,30);
		text.setFont(myFont);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text = new JLabel("Hall 1:");
		text.setBounds(15,85,60,25);
		text.setBackground(Color.WHITE);
		panel.add(text);
		
		text = new JLabel("Hall 2:");
		text.setBounds(15,110,60,25);
		text.setBackground(Color.WHITE);
		panel.add(text);
		
		r1 = new JRadioButton("11:30AM");
		r1.setBounds(75,85,80,25);
		r1.setBackground(Color.WHITE);
		panel.add(r1);
		
		r2 = new JRadioButton("3:30PM");
		r2.setBounds(155,85,80,25);
		r2.setBackground(Color.WHITE);
		panel.add(r2);
		
		r3 = new JRadioButton("7:15PM");
		r3.setBounds(235,85,80,25);
		r3.setBackground(Color.WHITE);
		panel.add(r3);
		
		r4 = new JRadioButton("11:00AM");
		r4.setBounds(75,110,80,25);
		r4.setBackground(Color.WHITE);
		panel.add(r4);
		
		r5 = new JRadioButton("4:35PM");
		r5.setBounds(155,110,80,25);
		r5.setBackground(Color.WHITE);
		panel.add(r5);
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		
		/*img = new ImageIcon("Animal_ticket.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(500,85,130,150);
		panel.add(imgLabel);*/
		
		nextBtn = new JButton("Next");
		nextBtn.setBounds(200,350,70,25);
		nextBtn.setBackground(myColor1);
		nextBtn.setForeground(Color.BLACK);
		nextBtn.setOpaque(true);
		nextBtn.addActionListener(this);
		panel.add(nextBtn);
		
		icon = new ImageIcon("images/back-icon.png");
		backBtn = new JButton(icon);
		backBtn.setBounds(10,10,20,20);
		backBtn.setBackground(Color.WHITE);
		backBtn.setOpaque(true);
		backBtn.addActionListener(this);
		backBtn.setBorder(null);
		panel.add(backBtn);
	
	
		a4 = new JButton("A4");
		a4.setBounds(45,200,25,25);
		a4.setBackground(Color.WHITE);
		a4.addActionListener(this);
		a4.setBorder(null);
		panel.add(a4);
		
		
		a5 = new JButton("A5");
		a5.setBounds(100,200,25,25);
		a5.setBackground(Color.WHITE);
		a5.addActionListener(this);
		a5.setBorder(null);
		panel.add(a5);
		
		
		a6 = new JButton("A6");
		a6.setBounds(155,200,25,25);
		a6.setBackground(Color.WHITE);
		a6.addActionListener(this);
		a6.setBorder(null);
		panel.add(a6);
		
		
		a7 = new JButton("A7");
		a7.setBounds(210,200,25,25);
		a7.setBackground(Color.WHITE);
		a7.addActionListener(this);
		a7.setBorder(null);
		panel.add(a7);
		
		
		a8 = new JButton("A8");
		a8.setBounds(265,200,25,25);
		a8.setBackground(Color.WHITE);
		a8.addActionListener(this);
		a8.setBorder(null);
		panel.add(a8);
		
		
		a9 = new JButton("A9");
		a9.setBounds(320,200,25,25);
		a9.setBackground(Color.WHITE);
		a9.addActionListener(this);
		a9.setBorder(null);
		panel.add(a9);
		
		a10 = new JButton("A10");
		a10.setBounds(375,200,25,25);
		a10.setBackground(Color.WHITE);
		a10.addActionListener(this);
		a10.setBorder(null);
		panel.add(a10);
		
		
		
		b11 = new JButton("B11");
		b11.setBounds(45,235,25,25);
		b11.setBackground(Color.WHITE);
		b11.addActionListener(this);
		b11.setBorder(null);
		panel.add(b11);
		
		
		b12 = new JButton("B12");
		b12.setBounds(100,235,25,25);
		b12.setBackground(Color.WHITE);
		b12.addActionListener(this);
		b12.setBorder(null);
		panel.add(b12);
		
		
		b13 = new JButton("B13");
		b13.setBounds(155,235,25,25);
		b13.setBackground(Color.WHITE);
		b13.addActionListener(this);
		b13.setBorder(null);
		panel.add(b13);
		
		b14 = new JButton("B14");
		b14.setBounds(210,235,25,25);
		b14.setBackground(Color.WHITE);
		b14.addActionListener(this);
		b14.setBorder(null);
		panel.add(b14);
		
		b15 = new JButton("B15");
		b15.setBounds(265,235,25,25);
		b15.setBackground(Color.WHITE);
		b15.addActionListener(this);
		b15.setBorder(null);
		panel.add(b15);
		
		b16 = new JButton("B16");
		b16.setBounds(320,235,25,25);
		b16.setBackground(Color.WHITE);
		b16.addActionListener(this);
		b16.setBorder(null);
		panel.add(b16);
		
		b17 = new JButton("B17");
		b17.setBounds(375,235,25,25);
		b17.setBackground(Color.WHITE);
		b17.addActionListener(this);
		b17.setBorder(null);
		panel.add(b17);
		
		c3 = new JButton("C3");
		c3.setBounds(45,270,25,25);
		c3.setBackground(Color.WHITE);
		c3.addActionListener(this);
		c3.setBorder(null);
		panel.add(c3);
		
		c4 = new JButton("C4");
		c4.setBounds(100,270,25,25);
		c4.setBackground(Color.WHITE);
		c4.addActionListener(this);
		c4.setBorder(null);
		panel.add(c4);
		
		c5 = new JButton("C5");
		c5.setBounds(155,270,25,25);
		c5.setBackground(Color.WHITE);
		c5.addActionListener(this);
		c5.setBorder(null);
		panel.add(c5);
		
		c6 = new JButton("C6");
		c6.setBounds(210,270,25,25);
		c6.setBackground(Color.WHITE);
		c6.addActionListener(this);
		c6.setBorder(null);
		panel.add(c6);
		
		c7 = new JButton("C7");
		c7.setBounds(265,270,25,25);
		c7.setBackground(Color.WHITE);
		c7.addActionListener(this);
		c7.setBorder(null);
		panel.add(c7);
		
		c8 = new JButton("C8");
		c8.setBounds(320,270,25,25);
		c8.setBackground(Color.WHITE);
		c8.addActionListener(this);
		c8.setBorder(null);
		panel.add(c8);
		
		c9 = new JButton("C9");
		c9.setBounds(375,270,25,25);
		c9.setBackground(Color.WHITE);
		c9.addActionListener(this);
		c9.setBorder(null);
		panel.add(c9);
		
		this.add(panel);
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent me){
		if(me.getSource() == a5){
			a5.setBackground(myColor1);
			a5.setForeground(Color.BLACK);
		}else if(me.getSource() == a6){
			a6.setBackground(myColor1);
			a6.setForeground(Color.BLACK);
		}else if(me.getSource() == a7){
			a7.setBackground(myColor1);
			a7.setForeground(Color.BLACK);
		}else if(me.getSource() == a8){
			a8.setBackground(myColor1);
			a8.setForeground(Color.BLACK);
		}else if(me.getSource() == a9){
			a9.setBackground(myColor1);
			a9.setForeground(Color.BLACK);
		}else if(me.getSource() == a10){
			a10.setBackground(myColor1);
			a10.setForeground(Color.BLACK);
		}else if(me.getSource() == b11){
			b11.setBackground(myColor1);
			b11.setForeground(Color.BLACK);
		}else if(me.getSource() == b12){
			b12.setBackground(myColor1);
			b12.setForeground(Color.BLACK);
		}else if(me.getSource() == b13){
			b13.setBackground(myColor1);
			b13.setForeground(Color.BLACK);
		}else if(me.getSource() == b14){
			b14.setBackground(myColor1);
			b14.setForeground(Color.BLACK);
		}else if(me.getSource() == b15){
			b15.setBackground(myColor1);
			b15.setForeground(Color.BLACK);
		}else if(me.getSource() == b16){
			b16.setBackground(myColor1);
			b16.setForeground(Color.BLACK);
		}else if(me.getSource() == b17){
			b17.setBackground(myColor1);
			b17.setForeground(Color.BLACK);
		}else if(me.getSource() == c3){
			c3.setBackground(myColor1);
			c3.setForeground(Color.BLACK);
		}else if(me.getSource() == c4){
			c4.setBackground(myColor1);
			c4.setForeground(Color.BLACK);
		}else if(me.getSource() == c5){
			c5.setBackground(myColor1);
			c5.setForeground(Color.BLACK);
		}else if(me.getSource() == c6){
			c6.setBackground(myColor1);
			c6.setForeground(Color.BLACK);
		}else if(me.getSource() == c6){
			c6.setBackground(myColor1);
			c6.setForeground(Color.BLACK);
		}else if(me.getSource() == c7){
			c7.setBackground(myColor1);
			c7.setForeground(Color.BLACK);
		}else if(me.getSource() == c8){
			c8.setBackground(myColor1);
			c8.setForeground(Color.BLACK);
		}else if(me.getSource() == c9){
			c9.setBackground(myColor1);
			c9.setForeground(Color.BLACK);
		}else{}
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(nextBtn.getText().equals(command)){
			ticket1 t1 = new ticket1(this);
			t1.setVisible(true);
			this.setVisible(false);
		}else if(backBtn.getText().equals(command)){
			hp.setVisible(true);
			this.setVisible(false);
		}else{}
	}
}