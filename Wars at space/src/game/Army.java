package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Army extends JLabel implements Serializable {
	
	private static final long serialVersionUID = 4L;
	int diferent,kolvo,x,y,wid,hig,spead;
	int countryArm;
	int px,py;
	String name,img;
	int armNomer;
	int xtogo;
	int ytogo;
	int clickX,clickY;
	
	public Army(int x,int y,int diferent,int kolvo,String name,int countryArm,int armNomer) {
		//setLayout(null);
		this.x=x;
		this.y=y;
		this.diferent=diferent;
		this.kolvo=kolvo;
		this.armNomer=armNomer;
	this.name=name;
		this.countryArm=countryArm;
		//if(countryArm==1){
			img="res/армия.png";
		//}
			
			setIcon(new ImageIcon(img));
			setBounds(x,y,45,30);
repaint();
	}
	

}
