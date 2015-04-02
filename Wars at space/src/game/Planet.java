package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
	JLabel tit = new JLabel();
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
		
		tit.setText(name);
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setBounds(x, y+y/2,45, 15);
		add(tit);
		
	
	}

	public void paint(Graphics g){
		g=(Graphics2D) g;
		
		
		
		g.setColor(color);
		g.fillOval(x+px, y+py,rad,rad);
		
		repaint();
		
	}
}
