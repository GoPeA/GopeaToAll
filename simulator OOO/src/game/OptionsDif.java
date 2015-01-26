package game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionsDif extends JPanel implements Serializable{
	static final long serialVersionUID=20L;
	JButton bEasy = new JButton("\u041B\u0435\u0433\u043A\u043E");
	JButton bNormal = new JButton("\u041D\u043E\u0440\u043C\u0430\u043B\u044C\u043D\u043E");
	JButton bHard = new JButton("\u0421\u043B\u043E\u0436\u043D\u043E");
	JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	int dificult;
	eHandler eh=new eHandler();
	public OptionsDif() {
		setLayout(null);
		
		
		bEasy.setFont(new Font("Tahoma", Font.BOLD, 20));
		bEasy.setEnabled(true);
		bEasy.setBounds(188, 55, 429, 57);
		add(bEasy);
		
		
		bNormal.setFont(new Font("Tahoma", Font.BOLD, 20));
		bNormal.setBounds(188, 123, 429, 57);
		add(bNormal);
		
		
		bHard.setFont(new Font("Tahoma", Font.BOLD, 20));
		bHard.setBounds(188, 191, 429, 57);
		add(bHard);
		bBack.setBounds(10, 565, 89, 23);
		
		add(bBack);

	}
	public class eHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}
