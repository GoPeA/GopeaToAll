package game;

import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DopLerningSC extends JPanel implements Serializable {
	static final long serialVersionUID=7L;
	DopLerning dl=new DopLerning();
	JScrollPane SCDLer = new JScrollPane();
	public DopLerningSC() {
		setLayout(null);
		
		
		SCDLer.setBounds(5, 50, 700, 425);
		add(SCDLer);
		
	
		SCDLer.setViewportView(dl);

	}

}
