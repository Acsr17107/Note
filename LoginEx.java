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
		
		JButton btnLogin = new JButton("�α���");
		JButton btnCancel = new JButton("���");
		
		this.add(new JLabel("����� ID"));
		this.add(id);
		this.add(new JLabel("��й�ȣ"));
		this.add(pwd);
		this.add(btnLogin);
        this.add(btnCancel);
        
        btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strId = id.getText();
				String strPwd = pwd.getText();
				if	(strId.equals("dongyang") && strPwd.equals("1234") )
					System.out.println("���������� �α���");
				else
					System.out.println("id�� ��й�ȣ �Է� ����, �ٽ� �Է��Ͻʽÿ�.");
			}
		});
        
        //	��� ��ư ������ clear (id, ��й�ȣ)
        
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
