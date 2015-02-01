package game;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Polet extends JPanel {

	JButton bPoletMMKK = new JButton("\u0423\u043B\u0435\u0442\u0435\u0442\u044C \u043D\u0430 \u041C\u043D\u043E\u0433\u043E\u0440\u0430\u0437\u043E\u0432\u043E\u043C \u041C\u0435\u0436\u0433\u0430\u043B\u0430\u043A\u0442\u0438\u0447\u0435\u0441\u043A\u043E\u043C \u041A\u041A");
	JButton bPOletTelep = new JButton("\u041F\u0435\u0440\u0435\u043C\u0435\u0441\u0442\u0438\u0442\u044C\u0441\u044F \u043F\u0440\u0438 \u043F\u043E\u043C\u043E\u0449\u0438 \u0442\u0435\u043B\u0435\u043F\u043E\u0440\u0442\u0430");
	HelpA ha= new HelpA();
	JLabel lHelp = new JLabel("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
	public Polet() {
		setLayout(null);
		
		
		bPoletMMKK.setEnabled(false);
		bPoletMMKK.setToolTipText("\u041A\u0443\u043F\u0438\u0442\u0435 \u041C\u043D\u043E\u0433\u043E\u0440\u0430\u0437\u043E\u0432\u044B\u0439 \u041C\u0435\u0436\u0433\u0430\u043B\u0430\u043A\u0442\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u041A\u041A. \u0428\u0430\u043D\u0441 \u0443\u0441\u043F\u0435\u0445\u0430 \u043F\u043E\u043B\u0435\u0442\u0430 30%");
		bPoletMMKK.setBounds(10, 66, 650, 48);
		add(bPoletMMKK);
		
		
		bPOletTelep.setEnabled(false);
		bPOletTelep.setToolTipText("\u041A\u0443\u043F\u0438\u0442\u0435 \u0442\u0435\u043B\u0435\u043F\u043E\u0440\u0442. \u0428\u0430\u043D\u0441 \u0443\u0441\u043F\u0435\u0445\u0430 \u043F\u043E\u043B\u0435\u0442\u0430 99%");
		bPOletTelep.setBounds(10, 125, 650, 48);
		add(bPOletTelep);
		
		JLabel label = new JLabel("\u041F\u043E\u043B\u0435\u0442 \u043D\u0430 \u0440\u043E\u0434\u0438\u043D\u0443");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(56, 32, 527, 23);
		add(label);
		
		
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setBounds(588, 40, 53, 15);
		add(lHelp);
		lHelp.addMouseListener(ha);

	}
	public class HelpA implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null,"Здесь вы можете улететь на родину,\n"+
													"для того чтобы выйграть игру.");
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
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
