package game;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class MySite extends JPanel {

	JButton bStartComp = new JButton(" \u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0441\u0430\u0439\u0442 \"\u21161\" 110000\u0420");
	JLabel lblNewLabel = new JLabel("\u041C\u043E\u0438 \u0441\u0430\u0439\u0442\u044B");
	JButton bPlus1 = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0441\u0430\u0439\u0442\u044B \u0437\u0430");
	JLabel lKolvo = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0441\u0430\u0439\u0442\u043E\u0432 = ");
	JLabel lPribil = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C(\u0434\u0435\u043D\u044C) = ");
	JLabel lblNewLabel_3 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u043E\u0442 150 \u0434\u043E 3250\u0420");
	JLabel lTrat = new JLabel("\u0417\u0430\u0442\u0440\u0430\u0442\u044B( \u0437\u0430 \u0434\u0435\u043D\u044C)=");
JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
 JButton bSellSite = new JButton("\u041F\u0440\u043E\u0434\u0430\u0442\u044C \u0441\u0430\u0439\u0442\u044B \u0437\u0430 ");
 JLabel lblNewLabel_1 = new JLabel("+");
 JLabel lblNewLabel_2 = new JLabel("-");
 JSpinner siteSToBay = new JSpinner();
  JSpinner siteSToSell = new JSpinner();
	
	public MySite() {
		setLayout(null);
		
		
		bStartComp.setBounds(92, 64, 500, 23);
		add(bStartComp);
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 11, 554, 23);
		add(lblNewLabel);
		bPlus1.setEnabled(false);
		
		
		bPlus1.setBounds(229, 98, 363, 23);
		add(bPlus1);
		
		
		lKolvo.setBounds(92, 166, 500, 23);
		add(lKolvo);
		
		
		lPribil.setBounds(92, 200, 500, 23);
		add(lPribil);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblNewLabel_3.setBounds(92, 272, 500, 23);
		add(lblNewLabel_3);
		
		
		
		lTrat.setBounds(92, 234, 513, 27);
		add(lTrat);
		bBack.setBounds(10, 391, 89, 23);
		
		add(bBack);
		bSellSite.setEnabled(false);
		bSellSite.setBounds(229, 132, 363, 23);
		
		add(bSellSite);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(92, 98, 14, 23);
		
		add(lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(92, 132, 14, 23);
		
		add(lblNewLabel_2);
		siteSToBay.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		siteSToBay.setBounds(102, 98, 117, 20);
		
		add(siteSToBay);
		siteSToSell.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		siteSToSell.setBounds(102, 133, 117, 20);
		
		add(siteSToSell);

	}

}
