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
import javax.swing.Timer;

import by.zti.SerializationManager;

import java.awt.CardLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main extends JFrame implements ActionListener {
	static final long serialVersionUID=1L;
	WorkPane wpan=new WorkPane();
	SaveClass sc=new SaveClass();
	 Back bck = new Back();
	StartPane sp = new StartPane();
	eHandler eh = new eHandler();
	OptionsDif opd = new OptionsDif();
	Timer time=new Timer(1000,this);
	private final Object osc=sc;
	 Object  owpan=wpan;
	boolean setsave=false,getsave=false;
	int x = 0;
	
	public JPanel contentPane;
	LerningPane lernpan = new LerningPane();

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					
					Main frame = new Main();
				 frame.load();
					frame.setSize(800, 640);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
					
					//frame.save();

				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
	}

	public Main() {
		//bck.day=(int) load();
		time.start();
		if(setsave==true){
			setsave=false;
		}
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
		sp.bSave.addActionListener(eh);
		sp.bDownl.addActionListener(eh);
		bck.bStartTime.addActionListener(this);
		bck.bStopTime.addActionListener(this);
		bck.bFastTime.addActionListener(this);
	
	}
	public  void save(){
		//bck.hause=rObj;
		

	}
	@SuppressWarnings("null")
	public Object load(){
		Object rObj=null;
		
		try {
			FileInputStream inPut= new FileInputStream("Save.ser");
			//FileInputStream inPut1= new FileInputStream("Save1.ser");
			ObjectInputStream in= new ObjectInputStream(inPut);
			//ObjectInputStream in1= new ObjectInputStream(inPut1);
			
			try {
				rObj=in.readObject();
				//bck.tr1=in1.readBoolean();
			} catch (ClassNotFoundException e) {
				System.out.println("Ошибка");
			}
			inPut.close();
			in.close();
			System.out.println("Десереализация прошла успешно");
		} catch (IOException e) {
			System.out.println("Ошибка Десереализации");
			e.printStackTrace();
		}
		//bck.day=(int) rObj;
		return rObj;
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
			
			if(e.getSource()==sp.bSave){
				try {
					FileOutputStream outPut= new FileOutputStream("Save.ser");
					
					//FileOutputStream outPut1= new FileOutputStream("Save1.ser");
					//ObjectOutputStream out1= new ObjectOutputStream(outPut1);
					ObjectOutputStream out= new ObjectOutputStream(outPut);
					//out1.writeBoolean(bck.dlb1);
					out.writeObject(bck.dlb1);
					out.writeObject(bck.dlb2);
					out.writeObject(bck.dlb3);
					out.writeBoolean(bck.DocUniv);
					out.writeBoolean(bck.DocUnivStart);
					out.writeBoolean(bck.hau1);
					out.writeBoolean(bck.hau10);
					out.writeBoolean(bck.hau11);
					out.writeBoolean(bck.hau12);
					out.writeBoolean(bck.hau13);
					out.writeBoolean(bck.hau13);
					out.writeBoolean(bck.hau14);
					out.writeBoolean(bck.hau15);
					out.writeBoolean(bck.hau16);
					out.writeBoolean(bck.hau17);
					out.writeBoolean(bck.hau17);
					out.writeBoolean(bck.hau18);
					out.writeBoolean(bck.hau19);
					out.writeBoolean(bck.hau2);
					out.writeBoolean(bck.hau20);
					out.writeBoolean(bck.hau21);
					out.writeBoolean(bck.hau22);
					out.writeBoolean(bck.hau23);
					out.writeBoolean(bck.hau24);
					out.writeBoolean(bck.hau25);
					out.writeBoolean(bck.hau3);
					out.writeBoolean(bck.hau4);
					out.writeBoolean(bck.hau5);
					out.writeBoolean(bck.hau6);
					out.writeBoolean(bck.hau7);
					out.writeBoolean(bck.hau8);
					out.writeObject(bck.hau9);
					out.writeObject(bck.HighScholl);
					out.writeObject(bck.HighSchollStart);
					out.writeObject(bck.InginerUniv);
					out.writeObject(bck.ITPUniv);
					
					
					
					
					
					
					
					
					
					
					out.writeObject(bck.banc);
					outPut.close();
					out.close();
					
					System.out.println("Сереализация прошла успешно");
				} catch (IOException e1) {
					System.out.println("Ошибка Сереализации");
					e1.printStackTrace();
				}
			}else{setsave=false;}
			
			if(e.getSource()==sp.bDownl){
				
			}else{
				getsave=false;
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		save();
		try {
			bck.daycount();
		} catch (IOException e1) {
			time.stop();
		
		}
		bck.Save();
			
			try {
				bck.bisness();
			} catch (IOException e1) {
				time.stop();
			
			}
		
		try {
			bck.invest();
		} catch (IOException e1) {
			time.stop();
			
		}
		try {
			bck.work();
		} catch (IOException e1) {
			
			time.stop();
		}
		try {
			bck.lern();
		} catch (IOException e1) {
			time.stop();
			
		}
		try {
			bck.info();
		} catch (IOException e1) {
			time.stop();
			
		}
		try {
			bck.transport();
		} catch (IOException e1) {
			time.stop();
			
		}
		try {
			bck.doplern();
		} catch (IOException e1) {
			time.stop();
			
		}
		bck.doprab();
		try {
			bck.houseinfo();
		} catch (IOException e1) {
			time.stop();
			
		}
		bck.trat();

		// daycount2();
		if (e.getSource() == bck.bStartTime) {
			// timeFast=false;
			bck.timeStart = true;
		}
		if (e.getSource() == bck.bFastTime) {
			bck.timeStart = false;
			// timeFast=true;
		}
		if (e.getSource() == bck.bStopTime) {
			bck.timeStart = false;
		}

	
		
	}

}