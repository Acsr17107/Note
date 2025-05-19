import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JSliderEx2 extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sli = new JSlider[3];
	JSliderEx2() {
		setTitle("슬라이더와 ActionEvent 예제");			// 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
		
		this.setLayout(new FlowLayout());				// 레이아웃 설정
		
		colorLabel = new JLabel(" SLIDER EXAMPLE 색상 변경~~~~~~");
		
		// 반복문
		for (int i=0; i<sli.length; i++) {
			sli[i] = new JSlider(JSlider.HORIZONTAL, 0 ,255, 128);
			sli[i].setPaintLabels(true);
			sli[i].setPaintTicks(true);
			sli[i].setPaintTrack(true);
			sli[i].setMajorTickSpacing(50);
			sli[i].setMajorTickSpacing(10);
			this.add(sli[i]);
		}
		
		sli[0].setForeground(Color.RED);
		sli[1].setForeground(Color.GREEN);
		sli[2].setForeground(Color.BLUE);
		
		int r = sli[0].getValue();
		int g = sli[1].getValue();
		int b = sli[2].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r, g, b));
		this.add(colorLabel);				// 컬러 레이블 추가
		JButton btn = new JButton("확인");	// 버튼 생성
		this.add(btn);						// 버튼 추가
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = sli[0].getValue();
				int g = sli[0].getValue();
				int b = sli[0].getValue();
				
				colorLabel.setBackground(new Color(r, g, b));
			}
		});
		
		setSize(300, 270);		// 사이즈 설정
		setVisible(true);		// 가시성 설정
	}

	public static void main(String[] args) {
		new JSliderEx2();
	}
}
