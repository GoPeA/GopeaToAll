package game;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MenuOfPlanet extends JPanel {
	JButton bCA = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0430\u0440\u043C\u0438\u044E");
	JButton btnNewButton = new JButton("New button");
	public MenuOfPlanet() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		
		btnNewButton.setBounds(10, 535, 205, 23);
		add(btnNewButton);
		
		
		bCA.setBounds(235, 535, 205, 23);
		add(bCA);

	}
}
