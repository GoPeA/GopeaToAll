package game;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class InvescSC extends JPanel {

	Invest inv= new Invest();
	Banc ban=new Banc();
	PammInvest pi=new PammInvest();
	JScrollPane csInvpan = new JScrollPane();
	public InvescSC() {
		setLayout(null);
		
	
		csInvpan.setBounds(5, 50, 700, 425);
		add(csInvpan);
		
	
		csInvpan.setViewportView(inv);

	}
}
