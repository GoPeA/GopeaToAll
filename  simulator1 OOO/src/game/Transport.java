package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Transport extends JPanel {
	JButton bTrans1 = new JButton("\u0421\u0430\u043C\u043E\u043A\u0430\u0442 2'500\u0420 0\u0420/\u0433\u043E\u0434  0/ 1825 \u0434\u043D\u0435\u0439 (5 \u043B\u0435\u0442)");
	JButton bTrans2 = new JButton("\u0412\u0435\u043B\u043E\u0441\u0438\u043F\u0435\u0434 7'500\u0420 500\u0420/\u0433\u043E\u0434 0/1825 \u0434\u043D\u0435\u0439 (5 \u043B\u0435\u0442)");
	JButton bTrans3 = new JButton("\u041C\u043E\u043F\u0435\u0434 15'000\u0420 4'500\u0420/\u0433\u043E\u0434 0/ 1825 \u0434\u043D\u0435\u0439 (5 \u043B\u0435\u0442)");
	JButton bTrans4 = new JButton("\u0421\u043A\u0443\u0442\u0435\u0440 35'000\u0420 7'500\u0420/\u0433\u043E\u0434 0/ 1825 \u0434\u043D\u0435\u0439 (5 \u043B\u0435\u0442) ");
	JButton bTrans5 = new JButton("\u041C\u043E\u0442\u043E\u0446\u0438\u043A\u043B 70'000\u0420 12'500\u0420/\u0433\u043E\u0434 0/ 1825 \u0434\u043D\u0435\u0439(5 \u043B\u0435\u0442)");
	JButton bTrans6 = new JButton("\u0412\u0410\u0417 2114 150'000\u0420 15'000\u0420/\u0433\u043E\u0434  0/ 2555 \u0434\u043D\u0435\u0439(7 \u043B\u0435\u0442)  + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans7 = new JButton("Lada 110 200'000\u0420 20'000\u0420/\u0433\u043E\u0434 0/ 2737\u0434\u043D\u0435\u0439 (7,5 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D ");
	JButton bTrans8 = new JButton("Lada Kalina 350'000\u0420 20'500\u0420/\u0433\u043E\u0434  0/ 2737\u0434\u043D\u0435\u0439(7,5 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D ");
	JButton bTrans9 = new JButton("Daewoo Nexia 420'000\u0420 22'000\u0420/\u0433\u043E\u0434 0/ 2737\u0434\u043D\u0435\u0439 (7,5 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D ");
	JButton bTrans10 = new JButton("Lada Largus 570'000\u0420 25'000\u0420/\u0433\u043E\u0434 0/ 2737\u0434\u043D\u0435\u0439(7,5 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans11 = new JButton("Renault Logan 650'000\u0420 25'000\u0420/\u0433\u043E\u0434 0/ 2920\u0434\u043D\u0435\u0439 (8 \u043B\u0435\u0442) +\u0431\u0435\u043D\u0437\u0438\u043D ");
	JButton bTrans12 = new JButton("\u0423\u0410\u0417 \u041F\u0430\u0442\u0440\u0438\u043E\u0442 800'000\u0420 28'000\u0420/\u0433\u043E\u0434 0/2920\u0434\u043D\u0435\u0439(8 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans13 = new JButton("Ford Focus 1'000'000\u0420 35'000P/\u0433\u043E\u0434 0/2920\u0434\u043D\u0435\u0439(8 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans14 = new JButton("Ssang Yong Action 1'500'000P 40'000\u0420/\u0433\u043E\u0434 0/2920\u0434\u043D\u0435\u0439(8 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n");
	JButton bTrans15 = new JButton("Volkswagen Touareg 1'800'000P 50'000\u0420 0/ 3285(9 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans16 = new JButton("Mersedes - Benz 2'500'000P 80'000\u0420/\u0433\u043E\u0434 0/ 3650\u0434\u043D\u0435\u0439 (10 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n\r\n");
	JButton bTrans17 = new JButton("BMW X6 4'000'000P 100'000\u0420/\u0433\u043E\u0434 0/ 3650\u0434\u043D\u0435\u0439(10 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans18 = new JButton("Audi 4'000'000P 100'000\u0420/\u0433\u043E\u0434 0/ 3650\u0434\u043D\u0435\u0439(10 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n");
	JButton bTrans19 = new JButton("Lexus 5'500'000P 200'000\u0420/\u0433\u043E\u0434 0/ 4015\u0434\u043D\u0435\u0439(11\u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n");
	JButton bTrans20 = new JButton("Porshe 7'500'000P 175'000\u0420/\u0433\u043E\u0434 0/ 4015\u0434\u043D\u0435\u0439(11 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n");
	JButton bTrans21 = new JButton("Ferari 12'000'000P 250'000\u0420/\u0433\u043E\u0434 0/ 4015 \u0434\u043D\u0435\u0439(11 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n\r\n");
	JButton bTrans22 = new JButton("Lamnorgini 18\u043C\u043B\u043D \u0420 300'000\u0420/\u0433\u043E\u0434 0/ 4015\u0434\u043D\u0435\u0439(11 \u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D\r\n");
	JButton bTrans23 = new JButton("Bentli 25 \u043C\u043B\u043D \u0420 350'000\u0420/\u0433\u043E\u0434 0/ 4015 \u0434\u043D\u0435\u0439(11\u043B\u0435\u0442) + \u0431\u0435\u043D\u0437\u0438\u043D");
	JButton bTrans24 = new JButton("\u0412\u0435\u0440\u0442\u043E\u043B\u0435\u0442 50 \u043C\u043B\u043D \u0420 2 \u043C\u043B\u043D\u0420/\u0433\u043E\u0434 7300\u0434\u043D\u0435\u0439(20 \u043B\u0435\u0442)\r\n");
	JButton bTrans25 = new JButton("Bugatti 130 \u043C\u043B\u043D \u0420 3\u043C\u043B\u043D \u0420/\u0433\u043E\u0434 5475\u0434\u043D\u0435\u0439(15 \u043B\u0435\u0442)\r\n");
	JButton bTrans26 = new JButton("\u042F\u0445\u0442\u0430 400 \u043C\u043B\u043D \u0420 12\u043C\u043B\u043D \u0420/ \u0433\u043E\u0434 9125\u0434\u043D\u0435\u0439(25 \u043B\u0435\u0442)\r\n");
	JButton bTrans27 = new JButton("\u0421\u0430\u043C\u043E\u043B\u0435\u0442 1,5 \u043C\u043B\u0440\u0434 \u0420 50\u043C\u043B\u043D \u0420/\u0433\u043E\u0434 9125\u0434\u043D\u0435\u0439( 25 \u043B\u0435\u0442)\r\n");
	JButton bTrans28 = new JButton("\u0411\u0443\u0440\u0430\u043D 12 \u043C\u043B\u0440\u0434 \u0420 500 \u043C\u043B\u043D \u0420/\u0433\u043E\u0434 9125 \u0434\u043D\u0435\u0439(25 \u043B\u0435\u0442)");
	JButton bTrans29 = new JButton("\u041C\u043D\u043E\u0433\u043E\u0440\u0430\u0437\u043E\u0432\u044B\u0439 \u041C\u0435\u0436\u0433\u0430\u043B\u0430\u043A\u0442\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u041A\u041A 50 \u043C\u043B\u0440\u0434 \u0420 800\u043C\u043B\u043D\u0420/\u0433\u043E\u0434 \u0431\u0435\u043A\u043E\u043D\u0435\u0441\u0447\u043D\u043E\r\n");
	JButton bTrans30 = new JButton("\u0422\u0435\u043B\u0435\u043F\u043E\u0440\u0442 180 \u043C\u043B\u0440\u0434 \u0420 100\u043C\u043B\u043D \u0420 /\u0433\u043E\u0434 \u0431\u0435\u0441\u043A\u043E\u043D\u0435\u0447\u043D\u043E");
	
	public Transport() {
		bTrans2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bTrans1, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans2, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans3, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans4, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans5, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans6, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans7, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans8, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans9, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans10, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans11, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans12, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans13, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans14, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans15, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans16, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans17, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans18, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans19, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans20, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans21, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans22, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans23, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans24, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans25, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans26, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans27, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans28, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans29, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
						.addComponent(bTrans30, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(bTrans1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans14, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans15, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans16, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans17, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans18, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans19, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans20, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans21, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans22, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans23, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans24, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans25, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans26, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans27, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans28, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans29, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(bTrans30, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);

	}
}
