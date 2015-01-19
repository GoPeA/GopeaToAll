package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PammInvest extends JPanel {
	JButton btnNewButton = new JButton("New button");
	JButton btnNewButton_1 = new JButton("New button");
	JButton btnNewButton_2 = new JButton("New button");
	JLabel lblNewLabel = new JLabel("\u041D\u0430 \u041F\u0410\u041C\u041C \u0441\u0447\u0435\u0442\u0430\u0445");
	JSpinner spinner = new JSpinner();
	JLabel lblNewLabel_1 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u0437\u0430 \u0434\u0435\u043D\u044C =  ");
	JLabel lblNewLabel_2 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u0437\u0430 \u043F\u0440\u043E\u0448\u043B\u0443\u044E \u043D\u0435\u0434\u0435\u043B\u044E = ");
	JLabel lblNewLabel_3 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u0437\u0430 \u0433\u043E\u0434 (\u043F\u0440\u0435\u0434\u043F\u043E\u043B\u043E\u0436\u0435\u043D\u0438\u0435) = ");
	
	public PammInvest() {
		setLayout(null);
		
		
		btnNewButton.setBounds(10, 391, 89, 23);
		add(btnNewButton);
		
		
		btnNewButton_1.setBounds(55, 159, 271, 23);
		add(btnNewButton_1);
		
		
		btnNewButton_2.setBounds(336, 159, 271, 23);
		add(btnNewButton_2);
		
		
		lblNewLabel.setBounds(55, 84, 540, 23);
		add(lblNewLabel);
		
		
		spinner.setModel(new SpinnerNumberModel(new Long(1000), new Long(1000), null, new Long(1)));
		spinner.setBounds(55, 128, 552, 20);
		add(spinner);
		
		
		lblNewLabel_1.setBounds(53, 193, 273, 23);
		add(lblNewLabel_1);
		
		
		lblNewLabel_2.setBounds(336, 193, 271, 23);
		add(lblNewLabel_2);
		
		lblNewLabel_3.setBounds(55, 227, 552, 23);
		add(lblNewLabel_3);

	}
}
