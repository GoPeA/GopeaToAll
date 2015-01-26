package game;

import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Invest extends JPanel implements Serializable{
	static final long serialVersionUID=16L;

	JButton bInv1 = new JButton("\u0411\u0430\u043D\u043A");
	JButton bInv2 = new JButton("\u041F\u0410\u041C\u041C \u0441\u0447\u0435\u0442\u0430 \u043E\u0442-50% \u0434\u043E 150%/\u0433\u043E\u0434");
	JButton bInv3 = new JButton("\u0421\u0442\u0440\u0443\u043A\u0442\u0443\u0440\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u044B\u0435 \u043F\u0440\u043E\u0434\u0443\u043A\u0442\u044B");
	public Invest() {
		setLayout(null);
		
		
		bInv1.setBounds(10, 11, 670, 23);
		add(bInv1);
		
		
		bInv2.setBounds(10, 45, 670, 23);
		add(bInv2);
		
		
		bInv3.setEnabled(false);
		bInv3.setBounds(10, 79, 670, 23);
		add(bInv3);

	}

}
