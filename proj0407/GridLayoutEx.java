package proj0407;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		
		this.setLayout(grid);
		this.add(new JLabel(" 이름"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 학번"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 학과"));
		this.add(new JTextField(""));
		this.add(new JLabel(" 과목"));
		this.add(new JTextField(""));
		
		this.setLayout(4, 10);
		this.add(new JButton(" 확인"));
		this.add(new JButton(" 취소"));
		
		setSize(300, 200);
		setVisible(true);
	}

	private void setLayout(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
