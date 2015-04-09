package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Map extends JPanel implements Serializable {
	boolean make = false;
	private static final long serialVersionUID = 2L;
	ArmyMenu am= new ArmyMenu();
	JPanel pan= new JPanel();
	Mouse mouse = new Mouse();
	int swid, shig;
	int clickCountry,clickArmy,clickArmyCountry;
	boolean show;
	int clicX, clicY;
	int plNomer;
	PlanetMenu pm = new PlanetMenu();
	// String armname;
	MenuOfPlanet mop = new MenuOfPlanet();
	// int armx;
	// int army;
	// int countryarm=1;
	// int kolarm;
	// int difarm;
	Mouse1 mouse1 = new Mouse1();
	int px, py;
	int dar;
	int n = 1;
	int ypol, xpol;
	boolean timer;
	Dimension sSize;
	int ptca;
	Planet pl[] = new Planet[111];

	Army maparm[][] = new Army[100][175000];
	Pl1 Pl1 = new Pl1();
	Pl2 Pl2 = new Pl2();

	public Map() {
		setBackground(Color.WHITE);
		setLayout(null);
		sSize = Toolkit.getDefaultToolkit().getScreenSize();
		swid = sSize.width;
		shig = sSize.height;
		addMouseListener(mouse);
		sSize = Toolkit.getDefaultToolkit().getScreenSize();
		swid = sSize.width;
		shig = sSize.height;
		movePlan();
		plMake();
		addMouseMotionListener(mouse1);
	}

	public void plMake() {
		pl[1] = new Planet(0, 0, 50, "Земля", 1, n);
		pl[2] = new Planet(100, 0, 50, "Марс", 0, n);
		pl[3] = new Planet(250, 85, 50, "XT56", 0, n);
		pl[4] = new Planet(135, 90, 50, "M89ty", 0, n);
		pl[5] = new Planet(501, 20, 40, "K87M8", 0, n);
		pl[6] = new Planet(800, 500, 60, "Юпитер", 0, n);
		pl[7] = new Planet(126, 325, 50, "Венера", 0, n);
		pl[8] = new Planet(714, 45, 40, "Сатурн", 0, n);
		pl[9] = new Planet(954, 845, 50, "Нептун", 0, n);
		pl[10] = new Planet(80, 950, 50, "Плутон", 0, n);
	}



	public void createArmy() {
		if(pm.ptca==1){
			armx=500;
			ary=100;
			countryarm=1;
			maparm[countryarm][armNomer] = new Army( armx,ary,armdiferent,
					armkolvo, armname, countryarm, armNomer);
			pm.ptca=0;
		}
		System.out.println(pm.ptca);
	}

	public void ArmyForMap() {

		
		// if(px1!=px||py1!=py){
		
		removeAll();
		plShow();
		for (countryarm = 1; countryarm <= 2; countryarm++) {
			if (maparm[countryarm][armNomer] != null) {

				maparm[countryarm][armNomer].setBounds(
						maparm[countryarm][armNomer].x + px,
						maparm[countryarm][armNomer].y + py, 45, 30);
				add(maparm[countryarm][armNomer]);
			}
		}
		
		repaint();

	}

	int armx;
	int ary;
	int armkolvo;
	String armname;
	int countryarm;
	int armNomer;
	int armdiferent;

	public synchronized void movePlan() {

		dar = 6 / n;

		if (dar < 1) {
			dar = 1;
		}
		if (ypol <= 20) {
			py = py + dar;
		}
		if (xpol <= 20) {
			px = px + dar;
		}
		if (ypol >= shig - 100  ) {
			py = py - dar;
		}
		if (xpol >= swid - 20 ) {
			px = px - dar;
		}

	}

	public synchronized void plShow() {
		for (plNomer = 1; plNomer < 111; plNomer++) {
			if (pl[plNomer] != null) {
				pl[plNomer].px = px;
				pl[plNomer].py = py;
				pl[plNomer].setBounds(0, 0, 15000 / n, 15000 / n);
				add(pl[plNomer]);
			}
		}
		///pan.setBounds(0, 0, 1280, 50);
		//pan.setBackground(Color.black); Примерно таким способом можно написать меню;
		//add(pan);
	}

	public class Mouse implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			
			for (plNomer = 1; plNomer < 111; plNomer++) {
				if (pl[plNomer] != null) {
					if ((e.getX() >= px + pl[plNomer].x & e.getX() <= px
							+ pl[plNomer].x + pl[plNomer].rad)
							& (e.getY() >= py + pl[plNomer].y & e.getY() <= py
									+ pl[plNomer].y + pl[plNomer].rad)) {
						clickCountry=plNomer;
						System.out.println(clickCountry);
						pm.setBounds(0, 0,460, 610);
						pm.setTitle(pl[plNomer].name);
						pm.setVisible(true);

					}
				}
			}
			
			
			for (countryarm = 1; countryarm <= 2; countryarm++) {
				
				
				if (maparm[countryarm][armNomer] != null) {
					
					if ((e.getX() >= maparm[countryarm][armNomer].x + px & e
							.getX() <= maparm[countryarm][armNomer].x + px + 45)
							& (e.getY() >= maparm[countryarm][armNomer].y + py & e
									.getY() <= maparm[countryarm][armNomer].y
									+ py + 30)) {
						am.setBounds(0, 0, 310, 510);
						am.setVisible(true);
						clickArmy=maparm[countryarm][armNomer].armNomer;
						clickArmyCountry=maparm[countryarm][armNomer].countryArm;
						
						System.out.println("Выбрана армия страны номер "
								+ maparm[countryarm][armNomer].countryArm);
					}
					maparm[countryarm][armNomer].x=e.getX()-px; // Способ перемещения армий
					maparm[countryarm][armNomer].y=e.getY()-py;
					ArmyForMap();
				}
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

	}

	public class Mouse1 implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent arg0) {

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			xpol = e.getX();
			ypol = e.getY();
			if (isFocusable() == true) {
				if (xpol <= 30 || xpol >= swid - 30) {
					timer = true;
				}
				if (ypol <= 30 || ypol >= shig - 30) {
					timer = true;
				}
			}
		}

	}

	public class Pl1 implements Runnable {

		public void run() {
			ArmyForMap();

		}

	}

	public class Pl2 implements Runnable {

		public void run() {
			plShow();

		}

	}

}
