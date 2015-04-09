package game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ArmyMenu extends JDialog {

	JPanel contentPanel = new JPanel();

	MenuOfArmy moa= new MenuOfArmy();
	public ArmyMenu() {
		contentPanel.setBounds(0, 0, 300, 500);
		setBounds(0, 0,300, 500);
		getContentPane().setLayout(null);
		
		
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
	}

}
