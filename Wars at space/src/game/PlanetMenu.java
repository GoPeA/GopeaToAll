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
	public static void main(String[] args) {
		try {
			PlanetMenu dialog = new PlanetMenu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PlanetMenu() {
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 261);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		mop.setBounds(0, 0, 450, 300);
		contentPanel.add(mop);
		
			
		
		mop.bCA.addActionListener(eh);
	}
	public class eHandler implements ActionListener{

	
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mop.bCA){
			ptca=mop.BoxPlanet.getSelectedIndex()+1;
			
		}else{ptca=0;}
			
		}
		
	}

}
