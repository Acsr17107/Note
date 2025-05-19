import javax.swing.*;
import java.awt.*;

public class JSliderEx extends JFrame {
	public JSliderEx() {
		setTitle("슬라이더 만들기 예제");					// 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
		
		this.setLayout(new FlowLayout());				// 레이아웃 설정
		
		// 슬라이더 설정
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		this.add(slider);		// 슬라이드 추가
		setSize(300, 100);		// 사이즈 설정
		setVisible(true);		// 가시성 설정
	}

	public static void main(String[] args) {
		new JSliderEx();
	}
}
