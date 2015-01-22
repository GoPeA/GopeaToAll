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
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;

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
		
		JLabel lblf = new JLabel("\u0417/\u041F, -F%, -\u0441\u0447\u0430\u0441\u0442\u044C\u0435%, -HP%, \u0443\u0441\u043B\u043E\u0432\u0438\u044F \u043F\u0440\u0438\u0435\u043C\u0430 \u043D\u0430 \u0440\u0430\u0431\u043E\u0442\u0443");
		lblf.setHorizontalAlignment(SwingConstants.CENTER);
		lblf.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(WorkBar, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(143)
					.addComponent(lblf, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
					.addGap(32))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(WorkBar, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblf, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
					.addGap(11))
		);
		setLayout(groupLayout);
		
		
		
		

	}
}
