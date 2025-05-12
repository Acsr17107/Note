package Proj0512;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JCheckBoxEx extends JFrame {
	private String[]	names = {"���", "��", "ü��"};
	private int[] 		prices = {100, 500, 20000};
	int sum = 0;
	
	JCheckBoxEx() {
		setTitle("üũ�ڽ��� ActionEvent ����");				// ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// �ݱ�
		this.setLayout(new FlowLayout());					// ���̾ƿ� ����
		this.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));	// ���̺� ����
		
		JLabel sumLabel = new JLabel("���� 0 �� �Դϴ�.");		// �ʱ� ���̺�
		JCheckBox cbApple = new JCheckBox("���");			// ��� üũ�ڽ�
		JCheckBox cbPear = new JCheckBox("��");				// �� üũ�ڽ�
		JCheckBox cbCherry = new JCheckBox("ü��");			// ü�� üũ�ڽ�
		// ���		
		cbApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[0];						// ��� ���� ����
				else
					sum -= prices[0];						// ��� ���� �M
				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
				
			}
		});
		
		// ��			
		cbPear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[1];						// �� ���� ����
				else
					sum -= prices[1];						// �� ���� �M
				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
			}
		});
		
		// ü��
		cbCherry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[2];						// ü�� ���� ����
				else
					sum -= prices[2];						// ü�� ���� �M
				sumLabel.setText("���� " + sum + "�� �Դϴ�.");
				
			}
		});
		
		this.add(cbApple);	// üũ�ڽ� �߰�
		this.add(cbPear);
		this.add(cbCherry);
		this.add(sumLabel);
		
		this.setSize(250, 200);	// ������ ����
		this.setVisible(true);	// ���̰� ��
	}

	public static void main(String[] args) {
		new JCheckBoxEx();	// ����
	}

}
