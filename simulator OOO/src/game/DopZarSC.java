package game;

import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DopZarSC extends JPanel implements Serializable {
	static final long serialVersionUID=9L;
	DopZar dz=new DopZar();
	JScrollPane ZarSC = new JScrollPane();
	public DopZarSC() {
		setLayout(null);
		
		
		ZarSC.setBounds(5, 50, 700, 425);
		add(ZarSC);
		
		
		ZarSC.setViewportView(dz);

	}
}
