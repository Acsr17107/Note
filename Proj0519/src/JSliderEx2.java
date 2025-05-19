import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JSliderEx2 extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sli = new JSlider[3];
	JSliderEx2() {
		setTitle("�����̴��� ActionEvent ����");			// ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����
		
		this.setLayout(new FlowLayout());				// ���̾ƿ� ����
		
		colorLabel = new JLabel(" SLIDER EXAMPLE ���� ����~~~~~~");
		
		// �ݺ���
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
		this.add(colorLabel);				// �÷� ���̺� �߰�
		JButton btn = new JButton("Ȯ��");	// ��ư ����
		this.add(btn);						// ��ư �߰�
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = sli[0].getValue();
				int g = sli[0].getValue();
				int b = sli[0].getValue();
				
				colorLabel.setBackground(new Color(r, g, b));
			}
		});
		
		setSize(300, 270);		// ������ ����
		setVisible(true);		// ���ü� ����
	}

	public static void main(String[] args) {
		new JSliderEx2();
	}
}
