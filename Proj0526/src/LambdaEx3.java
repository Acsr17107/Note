import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LambdaEx3 extends JFrame {

	LambdaEx3() {
		this.setTitle("���ٽ� ���� ����");					// ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	// ����
		this.setLayout(new FlowLayout());			// ���̾ƿ� ����
		
		JLabel lb = new JLabel("���̽�ũ���� �����ϳ���?");	// ���̺� ����
		JButton btnOk = new JButton("Yes");		// ok ��ư ����
		JButton btnNo = new JButton("No");		// no ��ư ����
		
		/*
		 
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��, ���̽�ũ���� �����մϴ�.");
			}
		});
		
		*/
		
		btnOk.addActionListener( e -> System.out.println("��, ���̽�ũ���� �����մϴ�.") );
		btnNo.addActionListener( e -> System.out.println("�ƴϿ�, ���̽�ũ���� �Ⱦ��մϴ�.") );
		
		
		
		this.add(lb);		// ���̺� �߰�
		this.add(btnOk);	// ok ��ư �߰�
		this.add(btnNo);	// no ��ư �߰�
		
		this.setSize(400, 200);		// ������ ����
		this.setVisible(true);		// ���ü� ����
	}

	public static void main(String[] args) {
		new LambdaEx3(); 					// ������ ȣ��
	}
}
