package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class InterShop extends JPanel {
	JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	JLabel lblNewLabel = new JLabel("\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 \u043C\u0430\u0433\u0430\u0437\u0438\u043D");
	JButton bStartComp = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 \u043C\u0430\u0433\u0430\u0437\u0438\u043D 1'800'000\u0420");
	JButton bBay = new JButton("\u041A\u0443\u043F\u0438\u0442\u044C \u0443\u043B\u0443\u0447\u0448\u0435\u043D\u0438\u044F");
	JButton bSell = new JButton("\u041F\u0440\u043E\u0434\u0430\u0442\u044C \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044E \u0437\u0430");
	JLabel lblNewLabel_1 = new JLabel("+");
	JSpinner spToBay = new JSpinner();
	JLabel lKolvo = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E ");
	 JLabel lKolcoBest = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0443\u043B\u0443\u0447\u0448\u0435\u043D\u0438\u0439");
	 JLabel lPrib = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C (\u0434\u0435\u043D\u044C) = ");
	 JLabel lZatrst = new JLabel("\u0417\u0430\u0442\u0440\u0430\u0442\u044B( \u0434\u0435\u043D\u044C) =");
 JLabel lpribFromTo = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u043E\u0442 \u0434\u043E");
	public InterShop() {
		setLayout(null);
		
		
		bBack.setBounds(10, 391, 89, 23);
		add(bBack);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblNewLabel.setBounds(49, 11, 546, 23);
		add(lblNewLabel);
		
		
		bStartComp.setBounds(49, 45, 546, 23);
		add(bStartComp);
		bBay.setEnabled(false);
		
		
		bBay.setBounds(225, 79, 370, 23);
		add(bBay);
		bSell.setEnabled(false);
		
		
		bSell.setBounds(49, 113, 546, 23);
		add(bSell);
		
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(53, 79, 15, 23);
		add(lblNewLabel_1);
		spToBay.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		
		
		spToBay.setBounds(70, 79, 145, 20);
		add(spToBay);
		lKolvo.setBounds(49, 147, 546, 23);
		
		add(lKolvo);
		lKolcoBest.setBounds(49, 181, 551, 23);
		
		add(lKolcoBest);
		lPrib.setBounds(49, 215, 539, 23);
		
		add(lPrib);
		lZatrst.setBounds(49, 249, 539, 23);
		
		add(lZatrst);
		lpribFromTo.setBounds(49, 283, 539, 23);
		
		add(lpribFromTo);

	}
}
