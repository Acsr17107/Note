import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LambdaEx3 extends JFrame {

	LambdaEx3() {
		this.setTitle("람다식 적용 예제");					// 제목
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	// 종료
		this.setLayout(new FlowLayout());			// 레이아웃 설정
		
		JLabel lb = new JLabel("아이스크림을 좋아하나요?");	// 레이블 정의
		JButton btnOk = new JButton("Yes");		// ok 버튼 정의
		JButton btnNo = new JButton("No");		// no 버튼 정의
		
		/*
		 
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("네, 아이스크림을 좋아합니다.");
			}
		});
		
		*/
		
		btnOk.addActionListener( e -> System.out.println("네, 아이스크림을 좋아합니다.") );
		btnNo.addActionListener( e -> System.out.println("아니요, 아이스크림을 싫어합니다.") );
		
		
		
		this.add(lb);		// 레이블 추가
		this.add(btnOk);	// ok 버튼 추가
		this.add(btnNo);	// no 버튼 추가
		
		this.setSize(400, 200);		// 사이즈 설정
		this.setVisible(true);		// 가시성 설정
	}

	public static void main(String[] args) {
		new LambdaEx3(); 					// 생성자 호출
	}
}
