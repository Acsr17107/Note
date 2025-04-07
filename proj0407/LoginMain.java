package proj0407;

import javax.swing.*;
import java.awt.*;

public class LoginMain extends JFrame {
	public LoginMain() {
		setTitle("LoginMain");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);
		
		this.setLayout(grid);
		this.add(new JLabel("사용자ID"));
		this.add(new JTextField(""));
		this.add(new JLabel("비밀번호"));
		this.add(new JPasswordField(""));
		
		this.add(new JButton("로그인"));
		this.add(new JButton("취소"));
		
		setSize(300, 200);
		setVisible(true);	
	}
	

	public static void main(String[] args) {
		new LoginMain();
	}
}
