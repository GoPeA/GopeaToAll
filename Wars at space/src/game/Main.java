package game;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JFrame implements ActionListener {
	Map map = new Map();
	Game game= new Game();
	int px,py;
	Timer time = new Timer(1, this);

	JPanel cP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Main frame = new Main();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setSize(800, 640);
					// frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Planets wars");
					frame.setVisible(true);
					//frame.potoc();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void potoc() {
		Thread t1=new Thread(map.Pl1);
		Thread t2=new Thread(map.Pl2);
		//Thread t3=new Thread(map.Pl3);
		//Thread t4=new Thread(map.Pl4);
		//Thread t5=new Thread(map.Pl5);
		//Thread t6=new Thread(map.Pl6);
		//Thread t7=new Thread(map.Pl7);
		//Thread t8=new Thread(map.Pl8);
		///Thread t9=new Thread(map.Pl9);
		//Thread t10=new Thread(map.Pl10);
		//Thread t11=new Thread(map.Pl11);
		t1.start();
		t2.start();
	try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
		}
		
		//t3.start();
		//t4.start();
		//t5.start();
		//t6.start();
		//t7.start();
		//t8.start();
		///t9.start();
		//t10.start();
		//t11.start();
	repaint();
	}

	public Main() {
		time.start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// map.shig = this.getSize().height;
		// map.swid=this.getSize().width;
		cP = new JPanel();
		setContentPane(cP);
		cP.setLayout(new CardLayout(0, 0));

		planetDraw();
	}

	public void planetDraw() {
		time.start();
		cP.add(map);

		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		potoc();
		if (map.timer == true) {
			map.movePlan();
		}
		game.showMap();
		map.plShow();
		map.createArmy();
		map.ArmyForMap();
		repaint();
		//map.ArmyPol();
		
		
		repaint();

	}

}
