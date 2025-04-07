package proj0407;

import java.awt.*;
import javax.swing.*;

public class MyFrameEx2 extends JFrame {
	// 생성자
	MyFrameEx2 () {
		// super("나의 첫GUI 프로그래밍");
		this.setTitle("나의 첫GUI 프로그래밍");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("확인");
		btn1.setBackground(Color.PINK);
		
		this.add(btn1);
		this.add(new JButton("취소"));
		this.add(new JButton("삭제"));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// MyFrameEx2 frame = new MyFrameEx2();
		new MyFrameEx2();
		
	}
}
