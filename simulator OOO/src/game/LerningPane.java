package game;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

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
	HelpA ha=new HelpA();
	boolean KoledSles,KoleedElek,KoledSanteh,InginerUniv,DocUniv,PoliceUniv,ITPuniv,ITSpecUniv,UristUniv,MenegerUniv,lerning=false,KoledSlesStart,KoledElekStart,KoledSantehStart,InginerUnivStart,DocUnivStart,PoliceUnivStart,ITPUnivStart,ITSpecUnivStart,UristUnivStart,MenegerUnivStart;
	
	int dayStartLern,dayLerning,dayToLerning;
	 JLabel label = new JLabel("\u041E\u0431\u0443\u0447\u0435\u043D\u0438\u0435");
	 JLabel lHelp = new JLabel("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
	public LerningPane() {
		bKoledElek.setBounds(362, 93, 348, 23);
		
		bKoledElek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bInginerUniv.setBounds(5, 161, 347, 23);
		
		bInginerUniv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LernBar.setBounds(5, 408, 695, 19);
		
		
		LernBar.setStringPainted(true);
		setLayout(null);
		bKoledSles.setBounds(5, 93, 347, 23);
		add(bKoledSles);
		add(bKoledElek);
		bKoledSanteh.setBounds(175, 127, 365, 23);
		add(bKoledSanteh);
		add(bInginerUniv);
		bDocUniv.setBounds(362, 161, 348, 23);
		add(bDocUniv);
		bPoliceUniv.setBounds(5, 195, 347, 23);
		add(bPoliceUniv);
		bITPUniv.setBounds(357, 195, 348, 23);
		add(bITPUniv);
		bITSpecUniv.setBounds(5, 229, 347, 23);
		add(bITSpecUniv);
		bUristUniv.setBounds(357, 229, 348, 23);
		add(bUristUniv);
		bHighScholl.setBounds(175, 297, 365, 23);
		add(bHighScholl);
		bMenegerUniv.setBounds(175, 263, 365, 23);
		add(bMenegerUniv);
		add(LernBar);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(87, 23, 509, 23);
		
		add(label);
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lHelp.setBounds(637, 29, 53, 15);
		
		add(lHelp);
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

		lHelp.addMouseListener(ha);
	}
	public class HelpA implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==lHelp){
				JOptionPane.showMessageDialog(null, "Здесь вы можеье пройти обучение\n"+
													"для открытия новых типов работы.");
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
