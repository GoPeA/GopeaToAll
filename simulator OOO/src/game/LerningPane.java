package game;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Serializable;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LerningPane extends JPanel implements Serializable {
	static final long serialVersionUID=18L;
	//Timer time1 =new Timer(800,this);
	JButton bKoledSles = new JButton("\u041A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u0441\u043B\u0435\u0441\u0430\u0440\u044F(\u0440\u0430\u0431\u043E\u0447\u0438\u0439 \u0437\u0430\u0432\u043E\u0434\u0430) 1 \u0433");
	JButton bKoledElek = new JButton("\u041A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u044D\u043B\u0435\u043A\u0442\u0440\u0438\u043A\u0430 1\u0433");
	JButton bKoledSanteh = new JButton("\u041A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u0441\u0430\u043D\u0442\u0435\u0445\u043D\u0438\u043A\u0430 1\u0433");
	JButton bInginerUniv = new JButton("\u0418\u043D\u0436\u0438\u043D\u0435\u0440\u043D\u044B\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442 5\u043B");
	JButton bDocUniv = new JButton("\u041C\u0435\u0434\u0438\u0446\u0438\u043D\u0441\u043A\u0438\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442 6\u043B");
	JButton bPoliceUniv = new JButton("\u0410\u043A\u0430\u0434\u0435\u043C\u0438\u044F \u041C\u0412\u0414 5\u043B\r\n");
	JButton bITPUniv = new JButton("\u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u0418\u0422\u0438\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u044F 6\u043B");
	JButton bITSpecUniv = new JButton("\u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u043D\u0430 IT \u0441\u043F\u0435\u0446\u0438\u0430\u043B\u0438\u0441\u0442\u043E\u0432 6\u043B");
	JButton bUristUniv = new JButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442 6\u043B");
	JButton bMenegerUniv = new JButton("\u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u041C\u0435\u043D\u0435\u0434\u0436\u043C\u0435\u043D\u0442\u0430 5,5\u043B");
	JButton bHighScholl = new JButton("\u0412\u044B\u0441\u0448\u0430\u044F \u0428\u043A\u043E\u043B\u0430 \u042D\u043A\u043E\u043D\u043E\u043C\u0438\u043A\u0438 4\u0433");
	//eHandler eh=new eHandler();
	JProgressBar LernBar = new JProgressBar();
	int day,day1,year,clic;
	boolean KoledSles,KoleedElek,KoledSanteh,InginerUniv,DocUniv,PoliceUniv,ITPuniv,ITSpecUniv,UristUniv,MenegerUniv,lerning=false,KoledSlesStart,KoledElekStart,KoledSantehStart,InginerUnivStart,DocUnivStart,PoliceUnivStart,ITPUnivStart,ITSpecUnivStart,UristUnivStart,MenegerUnivStart;
	
	int dayStartLern,dayLerning,dayToLerning;
	public LerningPane() {
		
		bKoledElek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		bInginerUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		LernBar.setStringPainted(true);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(bKoledSles, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(bKoledElek, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(175)
					.addComponent(bKoledSanteh, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(175))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(bInginerUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(bDocUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(bPoliceUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(bITPUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(bITSpecUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(bUristUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(LernBar, GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(175)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bHighScholl, GroupLayout.PREFERRED_SIZE, 165, Short.MAX_VALUE)
							.addGap(175))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bMenegerUniv, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
							.addGap(175))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bKoledSles)
						.addComponent(bKoledElek))
					.addGap(11)
					.addComponent(bKoledSanteh)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bInginerUniv)
						.addComponent(bDocUniv))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bPoliceUniv)
						.addComponent(bITPUniv))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bITSpecUniv)
						.addComponent(bUristUniv))
					.addGap(11)
					.addComponent(bMenegerUniv)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bHighScholl)
					.addGap(111)
					.addComponent(LernBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
		bKoledSles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bKoledSanteh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bDocUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bInginerUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bITPUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bITSpecUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bPoliceUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bUristUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bMenegerUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		
	}
}
