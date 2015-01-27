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
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
	}

	public Main() {
		
		
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
		sp.bDownl.addActionListener(this);
		bck.bStartTime.addActionListener(this);
		bck.bStopTime.addActionListener(this);
		bck.bFastTime.addActionListener(this);
	
	}
	public  void save(){
		//bck.hause=rObj;
		

	}

	public Object load(){
		Object rObj=null;
		
		try {
			FileInputStream inPut= new FileInputStream("Save.ser");
			//FileInputStream inPut1= new FileInputStream("Save1.ser");
			ObjectInputStream in= new ObjectInputStream(inPut);
			//ObjectInputStream in1= new ObjectInputStream(inPut1);
			
			try {
				
				bck.day=(int) in.readObject();
				bck.money=(long)in.readObject();
				bck.day1=(int)in.readObject();
				bck.bancMoney=(double) in.readObject();
				
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
					ObjectOutputStream out= new ObjectOutputStream(outPut);
					
					
					out.writeObject(bck.day);
					out.writeObject(bck.money);
					out.writeObject(bck.day1);
					out.writeObject(bck.bancMoney);
					out.writeObject(bck.allKreditMoney);
					out.writeObject(bck.daydLS1);
					out.writeObject(bck.daydLS2);
					out.writeObject(bck.daydLS3);
					out.writeObject(bck.daydLS4);
					out.writeObject(bck.daydLS5);
					out.writeObject(bck.daydLS6);
					out.writeObject(bck.daydLS7);
					out.writeObject(bck.daydLtoL1);
					out.writeObject(bck.daydLtoL2);
					out.writeObject(bck.daydLtoL3);
					out.writeObject(bck.daydLtoL4);
					out.writeObject(bck.daydLtoL5);
					out.writeObject(bck.daydLtoL6);
					out.writeObject(bck.daydLtoL7);
					out.writeObject(bck.daydZS1);
					out.writeObject(bck.daydZS2);
					out.writeObject(bck.daydZS3);
					out.writeObject(bck.daydZS4);
					out.writeObject(bck.daydZS5);
					out.writeObject(bck.daydZS6);
					out.writeObject(bck.daydZS7);
					out.writeObject(bck.daydZtoR1);
					out.writeObject(bck.daydZtoR2);
					out.writeObject(bck.daydZtoR3);
					out.writeObject(bck.daydZtoR4);
					out.writeObject(bck.daydZtoR5);
					out.writeObject(bck.daydZtoR6);
					out.writeObject(bck.daydZtoR7);
					out.writeObject(bck.dayLerning);
					out.writeObject(bck.dayStartLern);
					out.writeObject(bck.dayToLerning);
					out.writeObject(bck.dayZarp);
					out.writeObject(bck.dlb1);
					out.writeObject(bck.dlb2);
					out.writeObject(bck.dlb3);
					out.writeObject(bck.DocUniv);
					out.writeObject(bck.DocUnivStart);
					out.writeObject(bck.dTakeKredit);
					out.writeObject(bck.eat1);
					out.writeObject(bck.h1);
					out.writeObject(bck.h2);
					out.writeObject(bck.h3);
					out.writeObject(bck.h4);
					out.writeObject(bck.h5);
					out.writeObject(bck.h6);
					out.writeObject(bck.h7);
					out.writeObject(bck.h8);
					out.writeObject(bck.h9);
					out.writeObject(bck.h10);
					out.writeObject(bck.h11);
					out.writeObject(bck.h12);
					out.writeObject(bck.h13);
					out.writeObject(bck.h14);
					out.writeObject(bck.h15);
					out.writeObject(bck.h16);
					out.writeObject(bck.h17);
					out.writeObject(bck.h18);
					out.writeObject(bck.h19);
					out.writeObject(bck.h20);
					out.writeObject(bck.h21);
					out.writeObject(bck.h22);
					out.writeObject(bck.h23);
					out.writeObject(bck.h24);
					out.writeObject(bck.h25);
					out.writeObject(bck.hau1);
					out.writeObject(bck.hau2);
					out.writeObject(bck.hau3);
					out.writeObject(bck.hau4);
					out.writeObject(bck.hau5);
					out.writeObject(bck.hau6);
					out.writeObject(bck.hau7);
					out.writeObject(bck.hau8);
					out.writeObject(bck.hau9);
					out.writeObject(bck.hau10);
					out.writeObject(bck.hau11);
					out.writeObject(bck.hau12);
					out.writeObject(bck.hau13);
					out.writeObject(bck.hau14);
					out.writeObject(bck.hau15);
					out.writeObject(bck.hau16);
					out.writeObject(bck.hau17);
					out.writeObject(bck.hau18);
					out.writeObject(bck.hau19);
					out.writeObject(bck.hau20);
					out.writeObject(bck.hau21);
					out.writeObject(bck.hau22);
					out.writeObject(bck.hau23);
					out.writeObject(bck.hau24);
					out.writeObject(bck.hau25);
					out.writeObject(bck.healthy);
					out.writeObject(bck.HighScholl);
					out.writeObject(bck.HighSchollStart);
					out.writeObject(bck.hmKolvo);
					out.writeObject(bck.InginerUniv);
					out.writeObject(bck.InginerUnivStart);
					out.writeObject(bck.ITPUniv);
					out.writeObject(bck.ITPUnivStart);
					out.writeObject(bck.ITSpecUniv);
					out.writeObject(bck.ITSpecUnivStart);
					out.writeObject(bck.KoledElek);
					out.writeObject(bck.KoledElekStart);
					out.writeObject(bck.KoledSanteh);
					out.writeObject(bck.KoledSantehStart);
					out.writeObject(bck.KoledSles);
					out.writeObject(bck.KoledSlesStart);
					out.writeObject(bck.kolLarek);
					out.writeObject(bck.kolShop);
					out.writeObject(bck.kolSite);
					out.writeObject(bck.KreditMoney);
					out.writeObject(bck.lerning);
					out.writeObject(bck.MenegerUniv);
					out.writeObject(bck.MenegerUnivStart);
					out.writeObject(bck.MoneyToPay);
					out.writeObject(bck.piMoney);
					out.writeObject(bck.PoliceUniv);
					out.writeObject(bck.PoliceUnivStart);
					out.writeObject(bck.prestige);
					out.writeObject(bck.t10Live);
					out.writeObject(bck.t10LiveS);
					out.writeObject(bck.t11Live);
					out.writeObject(bck.t11LiveS);
					out.writeObject(bck.t12Live);
					out.writeObject(bck.t12LiveS);
					out.writeObject(bck.t13Live);
					out.writeObject(bck.t14Live);
					out.writeObject(bck.t14LiveS);
					out.writeObject(bck.t15Live);
					out.writeObject(bck.t15LiveS);
					out.writeObject(bck.t16Live);
					out.writeObject(bck.t16LiveS);
					out.writeObject(bck.t17Live);
					out.writeObject(bck.t17LiveS);
					out.writeObject(bck.t18Live);
					out.writeObject(bck.t18LiveS);
					out.writeObject(bck.t19Live);
					out.writeObject(bck.t19LiveS);
					out.writeObject(bck.t1Live);
					out.writeObject(bck.t1LiveS);
					out.writeObject(bck.t20Live);
					out.writeObject(bck.t20LiveS);
					out.writeObject(bck.t21Live);
					out.writeObject(bck.t21Live);
					out.writeObject(bck.t21LiveS);
					out.writeObject(bck.t22Live);
					out.writeObject(bck.t23Live);
					out.writeObject(bck.t23LiveS);
					out.writeObject(bck.t24Live);
					out.writeObject(bck.t24LiveS);
					out.writeObject(bck.t25Live);
					out.writeObject(bck.t25LiveS);
					out.writeObject(bck.t26Live);
					out.writeObject(bck.t26LiveS);
					out.writeObject(bck.t27Live);
					out.writeObject(bck.t27LiveS);
					out.writeObject(bck.t28Live);
					out.writeObject(bck.t28LiveS);
					out.writeObject(bck.t29Live);
					out.writeObject(bck.t29LiveS);
					out.writeObject(bck.t2Live);
					out.writeObject(bck.t30Live);
					out.writeObject(bck.t30LiveS);
					out.writeObject(bck.t3Live);
					out.writeObject(bck.t3LiveS);
					out.writeObject(bck.t4Live);
					out.writeObject(bck.t14LiveS);
					out.writeObject(bck.t5Live);
					out.writeObject(bck.t15LiveS);
					out.writeObject(bck.t6Live);
					out.writeObject(bck.t6LiveS);
					out.writeObject(bck.t7Live);
					out.writeObject(bck.t7LiveS);
					out.writeObject(bck.t8Live);
					out.writeObject(bck.t8LiveS);
					out.writeObject(bck.t9Live);
					out.writeObject(bck.t9LiveS);
					out.writeObject(bck.tidy1);
					out.writeObject(bck.Toplivo);
					out.writeObject(bck.tr1);
					out.writeObject(bck.tr2);
					out.writeObject(bck.tr3);
					out.writeObject(bck.tr4);
					out.writeObject(bck.tr5);
					out.writeObject(bck.tr6);
					out.writeObject(bck.tr7);
					out.writeObject(bck.tr8);
					out.writeObject(bck.tr9);
					out.writeObject(bck.tr10);
					out.writeObject(bck.tr11);
					out.writeObject(bck.tr12);
					out.writeObject(bck.tr13);
					out.writeObject(bck.tr14);
					out.writeObject(bck.tr15);
					out.writeObject(bck.tr16);
					out.writeObject(bck.tr17);
					out.writeObject(bck.tr18);
					out.writeObject(bck.tr19);
					out.writeObject(bck.tr20);
					out.writeObject(bck.tr21);
					out.writeObject(bck.tr22);
					out.writeObject(bck.tr23);
					out.writeObject(bck.tr24);
					out.writeObject(bck.tr25);
					out.writeObject(bck.tr26);
					out.writeObject(bck.tr27);
					out.writeObject(bck.tr28);
					out.writeObject(bck.tr29);
					out.writeObject(bck.tr30);
					out.writeObject(bck.tst1);
					out.writeObject(bck.tst2);
					out.writeObject(bck.tst3);
					out.writeObject(bck.tst4);
					out.writeObject(bck.tst5);
					out.writeObject(bck.tst6);
					out.writeObject(bck.tst7);
					out.writeObject(bck.tst8);
					out.writeObject(bck.tst9);
					out.writeObject(bck.tst10);
					out.writeObject(bck.tst11);
					out.writeObject(bck.tst12);
					out.writeObject(bck.tst13);
					out.writeObject(bck.tst14);
					out.writeObject(bck.tst15);
					out.writeObject(bck.tst16);
					out.writeObject(bck.tst17);
					out.writeObject(bck.tst18);
					out.writeObject(bck.tst19);
					out.writeObject(bck.tst20);
					out.writeObject(bck.tst21);
					out.writeObject(bck.tst22);
					out.writeObject(bck.tst23);
					out.writeObject(bck.tst24);
					out.writeObject(bck.tst25);
					out.writeObject(bck.tst26);
					out.writeObject(bck.tst27);
					out.writeObject(bck.tst28);
					out.writeObject(bck.tst29);
					out.writeObject(bck.tst30);
					out.writeObject(bck.UristUniv);
					out.writeObject(bck.UristUnivStart);
					out.writeObject(bck.x);
					out.writeObject(bck.xp);
					out.writeObject(bck.year);
					out.writeObject(bck.zarpday);
					out.writeObject(bck.zarplata);
					
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
		bck.Save();

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