package game;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class HauseSC extends JPanel {
	Hause hause=new Hause();
	JScrollPane scPan = new JScrollPane();
	JLabel lHauseTrat = new JLabel("\u0417\u0430\u0442\u0440\u0430\u0442\u044B \u0437\u0430 \u0436\u0438\u043B\u044C\u0435 (\u0433\u043E\u0434) = ");
	public HauseSC() {
		setLayout(null);
		
		
		scPan.setBounds(3, 50, 700, 425);
		add(scPan);
		
		
		scPan.setViewportView(hause);
		
		
		lHauseTrat.setBounds(73, 11, 482, 21);
		add(lHauseTrat);

	}

}
