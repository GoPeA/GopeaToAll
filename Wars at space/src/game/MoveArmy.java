package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveArmy extends JLabel{
	int x1;
	int y1;
	int x2;
	int y2;

	private static final long serialVersionUID = 1000L;

	public MoveArmy(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}

	//public void paint(Graphics g) {
		//g = (Graphics2D) g;
		//g.setColor(Color.BLACK);

		//g.drawLine(x1, y1, x2, y2);
		//repaint();
	//}
}
