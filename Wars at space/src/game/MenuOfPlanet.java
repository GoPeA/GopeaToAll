package game;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuOfPlanet extends JPanel {
	JComboBox BoxPlanet = new JComboBox();
	JButton bCA = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0410\u0440\u043C\u0438\u044E");
	
	
	public MenuOfPlanet() {
		setLayout(null);
		
		
		BoxPlanet.setModel(new DefaultComboBoxModel(new String[] {"\u041F\u043B\u0430\u043D\u0435\u0442\u0430 1", "\u041F\u043B\u0430\u043D\u0435\u0442\u0430 2", "\u041F\u043B\u0430\u043D\u0435\u0442\u0430 3", "\u041F\u043B\u0430\u043D\u0435\u0442\u0430 4", "\u041F\u043B\u0430\u043D\u0435\u0442\u0430 5", "\u041F\u043B\u0430\u043D\u0435\u0442\u0430 6"}));
		BoxPlanet.setSelectedIndex(0);
		BoxPlanet.setBounds(10, 50, 127, 20);
		add(BoxPlanet);
		
		
		bCA.setBounds(162, 49, 162, 23);
		add(bCA);

	}
}
