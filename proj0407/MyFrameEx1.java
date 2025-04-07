package proj0407;

import javax.swing.JFrame;

public class MyFrameEx1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("첫 화면 프레임");	// 맨 위 필수
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 200);
		frame.setVisible(true);		// 맨 아래 필수
	}

}
