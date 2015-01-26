package rr;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
	JButton b1 = new JButton("New button");
	JButton btnNewButton_1 = new JButton("New button");
	JButton btnNewButton_2 = new JButton("dfhbdjfbhdbfjdhbvfhdgf");
	EHandler eh= new EHandler();
	String s1;
	
	public Panel() {
		setLayout(null);
		
		
		b1.setBounds(40, 53, 238, 285);
		add(b1);
		
	
		btnNewButton_1.setBounds(136, 448, 89, 23);
		add(btnNewButton_1);
		
		
		btnNewButton_2.setForeground(SystemColor.activeCaption);
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(430, 109, 203, 303);
		add(btnNewButton_2);
		b1.addActionListener(eh);
	}
	public class EHandler implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
				s1="Борис лох\n"+"Ха-Ха";
						b1.setText((9%2)+"");
			}
			
		}
		
	}
	
	
}
