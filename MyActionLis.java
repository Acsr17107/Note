import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionLis implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if	(b.getText().equals("EnglishAction") )
			b.setText("�ѱ۾׼�");
		else
			b.setText("EnglishAction");
	}
	

}
