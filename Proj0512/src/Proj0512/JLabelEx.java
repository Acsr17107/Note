package Proj0512;

import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
	JLabelEx() {
		this.setTitle("���̺� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		JLabel lbTxt = new JLabel("����մϴ�. ������ ~~~~~ ���� �Ϸ�..");
		
		ImageIcon img = new ImageIcon("C:\\Users\\313\\Downloads\\love.jpg");
		JLabel lbImg = new JLabel(img);
		ImageIcon phoneImg = new ImageIcon("C:\\Users\\313\\Downloads\\phone.jpg");
		JButton btn = new JButton("������", phoneImg);
		
		this.add(lbTxt);
		this.add(lbImg);
		this.add(btn);
		
		this.setSize(400, 600);
		this.setVisible(true);
	}
	//--- end
	
	public static void main(String[] args) {
		new JLabelEx();
	}

}
