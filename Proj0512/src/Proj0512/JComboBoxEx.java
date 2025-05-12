package Proj0512;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JComboBoxEx extends JFrame {
	JComboBoxEx() {
		this.setTitle("JComboBox ¿¹Á¦");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", 
				"peach", "berry", "strawberry", "blackberry"};
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(strCombo.getSelectedItem() + ", " + 
						strCombo.getSelectedIndex());
			}
		});
		
		this.add(strCombo);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JComboBoxEx();
	}
}
