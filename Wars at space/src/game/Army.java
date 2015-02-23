package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;

import javax.swing.JPanel;

public class Army extends JPanel implements Serializable {
	
	private static final long serialVersionUID = 4L;
	int diferent,kolvo,x,y,wid,hig,spead;
	int countryArm;
	String name;
	
	public Army(int x,int y,int diferent,int kolvo,String name,int countryArm) {
		this.x=x;
		this.y=y;
		this.diferent=diferent;
		this.kolvo=kolvo;
		this.name=name;
		this.countryArm=countryArm;

	}
	public void paint (Graphics g){
		g=(Graphics2D)g;
	}

}
