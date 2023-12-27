import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements MouseListener, ActionListener{
	private JPanel panel;
	private JLabel userLabel, passwordLabel, rgstrLabel, text, imgLabel1, imgLabel2, imgLabel3;
	private JTextField userTF;
	private JPasswordField passwordTF;
	private JButton lgnBtn, exitBtn, rgstrBtn, adminBtn;
	Color myColor1, myColor2;
	Font myFont, myFont2;
	ImageIcon img1,img2,img3;
	private user u;
	private users us;
	
	public login(users us){
		super("Login Page");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.us= us;
		
		myColor1 = new Color(255,224,2);
		myColor2 = new Color(234,234,234);
		myFont = new Font("Century", Font.ITALIC,17);
		myFont2 = new Font("Century", Font.PLAIN,15);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		img1 = new ImageIcon("images/login.jpg");
		imgLabel1 = new JLabel(img1);
		imgLabel1.setBounds(0,0,800,500);
		panel.add(imgLabel1);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(500,150,90,25);
		userLabel.setBackground(Color.WHITE);
		userLabel.setForeground(Color.BLACK);
		userLabel.setOpaque(true);
		imgLabel1.add(userLabel);
		panel.add(userLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(500,200,60,25);
		passwordLabel.setBackground(Color.WHITE);
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setOpaque(true);
		imgLabel1.add(passwordLabel);
		panel.add(passwordLabel);
		
		userTF = new JTextField();
		userTF.setBounds(500,175,170,25);
		imgLabel1.add(userTF);
		panel.add(userTF);
		
		img2 = new ImageIcon("images/profile1.png");
		imgLabel2 = new JLabel(img2);
		imgLabel2.setBounds(475,175,20,20);
		imgLabel1.add(userLabel);
		imgLabel1.add(imgLabel2);
		panel.add(imgLabel2);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(500,225,170,25);
		imgLabel1.add(passwordTF);
		panel.add(passwordTF);
		
		img3 = new ImageIcon("images/pass1.png");
		imgLabel3 = new JLabel(img3);
		imgLabel3.setBounds(475,225,20,20);
		imgLabel1.add(passwordLabel);
		panel.add(imgLabel3);
		
		lgnBtn = new JButton("Login");
		lgnBtn.setBounds(500,253,170,25);
		lgnBtn.setBackground(myColor1);
		lgnBtn.setForeground(Color.BLACK);
		lgnBtn.setOpaque(true);
		lgnBtn.addMouseListener(this);
		lgnBtn.addActionListener(this);
		imgLabel1.add(lgnBtn);
		panel.add(lgnBtn);
		
		text = new JLabel("Don't have any account?");
		text.setBounds(465,290,140,25);
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		text.setOpaque(true);
		imgLabel1.add(text);
		panel.add(text);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(555,400,60,25);
		exitBtn.setBackground(Color.RED);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setOpaque(true);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		imgLabel1.add(exitBtn);
		panel.add(exitBtn);
		
		rgstrBtn = new JButton("Create one");
		rgstrBtn.setBounds(610,290,100,25);
		rgstrBtn.setBackground(Color.WHITE);
		rgstrBtn.setForeground(Color.BLACK);
		rgstrBtn.addActionListener(this);
		imgLabel1.add(rgstrBtn);
		panel.add(rgstrBtn);
		
		adminBtn = new JButton("Admin");
		adminBtn.setBounds(550,330,70,25);
		adminBtn.setBackground(Color.WHITE);
		//adminBtn.setForeground(Color.BLACK);
		adminBtn.addMouseListener(this);
		adminBtn.addActionListener(this);
		imgLabel1.add(adminBtn);
		panel.add(adminBtn);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent me){}  
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == adminBtn){
			adminBtn.setBackground(myColor1);
			adminBtn.setForeground(Color.BLACK);
		}/*else if(me.getSource() == exitBtn){
			exitBtn.setBackground(Color.GREEN);
			exitBtn.setForeground(Color.BLACK);
		}else{}*/
	} 
	public void mouseExited(MouseEvent me){
		if(me.getSource() == adminBtn){
			adminBtn.setBackground(Color.WHITE);
			adminBtn.setForeground(Color.BLACK);
		}/*else if(me.getSource() == exitBtn){
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}else{}*/
	}
	public void mousePressed(MouseEvent me){}  
	public void mouseReleased(MouseEvent me){} 

	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(lgnBtn.getText().equals(command)){
			String name = userTF.getText();
			String pass = passwordTF.getText();
			
			int index = us.userExists(name);
			if(index!=-1){
				u = us.getUser(index,pass);
				if(u!=null){
					JOptionPane.showMessageDialog(this, "Login successfull!");
					//dashBoard db = new dashBoard(u,this);
					//db.setVisible(true);
					homepage hp = new homepage(u,this);
					hp.setVisible(true);
					this.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(this, "Password incorrect!");
				}
			}else{
				JOptionPane.showMessageDialog(this, "User doesn't exist!");
			}		
		}else if(exitBtn.getText().equals(command)){
			System.exit(0);
		}else if(rgstrBtn.getText().equals(command)){
			Registration rg = new Registration(us,this);
			rg.setVisible(true);
			this.setVisible(false);
		}else if(adminBtn.getText().equals(command)){
			Admin al = new Admin(this);
            al.setVisible(true);
            this.setVisible(false);
		}else{}
	}	
}