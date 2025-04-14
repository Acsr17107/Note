import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GridLayoutEx extends JFrame {
	// 생성자
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5, 2);
		this.setLayout(grid);
		
		JTextField name = new JTextField(" ");
		JTextField stuId = new JTextField(" ");
		JTextField major = new JTextField(" ");
		JTextField gwa = new JTextField(" ");
		
		JButton btnhak = new JButton("확인");
		JButton btnCancel = new JButton("취소");
		
		this.add(new JLabel("이름"));
		this.add(name);
		this.add(new JLabel("학번"));
		this.add(stuId);
		this.add(new JLabel("학과"));
		this.add(major);
		this.add(new JLabel("과목"));
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
					System.out.println("이름 : " + strName + ", 학번 : " + strStuId + ", 학과 : " + strMajor + ", 과목 : " + strGwa + ", 확인이 되었습니다!!!");
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
