package game;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JLabel;


public class Map extends JPanel implements Serializable {

	private static final long serialVersionUID = 2L;
	Mouse mouse=new Mouse();
	int swid,shig;
	Mouse1 mouse1=new Mouse1();
	 int px,py;
	 int dar;
	 int n=1;
	 int ypol,xpol;
	 boolean timer;
	 Dimension sSize;
	Planet p1= new Planet(50,25,100,"mars",1,n);
	Planet p2 =new Planet(200,200,64,"",2,n);
	Planet p3 =new Planet(500,200,70,"",3,n);
	Planet p4 =new Planet(365,50,30,"",4,n);
	Planet p5 =new Planet(280,450,64,"",5,n);
	Planet p6 =new Planet(600,300,125,"",6,n);
	Planet p7 =new Planet(800,200,125,"",7,n);
	Planet p8 =new Planet(750,340,125,"",8,n);
	Planet p9 =new Planet(952,452,125,"",9,n);
	Planet p10 =new Planet(640,800,125,"",10,n);
	Planet p11 =new Planet(500,830,125,"",11,n);
	
	
	public Map() {
		setBackground(Color.WHITE);
		 sSize = Toolkit.getDefaultToolkit ().getScreenSize();
		 swid=sSize.width;
		 shig=sSize.height;
		addMouseListener(mouse);
		 sSize = Toolkit.getDefaultToolkit ().getScreenSize();
		 swid=sSize.width;
		 shig=sSize.height;
		 movePlan();
		Draw();
	addMouseMotionListener(mouse1);
	}
public void movePlan(){
		
		dar=3/n;
		
		if(dar<1){
			dar=1;
		}
		if(ypol<=20){
			py=py+dar;
		}
		if(xpol<=20){
			px=px+dar;
		}
		if(ypol>=shig-100 & py>0){
			py=py-dar;
		}
		if(xpol>=swid-20 &px>0){
			px=px-dar;
		}
		
	}
public void px_py(){
//p1.paint(getGraphics(),px,py);
	p1.px=px;
	p1.py=py;
	p2.px=px;
	p2.py=py;
	p3.px=px;
	p3.py=py;
	p4.px=px;
	p4.py=py;
	p5.px=px;
	p5.py=py;
	p6.px=px;
	p6.py=py;
	p7.px=px;
	p7.py=py;
	p8.px=px;
	p8.py=py;
	p9.px=px;
	p9.py=py;
	p10.px=px;
	p10.py=py;
	p11.px=px;
	p11.py=py;
	
	
			
	//repaint();
}

	public void Draw(){
		
		setLayout(null);
		
		//pan.setLayout(null);
		p1.setBounds(0, 0, 15000/n,15000/n);
		p2.setBounds(0, 0, 15000/n,15000/n);
		p3.setBounds(0, 0, 15000/n,15000/n);
		p4.setBounds(0, 0, 15000/n,15000/n);
		p5.setBounds(0, 0, 15000/n,15000/n);
		p6.setBounds(0, 0, 15000/n,15000/n);
		p7.setBounds(0, 0, 15000/n,15000/n);
		p8.setBounds(0, 0, 15000/n,15000/n);
		p9.setBounds(0, 0, 15000/n,15000/n);
		p10.setBounds(0, 0, 15000/n,15000/n);
		p11.setBounds(0, 0, 15000/n,15000/n);
		
		
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
	public class Mouse1 implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			xpol=e.getX();
			ypol=e.getY();
			if(isFocusable()==true){
			if(xpol<=30||xpol>=swid-30){
				timer=true;
			}
			if(ypol<=30||ypol>=shig-30){
				timer=true;
			}
			}
		}
		
	}
}
