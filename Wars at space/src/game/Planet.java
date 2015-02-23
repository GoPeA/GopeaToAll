package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JPanel;

public class Planet extends JPanel implements Serializable  {

	private static final long serialVersionUID = 6L;
	int n;
	int x,y,rad,px,py;
	Color color;
	//double
	int country;
	String name;
	boolean click;
	int ypol, xpol;
	
	public Planet (int x,int y,int rad,Color color,String name,int country,int n){
		
		this.x=Math.round(x/n);
		this.color=color;
		this.y=Math.round(y/n);
		this.rad=Math.round(rad/n);
		//this.hig=hig;
		this.name=name;
		this.country=country;
		setLayout(null);
		//addMouseListener(new Mouse());
	
	}

	public void paint(Graphics g){
		
		g=(Graphics2D) g;
		g.setColor(color);
		g.fillOval(x, y,rad,rad);
		repaint();
		
	}
	public class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if((e.getX()>=x & e.getX()<=x+rad)&(e.getY()>=y&e.getY()<=y+rad)){
				click=true;
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
