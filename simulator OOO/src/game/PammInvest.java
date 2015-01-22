package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PammInvest extends JPanel {
	JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	JButton bInvest = new JButton("\u0418\u043D\u0432\u0435\u0441\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
	JButton bTakeMoney = new JButton("\u0417\u0430\u0431\u0440\u0430\u0442\u044C");
	JLabel lpiMoney = new JLabel("\u041D\u0430 \u041F\u0410\u041C\u041C \u0441\u0447\u0435\u0442\u0430\u0445");
	JSpinner pammMoney = new JSpinner();
	JLabel lDayPrib = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u0437\u0430 \u0434\u0435\u043D\u044C =  ");
	JLabel lYaerPrib = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u0437\u0430 \u0433\u043E\u0434 (\u043F\u0440\u0435\u0434\u043F\u043E\u043B\u043E\u0436\u0435\u043D\u0438\u0435) = ");
	
	public PammInvest() {
		setLayout(null);
		
		
		bBack.setBounds(10, 391, 89, 23);
		add(bBack);
		
		
		bInvest.setBounds(55, 159, 271, 23);
		add(bInvest);
		
		
		bTakeMoney.setBounds(336, 159, 271, 23);
		add(bTakeMoney);
		
		
		lpiMoney.setBounds(55, 84, 540, 23);
		add(lpiMoney);
		
		
		pammMoney.setModel(new SpinnerNumberModel(new Long(1000), new Long(0), null, new Long(1)));
		pammMoney.setBounds(55, 128, 552, 20);
		add(pammMoney);
		
		
		lDayPrib.setBounds(53, 193, 273, 23);
		add(lDayPrib);
		
		lYaerPrib.setBounds(55, 227, 552, 23);
		add(lYaerPrib);

	}
}
