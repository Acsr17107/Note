package Proj0512;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JCheckBoxEx extends JFrame {
	private String[]	names = {"사과", "배", "체리"};
	private int[] 		prices = {100, 500, 20000};
	int sum = 0;
	
	JCheckBoxEx() {
		setTitle("체크박스와 ActionEvent 예제");				// 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 닫기
		this.setLayout(new FlowLayout());					// 레이아웃 선택
		this.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));	// 레이블 생성
		
		JLabel sumLabel = new JLabel("현재 0 원 입니다.");		// 초기 레이블
		JCheckBox cbApple = new JCheckBox("사과");			// 사과 체크박스
		JCheckBox cbPear = new JCheckBox("배");				// 배 체크박스
		JCheckBox cbCherry = new JCheckBox("체리");			// 체리 체크박스
		// 사과		
		cbApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[0];						// 사과 가격 더함
				else
					sum -= prices[0];						// 사과 가격 뻄
				sumLabel.setText("현재 " + sum + "원 입니다.");
				
			}
		});
		
		// 배			
		cbPear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[1];						// 배 가격 더함
				else
					sum -= prices[1];						// 배 가격 뻄
				sumLabel.setText("현재 " + sum + "원 입니다.");
			}
		});
		
		// 체리
		cbCherry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbApple.isSelected() == true)
					sum += prices[2];						// 체리 가격 더함
				else
					sum -= prices[2];						// 체리 가격 뻄
				sumLabel.setText("현재 " + sum + "원 입니다.");
				
			}
		});
		
		this.add(cbApple);	// 체크박스 추가
		this.add(cbPear);
		this.add(cbCherry);
		this.add(sumLabel);
		
		this.setSize(250, 200);	// 사이즈 설정
		this.setVisible(true);	// 보이게 함
	}

	public static void main(String[] args) {
		new JCheckBoxEx();	// 실행
	}

}
