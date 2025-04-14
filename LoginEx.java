import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginEx extends JFrame {
	LoginEx() {
		this.setTitle("EventEx3");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(3, 2, 0, 5);
		this.setLayout(grid);
		
		JTextField id = new JTextField("");
		JPasswordField pwd = new JPasswordField("");
		
		JButton btnLogin = new JButton("로그인");
		JButton btnCancel = new JButton("취소");
		
		this.add(new JLabel("사용자 ID"));
		this.add(id);
		this.add(new JLabel("비밀번호"));
		this.add(pwd);
		this.add(btnLogin);
        this.add(btnCancel);
        
        btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strId = id.getText();
				String strPwd = pwd.getText();
				if	(strId.equals("dongyang") && strPwd.equals("1234") )
					System.out.println("정상적으로 로그인");
				else
					System.out.println("id나 비밀번호 입려 오류, 다시 입력하십시오.");
			}
		});
        
        //	취소 버튼 누르면 clear (id, 비밀번호)
        
        btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				id.setText(""); pwd.setText("");
			}
		});
        
        this.setSize(300, 200);
        this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginEx();
	}
}
