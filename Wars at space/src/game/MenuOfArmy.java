package game;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JList;

public class MenuOfArmy extends JPanel {
	private final JList list = new JList();

	/**
	 * Create the panel.
	 */
	public MenuOfArmy() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		list.setBounds(10, 11, 280, 477);
		add(list);

	}

}
