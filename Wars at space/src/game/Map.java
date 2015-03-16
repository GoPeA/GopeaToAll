package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;

import javax.swing.JPanel;

public class Map extends JPanel implements Serializable {
	boolean make=false;
	private static final long serialVersionUID = 2L;
	Mouse mouse = new Mouse();
	int swid, shig;
	String armname;
	int armx;
	int army;
	int countryarm=1;
	int kolarm;
	int difarm;
	Mouse1 mouse1 = new Mouse1();
	int px, py;
	int dar;
	int n = 1;
	int ypol, xpol;
	boolean timer;
	Dimension sSize;
	int armNomer;
	Planet p1 = new Planet(50, 25, 100, "mars", 1, n);
	Planet p2 = new Planet(200, 200, 64, "", 2, n);
	Planet p3 = new Planet(500, 200, 70, "", 3, n);
	Planet p4 = new Planet(365, 50, 30, "", 4, n);
	Planet p5 = new Planet(280, 450, 64, "", 5, n);
	Planet p6 = new Planet(600, 300, 125, "", 6, n);
	Planet p7 = new Planet(800, 200, 125, "", 7, n);
	Planet p8 = new Planet(750, 340, 125, "", 8, n);
	Planet p9 = new Planet(952, 452, 125, "", 9, n);
	Planet p10 = new Planet(640, 800, 125, "", 10, n);
	Planet p11 = new Planet(500, 830, 125, "", 11, n);
	
	Army maparm[][]=new Army[10][17500000];
	Pl1 Pl1= new Pl1();
	Pl2 Pl2= new Pl2();
	Pl3 Pl3= new Pl3();
	Pl4 Pl4= new Pl4();
	Pl5 Pl5= new Pl5();
	Pl6 Pl6= new Pl6();
	Pl7 Pl7= new Pl7();
	Pl8 Pl8= new Pl8();
	Pl9 Pl9= new Pl9();
	Pl10 Pl10= new Pl10();
	Pl11 Pl11= new Pl11();
	public Map() {
		setBackground(Color.WHITE);
		sSize = Toolkit.getDefaultToolkit().getScreenSize();
		swid = sSize.width;
		shig = sSize.height;
		addMouseListener(mouse);
		sSize = Toolkit.getDefaultToolkit().getScreenSize();
		swid = sSize.width;
		shig = sSize.height;
		movePlan();
		
		addMouseMotionListener(mouse1);
	}

	public void ArmyForMap(){
		for(armNomer=0;armNomer<3;armNomer++){
		maparm[countryarm][armNomer]=new Army(armNomer*100,armNomer*100,1,5000,"",countryarm,armNomer);
		maparm[countryarm][armNomer].setBounds(0, 0, 15000, 15000);
		add(maparm[countryarm][armNomer]);
		repaint();
		}
		make=true;
		
	}
	public void ArmyPol(){
		for(armNomer=0;armNomer<3;armNomer++){
			maparm[countryarm][armNomer].px=px;
			maparm[countryarm][armNomer].py=py;
			repaint();
		}
	}


	
	public void movePlan() {
		
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
		if (ypol >= shig - 100 & py > 0) {
			py = py - dar;
		}
		if (xpol >= swid - 20 & px > 0) {
			px = px - dar;
		}

	}
	

	public  synchronized void pl1() {
	
		p1.px = px;
		p1.py = py;
		p1.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p1);

		// repaint();
	}
	public synchronized void pl2(){
		p2.px = px;
		p2.py = py;
		p2.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p2);
	}
	public synchronized void pl3(){
		p3.px = px;
		p3.py = py;
		p3.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p3);
	}
	public synchronized void pl4(){
		p4.px = px;
		p4.py = py;
		p4.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p4);
	}
	public synchronized void pl5(){
		p5.px = px;
		p5.py = py;
		p5.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p5);
	}
	public synchronized void pl6(){
		p6.px = px;
		p6.py = py;
		p6.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p6);
	}
	public synchronized void pl7(){
		p7.px = px;
		p7.py = py;
		p7.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p7);
	}
	public synchronized void pl8(){
		p8.px = px;
		p8.py = py;
		p8.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p8);
	}
	public synchronized void pl9(){
		p9.px = px;
		p9.py = py;
		p9.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p9);
	}
	public synchronized void pl10(){
		p10.px = px;
		p10.py = py;
		p10.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p2);
	}
	public synchronized void pl11(){
		p11.px = px;
		p11.py = py;
		p11.setBounds(0, 0, 15000 / n, 15000 / n);
		add(p11);
	}
	//public void pl12(){
		///p2.px = px;
		//p2.py = py;
		//p2.setBounds(0, 0, 15000 / n, 15000 / n);
		//add(p2);
	//}
	public void army1(){
		
	}


	public class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((e.getX() >= px + p1.x & e.getX() <= px + p1.x + p1.rad)
					& (e.getY() >= py + p1.y & e.getY() <= py + p1.y + p1.rad)) {
				System.out.println(p1.country);
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
	public class Pl1 implements Runnable{

		@Override
		public void run() {
			pl1();
			
		}
		
	}
	public class Pl2 implements Runnable{

		@Override
		public void run() {
			pl2();
			
		}
		
	}
	public class Pl3 implements Runnable{

		@Override
		public void run() {
			pl3();
			
		}
		
	}
	public class Pl4 implements Runnable{

		@Override
		public void run() {
			pl4();
			
		}
		
	}
	public class Pl5 implements Runnable{

		@Override
		public void run() {
			pl5();
			
		}
		
	}
	public class Pl6 implements Runnable{

		@Override
		public void run() {
			pl6();
			
		}
		
	}
	public class Pl7 implements Runnable{

		@Override
		public void run() {
			pl7();
			
		}
		
	}
	public class Pl8 implements Runnable{

		@Override
		public void run() {
			pl8();
			
		}
		
	}
	public class Pl9 implements Runnable{

		@Override
		public void run() {
			pl9();
			
		}
		
	}
	public class Pl10 implements Runnable{

		@Override
		public void run() {
			pl10();
			
		}
		
	}
	public class Pl11 implements Runnable{

		@Override
		public void run() {
			pl11();
			
		}
		
	}
	
	
}
