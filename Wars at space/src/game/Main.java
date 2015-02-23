package game;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Main extends JFrame implements ActionListener {
	Map map = new Map();
	Timer time=new Timer(1,this);
	
	 JPanel cP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setSize(800,640);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Planets wars");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
		time.start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cP = new JPanel();
		setContentPane(cP);
		cP.setLayout(new CardLayout(0, 0));
		
	
		planetDraw();
	}
	public void planetDraw(){
		time.start();
		cP.add(map);
		
		repaint();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		map.Draw();
		map.clickTest();
		if(map.timer==true){
		map.movePlan();
		}
		
	}

}
