package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PlanetMenu extends JDialog {

 JPanel contentPanel = new JPanel();
	JPanel buttonPane = new JPanel();
	JButton bOk = new JButton("OK");
	JButton bCancel = new JButton("Cancel");
	MenuOfPlanet mop= new MenuOfPlanet();
	eHandler eh= new eHandler();
	int ptca;
	public int countryArm;
	public int ytoArm;
	public int xtoArm;


	/**
	 * Create the dialog.
	 */
	public PlanetMenu() {
		getContentPane().setLayout(null);
		setBounds(0,0,450,600);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 450, 600);
		
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		mop.setBounds(0, 0, 450, 600);
		contentPanel.add(mop);
		
			
		
		mop.bCA.addActionListener(eh);
	}
	public class eHandler implements ActionListener{

	
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mop.bCA){
			ptca=1;
			
		}else{ptca=0;}
			
		}
		
	}

}
