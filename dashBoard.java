import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashBoard extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	JLabel userLabel, passwordLabel, genderLabel, dobLabel, addressLabel;
	JButton logoutBtn, showBtn;
	Font myFont;
	ImageIcon icon;
	login lg;
	user u;
	String pass="",hiddenPass="";
	
	public dashBoard(user u, login lg){
		super("Users Info");
		this.setSize(500,400);
		//icon = new ImageIcon("student.jpg");
		//this.setIconImage(icon.getImage());  //setting icon of the frame header
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.lg = lg;
		this.u = u;
		
		myFont = new Font("Cambria", Font.PLAIN, 17);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("User name: "+u.getName()); 
		userLabel.setBounds(50,10,300,30);
		userLabel.setFont(myFont);
		panel.add(userLabel);
		
		pass = u.getPassword();
		int passLength = pass.length();
		for(int i=0;i<passLength;i++){
			hiddenPass+='*';
		}
		passwordLabel = new JLabel("Password: "+hiddenPass);
		passwordLabel.setBounds(50,50,200,30);
		passwordLabel.setFont(myFont);
		panel.add(passwordLabel);
		
		genderLabel = new JLabel("Gender: "+u.getGender());
		genderLabel.setBounds(50,90,300,30);
		genderLabel.setFont(myFont);
		panel.add(genderLabel);
		
		dobLabel = new JLabel("Date of Birth: "+u.getDOB());
		dobLabel.setBounds(50,130,300,30);
		dobLabel.setFont(myFont);
		panel.add(dobLabel);
		
		addressLabel = new JLabel("Address: "+u.getAddress());
		addressLabel.setBounds(50,170,300,30);
		addressLabel.setFont(myFont);
		panel.add(addressLabel);
		
		
		logoutBtn = new JButton("Log out");
		logoutBtn.setBounds(200,250,80,30);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		showBtn = new JButton("Show");
		showBtn.setBounds(250,50,70,30);
		showBtn.addMouseListener(this);
		showBtn.addActionListener(this);
		panel.add(showBtn);
		
		this.add(panel);
		this.setVisible(true);
		
	}
	
	public void mouseClicked(MouseEvent me){}  
	public void mouseEntered(MouseEvent me){}  
	public void mouseExited(MouseEvent me){}  
	public void mousePressed(MouseEvent me){
		if(me.getSource() == showBtn){
			passwordLabel.setText("Password: "+pass);
		}
	}
	public void mouseReleased(MouseEvent me){
		if(me.getSource() == showBtn){
			passwordLabel.setText("Password: "+hiddenPass);
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		String command = ae.getActionCommand();
		if(logoutBtn.getText().equals(command)){
			lg.setVisible(true);
			this.setVisible(false);
		}else{}
	}
}
