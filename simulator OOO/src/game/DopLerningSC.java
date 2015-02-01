package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class DopLerningSC extends JPanel implements Serializable {
	static final long serialVersionUID=7L;
	DopLerning dl=new DopLerning();
	JScrollPane SCDLer = new JScrollPane();
	HelpA ha=new HelpA();
	JLabel lHelp = new JLabel("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
	private final JLabel label = new JLabel("\u041A\u0443\u0440\u0441\u044B");
	public DopLerningSC() {
		setLayout(null);
		
		
		SCDLer.setBounds(5, 50, 700, 425);
		add(SCDLer);
		
	
		SCDLer.setViewportView(dl);
		
		
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setBounds(635, 25, 51, 15);
		add(lHelp);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(55, 16, 560, 23);
		
		add(label);
		lHelp.addMouseListener(ha);

	}
	public class HelpA implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null, "Тут вы можете пройти дополнительное обучение,\n"
													+"которое может понадобится Вам для работы.");
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
