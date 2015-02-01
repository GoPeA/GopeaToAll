package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

public class BisnessSC extends JPanel implements Serializable {
	static final long serialVersionUID=5L;
	HelpA ha=new HelpA();
	Shop shop=new Shop();
	JScrollPane spBisness = new JScrollPane();
	Bisness bisn=new Bisness();
	Larek lar= new Larek();
	Hipermarket hm=new Hipermarket();
	MySite mSite=new MySite();
	JLabel lHelp = new JLabel("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
	private final JLabel lblNewLabel = new JLabel("\u0411\u0438\u0437\u043D\u0435\u0441\u0441");
	public BisnessSC() {
		setLayout(null);
		
		
		spBisness.setBounds(5, 50, 693, 425);
		add(spBisness);
		spBisness.setViewportView(bisn);
		
	
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setHorizontalAlignment(SwingConstants.CENTER);
		lHelp.setBounds(619, 25, 56, 15);
		add(lHelp);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 16, 560, 23);
		
		add(lblNewLabel);
		lHelp.addMouseListener(ha);
	}
	public class HelpA implements MouseListener{

		
		public void mouseClicked(MouseEvent e ) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null, "Тут Вы можете откравать свой бизнесс. \n"+
													"Сначала вам нужно открыть компанию, а \n"
													+ "затем Вы можете улучшать бизнесс.");
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
