package game;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class HomePage extends JPanel {
	
	JLabel lXP = new JLabel("XP(\u041E\u043F\u044B\u0442)");
	JLabel lMoney = new JLabel("\u0414\u0435\u043D\u044C\u0433\u0438");
	JLabel lPrestige = new JLabel("\u041F\u0440\u0435\u0441\u0442\u0438\u0436 0");
	JLabel LAllTrat = new JLabel("\u0417\u0430\u0442\u0440\u0430\u0442\u044B \u0437\u0430 \u0433\u043E\u0434 = ");
	public HomePage() {
		setLayout(null);
		
		
		lXP.setBounds(10, 11, 331, 20);
		add(lXP);
		
		
		lMoney.setBounds(10, 42, 331, 20);
		add(lMoney);
		
		
		lPrestige.setBounds(351, 11, 311, 20);
		add(lPrestige);
		
		
		LAllTrat.setBounds(10, 73, 311, 20);
		add(LAllTrat);

	}
}
