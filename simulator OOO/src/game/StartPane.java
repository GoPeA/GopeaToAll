package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StartPane extends JPanel {
	
	JButton bExit = new JButton("\u0412\u044B\u0445\u043E\u0434");
	JButton bHelp = new JButton("\u041F\u043E\u043C\u043E\u0449\u044C");
	JButton bDownl = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u043A\u0438");
	JButton bSave = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F");
	JButton bOptions = new JButton("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438");
	JButton bGame = new JButton("\u0418\u0433\u0440\u0430");
	public StartPane() {
		bGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bDownl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(247)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bSave, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
						.addComponent(bGame, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
						.addComponent(bOptions, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
						.addComponent(bDownl, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHelp, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
						.addComponent(bExit, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
					.addGap(213))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(187)
					.addComponent(bGame, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bOptions, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bSave, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(bDownl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bHelp, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bExit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
       
	}
}
