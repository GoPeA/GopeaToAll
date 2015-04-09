package game;

import javax.swing.JPanel;
import java.awt.Color;

public class Game extends JPanel {
	Map map = new Map();

	public Game() {
		setLayout(null);
		map.setBackground(Color.BLUE);

		showMap();
	}
	public void showMap(){
		map.setBounds(0, 0,15000, 15000);
		map.plMake();
		map.plShow();
		map.movePlan();
		map.createArmy();
		map.ArmyForMap();
			add(map);
	}

}
