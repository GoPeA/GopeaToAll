package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Army extends JPanel implements Serializable {
	
	private static final long serialVersionUID = 4L;
	int diferent,kolvo,x,y,wid,hig,spead;
	int countryArm;
	int px,py;
	String name;
	int armNomer;
	Image img;
	public Army(int x,int y,int diferent,int kolvo,String name,int countryArm,int armNomer) {
		setLayout(null);
		this.x=x;
		this.y=y;
		this.diferent=diferent;
		this.kolvo=kolvo;
		this.armNomer=armNomer;
		this.name=name;
		this.countryArm=countryArm;
		//if(countryArm==1){
			img=new ImageIcon("res/армия.png").getImage();
		//}
repaint();
	}
	public void paint (Graphics g){
		g=(Graphics2D)g;
		g.drawImage(img, x+px, y+py, null);
		repaint();
	}

}
