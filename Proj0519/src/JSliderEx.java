import javax.swing.*;
import java.awt.*;

public class JSliderEx extends JFrame {
	public JSliderEx() {
		setTitle("�����̴� ����� ����");					// ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����
		
		this.setLayout(new FlowLayout());				// ���̾ƿ� ����
		
		// �����̴� ����
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		this.add(slider);		// �����̵� �߰�
		setSize(300, 100);		// ������ ����
		setVisible(true);		// ���ü� ����
	}

	public static void main(String[] args) {
		new JSliderEx();
	}
}
