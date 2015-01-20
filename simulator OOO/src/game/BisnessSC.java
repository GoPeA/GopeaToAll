package game;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BisnessSC extends JPanel {
	Shop shop=new Shop();
	JScrollPane spBisness = new JScrollPane();
	Bisness bisn=new Bisness();
	Larek lar= new Larek();
	Hipermarket hm=new Hipermarket();
	MySite mSite=new MySite();
	public BisnessSC() {
		setLayout(null);
		
		
		spBisness.setBounds(5, 50, 693, 425);
		add(spBisness);
		spBisness.setViewportView(bisn);

	}
}
