package Proj0512;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCompEx extends JFrame {
	JCompEx() {
		this.setTitle("JComponent ���� �޼ҵ� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pan1 = new JPanel(); // Container, FlowLayout �⺻ ��ġ ������
		JButton btn1 = new JButton("���ڻ�/������ ���� ��ư");
		JButton btn2 = new JButton("��Ȱ��(Disable) ��ư");
		JButton btn3 = new JButton("x, y��ǥ ��ư");
		
		pan1.add(btn1); // �ǳڿ� ���̱�
		pan1.add(btn2);
		pan1.add(btn3);
		
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA);
		btn2.setEnabled(false);
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println( btn3.getX() + ", " + btn3.getY() );
			}
		});
		
		this.add(pan1);
		this.setSize(260, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JCompEx();

	}

}
