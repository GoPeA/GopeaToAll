package game;

import java.io.Serializable;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InvescSC extends JPanel implements Serializable {
	static final long serialVersionUID=15L;
	Invest inv= new Invest();
	HelpA ha=new HelpA();
	Banc ban=new Banc();
	PammInvest pi=new PammInvest();
	JScrollPane csInvpan = new JScrollPane();
	JLabel lHelp = new JLabel("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
	public InvescSC() {
		setLayout(null);
		
	
		csInvpan.setBounds(5, 50, 700, 425);
		add(csInvpan);
		
	
		csInvpan.setViewportView(inv);
		
		JLabel label = new JLabel("\u0418\u043D\u0432\u0435\u0441\u0442\u0438\u0446\u0438\u0438");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(27, 16, 560, 23);
		add(label);
		
	
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setBounds(638, 24, 53, 15);
		add(lHelp);
		lHelp.addMouseListener(ha);
	}
	public class HelpA implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null, "Здесь Вы можете инвестировать\n"+
													" свои средства в Банк или ПАММ\n"+
													"счета, а также можете взять кредит\n"+
													"в банке под 20% годовых.");
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
