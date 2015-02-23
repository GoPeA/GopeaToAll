package game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JPanel;


public class Map extends JPanel implements Serializable {

	private static final long serialVersionUID = 2L;
	Mouse mouse=new Mouse();
	 int px,py;
	 int dar;
	 int n=1;
	 int ypol,xpol;
	 boolean timer;
	
	Planet p1= new Planet(50,25,100,Color.GREEN,"mars",1,n);
	Planet p2 =new Planet(200,200,64,Color.DARK_GRAY,"",2,n);
	Planet p3 =new Planet(500,200,70,Color.DARK_GRAY,"",3,n);
	Planet p4 =new Planet(365,50,30,Color.DARK_GRAY,"",4,n);
	Planet p5 =new Planet(280,450,64,Color.DARK_GRAY,"",5,n);
	Planet p6 =new Planet(600,300,125,Color.DARK_GRAY,"",6,n);
	Planet p7 =new Planet(800,200,125,Color.DARK_GRAY,"",7,n);
	Planet p8 =new Planet(750,340,125,Color.DARK_GRAY,"",8,n);
	Planet p9 =new Planet(952,452,125,Color.DARK_GRAY,"",9,n);
	Planet p10 =new Planet(640,800,125,Color.DARK_GRAY,"",10,n);
	Planet p11 =new Planet(500,830,125,Color.DARK_GRAY,"",11,n);
	
	
	public Map() {
			
		addMouseListener(mouse);
			
			n=2;
		
		Draw();
	
	}

	public void Draw(){
		setLayout(null);
		//pan.setLayout(null);
		p1.setBounds(px, py, 10000*n,10000*n);
		p2.setBounds(px, py, 10000*n,10000*n);
		p3.setBounds(px, py, 10000*n,10000*n);
		p4.setBounds(px, py, 10000*n,10000*n);
		p5.setBounds(px, py, 10000*n,10000*n);
		p6.setBounds(px, py, 10000*n,10000*n);
		p7.setBounds(px, py, 10000*n,10000*n);
		p8.setBounds(px, py, 10000*n,10000*n);
		p9.setBounds(px, py, 10000*n,10000*n);
		p10.setBounds(px, py, 10000*n,10000*n);
		p11.setBounds(px, py, 10000*n,10000*n);
		
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		add(p10);
		add(p11);
		p2.setLayout(null);
	}
	public void movePlan(){
		dar=5/n;
		if(dar<1){
			dar=1;
		}
		if(ypol<=5){
			py=py+dar;
		}
		if(xpol<=10){
			px=px+dar;
		}
	}

	public class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		if((e.getX()>=px+p1.x & e.getX()<=px+p1.x+p1.rad)&(e.getY()>=py+p1.y & e.getY()<=py+p1.y+p1.rad)){
		System.out.println(p1.country);
		}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			ypol=e.getY();
			xpol=e.getX();
			
		timer=false;
			
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			ypol=e.getY();
			xpol=e.getX();
			timer=true;
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			
		}
		
	}
}
