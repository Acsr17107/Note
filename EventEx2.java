import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventEx2 extends JFrame {
	EventEx2() {
		this.setTitle("EventEx2");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("�⺻ �ؽ�Ʈ");
		JButton button1 = new JButton("�ȳ�!");
        JButton button2 = new JButton("�� ��!");
        
        this.setLayout(new GridLayout(3, 1));
        
        this.add(label);
        this.add(button1);
        this.add(button2);
        
        button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�ȳ��ϼ���? �ݰ����ϴ�.");
			}
		});
        
        button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("I will be back!");
			}
		});
        
        this.setSize(400, 300);
        this.setVisible(true);
        
	}

	public static void main(String[] args) {
		new EventEx2();
	}
}
