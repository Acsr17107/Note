import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventEx1 extends JFrame {

	EventEx1() {
		this.setTitle("��ư �̺�Ʈ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btnOk = new JButton("Ȯ��");
		JButton btnCancel = new JButton("���");
		
		this.setLayout(new FlowLayout());
		this.add(btnOk);
		this.add(btnCancel);
		
		btnOk.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ȯ�� ��ư Ŭ����~~");
				System.out.println(e);
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��� ��ư Ŭ����~~");
				System.out.println(e);	
			}
		});

		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx1();
	}

}
