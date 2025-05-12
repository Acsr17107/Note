package Proj0512;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCompEx extends JFrame {
	JCompEx() {
		this.setTitle("JComponent 공통 메소드 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pan1 = new JPanel(); // Container, FlowLayout 기본 배치 관리자
		JButton btn1 = new JButton("글자색/바탕색 설정 버튼");
		JButton btn2 = new JButton("비활성(Disable) 버튼");
		JButton btn3 = new JButton("x, y좌표 버튼");
		
		pan1.add(btn1); // 판넬에 붙이기
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
