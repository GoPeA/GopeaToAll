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
		Thread t1=new Thread();
	
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
		//potoc();
		if (map.timer == true) {
			map.movePlan();
		}
		if(px!=map.px||py!=map.py){
			px=map.px;
			py=map.py;
			map.px_py();
			map.Draw();
		}
		repaint();

	}

}
