import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JSliderEx2 extends JFrame {
	private JLabel colorLabel;					// 색상을 표시할 라벨
	private JSlider [] sli = new JSlider[3];    // RGB 조절용 슬라이더 3개
	JSliderEx2() {
		setTitle("슬라이더와 ActionEvent 예제");			// 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
		
		this.setLayout(new FlowLayout());				// 레이아웃 설정
		
		colorLabel = new JLabel(" SLIDER EXAMPLE 색상 변경~~~~~~");
		
		// 슬라이더 3개 생성
		for (int i=0; i<sli.length; i++) {
			// 수평 슬라이더, 초기값 128
			sli[i] = new JSlider(JSlider.HORIZONTAL, 0 ,255, 128);
			
			sli[i].setPaintLabels(true);	// 숫자 라벨 표시
			sli[i].setPaintTicks(true);		// 눈금 표시
			sli[i].setPaintTrack(true);		// 트랙 표시
			sli[i].setMajorTickSpacing(50);
			sli[i].setMinorTickSpacing(10);
			this.add(sli[i]);				// 슬라이더 추가
		}
		
		// 각 슬라이더 색 지정
		sli[0].setForeground(Color.RED);
		sli[1].setForeground(Color.GREEN);
		sli[2].setForeground(Color.BLUE);
		
		// 슬라이더 초기값 색 설정
		int r = sli[0].getValue();
		int g = sli[1].getValue();
		int b = sli[2].getValue();
		
		colorLabel.setOpaque(true);						// 배경색 보이게 설정
		colorLabel.setBackground(new Color(r, g, b));	// 배경색 설정
		this.add(colorLabel);							// 컬러 레이블 추가
		JButton btn = new JButton("확인");				// 버튼 생성
		this.add(btn);									// 버튼 추가
		
		// 버튼 클릭 이벤트
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 슬라이더 값으로 배경색 변경
				int r = sli[0].getValue();
				int g = sli[1].getValue();
				int b = sli[2].getValue();
				
				colorLabel.setBackground(new Color(r, g, b));
			}
		});
		
		setSize(300, 270);		// 사이즈 설정
		setVisible(true);		// 가시성 설정
	}

	public static void main(String[] args) {
		new JSliderEx2();		// 객체 생성
	}
}
