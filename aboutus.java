import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aboutus extends JFrame implements ActionListener{
	JPanel panel;
	JLabel text;
	JButton backBtn;
	ImageIcon icon;
	homepage hp;
	public aboutus(homepage hp){
		super("About Us");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.hp=hp;
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		icon = new ImageIcon("back-icon.png");
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
		if(backBtn.getText().equals(command)){
			hp.setVisible(true);
			this.setVisible(false);
		}else{}
	}
}	