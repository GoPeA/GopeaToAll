package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Bisness extends JPanel {
	Shop shop=new Shop();
	Hipermarket hm=new Hipermarket();
	JButton bBisn1 = new JButton("\u041B\u0430\u0440\u0435\u043A\r\n");
	JButton bBisn2 = new JButton("\u041C\u0430\u0433\u0430\u0437\u0438\u043D");
	JButton bBisn3 = new JButton("\u0413\u0438\u043F\u0435\u0440\u043C\u0430\u0440\u043A\u0435\u0442");
	JButton bBisn4 = new JButton("\u0421\u0432\u043E\u0439 \u0441\u0430\u0439\u0442");
	JButton bBisn5 = new JButton("\u0418\u043D\u0442\u0435\u0440\u043D\u0435\u0442 \u043C\u0430\u0433\u0430\u0437\u0438\u043D\r\n");
	JButton bBisn6 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u043A\u0430\u0444\u0435");
	JButton bBisn7 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u043A\u0438\u043D\u043E\u0442\u0435\u0430\u0442\u0440");
	JButton bBisn8 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0431\u0430\u043D\u043A");
	JButton bBisn9 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C \u0411\u043E\u0443\u043B\u0438\u043D\u0433");
	JButton bBisn10 = new JButton("\u041E\u0441\u043D\u043E\u0432\u0430\u0442\u044C \u0422\u0443\u0440 -\u0424\u0438\u0440\u043C\u0443");
	JButton bBisn11 = new JButton("\u041F\u043E\u0441\u0442\u0440\u043E\u0438\u0442\u044C \u0422\u0420\u041A");
	JButton bBisn12 = new JButton("\u041F\u043E\u0441\u0442\u0440\u043E\u0438\u0442\u044C \u043F\u0430\u0440\u043A \u0440\u0430\u0437\u0432\u043B\u0435\u0447\u0435\u043D\u0438\u0439");
	JButton bBisn13 = new JButton("\u041E\u0441\u043D\u043E\u0432\u0430\u0442\u044C \u0442\u0440\u0430\u043D\u0441\u043F\u043E\u0440\u0442\u043D\u0443\u044E \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044E");
	JButton bBisn14 = new JButton("\u041E\u0441\u043D\u043E\u0432\u0430\u0442\u044C \u0410\u0412\u0438\u0430 \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044E");
	JButton bBisn15 = new JButton("\u041E\u0441\u043D\u043E\u0432\u0430\u0442\u044C \u0424\u0430\u0431\u0440\u0438\u043A\u0443");
	JButton bBisn16 = new JButton("\u041E\u0441\u043D\u043E\u0432\u0430\u0442\u044C \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044E \u043F\u043E \u0440\u0430\u0437\u0440\u0430\u0431\u043E\u0442\u043A\u0435 \u0441\u043E\u0444\u0442\u0430 \u0438 \u0438\u0433\u0440");
	JButton bBisn17 = new JButton("\u041F\u043E\u0441\u0442\u0440\u043E\u0438\u0442\u044C \u0410\u0432\u0442\u043E\u0437\u0430\u0432\u043E\u0434");
	JButton bBisn18 = new JButton("\u0417\u0430\u0432\u043E\u0434 \u043F\u043E \u043F\u0440\u043E\u0438\u0437\u0432\u043E\u0434\u0441\u0442\u0432\u0443 \u0415\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u0438\u043A\u0438");
	JButton bBisn19 = new JButton("\u0410\u0432\u0438\u0430\u0441\u0442\u0440\u043E\u0438\u0442\u0435\u043B\u044C\u043D\u0430\u044F \u041A\u043E\u043C\u043F\u0430\u043D\u0438\u044F");
	JButton bBisn20 = new JButton("\u0421\u0443\u0434\u043E\u0441\u0442\u0440\u043E\u0438\u0442\u0435\u043B\u044C\u043D\u0430\u044F \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044F ( \u0412\u0435\u0440\u0444\u044C)");
	Larek lar= new Larek();
	MySite mSite=new MySite();
	public Bisness() {
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBisn1, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn2, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn3, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn4, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn5, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn6, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn7, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn8, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn9, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn10, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn11, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn12, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn13, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn14, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn15, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn16, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn17, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn18, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn19, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBisn20, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)))
		);
		bBisn5.setEnabled(false);
		bBisn6.setEnabled(false);
		bBisn7.setEnabled(false);
		bBisn8.setEnabled(false);
		bBisn9.setEnabled(false);
		bBisn10.setEnabled(false);
		bBisn11.setEnabled(false);
		bBisn12.setEnabled(false);
		bBisn13.setEnabled(false);
		bBisn14.setEnabled(false);
		bBisn15.setEnabled(false);
		bBisn16.setEnabled(false);
		bBisn17.setEnabled(false);
		bBisn18.setEnabled(false);
		bBisn19.setEnabled(false);
		bBisn20.setEnabled(false);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(bBisn1)
					.addGap(11)
					.addComponent(bBisn2)
					.addGap(11)
					.addComponent(bBisn3)
					.addGap(11)
					.addComponent(bBisn4)
					.addGap(11)
					.addComponent(bBisn5)
					.addGap(11)
					.addComponent(bBisn6)
					.addGap(11)
					.addComponent(bBisn7)
					.addGap(11)
					.addComponent(bBisn8)
					.addGap(11)
					.addComponent(bBisn9)
					.addGap(11)
					.addComponent(bBisn10)
					.addGap(11)
					.addComponent(bBisn11)
					.addGap(11)
					.addComponent(bBisn12)
					.addGap(11)
					.addComponent(bBisn13)
					.addGap(11)
					.addComponent(bBisn14)
					.addGap(11)
					.addComponent(bBisn15)
					.addGap(11)
					.addComponent(bBisn16)
					.addGap(11)
					.addComponent(bBisn17)
					.addGap(11)
					.addComponent(bBisn18)
					.addGap(11)
					.addComponent(bBisn19)
					.addGap(11)
					.addComponent(bBisn20))
		);
		setLayout(groupLayout);

	}
}
