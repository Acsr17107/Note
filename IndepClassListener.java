import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	IndepClassListener() {
		this.setTitle("Action 이벤트 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btnOk = new JButton("EnglishAction");
		this.setLayout(new FlowLayout());
		this.add(btnOk);
		
		MyActionLis lis = new MyActionLis();
		btnOk.addActionListener(lis);
		
		this.setSize(350, 200);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		new IndepClassListener();

	}

}
