package game;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;

public class GameMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public GameMenu() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(82, 39, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(528, 39, 89, 23);
		add(btnNewButton_1);

	}
}
