package game;

import java.io.Serializable;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HauseSC extends JPanel implements Serializable {
	static final long serialVersionUID = 11L;
	Hause hause = new Hause();
	JScrollPane scPan = new JScrollPane();
	JLabel lHauseTrat = new JLabel(
			"\u0417\u0430\u0442\u0440\u0430\u0442\u044B \u0437\u0430 \u0436\u0438\u043B\u044C\u0435 (\u0433\u043E\u0434) = ");
	 JLabel lHelp = new JLabel(
			"\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
HelpA ha= new HelpA();
	public HauseSC() {
		setLayout(null);

		scPan.setBounds(3, 50, 700, 425);
		add(scPan);

		scPan.setViewportView(hause);

		lHauseTrat.setBounds(10, 18, 482, 21);
		add(lHauseTrat);
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setBounds(616, 18, 53, 15);

		add(lHelp);
		lHelp.addMouseListener(ha);
	}

	public class HelpA implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null,"Здесь вы можете купить жилье.\n"+
													"Жильё понижает затраты еды.");
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
