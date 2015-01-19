package game;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JProgressBar;

public class WorkPage extends JPanel {
	int x;
	JScrollPane scrollPane = new JScrollPane();
	WorkPane wpan=new WorkPane();
	JProgressBar WorkBar = new JProgressBar();
	public WorkPage() {
		setBackground(Color.ORANGE);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		scrollPane.setViewportView(wpan);
		WorkBar.setMaximum(15);
		WorkBar.setStringPainted(true);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(WorkBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(WorkBar, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addGap(11))
		);
		setLayout(groupLayout);
		
		
		
		

	}
}
