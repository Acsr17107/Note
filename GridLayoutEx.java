import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GridLayoutEx extends JFrame {
	// ������
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5, 2);
		this.setLayout(grid);
		
		JTextField name = new JTextField(" ");
		JTextField stuId = new JTextField(" ");
		JTextField major = new JTextField(" ");
		JTextField gwa = new JTextField(" ");
		
		JButton btnhak = new JButton("Ȯ��");
		JButton btnCancel = new JButton("���");
		
		this.add(new JLabel("�̸�"));
		this.add(name);
		this.add(new JLabel("�й�"));
		this.add(stuId);
		this.add(new JLabel("�а�"));
		this.add(major);
		this.add(new JLabel("����"));
        this.add(gwa);
        this.add(btnhak);
        this.add(btnCancel);
        
        btnhak.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strName = name.getText();
				String strStuId = stuId.getText();
				String strMajor = major.getText();
				String strGwa = gwa.getText();
					System.out.println("�̸� : " + strName + ", �й� : " + strStuId + ", �а� : " + strMajor + ", ���� : " + strGwa + ", Ȯ���� �Ǿ����ϴ�!!!");
			}
		});
        
        btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText(""); stuId.setText("");
				major.setText(""); gwa.setText("");
			}
		});
		
		this.setSize(300, 200);
        this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
