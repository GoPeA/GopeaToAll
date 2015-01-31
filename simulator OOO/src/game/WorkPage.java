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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
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
import java.io.Serializable;

public class WorkPage extends JPanel implements Serializable{
	static final long serialVersionUID=26L;
	int x;
	ha ha=new ha();
	JScrollPane scrollPane = new JScrollPane();
	WorkPane wpan=new WorkPane();
	JProgressBar WorkBar = new JProgressBar();
	JLabel lHelp = new JLabel("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(WorkBar, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(620, Short.MAX_VALUE)
					.addComponent(lHelp)
					.addGap(49))
		);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setForeground(Color.BLUE);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(WorkBar, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lHelp)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
					.addGap(11))
		);
		setLayout(groupLayout);
		lHelp.addMouseListener(ha);
		
		

	}
	public class ha implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null,"Тут вы можете наниматься на работу.\n"+
													"За работу каждые 15 дней начисляется\n"
													+ "половина месячной З/П.");
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	
		
	}
}
