package game;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Larek extends JPanel {

	JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	JButton bStartComp = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0444\u0438\u0440\u043C\u0443 (+1 \u043B\u0430\u0440\u0435\u043A) 60000\u0420");
	JButton bPlus1 = new JButton("\u041A\u0443\u043F\u0438\u0442\u044C \u043B\u0430\u0440\u044C\u043A\u0438 \u0437\u0430");
	JLabel lblNewLabel = new JLabel("\u0421\u0435\u0442\u044C \u043B\u0430\u0440\u044C\u043A\u043E\u0432");
	JLabel lKolLarek = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043B\u0430\u0440\u043A\u043E\u0432");
	JLabel lPribil = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C /\u0434\u0435\u043D\u044C =");
	JLabel lTrat = new JLabel("\u0417\u0430\u0442\u0440\u0430\u0442\u044B( \u0437\u0430 \u0434\u0435\u043D\u044C)=");
	JButton bSellLarek = new JButton("\u041F\u0440\u043E\u0434\u0430\u0442\u044C \u043B\u0430\u0440\u0435\u043A\u0438 \u0437\u0430");
	
	
	JLabel lblNewLabel_1 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u0432 \u0434\u0435\u043D\u044C \u043E\u0442 800 \u0434\u043E 3000");
	 JLabel lblNewLabel_2 = new JLabel("+");
	 JLabel lblNewLabel_3 = new JLabel("-");
	 JSpinner larsBild = new JSpinner();
	 JSpinner larsSell = new JSpinner();
	public Larek() {
		setLayout(null);
		bBack.setBounds(10, 391, 89, 23);
		add(bBack);
		
		
		bStartComp.setBounds(89, 54, 513, 23);
		add(bStartComp);
		bPlus1.setEnabled(false);
		
		
		bPlus1.setBounds(239, 88, 363, 23);
		add(bPlus1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblNewLabel.setBounds(53, 11, 574, 23);
		add(lblNewLabel);
		
		
		lKolLarek.setBounds(89, 156, 513, 23);
		add(lKolLarek);
		
		
		lPribil.setBounds(89, 190, 513, 23);
		add(lPribil);
		
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(89, 262, 513, 23);
		add(lblNewLabel_1);
		
		
		lTrat.setBounds(89, 224, 513, 27);
		add(lTrat);
		
		
		bSellLarek.setEnabled(false);
		bSellLarek.setBounds(239, 122, 363, 23);
		add(bSellLarek);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(89, 88, 15, 23);
		
		add(lblNewLabel_2);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(89, 115, 15, 23);
		
		add(lblNewLabel_3);
		larsBild.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		larsBild.setBounds(99, 88, 130, 20);
		
		add(larsBild);
		larsSell.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		larsSell.setBounds(99, 118, 130, 20);
		
		add(larsSell);
	}
}
