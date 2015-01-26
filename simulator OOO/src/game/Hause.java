package game;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Serializable;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Hause extends JPanel implements Serializable {
	static final long serialVersionUID=10L;

	JButton bHause1 = new JButton("\u041A\u043E\u043C\u043D\u0430\u0442\u0430 \u0432 \u043E\u0431\u0449\u0430\u0433\u0435 5000\u0420/\u043C\u0435\u0441\u044F\u0446");
	JButton bHause2 = new JButton("\u041A\u043E\u043C\u0443\u043D\u0430\u043B\u043A\u0430 10000\u0420/\u043C\u0435\u0441\u044F\u0446");
	JButton bHause3 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0438\u043D\u0435( \u0432 \u0445\u0440\u0443\u0449\u0435\u0432\u043A\u0435 ) 1 \u043A\u043E\u043C. 1,3\u043C\u043B\u043D \u0420");
	JButton bHause4 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0438\u043D\u0435( \u0432 \u0445\u0440\u0443\u0449\u0435\u0432\u043A\u0435 ) 2 \u043A\u043E\u043C. 2,1\u043C\u043B\u043D \u0420");
	JButton bHause5 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0438\u043D\u0435( \u0432 \u0445\u0440\u0443\u0449\u0435\u0432\u043A\u0435 ) 3 \u043A\u043E\u043C. 3\u043C\u043B\u043D \u0420");
	JButton bHause6 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0438\u043D\u0435( \u0432 \u0445\u0440\u0443\u0449\u0435\u0432\u043A\u0435 ) 4 \u043A\u043E\u043C. 4,2\u043C\u043B\u043D \u0420");
	JButton bHause7 = new JButton("\u041D\u043E\u0432\u0430\u044F \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0439\u043D\u0435 \u0441\u0442\u0443\u0434\u0438\u044F 1,27\u043C\u043B\u043D \u0420");
	JButton bHause8 = new JButton("\u041D\u043E\u0432\u0430\u044F \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0439\u043D\u0435 1 \u043A\u043E\u043C. 1,45\u043C\u043B\u043D \u0420");
	JButton bHause9 = new JButton("\u041D\u043E\u0432\u0430\u044F \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0439\u043D\u0435 2 \u043A\u043E\u043C. 2,3\u043C\u043B\u043D \u0420");
	JButton bHause10 = new JButton("\u041D\u043E\u0432\u0430\u044F \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0439\u043D\u0435 3 \u043A\u043E\u043C. 3,2\u043C\u043B\u043D \u0420");
	JButton bHause11 = new JButton("\u041D\u043E\u0432\u0430\u044F \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u043D\u0430 \u043E\u043A\u0440\u0430\u0439\u043D\u0435 4 \u043A\u043E\u043C. 4,8 \u043C\u043B\u043D \u0420");
	JButton bHause12 = new JButton("\u0422\u0430\u0443\u043D\u0445\u0430\u0443\u0441 3 \u043C\u043B\u043D \u0420");
	JButton bHause13 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u0432 \u0446\u0435\u043D\u0442\u0440\u0435 2 \u043A\u043E\u043C. 9,5 \u043C\u043B\u043D");
	JButton bHause14 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u0432 \u0446\u0435\u043D\u0442\u0440\u0435 3 \u043A\u043E\u043C. 18 \u043C\u043B\u043D \u0420 ");
	JButton bHause15 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u0432 \u0446\u0435\u043D\u0442\u0440\u0435 4 \u043A\u043E\u043C. 29 \u043C\u043B\u043D");
	JButton bHause16 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u0432 \u0446\u0435\u043D\u0442\u0440\u0435 5 \u043A\u043E\u043C 35 \u043C\u043B\u043D \u0420");
	JButton bHause17 = new JButton("\u041F\u0435\u043D\u0442\u0445\u0430\u0443\u0441 42,5 \u043C\u043B\u043D \u0420");
	JButton bHause18 = new JButton("\u0414\u043E\u043C \u0432 \u0447\u0430\u0441\u0442\u043D\u043E\u043C \u0441\u0435\u043A\u0442\u043E\u0440\u0435 25 \u043C\u043B\u043D \u0420");
	JButton bHause19 = new JButton("\u0414\u043E\u043C \u0432 \u043F\u0440\u0435\u0441\u0442\u0438\u0436\u043D\u043E\u043C \u0440\u0430\u0439\u043E\u043D\u0435 47 \u043C\u043B\u043D \u0420");
	JButton bHause20 = new JButton("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430 \u0437\u0430 \u0433\u0440\u0430\u043D\u0438\u0446\u0435\u0439 18 \u043C\u043B\u043D \u0420");
	JButton bHause21 = new JButton("\u0414\u043E\u043C \u0437\u0430 \u0433\u0440\u0430\u043D\u0438\u0446\u0435\u0439 30 \u043C\u043B\u043D \u0420");
	JButton bHause22 = new JButton("\u0412\u0438\u043B\u043B\u0430 85 \u043C\u043B\u043D \u0420");
	JButton bHause23 = new JButton("\u0417\u0430\u043C\u043E\u043A 250 \u043C\u043B\u043D \u0420");
	JButton bHause24 = new JButton("\u0414\u0432\u043E\u0440\u0435\u0446 500\u043C\u043B\u043D");
	JButton bHause25 = new JButton("\u0420\u0435\u0437\u0438\u0434\u0435\u043D\u0446\u0438\u044F 950 \u043C\u043B\u043D");
	public Hause() {
		
		
		bHause1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bHause1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause2, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause3, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause4, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause5, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause6, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause7, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause8, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause9, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause10, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause11, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause12, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause13, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause14, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause15, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause16, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause17, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause18, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause19, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause20, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause21, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause22, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause23, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause24, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
						.addComponent(bHause25, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(bHause1)
					.addGap(11)
					.addComponent(bHause2)
					.addGap(11)
					.addComponent(bHause3)
					.addGap(11)
					.addComponent(bHause4)
					.addGap(11)
					.addComponent(bHause5)
					.addGap(11)
					.addComponent(bHause6)
					.addGap(11)
					.addComponent(bHause7)
					.addGap(11)
					.addComponent(bHause8)
					.addGap(11)
					.addComponent(bHause9)
					.addGap(11)
					.addComponent(bHause10)
					.addGap(11)
					.addComponent(bHause11)
					.addGap(11)
					.addComponent(bHause12)
					.addGap(11)
					.addComponent(bHause13)
					.addGap(11)
					.addComponent(bHause14)
					.addGap(11)
					.addComponent(bHause15)
					.addGap(11)
					.addComponent(bHause16)
					.addGap(11)
					.addComponent(bHause17)
					.addGap(11)
					.addComponent(bHause18)
					.addGap(11)
					.addComponent(bHause19)
					.addGap(11)
					.addComponent(bHause20)
					.addGap(11)
					.addComponent(bHause21)
					.addGap(11)
					.addComponent(bHause22)
					.addGap(10)
					.addComponent(bHause23)
					.addGap(11)
					.addComponent(bHause24)
					.addGap(11)
					.addComponent(bHause25))
		);
		setLayout(groupLayout);

	}
}
