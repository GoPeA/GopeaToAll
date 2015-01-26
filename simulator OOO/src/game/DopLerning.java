package game;

import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JButton;

public class DopLerning extends JPanel implements Serializable {
	static final long serialVersionUID=6L;

	JButton bDL1 = new JButton("\u0410\u0432\u0442\u043E \u0448\u043A\u043E\u043B\u0430 \u043D\u0430 \u043F\u0440\u0430\u0432\u0430 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 B 0/ 180 \u0434\u043D\u0435\u0439");
	JButton bDL2 = new JButton("\u0410\u0432\u0442\u043E \u0448\u043A\u043E\u043B\u0430 \u043D\u0430 \u043F\u0440\u0430\u0432\u0430 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 C 0/ 180 \u0434\u043D\u0435\u0439");
	JButton bDL3 = new JButton("\u0410\u0432\u0442\u043E \u0448\u043A\u043E\u043B\u0430 \u043D\u0430 \u043F\u0440\u0430\u0432\u0430 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 D 0/ 180 \u0434\u043D\u0435\u0439");
	public DopLerning() {
		setLayout(null);
		
		
		bDL1.setBounds(10, 11, 670, 23);
		add(bDL1);
		
		
		bDL2.setBounds(10, 45, 670, 23);
		add(bDL2);
		
		
		bDL3.setBounds(10, 79, 670, 23);
		add(bDL3);

	}
}
