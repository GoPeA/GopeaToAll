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
	int x,y,rad,px,py,px1,py1;
	Color color;
	//double
	int country;
	String name;
	boolean click;
	int ypol, xpol;
	
	public Planet (int x,int y,int rad,String name,int country,int n){
		this.setBackground(Color.white);
		this.x=Math.round(x/n);
		this.y=Math.round(y/n);
		this.rad=Math.round(rad/n);
		this.country=country;
		color=Color.DARK_GRAY;
		//addMouseListener(new Mouse());
		if(country==1){
			color=Color.GREEN;
		}
		
		this.name=name;
		
		setLayout(null);
		
	
	}

	public void paint(Graphics g){
		g=(Graphics2D) g;
		
		
		g.clearRect(x+px-2, y+py-2,rad+4,rad+4);
		g.setColor(color);
		g.fillOval(x+px-2, y+py-2,rad+4,rad+4);
		if(px1<px){
			px1=px;
			py1=py;
		g.clearRect(x+px1-5, y+py1-5,5,rad+10);
		}
		if(px1>px){
			px1=px;
			py1=py;
		g.clearRect(x+px1+rad, y+py1-5,10,rad+10);
		}
		if(py1<py){
			px1=px;
			py1=py;
		g.clearRect(x+px1-5, y+py1-5,rad+10,5);
		}
		if(py1>py){
			px1=px;
			py1=py;
		g.clearRect(x+px1-5, y+py1+rad,rad+10,5);
		}
		if(px1>px&py1>py){
			px1=px;
			py1=py;
		g.clearRect(x+px1-5, y+py1-5,rad+10,5);
		}
		repaint();
		
	}


}
