package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Serializable;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Banc extends JPanel implements Serializable{
	static final long serialVersionUID=3L;

	JButton bPutMoney = new JButton(
			"\u041F\u043E\u043B\u043E\u0436\u0438\u0442\u044C");
	JLabel lMoneyInBank = new JLabel("\u0412 \u0431\u0430\u043D\u043A\u0435 = 0");
	JButton bTakeMoney = new JButton("\u0412\u0437\u044F\u0442\u044C");
	JButton bTakeKredit = new JButton(
			"\u0412\u0437\u044F\u0442\u044C \u043A\u0440\u0435\u0434\u0438\u0442");
	JButton bbBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	JLabel lblNewLabel_1 = new JLabel("\u0421\u0442\u0430\u0432\u043A\u0430 \u043F\u043E \u043A\u0440\u0435\u0434\u0438\u0442\u0443 20%/\u0433\u043E\u0434 (\u0441\u043B\u043E\u0436\u043D\u044B\u043C \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u043E\u043C)");
	JLabel lMoneyYear = new JLabel("\u0415\u0436\u0435\u0433\u043E\u0434\u043D\u044B\u0435 \u0432\u044B\u043F\u043B\u0430\u0442\u044B =");
	 JLabel lblNewLabel_3 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
	 JLabel lblNewLabel_4 = new JLabel("\u0421\u0440\u043E\u043A \u043A\u0440\u0435\u0434\u0438\u0442\u0430(\u043B\u0435\u0442)");
	 JLabel lblNewLabel_5 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u043D\u0430\u044F \u0441\u0442\u0430\u0432\u043A\u0430 \u043F\u043E \u0432\u043A\u043B\u0430\u0434\u0443 12%/\u0433\u043E\u0434");
	 JLabel lblNewLabel_6 = new JLabel("\u0412\u043A\u043B\u0430\u0434\u044B");
	 JLabel lblNewLabel_7 = new JLabel("\u041A\u0440\u0435\u0434\u0438\u0442\u044B");
	  JLabel lKreditMoney = new JLabel("\u0412\u044B \u0434\u043E\u043B\u0436\u043D\u044B \u0435\u0449\u0435 \u0432\u044B\u043F\u043B\u0430\u0442\u0438\u0442\u044C ");
	  JLabel lallKreditToPay = new JLabel("\u041F\u043E\u043B\u043D\u0430\u044F \u0441\u0443\u043C\u043C\u0430 \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
	  JSpinner tfMoney = new JSpinner();
	   JSpinner tfKreditMoney = new JSpinner();
	  JSpinner tfKreditTime = new JSpinner();
	  JLabel lmaxCredit = new JLabel("\u0414\u043E\u0441\u0442\u0443\u043F\u0435\u043D \u043A\u0440\u0435\u0434\u0438\u0442 =");
	public Banc() {
		setLayout(null);

		bPutMoney.setBounds(0, 171, 145, 23);
		add(bPutMoney);

		lMoneyInBank.setFont(new Font("Tahoma", Font.BOLD, 12));
		lMoneyInBank.setBounds(10, 54, 290, 23);
		add(lMoneyInBank);

		bTakeMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bTakeMoney.setBounds(155, 171, 145, 23);
		add(bTakeMoney);

		bTakeKredit.setBounds(324, 271, 285, 23);
		add(bTakeKredit);
		bbBack.setBounds(10, 391, 89, 23);
		
				add(bbBack);
		lblNewLabel_1.setBounds(320, 171, 323, 23);

		add(lblNewLabel_1);
		lMoneyYear.setBounds(324, 205, 323, 23);

		add(lMoneyYear);
		lblNewLabel_3.setBounds(544, 108, 103, 20);
		
		add(lblNewLabel_3);
		lblNewLabel_4.setBounds(544, 137, 103, 23);
		
		add(lblNewLabel_4);
		lblNewLabel_5.setBounds(0, 137, 314, 23);
		
		add(lblNewLabel_5);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(0, 11, 314, 23);
		
		add(lblNewLabel_6);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(335, 11, 308, 23);
		
		add(lblNewLabel_7);
		lKreditMoney.setBounds(117, 329, 460, 23);
		
		add(lKreditMoney);
		
		
		lallKreditToPay.setBounds(324, 235, 346, 23);
		add(lallKreditToPay);
		tfMoney.setModel(new SpinnerNumberModel(new Long(1000), new Long(0), null, new Long(100)));
		tfMoney.setBounds(10, 108, 290, 20);
		
		add(tfMoney);
		tfKreditMoney.setModel(new SpinnerNumberModel(new Long(1000), new Long(1000), null, new Long(100)));
		tfKreditMoney.setBounds(324, 108, 220, 20);
		
		add(tfKreditMoney);
		tfKreditTime.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		tfKreditTime.setBounds(324, 140, 220, 20);
		
		add(tfKreditTime);
		
		
		lmaxCredit.setFont(new Font("Tahoma", Font.BOLD, 13));
		lmaxCredit.setBounds(324, 54, 346, 23);
		add(lmaxCredit);

	}
}
