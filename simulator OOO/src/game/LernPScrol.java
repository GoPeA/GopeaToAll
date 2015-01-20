package game;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class LernPScrol extends JPanel {
	LerningPane lp=new LerningPane();
	JScrollPane scrollPane = new JScrollPane();
	
	JProgressBar LernBar = new JProgressBar();
	JLabel lNameLern = new JLabel("");
	String s1;
	public LernPScrol() {
		s1="Ўкола";
		setLayout(null);
		
		scrollPane.setBounds(3, 50, 675, 429);
		add(scrollPane);
		
		scrollPane.setViewportView(lp);
		GroupLayout gl_lp = new GroupLayout(lp);
		gl_lp.setHorizontalGroup(
			gl_lp.createParallelGroup(Alignment.LEADING)
				.addGap(0, 673, Short.MAX_VALUE)
		);
		gl_lp.setVerticalGroup(
			gl_lp.createParallelGroup(Alignment.LEADING)
				.addGap(0, 427, Short.MAX_VALUE)
		);
		lp.setLayout(gl_lp);
		
		LernBar.setBounds(10, 3, 660, 15);
		add(LernBar);
		
		lNameLern.setBounds(10, 20, 657, 14);
		add(lNameLern);
		lNameLern.setText(s1);

	}

}
