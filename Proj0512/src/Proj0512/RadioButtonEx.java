package Proj0512;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	JRadioButton[] radio = new JRadioButton [3];
	String[] text = {"사과", "배", "체리"};
	ImageIcon[] Image = {
			new ImageIcon("C:\\Users\\313\\Downloads\\apple.jfif"), 
			new ImageIcon("C:\\Users\\313\\Downloads\\pear.jfif"),
			new ImageIcon("C:\\Users\\313\\Downloads\\cherry.jfif")};
	private JLabel imageLabel = new JLabel();
	
	RadioButtonEx() {
		this.setTitle("라디오버튼 액션이벤트 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel radioPanel = new JPanel();	// 기본이 FlowLayout
		radioPanel.setBackground(Color.GRAY);
		ButtonGroup btngroup = new ButtonGroup();
		
		for(int i=0; i < radio.length; i++) {
			btngroup.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if  (radio[0].isSelected() == true)
						imageLabel.setIcon(Image[0]);
					else if (radio[1].isSelected())
						imageLabel.setIcon(Image[1]);
					else
						imageLabel.setIcon(Image[2]);
				}
			});
		}
		radio[2].setSelected(true);
		imageLabel.setIcon(Image[2]);
		this.add(radioPanel, BorderLayout.NORTH);
		
		this.setSize(400, 600);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}

