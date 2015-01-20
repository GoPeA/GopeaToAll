package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import by.zti.SerializationManager;

import java.awt.CardLayout;

public class Main extends JFrame implements ActionListener {
	Back bck = new Back();
	StartPane sp = new StartPane();
	eHandler eh = new eHandler();
	OptionsDif opd = new OptionsDif();
	int x = 0;
	
	public JPanel contentPane;
	LerningPane lernpan = new LerningPane();

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Main frame = new Main();
					frame.setSize(800, 640);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	public Main() {
		setTitle("\u0421\u0438\u043C\u0443\u043B\u044F\u0442\u043E\u0440 \u0418\u041F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();

		setContentPane(contentPane);

		sp.setVisible(true);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(sp, "name_6765813040484");
		
		contentPane.add(bck, "name_6765830664232");
		contentPane.add(opd);
		opd.setVisible(false);
		bck.setVisible(false);
		sp.bGame.addActionListener(eh);
		sp.bExit.addActionListener(eh);
		sp.bOptions.addActionListener(eh);
		bck.bBack.addActionListener(eh);
		opd.bBack.addActionListener(eh);
		opd.bEasy.addActionListener(eh);
		opd.bHard.addActionListener(eh);
		opd.bNormal.addActionListener(eh);

		
	
	}
	public void Save(){
		
		
		
	
	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == sp.bExit) {
				System.exit(0);
			}
			if (e.getSource() == sp.bGame) {
				sp.setVisible(false);
				bck.setVisible(true);

				contentPane.removeAll();

				contentPane.add(bck);

			}
			if (e.getSource() == sp.bOptions) {
				sp.setVisible(false);
				opd.setVisible(true);

				contentPane.removeAll();

				contentPane.add(opd);

			}
			if(e.getSource()==opd.bBack){
				opd.setVisible(false);
				sp.setVisible(true);

				contentPane.removeAll();

				contentPane.add(sp);
			}
			if(e.getSource()==bck.bBack){
				bck.setVisible(false);
				sp.setVisible(true);

				contentPane.removeAll();
			
				contentPane.add(sp);
			}
			if(e.getSource()==opd.bEasy){
				bck.money=5000;
				opd.bEasy.setBackground(Color.GREEN);
			}else{opd.bEasy.setBackground(sp.bGame.getBackground());}
			if(e.getSource()==opd.bNormal){
				bck.money=2000;
				opd.bNormal.setBackground(Color.GREEN);
			}else{opd.bNormal.setBackground(sp.bGame.getBackground());}
			if(e.getSource()==opd.bHard){
				bck.money=500;
				opd.bHard.setBackground(Color.GREEN);
			}else{opd.bHard.setBackground(sp.bGame.getBackground());}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Save();
		
	}

}