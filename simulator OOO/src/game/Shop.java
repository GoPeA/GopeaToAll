package game;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.io.Serializable;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Shop extends JPanel implements Serializable{
	static final long serialVersionUID=24L;
	JLabel lblNewLabel = new JLabel("\u0421\u0435\u0442\u044C \u043C\u0430\u0433\u0430\u0437\u0438\u043D\u043E\u0432");
	JButton bStartComp = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044E 180000\u0420");
	JButton bPlus1 = new JButton("\u041F\u043E\u0441\u0442\u0440\u043E\u0438\u0442\u044C \u043C\u0430\u0433\u0430\u0437\u0438\u043D \u0437\u0430");
	JButton bMinus1 = new JButton("\u041F\u0440\u043E\u0434\u0430\u0442\u044C \u043C\u0430\u0433\u0430\u0437\u0438\u043D \u0437\u0430 ");
	JLabel lKolvo = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043C\u0430\u0433\u0430\u0437\u0438\u043D\u043E\u0432 ");
	JLabel lPribil = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C (\u0434\u0435\u043D\u044C) = ");
	JLabel lTrat = new JLabel("\u0417\u0430\u0442\u0440\u0430\u0442\u044B (\u0434\u0435\u043D\u044C) = ");
	JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	 JLabel lblNewLabel_1 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u043E\u0442 3000 \u0434\u043E 7000");
	JLabel lblNewLabel_2 = new JLabel("+");
	 JLabel lblNewLabel_3 = new JLabel("-");
	 JSpinner shopSToBay = new JSpinner();
	 JSpinner shopSToSell = new JSpinner();
	public Shop() {
		setLayout(null);
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setEnabled(true);
		lblNewLabel.setBounds(76, 11, 533, 23);
		add(lblNewLabel);
		bStartComp.setBounds(76, 45, 533, 23);
		add(bStartComp);
		bPlus1.setEnabled(false);
		bPlus1.setBounds(219, 79, 390, 23);
		add(bPlus1);
		bMinus1.setEnabled(false);
		bMinus1.setBounds(219, 113, 390, 23);
		add(bMinus1);
		lKolvo.setBounds(76, 147, 533, 23);
		add(lKolvo);
		lPribil.setBounds(76, 181, 533, 23);
		add(lPribil);
		lTrat.setBounds(76, 215, 533, 23);
		add(lTrat);
		bBack.setBounds(10, 391, 89, 23);
		add(bBack);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(119, 249, 459, 23);
		
		add(lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(76, 79, 11, 23);
		
		add(lblNewLabel_2);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(76, 113, 11, 23);
		
		add(lblNewLabel_3);
		shopSToBay.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		shopSToBay.setBounds(97, 79, 112, 20);
		
		add(shopSToBay);
		shopSToSell.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		shopSToSell.setBounds(97, 114, 112, 20);
		
		add(shopSToSell);

	}
}
