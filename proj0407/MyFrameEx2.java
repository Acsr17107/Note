package proj0407;

import java.awt.*;
import javax.swing.*;

public class MyFrameEx2 extends JFrame {
	// ������
	MyFrameEx2 () {
		// super("���� ùGUI ���α׷���");
		this.setTitle("���� ùGUI ���α׷���");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Ȯ��");
		btn1.setBackground(Color.PINK);
		
		this.add(btn1);
		this.add(new JButton("���"));
		this.add(new JButton("����"));
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// MyFrameEx2 frame = new MyFrameEx2();
		new MyFrameEx2();
		
	}
}
