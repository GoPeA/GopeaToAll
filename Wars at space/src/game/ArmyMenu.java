package game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ArmyMenu extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public ArmyMenu() {
		setBounds(0, 0, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 261);
		
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
	}

}
