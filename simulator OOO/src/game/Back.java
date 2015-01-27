package game;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Random;

import by.zti.*;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.MaskFormatter;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.awt.Font;
import java.io.IOException;
import java.io.Serializable;


public class Back extends JPanel implements Serializable {
	static final long serialVersionUID=2L;
	long canToCredit=100000,minMoney=1000;
	long piTakePutMoney,PlusOrMinus;
	double piMoney,piInvestPrib;
	String shmToBild,shmToSell;
	Hipermarket hm=new Hipermarket();
	 MaskFormatter f1,f2;
	long hmKolvo,hmPribil,hmZatrat,hmToBild,hmToSell;
	double eat1=5000,health1=5000,tidy1=5000,meat=1,mtidy=1;
	long allTrat,hauseTrat,tranTrat;
	long ht1,ht2,ht3,ht4,ht5,ht6,ht7,ht8,ht9,ht10,ht11,ht12,ht13,ht14,ht15,ht16,ht17
	,ht18,ht19,ht20,ht21,ht22,ht23,ht24,ht25;
	long tst1,tst2,tst3,tst4,tst5,tst6,tst7,tst8,tst9,tst10,tst11,tst12,tst13,tst14,tst15,tst16,tst17,tst18,tst19,tst20,tst21,tst22,tst23,tst24,tst25,tst26,tst27,tst28,tst29,tst30;
	DopLerningSC dlsc=new DopLerningSC();
	TimeA tma=new TimeA();
	DopZarSC dzsc= new DopZarSC();
	InvestAction ina= new InvestAction();
	BisnessAction ba=new BisnessAction();
	Banc banc=new Banc();
	JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	long kolLarek,pribLarek,zatratLarek,larekToSell,larekToBild;
	long podarok;
	long KreditMoney,MoneyInBank,allKreditMoney=0;
	long MoneyToPay;
	double bancMoney;
	int dTakeKredit;
	int KreditTime;
	long kolSite,pribSite,zatratSite,siteToBay,siteToSell;
	long kolShop,pribShop,zatratShop,shopToBay,shopToSell;
	DopRabAction dra= new DopRabAction();
	DopLernAction dla=new DopLernAction();
	int daydLS1,daydLtoL1,daydLS2,daydLtoL2,daydLS3,daydLtoL3,daydLS4,daydLtoL4,daydLS5,daydLtoL5,daydLS6,daydLtoL6,daydLS7,daydLtoL7;
	int daydZS1,daydZtoR1,daydZS2,daydZtoR2,daydZS3,daydZtoR3,daydZS4,daydZtoR4,daydZS5,daydZtoR5,daydZS6,daydZtoR6,daydZS7,daydZtoR7;
	HauseSC hsc=new HauseSC();
	int x,y;
	long y1,y2;
	boolean tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9,tr10,tr11,tr12,tr13,tr14,tr15
	,tr16,tr17,tr18,tr19,tr20,tr21,tr22,tr23,tr24,tr25,tr26,tr27,tr28,tr29,tr30;
	boolean hau1,hau2,hau3,hau4,hau5,hau6,hau7,hau8,hau9,hau10,hau11,hau12,hau13,hau14
	,hau15,hau16,hau17,hau18,hau19,hau20,hau21,hau22,hau23,hau24,hau25;
	boolean dlb1,dlb2,dlb3;
	InvescSC insc= new InvescSC();
	BisnessSC bsc=new BisnessSC();
	HouseAction ha=new HouseAction();
	Hause hause= new Hause();
	TransportAction ta= new TransportAction();
	ResourseMarket rmar = new ResourseMarket();
	JLabel lMoney1 = new JLabel("");
	Transport trans = new Transport();
	TransportSC tsc = new TransportSC();
	ResMarkAction rma = new ResMarkAction();
	ActionWork aw = new ActionWork();
	double mEat,mEn;
	int  eat=5000,tidy = 5000,   healthy = 5000, deat, dhelth,dtidy;
	int day = 0,year = 16,day1;
	int h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,h16,h17,h18,h19,h20,h21,h22,h23,h24,h25;
	long prestige;
	boolean deid = false;
	boolean KoledSles, KoledElek, KoledSanteh, InginerUniv, DocUniv,HighScholl,HighSchollStart,
			PoliceUniv, ITPUniv, ITSpecUniv, UristUniv, MenegerUniv,
			lerning = false, KoledSlesStart, KoledElekStart, KoledSantehStart,
			InginerUnivStart, DocUnivStart, PoliceUnivStart, ITPUnivStart,
			ITSpecUnivStart, UristUnivStart, MenegerUnivStart;
	int dayStartLern, dayLerning, dayToLerning;
	long cena;
	int t1LiveS,t2LiveS ,t3LiveS,t4LiveS,t5LiveS,t6LiveS,t7LiveS,t8LiveS,t9LiveS,t10LiveS,t11LiveS,
	t12LiveS,t13LiveS,t14LiveS,t15LiveS,t16LiveS,t17LiveS,t18LiveS,t19LiveS,t20LiveS,t21LiveS,t22LiveS,t23LiveS,t24LiveS,t25LiveS,t26LiveS,t27LiveS,t28LiveS,t29LiveS,t30LiveS;
	int t1Live,t2Live ,t3Live,t4Live,t5Live,t6Live,t7Live,t8Live,t9Live,t10Live,t11Live,t12Live,
	t13Live,t14Live,t15Live,t16Live,t17Live,t18Live,t19Live,t20Live,t21Live,
	t22Live,t23Live,t24Live,t25Live,t26Live,t27Live,t28Live,t29Live,t30Live;
	long Toplivo;
	double xp;
	int zarplata, zarpday, dayZarp;
	long money =500000000L;
	
	Random rand = new Random();
	//Timer time1 = new Timer(1000, this);
	//Timer time2 = new Timer(1000, this);
	boolean timeStart = false, timeStop = false, timeFast = false;
	eHandler eh = new eHandler();
	String s1, s2, s3, s4, s5, s6, s7, s8, s9;
	JProgressBar BarHealth = new JProgressBar();
	JProgressBar BarTidy = new JProgressBar();
	JProgressBar BarFood = new JProgressBar();
	JLabel LHealth = new JLabel("\u2665");
	JLabel lTidy = new JLabel("\u263A");
	JLabel lFood = new JLabel("F");
	JLabel lDays = new JLabel("New label");
	JButton bStopTime = new JButton("");
	JButton bStartTime = new JButton("");
	JButton bFastTime = new JButton("");
	HomePage hp = new HomePage();
	WorkPage wp = new WorkPage();
	JTabbedPane zone = new JTabbedPane(JTabbedPane.TOP);
	LerningPane lernpan = new LerningPane();
	LernPScrol lpsc = new LernPScrol();

	public Back() {
		//hm.tfBild= new JFormattedTextField(f1);
		//hm.tfSell= new JFormattedTextField(f1);
		insc.ban.lmaxCredit.setText("Доступен кредит = "+canToCredit+"Р");
		canToCredit=zarpday*1095+200*(kolLarek*1750+kolSite*2000+kolShop*3500+hmKolvo*17000);
		BarHealth.setMaximum(10000);
		BarHealth.setStringPainted(true);
		BarHealth.setForeground(new Color(0, 0, 128));
		BarHealth
				.setToolTipText("\u0417\u0434\u043E\u0440\u043E\u0432\u044C\u0435\r\n");
		BarHealth.setValue(5000);
		BarTidy.setToolTipText("\u0411\u043E\u0434\u0440\u043E\u0441\u0442\u044C");
		BarTidy.setMaximum(10000);
		s2 = "Деньги  Р " + money;
		BarTidy.setForeground(new Color(0, 0, 128));
		BarTidy.setStringPainted(true);
		BarTidy.setOrientation(SwingConstants.VERTICAL);
		BarTidy.setValue(5000);
		bStopTime.setBackground(UIManager.getColor("Button.background"));
		bStopTime.setIcon(new ImageIcon(Back.class.getResource("/res/pause.JPG")));
		bStopTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bStartTime.setBackground(UIManager.getColor("Button.background"));
		bStartTime.setIcon(new ImageIcon(Back.class
				.getResource("/res/play.JPG")));

		bStartTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bFastTime.setEnabled(false);
		bFastTime.setBackground(UIManager.getColor("Button.background"));
		bFastTime.setIcon(new ImageIcon(Back.class
				.getResource("/res/faster.JPG")));

		bFastTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		hp.lMoney.setText(s2);
		zone.add(hp);
		zone.setTitleAt(0, "\u0433\u043B\u0430\u0432\u043D\u0430\u044F");
		zone.setEnabledAt(0, true);
		zone.add(wp);
		zone.add(rmar);
		zone.setTitleAt(2, "+\u263A,+\u2665.+F");
		zone.setEnabledAt(2, true);
		
				rmar.bFood1.addActionListener(rma);
				rmar.bEnerge1.addActionListener(rma);
				rmar.bHelth1.addActionListener(rma);
				rmar.bEnerge2.addActionListener(rma);
				rmar.bEnerge3.addActionListener(rma);
				rmar.bEnerge4.addActionListener(rma);
				rmar.bEnerge5.addActionListener(rma);
				rmar.bEnerge6.addActionListener(rma);
				rmar.bEnerge7.addActionListener(rma);
				rmar.bEnerge8.addActionListener(rma);
				rmar.bEnerge9.addActionListener(rma);
				rmar.bEnerge10.addActionListener(rma);
				rmar.bHelth2.addActionListener(rma);
				rmar.bHelth3.addActionListener(rma);
				rmar.bHelth4.addActionListener(rma);
				rmar.bHelth5.addActionListener(rma);
				rmar.bHelth6.addActionListener(rma);
				rmar.bHelth7.addActionListener(rma);
				rmar.bHelth8.addActionListener(rma);
				rmar.bHelth9.addActionListener(rma);
				rmar.bHelth10.addActionListener(rma);
				rmar.bFood2.addActionListener(rma);
				rmar.bFood3.addActionListener(rma);
				rmar.bFood4.addActionListener(rma);
				rmar.bFood5.addActionListener(rma);
				rmar.bFood6.addActionListener(rma);
				rmar.bFood7.addActionListener(rma);
				rmar.bFood8.addActionListener(rma);
				rmar.bFood9.addActionListener(rma);
				rmar.bFood10.addActionListener(rma);
		zone.add(hsc);
		zone.setTitleAt(3,
				"\u0416\u0438\u043B\u044C\u0451");
		zone.setEnabledAt(3, true);
		hsc.hause.bHause1.addActionListener(ha);
		hsc.hause.bHause2.addActionListener(ha);
		hsc.hause.bHause3.addActionListener(ha);
		hsc.hause.bHause4.addActionListener(ha);
		hsc.hause.bHause5.addActionListener(ha);
		hsc.hause.bHause6.addActionListener(ha);
		hsc.hause.bHause7.addActionListener(ha);
		hsc.hause.bHause8.addActionListener(ha);
		hsc.hause.bHause9.addActionListener(ha);
		hsc.hause.bHause10.addActionListener(ha);
		hsc.hause.bHause11.addActionListener(ha);
		hsc.hause.bHause12.addActionListener(ha);
		hsc.hause.bHause13.addActionListener(ha);
		hsc.hause.bHause14.addActionListener(ha);
		hsc.hause.bHause15.addActionListener(ha);
		hsc.hause.bHause16.addActionListener(ha);
		hsc.hause.bHause17.addActionListener(ha);
		hsc.hause.bHause18.addActionListener(ha);
		hsc.hause.bHause19.addActionListener(ha);
		hsc.hause.bHause20.addActionListener(ha);
		hsc.hause.bHause21.addActionListener(ha);
		hsc.hause.bHause22.addActionListener(ha);
		hsc.hause.bHause23.addActionListener(ha);
		hsc.hause.bHause24.addActionListener(ha);
		hsc.hause.bHause25.addActionListener(ha);
		zone.add(tsc);
		zone.setTitleAt(4, "\u0422\u0440\u0430\u043D\u0441\u043F\u043E\u0440\u0442");
		zone.setEnabledAt(4, true);
		tsc.tran.bTrans1.addActionListener(ta);
		tsc.tran.bTrans2.addActionListener(ta);
		tsc.tran.bTrans3.addActionListener(ta);
		tsc.tran.bTrans4.addActionListener(ta);
		tsc.tran.bTrans5.addActionListener(ta);
		tsc.tran.bTrans6.addActionListener(ta);
		tsc.tran.bTrans7.addActionListener(ta);
		tsc.tran.bTrans8.addActionListener(ta);
		tsc.tran.bTrans9.addActionListener(ta);
		tsc.tran.bTrans10.addActionListener(ta);
		tsc.tran.bTrans11.addActionListener(ta);
		tsc.tran.bTrans12.addActionListener(ta);
		tsc.tran.bTrans13.addActionListener(ta);
		tsc.tran.bTrans14.addActionListener(ta);
		tsc.tran.bTrans15.addActionListener(ta);
		tsc.tran.bTrans16.addActionListener(ta);
		tsc.tran.bTrans17.addActionListener(ta);
		tsc.tran.bTrans18.addActionListener(ta);
		tsc.tran.bTrans19.addActionListener(ta);
		tsc.tran.bTrans20.addActionListener(ta);
		tsc.tran.bTrans21.addActionListener(ta);
		tsc.tran.bTrans22.addActionListener(ta);
		tsc.tran.bTrans23.addActionListener(ta);
		tsc.tran.bTrans24.addActionListener(ta);
		tsc.tran.bTrans25.addActionListener(ta);
		tsc.tran.bTrans26.addActionListener(ta);
		tsc.tran.bTrans27.addActionListener(ta);
		tsc.tran.bTrans28.addActionListener(ta);
		tsc.tran.bTrans29.addActionListener(ta);
		tsc.tran.bTrans30.addActionListener(ta);
		lernpan.day = day;
		lernpan.day1 = day1;
		lernpan.year = year;
		zone.add(lernpan);
		zone.setTitleAt(5, "\u0423\u0447\u0435\u0431\u0430");
		zone.setEnabledAt(5, true);
		
				lernpan.bKoledElek.addActionListener(eh);
				lernpan.bDocUniv.addActionListener(eh);
				lernpan.bInginerUniv.addActionListener(eh);
				lernpan.bITPUniv.addActionListener(eh);
				lernpan.bITSpecUniv.addActionListener(eh);
				lernpan.bKoledSanteh.addActionListener(eh);
				lernpan.bKoledSles.addActionListener(eh);
				lernpan.bMenegerUniv.addActionListener(eh);
				lernpan.bPoliceUniv.addActionListener(eh);
				lernpan.bUristUniv.addActionListener(eh);
				lernpan.bHighScholl.addActionListener(eh);
		dlsc.dl.bDL1.addActionListener(dla);
		dlsc.dl.bDL2.addActionListener(dla);
		dlsc.dl.bDL3.addActionListener(dla);
		zone.add(dlsc);
		zone.setTitleAt(6, "\u041A\u0443\u0440\u0441\u044B");
		zone.add(dzsc);
		zone.setTitleAt(7, "\u0425\u0430\u043B\u0442\u0443\u0440\u0430");
		zone.add(insc);
		zone.setEnabledAt(8, true);

		zone.setTitleAt(8, "%");
		GroupLayout gl_lpsc = new GroupLayout(lpsc);
		gl_lpsc.setHorizontalGroup(gl_lpsc.createParallelGroup(
				Alignment.LEADING).addGap(0, 705, Short.MAX_VALUE));
		gl_lpsc.setVerticalGroup(gl_lpsc.createParallelGroup(Alignment.LEADING)
				.addGap(0, 467, Short.MAX_VALUE));
		lpsc.setLayout(gl_lpsc);
		zone.setTitleAt(1, "\u0420\u0430\u0431\u043E\u0442\u0430");
		zone.setEnabledAt(1, true);
		BarFood.setToolTipText("\u0415\u0434\u0430");
		BarFood.setMaximum(10000);
		lpsc.LernBar.setMaximum(dayToLerning);
		lpsc.LernBar.setValue(day1 - dayStartLern);

		BarFood.setForeground(new Color(0, 0, 128));
		BarFood.setStringPainted(true);
		BarFood.setValue(5000);
		BarFood.setOrientation(SwingConstants.VERTICAL);

		lDays.setText("");
		s2 = "Деньги  Р " + money;
		lMoney1.setText(s2);
		//bStartTime.addActionListener(this);
		//bFastTime.addActionListener(this);
		//bStopTime.addActionListener(this);
		
		wp.wpan.bPromouter.addActionListener(aw);
		wp.wpan.bAdmin.addActionListener(aw);
		wp.wpan.bBoss.addActionListener(aw);
		wp.wpan.bCurer.addActionListener(aw);
		wp.wpan.bDoc.addActionListener(aw);
		wp.wpan.bBossDoc.addActionListener(aw);
		wp.wpan.bBossGov.addActionListener(aw);
		wp.wpan.bBossInginerProj.addActionListener(aw);
		wp.wpan.bBossIT.addActionListener(aw);
		wp.wpan.bBossOtdel.addActionListener(aw);
		wp.wpan.bBossPolice.addActionListener(aw);
		wp.wpan.bBossZeh.addActionListener(aw);
		wp.wpan.bCliner.addActionListener(aw);
		wp.wpan.bDriverB.addActionListener(aw);
		wp.wpan.bDriverC.addActionListener(aw);
		wp.wpan.bDriverD.addActionListener(aw);
		wp.wpan.bElek.addActionListener(aw);
		wp.wpan.bInginer.addActionListener(aw);
		wp.wpan.bITSpec.addActionListener(aw);
		wp.wpan.bMeneger.addActionListener(aw);
		wp.wpan.bPoliceman.addActionListener(aw);
		wp.wpan.bProgrammer.addActionListener(aw);
		wp.wpan.bSaler.addActionListener(aw);
		wp.wpan.bSanitar.addActionListener(aw);
		wp.wpan.bSanteh.addActionListener(aw);
		wp.wpan.bSekretar.addActionListener(aw);
		wp.wpan.bUrist.addActionListener(aw);
		wp.wpan.bWorkerZavod.addActionListener(aw);
		wp.wpan.bZamBoss.addActionListener(aw);
		insc.inv.bInv1.addActionListener(ina);
		insc.inv.bInv2.addActionListener(ina);
		insc.inv.bInv3.addActionListener(ina);
		insc.ban.bbBack.addActionListener(ina);
		insc.ban.bPutMoney.addActionListener(ina);
		insc.ban.bTakeKredit.addActionListener(ina);
		insc.ban.bTakeMoney.addActionListener(ina);
		bsc.bisn.bBisn1.addActionListener(ba);
		bsc.bisn.bBisn2.addActionListener(ba);
		bsc.bisn.bBisn3.addActionListener(ba);
		bsc.bisn.bBisn4.addActionListener(ba);
		bsc.bisn.bBisn5.addActionListener(ba);
		bsc.bisn.bBisn6.addActionListener(ba);
		bsc.bisn.bBisn7.addActionListener(ba);
		bsc.bisn.bBisn8.addActionListener(ba);
		bsc.bisn.bBisn9.addActionListener(ba);
		bsc.bisn.bBisn10.addActionListener(ba);
		bsc.bisn.bBisn11.addActionListener(ba);
		bsc.bisn.bBisn12.addActionListener(ba);
		bsc.bisn.bBisn13.addActionListener(ba);
		bsc.bisn.bBisn14.addActionListener(ba);
		bsc.bisn.bBisn15.addActionListener(ba);
		bsc.bisn.bBisn16.addActionListener(ba);
		bsc.bisn.bBisn17.addActionListener(ba);
		bsc.bisn.bBisn18.addActionListener(ba);
		bsc.bisn.bBisn19.addActionListener(ba);
		bsc.bisn.bBisn20.addActionListener(ba);
		bsc.lar.bBack.addActionListener(ba);
		bsc.lar.bPlus1.addActionListener(ba);
		bsc.lar.bStartComp.addActionListener(ba);
		bsc.lar.bSellLarek.addActionListener(ba);
		bsc.mSite.bBack.addActionListener(ba);
		bsc.mSite.bPlus1.addActionListener(ba);
		bsc.mSite.bSellSite.addActionListener(ba);
		bsc.mSite.bStartComp.addActionListener(ba);
		bsc.shop.bBack.addActionListener(ba);
		bsc.shop.bMinus1.addActionListener(ba);
		bsc.shop.bPlus1.addActionListener(ba);
		bsc.shop.bStartComp.addActionListener(ba);
		bsc.hm.bBack.addActionListener(ba);
		bsc.hm.bBild.addActionListener(ba);
		bsc.hm.bSell.addActionListener(ba);
		bsc.hm.bStartComp.addActionListener(ba);
		insc.pi.bBack.addActionListener(ina);
		insc.pi.bInvest.addActionListener(ina);
		insc.pi.bTakeMoney.addActionListener(ina);
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(LHealth, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BarHealth, GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
							.addGap(39))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(BarTidy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(zone, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lTidy, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(bBack)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lDays, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(bStopTime, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(bStartTime, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(bFastTime, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lMoney1, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lFood, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(BarFood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(LHealth, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(BarHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(BarFood, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
								.addComponent(BarTidy, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
							.addGap(1))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(zone, GroupLayout.PREFERRED_SIZE, 501, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(lFood, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(lTidy, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(bBack)
								.addComponent(lDays, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lMoney1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(bStartTime, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(bStopTime, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
								.addComponent(bFastTime, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
		);
		lTidy.setFont(new Font("Dialog", Font.BOLD, 32));
		zone.add(bsc);
		zone.setTitleAt(9, "\u0411\u0438\u0437\u043D\u0435\u0441\u0441");
		zone.setEnabledAt(9, true);
		lFood.setFont(new Font("Dialog", Font.BOLD, 32));
		LHealth.setFont(new Font("Dialog", Font.BOLD, 32));
		setLayout(groupLayout);
		eat =(int) eat1;
		tidy = (int)tidy1;
		
		if(canToCredit<100000){
			canToCredit=100000;
		}
		minMoney=canToCredit/250;
		if(minMoney<1000){
			minMoney=1000;
		}
		
	}

	

	public void daycount2() throws IOException{
		//time2.start();
		if (timeFast == true) {
			day++;
			System.out.println(day);
		} else {
		}
		if (day == 365) {
			year++;
		}

	}

	public void lern() throws IOException{

		if (KoledElekStart == true) {
			dayToLerning = 365;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				KoledElek = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bKoledElek.setBackground(Color.MAGENTA);
			}

		}
		if (KoledSlesStart == true) {
			dayToLerning = 365;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				KoledSles = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bKoledSles.setBackground(Color.MAGENTA);
			}

		}
		if (KoledSantehStart == true) {
			dayToLerning = 365;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				KoledSanteh = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bKoledSanteh.setBackground(Color.MAGENTA);
			}

		}
		if (DocUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				DocUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bDocUniv.setBackground(Color.MAGENTA);
			}

		}
		if (PoliceUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				PoliceUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bPoliceUniv.setBackground(Color.MAGENTA);
			}

		}
		if (InginerUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				InginerUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bInginerUniv.setBackground(Color.MAGENTA);
			}

		}
		if (ITPUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				ITPUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bITPUniv.setBackground(Color.MAGENTA);
			}

		}
		if (ITSpecUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				ITSpecUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bITSpecUniv.setBackground(Color.MAGENTA);
			}

		}
		if (UristUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				UristUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bUristUniv.setBackground(Color.MAGENTA);
			}

		}
		if (MenegerUnivStart == true) {
			dayToLerning = 2190;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				MenegerUniv = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bMenegerUniv.setBackground(Color.MAGENTA);
			}

		}
		if (HighSchollStart == true) {
			dayToLerning = 1460;
			// lerning=true;
			if (day1 - dayStartLern == dayToLerning) {
				HighScholl = true;
				lerning = false;
				dayToLerning = 0;
				lernpan.bHighScholl.setBackground(Color.MAGENTA);
			}

		}
		if (lerning == true) {
			lernpan.bKoledElek.setEnabled(false);
			lernpan.bDocUniv.setEnabled(false);
			lernpan.bInginerUniv.setEnabled(false);
			lernpan.bITPUniv.setEnabled(false);
			lernpan.bITSpecUniv.setEnabled(false);
			lernpan.bKoledSanteh.setEnabled(false);
			lernpan.bKoledSles.setEnabled(false);
			lernpan.bMenegerUniv.setEnabled(false);
			lernpan.bPoliceUniv.setEnabled(false);
			lernpan.bUristUniv.setEnabled(false);
			lernpan.bHighScholl.setEnabled(false);
		} else {
			lernpan.bKoledElek.setEnabled(true);
			lernpan.bDocUniv.setEnabled(true);
			lernpan.bInginerUniv.setEnabled(true);
			lernpan.bITPUniv.setEnabled(true);
			lernpan.bITSpecUniv.setEnabled(true);
			lernpan.bKoledSanteh.setEnabled(true);
			lernpan.bKoledSles.setEnabled(true);
			lernpan.bMenegerUniv.setEnabled(true);
			lernpan.bPoliceUniv.setEnabled(true);
			lernpan.bUristUniv.setEnabled(true);
			lernpan.bHighScholl.setEnabled(true);
		}
	}

	public void work() throws IOException{

		if (year >= 18) {
			wp.wpan.bSaler.setEnabled(true);
			wp.wpan.bCliner.setEnabled(true);
			wp.wpan.bSekretar.setEnabled(true);
			wp.wpan.bSanitar.setEnabled(true);
			wp.wpan.bAdmin.setEnabled(true);

		}
		if(year>=18& dlsc.dl.bDL1.getBackground()==Color.pink){
			wp.wpan.bDriverB.setEnabled(true);
		}
		if(year>=18& dlsc.dl.bDL2.getBackground()==Color.pink){
			wp.wpan.bDriverC.setEnabled(true);
		}
		if(year>=18& dlsc.dl.bDL3.getBackground()==Color.pink){
			wp.wpan.bDriverD.setEnabled(true);
		}
		if (KoledSles == true & year >= 18) {
			wp.wpan.bWorkerZavod.setEnabled(true);
			if(xp>=1800&prestige>=500){
				wp.wpan.bBossZeh.setEnabled(true);
			}
		}
		if (KoledSanteh == true & year >= 18) {
			wp.wpan.bSanteh.setEnabled(true);
		}
		if (KoledElek == true & year >= 18) {
			wp.wpan.bElek.setEnabled(true);
		}
		if (InginerUniv == true & year >= 18) {
			wp.wpan.bInginer.setEnabled(true);
			if(xp>=1500&prestige>=1000){
				wp.wpan.bBossInginerProj.setEnabled(true);
			}
		}
		if (PoliceUniv == true & year >= 18) {
			wp.wpan.bPoliceman.setEnabled(true);
			wp.wpan.bUrist.setEnabled(true);
			if(prestige>=800&xp>=1600){
				wp.wpan.bBossPolice.setEnabled(true);
			}
		}
		if (DocUniv == true & year >= 18) {
			wp.wpan.bDoc.setEnabled(true);
			if(xp>=1800&prestige>=1000){
				wp.wpan.bBossDoc.setEnabled(true);
			}
		}
		if (ITPUniv == true & year >= 18) {
			wp.wpan.bProgrammer.setEnabled(true);
			wp.wpan.bITSpec.setEnabled(true);
			if(xp>=1600&prestige>=1100){
				wp.wpan.bBossIT.setEnabled(true);
			}
		}
		if (ITSpecUniv == true & year >= 18) {
			wp.wpan.bITSpec.setEnabled(true);
			if(xp>=6500&prestige>=1100){
				wp.wpan.bBossIT.setEnabled(true);
			}
		}
		if (MenegerUniv == true & year >= 18) {
			wp.wpan.bMeneger.setEnabled(true);
			if(xp>=1800&prestige>=1250){
				wp.wpan.bBossGov.setEnabled(true);
			}
		}
		if (UristUniv == true & year >= 18) {
			wp.wpan.bUrist.setEnabled(true);
			wp.wpan.bPoliceman.setEnabled(true);
			if(prestige>=800&xp>=1600){
				wp.wpan.bBossPolice.setEnabled(true);
			}
		}
		if(year>=18){
			if(InginerUniv==true||PoliceUniv==true||DocUniv==true||ITPUniv==true||ITSpecUniv==true||UristUniv==true||MenegerUniv==true&(HighScholl==true)){
				if(xp>=4500&prestige>=3000){
					wp.wpan.bBossOtdel.setEnabled(true);
				}
				if(xp>=6000&prestige>=4250){
					wp.wpan.bZamBoss.setEnabled(true);
				}
				if(xp>=8000&prestige>=7000){
					wp.wpan.bBoss.setEnabled(true);
				}
			}
		}
		
		s2 = "Деньги  Р " + money;
		hp.lMoney.setText(s2);
		lMoney1.setText(s2);

	}

	public void info() throws IOException{

		s3 = "XP(Опыт)  " + (int) xp;
		hp.lXP.setText(s3);
		s4 = "Престиж  " + prestige;
		hp.lPrestige.setText(s4);
		wp.WorkBar.setValue(dayZarp);
		;
		BarFood.setValue((int)eat1);
		BarTidy.setValue(tidy);
		BarHealth.setValue(healthy);
		lernpan.LernBar.setMaximum(dayToLerning);
		lernpan.LernBar.setValue(day1 - dayStartLern);
		// прописать deat, dhealth,dtidy;
		// if(timeStart==true){
		if (timeStart == true) {
			if (wp.wpan.bPromouter.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(50);
				xp++;
				
			}
			if (wp.wpan.bAdmin.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(100);
				xp=xp+2;
				
			}
			if (wp.wpan.bBoss.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(100);
				xp=xp+7;
				
			}
			if (wp.wpan.bBossDoc.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(100);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+4;
				
			}
			if (wp.wpan.bBossGov.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+4;
				
			}
			if (wp.wpan.bBossInginerProj.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(100);
				xp=xp+4;
				
			}
			if (wp.wpan.bBossIT.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(150);
				xp=xp+4;
			}
			if (wp.wpan.bBossOtdel.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+5;
				
			}
			if (wp.wpan.bBossPolice.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(150);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+4;
				
			}
			if (wp.wpan.bBossZeh.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(100);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+4;
				
			}
			if (wp.wpan.bCliner.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(50);
				xp++;
				
			}
			if (wp.wpan.bCurer.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(50);
				xp++;
				
				
			}
			if (wp.wpan.bDoc.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(100);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+3;
				

			}
			if (wp.wpan.bDriverB.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(150);
				deat = rand.nextInt(150);
				dtidy =100+ rand.nextInt(100);
				xp=xp+2;
				
			}
			if (wp.wpan.bDriverC.getBackground() == Color.GREEN) {
				dhelth =50+ rand.nextInt(150);
				deat = rand.nextInt(150);
				dtidy =100+ rand.nextInt(150);
				xp=xp+2;
				
			}
			if (wp.wpan.bDriverD.getBackground() == Color.GREEN) {
				dhelth =50+ rand.nextInt(150);
				deat = rand.nextInt(150);
				dtidy =100+ rand.nextInt(150);
				xp=xp+2;
				
			}
			if (wp.wpan.bElek.getBackground() == Color.GREEN) {
				dhelth =50+ rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+2;
				
			}
			if (wp.wpan.bInginer.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(50);
				xp=xp+3;
				
			}
			if (wp.wpan.bITSpec.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(150);
				xp=xp+3;
				
			}
			if (wp.wpan.bMeneger.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(150);
				xp=xp+3;
				
			}
			if (wp.wpan.bPoliceman.getBackground() == Color.GREEN) {
				dhelth =50+ rand.nextInt(100);
				deat = rand.nextInt(150);
				dtidy =50 +rand.nextInt(150);
				xp=xp+3;
				
			}
			if (wp.wpan.bProgrammer.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(100);
				xp=xp+3;
				
			}
			if (wp.wpan.bSaler.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(100);
				xp++;
			}
			if (wp.wpan.bSanitar.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(100);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(100);
				xp++;
			
			}
			if (wp.wpan.bSanteh.getBackground() == Color.GREEN) {
				dhelth = 50+rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy =50+ rand.nextInt(100);
				xp=xp+2;
				
			}
			if (wp.wpan.bSekretar.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = rand.nextInt(100);
				xp++;
				
			}
			if (wp.wpan.bUrist.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy = 50+rand.nextInt(100);
				xp=xp+3;
				
			}
			if (wp.wpan.bWorkerZavod.getBackground() == Color.GREEN) {
				dhelth =50+ rand.nextInt(50);
				deat = 50+rand.nextInt(100);
				dtidy = rand.nextInt(50);
				xp=xp+2;
				
			}
			if (wp.wpan.bZamBoss.getBackground() == Color.GREEN) {
				dhelth = rand.nextInt(50);
				deat = rand.nextInt(150);
				dtidy =50+rand.nextInt(100);
				xp=xp+6;
				
			}
		}
	}

	public void transport() throws IOException{
		if(timeStart==true){
			if(tsc.tran.bTrans1.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.98;
				t1Live=day1-t1LiveS;
				tsc.tran.bTrans1.setText("Самокат 2'500Р 0Р/год "+ t1Live+" /1825дней(5 лет)");
				if(t1Live>=1825){
					tsc.tran.bTrans1.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans1.setText("Самокат 2'500Р 0Р/год  0 /1825дней(5 лет)");
					tr1=false;
				}
				if(day>=1825){
					money=money-0;
				}
			}
			if(tsc.tran.bTrans2.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.96;
				t2Live=day1-t2LiveS;
				tst2=500;
				tsc.tran.bTrans2.setText("Велосипед 7'500Р 500Р/год "+ t2Live+" /1825дней(5 лет)");
				if(t2Live>=1825){
					tsc.tran.bTrans2.setBackground(bStartTime.getBackground());
					tr2=false;
					tsc.tran.bTrans2.setText("Велосипед 7'500Р 500/год  0 /1825дней(5 лет)");
				}
				if(day>=365){
					money=money-500;
				}
			}
			if(tsc.tran.bTrans3.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.90;
				t3Live=day1-t3LiveS;
				tst3=4500;
				tsc.tran.bTrans3.setText("Мопед 15'000Р 4'500Р/год "+ t3Live+" /1825дней(5 лет)");
				if(t3Live>=1825){
					tr3=false;
					tsc.tran.bTrans3.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans3.setText("Мопед 15'000Р 4'500Р/год  0 /1825дней(5 лет)");
				}
				if(day==365){
					money=money-4500;
				}
			}
			if(tsc.tran.bTrans4.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.89;
				t4Live=day1-t4LiveS;
				tst4=+7500;
				tsc.tran.bTrans4.setText("Скутер 35'000Р 7'500Р/год "+ t4Live+" /1825дней(5 лет)");
				if(t4Live>=1825){
					tr4=false;
					tsc.tran.bTrans4.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans4.setText("Самокат 35'000Р 7'500Р/год  0 /1825дней(5 лет)");
				}
				if(day==365){
					money=money-7500;
				}
			}
			if(tsc.tran.bTrans5.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.88;
				t5Live=day1-t5LiveS;
				tst5=12500;
				tsc.tran.bTrans1.setText("Мотоцикл 70'000Р 12'500Р/год "+ t5Live+" /1825дней(5 лет)");
				if(t5Live>=1825){
					tr5=false;
					tsc.tran.bTrans5.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans5.setText("Мотоцикл 70'000Р 12'500Р/год  0 /1825дней(5 лет)");
				}
				if(day==365){
					money=money-12500;
				}
			}
			if(tsc.tran.bTrans6.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.78;
				t6Live=day1-t6LiveS;
				tst6=+15000;
				tsc.tran.bTrans6.setText("ВАЗ 2114 150'000Р 15'000Р/год "+ t6Live+" /2555дней(7 лет) + бензин");
				if(t6Live>=2555){
					tr6=false;
					tsc.tran.bTrans6.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans6.setText("ВАЗ 2114 150'000Р 15'000Р/год  0 /2555дней(7 лет) + бензин");
				}
				if(day>=365){
					money=money-15000;
				}
			}
			if(tsc.tran.bTrans7.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.75;
				t7Live=day1-t7LiveS;
				tst7=+20000;
				tsc.tran.bTrans7.setText("Lada 110 200'000Р 20'000Р/год "+ t7Live+" /2737дней(7,5 лет) + бензин");
				if(t7Live>=2737){
					tr7=false;
					tsc.tran.bTrans7.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans7.setText("Lada 110 200'000Р 20'000Р/год  0 /2737дней(7,5 лет) + бензин");
				}
				if(day>=365){
					money=money-20000;
				}
			}
			if(tsc.tran.bTrans8.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.73;
				t8Live=day1-t8LiveS;
				tst8=20500;
				tsc.tran.bTrans8.setText("Lada Kalina 350'000Р 20'500Р/год "+ t8Live+" /2737дней(7,5 лет) + бензин");
				if(t8Live>=2737){
					tr8=false;
					tsc.tran.bTrans8.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans8.setText("Lada Kalina 350'000Р 20'500Р/год  0 /2737дней(7,5 лет) + бензин");
				}
				if(day>=365){
					money=money-20500;
				}
			}
			if(tsc.tran.bTrans9.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.72;
				t9Live=day1-t9LiveS;
				tst9=22000;
				tsc.tran.bTrans9.setText("Daewoo Nexia 420'000Р 22'000Р/год "+ t9Live+" /2737дней(7,5 лет) + бензин");
				if(t9Live>=2737){
					tr9=false;
					tsc.tran.bTrans9.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans9.setText("Daewoo Nexia 420'000Р 22'000Р/год  0 /2737дней(7,5 лет) + бензин");
				}
				if(day>=365){
					money=money-22000;
				}
			}
			if(tsc.tran.bTrans10.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.7;
				t10Live=day1-t10LiveS;
				tst10=25000;
				tsc.tran.bTrans10.setText("Lada Largus 570'000Р 25'000Р/год "+ t10Live+" /2737дней(7,5 лет) + бензин");
				if(t10Live>=2737){
					tr10=false;
					tsc.tran.bTrans10.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans10.setText("Lada Largus 570'000Р 25'000Р/год  0 /2737дней(7,5 лет) + бензин");
				}
				if(day>=365){
					money=money-25000;
				}
			}
			if(tsc.tran.bTrans11.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.68;
				t11Live=day1-t11LiveS;
				tst11=25000;
				tsc.tran.bTrans11.setText("Renault Logan 650'000Р 25'000Р/год "+ t11Live+" /2920дней(8 лет) + бензин");
				if(t11Live>=2920){
					tr11=false;
					tsc.tran.bTrans11.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans11.setText("Renault Logan 650'000Р 25'000Р/год  0 /2920дней(8 лет) + бензин");
				}
				if(day>=365){
					money=money-25000;
				}
			}
			if(tsc.tran.bTrans12.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.65;
				t12Live=day1-t12LiveS;
				tst12=28000;
				tsc.tran.bTrans12.setText("УАЗ Патриот 800'000Р 28'000Р/год "+ t12Live+" /2920дней(8 лет) + бензин");
				if(t12Live>=2920){
					tr12=false;
					tsc.tran.bTrans12.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans12.setText("УАЗ Патриот 800'000Р 28'000Р/год  0 /2920дней(8 лет) + бензин");
				}
				if(day>=365){
					money=money-28000;
				}
			}
			if(tsc.tran.bTrans13.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.62;
				t13Live=day1-t13LiveS;
				tst13=35000;
				tsc.tran.bTrans13.setText("Ford FocusIII 1'000'000Р 35'000Р/год "+ t13Live+" / 2920дней(8 лет) + бензин");
				if(t13Live>=2920){
					tr13=false;
					tsc.tran.bTrans13.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans13.setText("Ford FocusIII 1'000'000Р 35'000Р/год  0 / 2920дней(8 лет) + бензин");
				}
				if(day>=365){
					money=money-35000;
				}
			}
			if(tsc.tran.bTrans14.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.58;
				t14Live=day1-t14LiveS;
				tst14=40000;
				tsc.tran.bTrans14.setText("Ssang Yong Action 1'500'000Р 40'000Р/год "+ t14Live+" /2920дней(8 лет) + бензин");
				if(t14Live>=2920){
					tr14=false;
					tsc.tran.bTrans14.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans14.setText("СSsang Yong Action 1'500'000Р 40'000Р/год  0 /2920дней(8 лет) + бензин");
				}
				if(day>=365){
					money=money-40000;
				}
			}
			if(tsc.tran.bTrans15.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.56;
				t15Live=day1-t15LiveS;
				tst15=50000;
				tsc.tran.bTrans15.setText("VolksWagen Touareg 1'800'000Р 50'000Р/год "+ t15Live+" /3285дней(9 лет) + бензин");
				if(t15Live>=3285){
					tr15=false;
					tsc.tran.bTrans15.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans15.setText("VolksWagen Touareg 1'800'000Р 50'000Р/год  0 /3285дней(9 лет) + бензин");
				}
				if(day>=365){
					money=money-50000;
				}
			}
			if(tsc.tran.bTrans16.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.53;
				t16Live=day1-t16LiveS;
				tst16=80000;
				tsc.tran.bTrans16.setText("Mersedes-Benz 2'500'000Р 80'000Р/год "+ t16Live+" /3650дней(10 лет) + бензин");
				if(t16Live>=3650){
					tr16=false;
					tsc.tran.bTrans16.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans16.setText("Mersedes-Benz 2'500'000Р 80'000Р/год  0 /3650дней(10 лет) + бензин");
				}
				if(day>=365){
					money=money-80000;
				}
			}
			if(tsc.tran.bTrans17.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.51;
				t17Live=day1-t17LiveS;
				tst17=100000;
				tsc.tran.bTrans17.setText("BMW X6 4'000'000Р 100'000Р/год "+ t17Live+" /3650дней(5 лет) + бензин");
				if(t17Live>=3650){
					tr17=false;
					tsc.tran.bTrans17.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans17.setText("BMW X6 4'000'000Р 100'000Р/год  0 /3650дней(10 лет) + бензин");
				}
				if(day>=365){
					money=money-100000;
				}
			}
			if(tsc.tran.bTrans18.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.51;
				t18Live=day1-t18LiveS;
				tst18=100000;
				tsc.tran.bTrans18.setText("Audi 4'000'000Р 100'000Р/год "+ t18Live+" /3650дней(10 лет) + бензин");
				if(t18Live>=3650){
					tr18=false;
					tsc.tran.bTrans18.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans18.setText("Audi 4'000'000Р 100'000Р/год  0 /3650дней(10 лет) + бензин");
				}
				if(day>=365){
					money=money-100000;
				}
			}
			if(tsc.tran.bTrans19.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.48;
				t19Live=day1-t19LiveS;
				tst19=200000;
				tsc.tran.bTrans19.setText("Lexus 5'500'000Р 200'000Р/год "+ t19Live+" /4015дней(11 лет) + бензин");
				if(t19Live>=4015){
					tr19=false;
					tsc.tran.bTrans19.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans19.setText("Lexus 5'500'000Р 200'000Р/год  0 /4015дней(11 лет) + бензин");
				}
				if(day>=365){
					money=money-200000;
				}
			}
			if(tsc.tran.bTrans20.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.45;
				t20Live=day1-t20LiveS;
				tst20=175000;
				tsc.tran.bTrans20.setText("Porshe 7'500'000Р 175'000Р/год "+ t20Live+" /4015дней(11 лет) + бензин");
				if(t20Live>=4015){
					tr20=false;
					tsc.tran.bTrans20.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans20.setText("Porshe 7'500'000Р 175'000Р/год  0 /4015дней(11 лет) + бензин");
				}
				if(day>=365){
					money=money-175000;
				}
			}
			if(tsc.tran.bTrans21.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.42;
				t21Live=day1-t21LiveS;
				tst21=250000;
				tsc.tran.bTrans21.setText("Ferari 12'000'000Р 250'000Р/год "+ t21Live+" /4015дней(11 лет) + бензин");
				if(t21Live>=4015){
					tr21=false;
					tsc.tran.bTrans21.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans21.setText("Ferari 12'000'000Р 250'000Р/год  0 /4015дней(11 лет) + бензин");
				}
				if(day>=365){
					money=money-250000;
				}
			}
			if(tsc.tran.bTrans22.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.40;
				t22Live=day1-t22LiveS;
				tst22=300000;
				tsc.tran.bTrans22.setText("Lamborgini 18млнР 300'000Р/год "+ t22Live+" /4015дней(11 лет) + бензин");
				if(t22Live>=4015){
					tr22=false;
					tsc.tran.bTrans22.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans22.setText("Lamborgini 18млнР 300'000Р/год  0 /4015дней(11 лет) + бензин");
				}
				if(day>=365){
					money=money-300000;
				}
			}
			if(tsc.tran.bTrans23.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.37;
				t23Live=day1-t23LiveS;
				tst23=350000;
				tsc.tran.bTrans23.setText("Bentli 25млн Р 350'000Р/год "+ t23Live+" /4015дней(11 лет)+ бензин");
				if(t23Live>=4015){
					tr23=false;
					tsc.tran.bTrans23.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans23.setText("Bentli 25млн Р 350'000Р/год  0 /4015дней(11 лет)+ бензин");
				}
				if(day>=365){
					money=money-350000;
				}
			}
			if(tsc.tran.bTrans24.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.3;
				t24Live=day1-t24LiveS;
				tst24=2000000;
				tsc.tran.bTrans24.setText("Вертолет 50млн Р 2млн Р/год "+ t24Live+" /7300дней(20 лет)");
				if(t24Live>=7300){
					tr24=false;
					tsc.tran.bTrans24.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans24.setText("Вертолет 50млн Р 2млн Р/год  0 /7300дней(20 лет)");
				}
				if(day>=365){
					money=money-2*1000*1000;
				}
			}
			if(tsc.tran.bTrans25.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.28;
				t25Live=day1-t25LiveS;
				tst25=3000000;
				tsc.tran.bTrans25.setText("Bugatti 130млн Р 3млн /год "+ t25Live+" /5475дней(15 лет)");
				if(t25Live>=5475){
					tr25=false;
					tsc.tran.bTrans25.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans25.setText("Bugatti 130млн Р 3млн Р/год  0 /5475дней(15 лет)");
				}
				if(day>=365){
					money=money-3000*1000;
				}
			}
			if(tsc.tran.bTrans26.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.2;
				t26Live=day1-t26LiveS;
				tst26=12000000;
				tsc.tran.bTrans26.setText("Яхта 400млн Р 12млн Р/год "+ t26Live+" /9125дней(25 лет)");
				if(t26Live>=9125){
					tr26=false;
					tsc.tran.bTrans26.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans26.setText("Яхта 400млн Р 12млн Р/год  0 /9125дней(25 лет)");
				}
				if(day>=365){
					money=money-12000*1000;
				}
			}
			if(tsc.tran.bTrans27.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.15;
				t27Live=day1-t27LiveS;
				tst27=50000000;
				tsc.tran.bTrans27.setText("Самолет 1,5млрд Р 50млн Р/год "+ t27Live+" /9125дней(25 лет)");
				if(t27Live>=9125){
					tr27=false;
					tsc.tran.bTrans27.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans27.setText("Самолет 1,5млрд Р 50млн Р/год  0 /9125дней(25 лет)");
				}
				if(day>=365){
					money=money-50*1000*1000;
				}
			}
			if(tsc.tran.bTrans28.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.11;
				t28Live=day1-t28LiveS;
				tst28=500000000;
				tsc.tran.bTrans28.setText("Буран 12млрд Р 500млн Р/год "+ t28Live+" /9125дней(25 лет)");
				if(t28Live>=9125){
					tr28=false;
					tsc.tran.bTrans28.setBackground(bStartTime.getBackground());
					tsc.tran.bTrans28.setText("Буран 12млрд Р 500млн Р/год  0 /9125дней(25 лет)");
				}
				if(day>=365){
					money=money-500*1000*1000;
				}
			}
			if(tsc.tran.bTrans29.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.05;
				
				tst29=80000000;
				
				
				if(day>=365){
					money=money-80000*1000;
				}
			}
			if(tsc.tran.bTrans30.getBackground()==Color.LIGHT_GRAY){
				mtidy=0.01;
				tst30=100000000;
				
				if(day>=365){
					money=money-100000L*1000;
				}
			}
			 // отписать изменения топлива;
		if(tsc.tran.bTrans6.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans7.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans8.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans9.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans10.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans11.getBackground()==Color.LIGHT_GRAY){
			
			Toplivo=33500;
			
		}
		if(tsc.tran.bTrans13.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans14.getBackground()==Color.LIGHT_GRAY){
			
			Toplivo=38500;
		}
		if(tsc.tran.bTrans12.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans15.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans16.getBackground()==Color.LIGHT_GRAY){
			Toplivo=49000;
		}
		if(tsc.tran.bTrans17.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans18.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans19.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans20.getBackground()==Color.LIGHT_GRAY){
			Toplivo=65000;
		}
		if(tsc.tran.bTrans21.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans22.getBackground()==Color.LIGHT_GRAY||
				tsc.tran.bTrans23.getBackground()==Color.LIGHT_GRAY){
			Toplivo=88000;
		}
			tsc.LToplivo.setText("Топливо за год "+Toplivo+"Р");
			if(day>=365){
				money=money-Toplivo;
			}
			
		}
		
	}


	
	public void houseinfo ()throws IOException{
		if(hsc.hause.bHause1.getBackground()==Color.YELLOW){
			mEat=0.98;
			ht1=60000;
			if(day>=365){
				money=money-60000L;
			}
		}
		if(hsc.hause.bHause2.getBackground()==Color.YELLOW){
			mEat=0.97;
			ht2=120000;
			if(day>=365){
				money=money-120000L;
			}
		}
		if(hsc.hause.bHause3.getBackground()==Color.YELLOW){
			ht3=65000L*h3;
			mEat=0.95;
			if(day>=365){
				money=money-65000L*h3;
			}
		}
		if(hsc.hause.bHause4.getBackground()==Color.YELLOW){
			ht4=85000*h4;
			mEat=0.93;
			if(day>=365){
				money=money-85000L*h4;
			}
		}
		if(hsc.hause.bHause5.getBackground()==Color.YELLOW){
			ht5=100000L*h5;
			mEat=0.9;
			if(day>=365){
				money=money-100000L*h5;
			}
		}
		if(hsc.hause.bHause6.getBackground()==Color.YELLOW){
			ht6=120000L*h6;
			mEat=0.86;
			if(day>=365){
				money=money-120000L*h6;
			}
		}
		if(hsc.hause.bHause7.getBackground()==Color.YELLOW){
			ht7=60000L*h7;
			mEat=0.96;
			if(day>=365){
				money=money-60000L*h7;
			}
		}
		if(hsc.hause.bHause8.getBackground()==Color.YELLOW){
			ht8=66000L*h8;
			mEat=0.94;
			if(day>=365){
				money=money-66000L*h8;
			}
		}
		if(hsc.hause.bHause9.getBackground()==Color.YELLOW){
			ht9=90000L*h9;
			mEat=0.91;
			if(day>=365){
				money=money-90000L*h9;
			}
		}
		if(hsc.hause.bHause10.getBackground()==Color.YELLOW){
			ht10=115000L*h10;
			mEat=0.88;
			if(day>=365){
				money=money-115000L*h10;
			}
		}
		if(hsc.hause.bHause11.getBackground()==Color.YELLOW){
			ht11=137000L*h11;
			mEat=0.84;
			if(day>=365){
				money=money-137000L*h11;
			}
		}
		if(hsc.hause.bHause12.getBackground()==Color.YELLOW){
			ht12=125000L*h12;
			mEat=0.87;
			if(day>=365){
				money=money-125000L*h12;
			}
		}
		if(hsc.hause.bHause13.getBackground()==Color.YELLOW){
			ht13=300000L*h13;
			mEat=0.83;
			if(day>=365){
				money=money-300000L*h13;
			}
		}
		if(hsc.hause.bHause14.getBackground()==Color.YELLOW){
			ht14=375000L*h14;
			mEat=0.78;
			if(day>=365){
				money=money-375000L*h14;
			}
		}
		if(hsc.hause.bHause15.getBackground()==Color.YELLOW){
			ht15=600000L*h15;
			mEat=0.75;
			if(day>=365){
				money=money-600000L*h15;
			}
		}
		if(hsc.hause.bHause16.getBackground()==Color.YELLOW){
			ht16=1150000L*h16;
			mEat=0.7;
			if(day>=365){
				money=money-1150000L*h16;
			}
		}
		if(hsc.hause.bHause17.getBackground()==Color.YELLOW){
			ht17=1400000L*h17;
			mEat=0.65;
			if(day>=365){
				money=money-1400000L*h17;
			}
		}
		if(hsc.hause.bHause18.getBackground()==Color.YELLOW){
			ht18=900000L*h18;
			mEat=0.7;
			if(day>=365){
				money=money-900000L*h18;
			}
		}
		if(hsc.hause.bHause19.getBackground()==Color.YELLOW){
			ht19=2500000L*h19;
			mEat=0.6;
			if(day>=365){
				money=money-2500000L*h19;
			}
		}
		if(hsc.hause.bHause20.getBackground()==Color.YELLOW){
			ht20=500000L*h20;
			mEat=0.72;
			if(day>=365){
				money=money-500000L*h20;
			}
		}
		if(hsc.hause.bHause21.getBackground()==Color.YELLOW){
			ht21=1000000L*h21;
			mEat=0.65;
			if(day>=365){
				money=money-1000000L*h21;
			}
		}
		if(hsc.hause.bHause22.getBackground()==Color.YELLOW){
			ht22=3500000L*h22;
			mEat=0.55;
			if(day>=365){
				money=money-3500000L*h22;
			}
		}
		if(hsc.hause.bHause23.getBackground()==Color.YELLOW){
			ht23=17500000L*h23;
			mEat=0.45;
			if(day>=365){
				money=money-17500000L*h23;
			}
		}
		if(hsc.hause.bHause24.getBackground()==Color.YELLOW){
			ht24=40000000L*h24;
			mEat=0.35;
			if(day>=365){
				money=money-40000000L*h24;
			}
		}
		if(hsc.hause.bHause25.getBackground()==Color.YELLOW){
			ht25=57500000L*h25;
			mEat=0.2;
			if(day>=365){
				money=money-57500000L*h25;
			}
		}
		
	}
	
	public void doplern()throws IOException{
		if(dlsc.dl.bDL1.getBackground()==Color.yellow){
			daydLtoL1=180;
			x=day1-daydLS1;
			dlb1=true;
			dlsc.dl.bDL1.setText("Авто школа на права категори  B "+x+"/ 180 дней");
			if(day1-daydLS1>=daydLtoL1){
				dlsc.dl.bDL1.setBackground(Color.pink);
				
			}
		}
		if(dlsc.dl.bDL2.getBackground()==Color.yellow){
			daydLtoL2=180;
			x=day1-daydLS2;
			dlb2=true;
			dlsc.dl.bDL2.setText("Авто школа на права категори  C "+x+"/ 180 дней");
			if(day1-daydLS2>=daydLtoL2){
				dlsc.dl.bDL2.setBackground(Color.pink);
				
			}
		}
		if(dlsc.dl.bDL3.getBackground()==Color.yellow){
			daydLtoL3=180;
			x=day1-daydLS3;
			dlb3=true;
			dlsc.dl.bDL3.setText("Авто школа на права категори  B "+x+"/ 180 дней");
			if(day1-daydLS3>=daydLtoL3){
				dlsc.dl.bDL3.setBackground(Color.pink);
				
			}
		}
	}
	public void doprab(){
		
		
	}

	public void format(){
		//try {
			//f1 = new MaskFormatter("#############");
			//f2 = new MaskFormatter("#############");
		//} catch (ParseException e) {
			
		//}
	}
	public void bisness() throws IOException{
		siteToBay=(long) bsc.mSite.siteSToBay.getValue();
		siteToSell=(long) bsc.mSite.siteSToSell.getValue();
		
		hmToBild=(long) bsc.hm.tfBild.getValue();
		hmToSell=(long) bsc.hm.tfSell.getValue();
		larekToBild=(long)bsc.lar.larsBild.getValue();
		larekToSell=(long)bsc.lar.larsSell.getValue();
		shopToBay=(long)bsc.shop.shopSToBay.getValue();
		shopToSell=(long)bsc.shop.shopSToSell.getValue();
		
		zatratLarek=kolLarek*1235;
		zatratSite=kolSite*507;
		zatratShop=kolShop*3562;
		hmZatrat=hmKolvo*11500;
		if(kolLarek>0){
			bsc.lar.bPlus1.setEnabled(true);
			bsc.lar.bSellLarek.setEnabled(true);
		}else{
			bsc.lar.bPlus1.setEnabled(false);
		bsc.lar.bSellLarek.setEnabled(false);}
		
		if(kolSite>0){
			bsc.mSite.bPlus1.setEnabled(true);
			bsc.mSite.bSellSite.setEnabled(true);
		}else{
			bsc.mSite.bPlus1.setEnabled(false);
			bsc.mSite.bSellSite.setEnabled(false);
		}
		if(kolShop>0){
			bsc.shop.bMinus1.setEnabled(true);
			bsc.shop.bPlus1.setEnabled(true);
		}else{
			bsc.shop.bMinus1.setEnabled(false);
			bsc.shop.bPlus1.setEnabled(false);
		}
		if(hmKolvo>0){
			bsc.hm.bBild.setEnabled(true);
			bsc.hm.bSell.setEnabled(true);
		}else{
			bsc.hm.bBild.setEnabled(false);
			bsc.hm.bSell.setEnabled(false);
		}
			if(timeStart==true){
				pribLarek=kolLarek*(800+rand.nextInt(2200));
				pribSite=kolSite*(150+rand.nextInt(3100));
				pribShop=kolShop*(3000+rand.nextInt(4000));
				hmPribil=hmKolvo*(7000+rand.nextInt(28000));
				money=money+pribLarek;
				money=money+pribSite;
				money=money+pribShop;
				money=money+hmPribil;
					money=money-zatratLarek;
					money=money-zatratSite;
					money=money-zatratShop;
					money=money-hmZatrat;
			}
		bsc.lar.lKolLarek.setText("Количество ларьков "+kolLarek);
		bsc.mSite.bPlus1.setText("Создать сайты за "+(siteToBay*100000)+"Р");
		bsc.mSite.bSellSite.setText("Продать сайты за "+(siteToSell*15000)+"Р");
		bsc.shop.bPlus1.setText("Построить за "+(150000*shopToBay+"Р"));
		bsc.shop.bMinus1.setText("Продать за "+(40000*shopToSell)+"Р");
		bsc.lar.bPlus1.setText("Купить дарьки за "+(larekToBild*50000)+"Р");
		bsc.lar.bSellLarek.setText("Продать ларьки за "+(larekToSell*1000)+"Р");
		bsc.hm.bBild.setText("Построить за "+(hmToBild*2300000)+"Р");
		bsc.hm.bSell.setText("Продать за "+(hmToSell*1000000)+"Р");
		
		bsc.lar.lTrat.setText("Затраты (день) = "+zatratLarek);
		bsc.lar.lPribil.setText("Прибыль (день) = "+pribLarek );
		bsc.mSite.lTrat.setText("Затраты(день) = "+ zatratSite);
		bsc.mSite.lPribil.setText("Прибыль (день) = "+pribSite);
		bsc.shop.lTrat.setText("Затраты (день) = "+zatratShop);
		bsc.shop.lPribil.setText("Прибыль (день) = "+pribShop);
		bsc.hm.lPribil.setText("Прибыль(день) = "+hmPribil);
		bsc.hm.lZatrat.setText("Затраты (день) = "+hmZatrat);
		bsc.hm.lKolvo.setText("Количество "+ hmKolvo);
	}
	public void invest()throws IOException{
		if(MoneyToPay>1){
			insc.ban.bTakeKredit.setEnabled(false);
		}
		canToCredit=zarpday*1095+200*(kolLarek*1750+kolSite*2000+kolShop*3500+hmKolvo*17000);
		if(canToCredit<100000){
			canToCredit=100000;
		}
		
		piInvestPrib=rand.nextInt(2513);
		piInvestPrib=piInvestPrib/1000000;
		if(PlusOrMinus%2!=0||PlusOrMinus==10||PlusOrMinus==20||PlusOrMinus==30
				||PlusOrMinus==40||PlusOrMinus==48||PlusOrMinus==52||PlusOrMinus==68||PlusOrMinus==84
			||PlusOrMinus==94||PlusOrMinus==16	){
			piInvestPrib=piInvestPrib;
			}else{piInvestPrib=piInvestPrib*-1;}
		if(timeStart==true){
		insc.pi.lDayPrib.setText("Прибыль за день = "+((piInvestPrib)*100)+"%");
		insc.pi.lYaerPrib.setText("Прибыль за год (предположительно) = "+Math.round(((Math.pow((piInvestPrib+1), 365)-1)*100))+"%");
		}
		
		
		
		insc.ban.lKreditMoney.setText("Вы должны ещё выплатить "+MoneyToPay);
		if(timeStart==true){
			PlusOrMinus=rand.nextInt(100);
			
			bancMoney=bancMoney*1.00031054;
			piMoney=(1+piInvestPrib)*piMoney;
			MoneyInBank=(long)bancMoney;
			
		}
		
		if(KreditMoney>0& day==365){
			if(KreditTime>0){
				KreditTime--;
			}
			money=(long) (money-MoneyToPay/KreditTime);
			MoneyToPay=MoneyToPay-MoneyToPay/KreditTime;
			allKreditMoney=(long) (allKreditMoney-MoneyToPay/KreditTime);
		}
		insc.pi.lpiMoney.setText("На ПАММ счетах = "+(long)piMoney+"Р");
		insc.ban.lmaxCredit.setText("Доступен кредит = "+canToCredit+"Р");
		insc.ban.lMoneyInBank.setText("Сумма в банке = "+(long)bancMoney);
	}
	public void Save (){
		if(dlb1==true){
			dlsc.dl.bDL1.setBackground(Color.yellow);
		}
		if(dlb2==true){
			dlsc.dl.bDL2.setBackground(Color.yellow);
		}
		if(dlb3==true){
			dlsc.dl.bDL3.setBackground(Color.yellow);
		}
		if(tr1==true){
			tsc.tran.bTrans1.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans1.setBackground(bStartTime.getBackground());}
		if(tr2==true){
			tsc.tran.bTrans2.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans2.setBackground(bStartTime.getBackground());}
		if(tr3==true){
			tsc.tran.bTrans3.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans3.setBackground(bStartTime.getBackground());}
		if(tr4==true){
			tsc.tran.bTrans4.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans4.setBackground(bStartTime.getBackground());}
		if(tr5==true){
			tsc.tran.bTrans5.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans5.setBackground(bStartTime.getBackground());}
		if(tr6==true){
			tsc.tran.bTrans6.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans6.setBackground(bStartTime.getBackground());}
		if(tr7==true){
			tsc.tran.bTrans7.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans7.setBackground(bStartTime.getBackground());}
		if(tr8==true){
			tsc.tran.bTrans8.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans8.setBackground(bStartTime.getBackground());}
		if(tr9==true){
			tsc.tran.bTrans9.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans9.setBackground(bStartTime.getBackground());}
		if(tr10==true){
			tsc.tran.bTrans10.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans10.setBackground(bStartTime.getBackground());}
		if(tr11==true){
			tsc.tran.bTrans11.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans11.setBackground(bStartTime.getBackground());}
		if(tr12==true){
			tsc.tran.bTrans12.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans12.setBackground(bStartTime.getBackground());}
		if(tr13==true){
			tsc.tran.bTrans13.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans13.setBackground(bStartTime.getBackground());}
		if(tr14==true){
			tsc.tran.bTrans14.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans14.setBackground(bStartTime.getBackground());}
		if(tr15==true){
			tsc.tran.bTrans15.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans15.setBackground(bStartTime.getBackground());}
		if(tr16==true){
			tsc.tran.bTrans16.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans16.setBackground(bStartTime.getBackground());}
		if(tr17==true){
			tsc.tran.bTrans17.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans17.setBackground(bStartTime.getBackground());}
		if(tr18==true){
			tsc.tran.bTrans18.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans18.setBackground(bStartTime.getBackground());}
		if(tr19==true){
			tsc.tran.bTrans19.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans19.setBackground(bStartTime.getBackground());}
		if(tr20==true){
			tsc.tran.bTrans20.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans20.setBackground(bStartTime.getBackground());}
		if(tr21==true){
			tsc.tran.bTrans21.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans21.setBackground(bStartTime.getBackground());}
		if(tr22==true){
			tsc.tran.bTrans22.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans22.setBackground(bStartTime.getBackground());}
		if(tr23==true){
			tsc.tran.bTrans23.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans23.setBackground(bStartTime.getBackground());}
		if(tr24==true){
			tsc.tran.bTrans24.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans24.setBackground(bStartTime.getBackground());}
		if(tr25==true){
			tsc.tran.bTrans25.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans25.setBackground(bStartTime.getBackground());}
		if(tr26==true){
			tsc.tran.bTrans26.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans26.setBackground(bStartTime.getBackground());}
		if(tr27==true){
			tsc.tran.bTrans27.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans27.setBackground(bStartTime.getBackground());}
		if(tr28==true){
			tsc.tran.bTrans28.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans28.setBackground(bStartTime.getBackground());}
		if(tr29==true){
			tsc.tran.bTrans29.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans29.setBackground(bStartTime.getBackground());}
		if(tr30==true){
			tsc.tran.bTrans30.setBackground(Color.LIGHT_GRAY);
		}else{tsc.tran.bTrans30.setBackground(bStartTime.getBackground());}
		
		if(hau3==true){
			hsc.hause.bHause3.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause3.setBackground(bStartTime.getBackground());}
		if(hau4==true){
			hsc.hause.bHause4.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause4.setBackground(bStartTime.getBackground());}
		if(hau5==true){
			hsc.hause.bHause5.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause5.setBackground(bStartTime.getBackground());}
		if(hau6==true){
			hsc.hause.bHause6.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause6.setBackground(bStartTime.getBackground());}
		if(hau7==true){
			hsc.hause.bHause7.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause7.setBackground(bStartTime.getBackground());}
		if(hau8==true){
			hsc.hause.bHause8.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause8.setBackground(bStartTime.getBackground());}
		if(hau9==true){
			hsc.hause.bHause9.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause9.setBackground(bStartTime.getBackground());}
		if(hau10==true){
			hsc.hause.bHause10.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause10.setBackground(bStartTime.getBackground());}
		if(hau11==true){
			hsc.hause.bHause11.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause11.setBackground(bStartTime.getBackground());}
		if(hau12==true){
			hsc.hause.bHause12.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause12.setBackground(bStartTime.getBackground());}
		if(hau13==true){
			hsc.hause.bHause13.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause13.setBackground(bStartTime.getBackground());}
		if(hau14==true){
			hsc.hause.bHause14.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause14.setBackground(bStartTime.getBackground());}
		if(hau15==true){
			hsc.hause.bHause15.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause15.setBackground(bStartTime.getBackground());}
		if(hau16==true){
			hsc.hause.bHause16.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause16.setBackground(bStartTime.getBackground());}
		if(hau17==true){
			hsc.hause.bHause17.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause17.setBackground(bStartTime.getBackground());}
		if(hau18==true){
			hsc.hause.bHause18.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause18.setBackground(bStartTime.getBackground());}
		if(hau19==true){
			hsc.hause.bHause19.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause19.setBackground(bStartTime.getBackground());}
		if(hau20==true){
			hsc.hause.bHause20.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause20.setBackground(bStartTime.getBackground());}
		if(hau21==true){
			hsc.hause.bHause21.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause21.setBackground(bStartTime.getBackground());}
		if(hau22==true){
			hsc.hause.bHause22.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause22.setBackground(bStartTime.getBackground());}
		if(hau23==true){
			hsc.hause.bHause23.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause23.setBackground(bStartTime.getBackground());}
		if(hau24==true){
			hsc.hause.bHause24.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause24.setBackground(bStartTime.getBackground());}
		
		if(hau25==true){
			hsc.hause.bHause25.setBackground(Color.YELLOW);
		}else{hsc.hause.bHause25.setBackground(bStartTime.getBackground());}
	}
	
	public void trat(){
		hauseTrat=ht1+ht2+ht3+ht4+ht5+ht6+ht7+ht8+ht9+ht10+ht11+ht12+ht13+ht14
				+ht15+ht16+ht17+ht18+ht19+ht20+ht21+ht22+ht23+ht24+ht25;
		tranTrat=tst1+tst2+tst3+tst4+tst5+tst6+tst7+tst8+tst9+tst10+tst11
				+tst12+tst13+tst14+tst15+tst16+tst17+tst18+tst19+tst20
				+tst21+tst22+tst23+tst24+tst25+tst26+tst27+tst28+tst29+tst30+Toplivo;
		allTrat=+tranTrat+hauseTrat;
		hsc.lHauseTrat.setText("Затраты на жилье(год)= "+hauseTrat);
		tsc.lTransportTrat.setText("Затраты(год) = "+tranTrat);
		hp.LAllTrat.setText("Затраты за год = "+ allTrat);
	}
	public void daycount() throws IOException{
		//meat
		minMoney=canToCredit/250;
		if(minMoney<1000){
			minMoney=1000;
		}
		//time1.start();
		if (timeStart == true) {
			day++;
			dayZarp++;
			zarplata = zarplata + zarpday;
			day1++;
			System.out.println(day1);
			eat =(int) eat1;
			eat1=eat1 - (100 + deat)*meat;
			tidy = (int)tidy1;
			tidy1=tidy1 -( 50 + dtidy)*mtidy;
			healthy = healthy - 50 - dhelth;;
			//health1=health1 - 1 - dhelth;
			//BarFood.setValue((int)eat1);

		}
		if (dayZarp == 15) {
			dayZarp = 0;
			money = money + zarplata+0L;
			zarplata = 0;
		}
		if (day > 365) {
			day = 0;
			year++;

		}
		if (eat1 >= 10000) {
			eat1 = 10000;
		}
		if (eat1 < 0) {
			JOptionPane.showMessageDialog(null, "Yuo Deid");
			System.exit(1);
		}
		if (tidy1 >= 10000) {
			tidy1 = 10000;
		}
		if (tidy1 < 0) {
			JOptionPane.showMessageDialog(null, "Yuo Deid");
			System.exit(1);
		}
		if (healthy >= 10000) {
			healthy = 10000;
		}
		if (healthy < 0) {
			JOptionPane.showMessageDialog(null, "Yuo Deid");
		System.exit(1);
		}
		if(money<-minMoney){
			JOptionPane.showMessageDialog(null, "Вы банкрот");
			System.exit(2);
		}
		if(day==365){
			podarok=(long)(money*0.02+3500);
			tidy1=tidy1+5000;
			eat1=eat1+5000;
			healthy=healthy+5000;
			money=money+podarok;
			JOptionPane.showMessageDialog(null, "У вас день рождения \n"+"Вам подарок\n "+"Деньги "+podarok+
					"\n"+"Здоровье +50% \n"+"Бодрость +50% \n"+"Еда +50%");
			
		}
		s1 = year + " лет " + day + " дней ";
		lDays.setText(s1);
		
		return;
	}

	

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == lernpan.bKoledElek & lerning == false) {
				dayStartLern = day1;
				KoledElekStart = true;
				lerning = true;
			}
			if (e.getSource() == lernpan.bKoledSles & lerning == false) {
				dayStartLern = day1;
				KoledSlesStart = true;
				lerning = true;
			}
			if (e.getSource() == lernpan.bKoledSanteh & lerning == false) {
				dayStartLern = day1;
				KoledSantehStart = true;
				lerning = true;
			}
			if (e.getSource() == lernpan.bDocUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					DocUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bInginerUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					InginerUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bITPUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					ITPUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bITSpecUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					ITSpecUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bMenegerUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					MenegerUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bPoliceUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					PoliceUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bUristUniv & lerning == false) {
				if (year >= 18) {
					dayStartLern = day1;
					UristUnivStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}
			if (e.getSource() == lernpan.bHighScholl & lerning == false) {
				if(InginerUniv==true||PoliceUniv==true||DocUniv==true||ITPUniv==true||ITSpecUniv==true||UristUniv==true||MenegerUniv==true){
				if (year >= 18) {
					dayStartLern = day1;
					HighSchollStart = true;
					lerning = true;
				} else {
					JOptionPane.showMessageDialog(null, "Вам нет 18 лет");
				}
			}else{JOptionPane.showMessageDialog(null, "Вы не закончилиодин из университетов");}
			}

		}

	}

	public class ActionWork implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == wp.wpan.bPromouter) {
				zarpday = 360;
				wp.wpan.bPromouter.setBackground(Color.GREEN);
			} else {
				wp.wpan.bPromouter.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bAdmin) {
				zarpday = 750;
				wp.wpan.bAdmin.setBackground(Color.GREEN);
			} else {
				wp.wpan.bAdmin.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bCliner) {
				zarpday = 550;
				wp.wpan.bCliner.setBackground(Color.GREEN);
			} else {
				wp.wpan.bCliner.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bCurer) {
				zarpday = 500;
				wp.wpan.bCurer.setBackground(Color.GREEN);
			} else {
				wp.wpan.bCurer.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bElek) {
				zarpday = 1000;
				wp.wpan.bElek.setBackground(Color.GREEN);
			} else {
				wp.wpan.bElek.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bSaler) {
				zarpday = 625;
				wp.wpan.bSaler.setBackground(Color.GREEN);
			} else {
				wp.wpan.bSaler.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bSanitar) {
				zarpday = 800;
				wp.wpan.bSanitar.setBackground(Color.GREEN);
			} else {
				wp.wpan.bSanitar.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bWorkerZavod) {
				zarpday = 1500;
				wp.wpan.bWorkerZavod.setBackground(Color.GREEN);
			} else {
				wp.wpan.bWorkerZavod.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bBoss) {
				zarpday = 10000;
				wp.wpan.bBoss.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBoss.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bBossDoc) {
				zarpday = 2750;
				wp.wpan.bBossDoc.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossDoc.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bBossGov) {
				zarpday = 4000;
				wp.wpan.bBossGov.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossGov.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bBossInginerProj) {
				zarpday = 2500;
				wp.wpan.bBossInginerProj.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossInginerProj.setBackground(bStopTime
						.getBackground());
			}
			if (e.getSource() == wp.wpan.bBossIT) {
				zarpday = 3750;
				wp.wpan.bBossIT.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossIT.setBackground(bStopTime.getBackground());
			}
			
			if (e.getSource() == wp.wpan.bBossOtdel) {
				zarpday = 4700;
				wp.wpan.bBossOtdel.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossOtdel.setBackground(bStopTime.getBackground());}
			
			if (e.getSource() == wp.wpan.bBossPolice) {
				zarpday = 3000;
				wp.wpan.bBossPolice.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossPolice.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bBossZeh) {
				zarpday = 2330;
				wp.wpan.bBossZeh.setBackground(Color.GREEN);
			} else {
				wp.wpan.bBossZeh.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bDoc) {
				zarpday = 1900;
				wp.wpan.bDoc.setBackground(Color.GREEN);
			} else {
				wp.wpan.bDoc.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bDriverB) {
				zarpday = 1400;
				wp.wpan.bDriverB.setBackground(Color.GREEN);
			} else {
				wp.wpan.bDriverB.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bDriverC) {
				zarpday = 1500;
				wp.wpan.bDriverC.setBackground(Color.GREEN);
			} else {
				wp.wpan.bDriverC.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bDriverD) {
				zarpday = 1500;
				wp.wpan.bDriverD.setBackground(Color.GREEN);
			} else {
				wp.wpan.bDriverD.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bInginer) {
				zarpday = 1850;
				wp.wpan.bInginer.setBackground(Color.GREEN);
			} else {
				wp.wpan.bInginer.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bITSpec) {
				zarpday = 2000;
				wp.wpan.bITSpec.setBackground(Color.GREEN);
			} else {
				wp.wpan.bITSpec.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bMeneger) {
				wp.wpan.bMeneger.setBackground(Color.GREEN);
				zarpday = 1650;
			} else {
				wp.wpan.bMeneger.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bPoliceman) {
				zarpday = 1950;
				wp.wpan.bPoliceman.setBackground(Color.GREEN);
			} else {
				wp.wpan.bPoliceman.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bProgrammer) {
				zarpday = 2300;
				wp.wpan.bProgrammer.setBackground(Color.GREEN);
			} else {
				wp.wpan.bProgrammer.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bZamBoss) {
				zarpday =6750;
				wp.wpan.bZamBoss.setBackground(Color.GREEN);
			} else {
				wp.wpan.bZamBoss.setBackground(bStopTime.getBackground());
			}
			if (e.getSource() == wp.wpan.bSanteh) {
				zarpday = 1000;
				wp.wpan.bSanteh.setBackground(Color.GREEN);
			} else {
				wp.wpan.bSanteh.setBackground(bStopTime.getBackground());
			}

			if (e.getSource() == wp.wpan.bUrist) {
				zarpday = 1800;
				wp.wpan.bUrist.setBackground(Color.GREEN);
			} else {
				wp.wpan.bUrist.setBackground(bStopTime.getBackground());
			}

		}

	}

	public class ResMarkAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == rmar.bFood1) {
				cena = 50;
				if (money - cena >= 0) {
					eat1 = eat1 + 200;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}

			if (e.getSource() == rmar.bEnerge1) {
				cena = 100;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 200;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarTidy.setValue(tidy);
				}
			}

			if (e.getSource() == rmar.bHelth1) {
				cena = 100;
				if (money - cena >= 0) {
					healthy = healthy + 200;
					money = money - cena;
					BarHealth.setValue(healthy);
				}

			}

			if (e.getSource() == rmar.bEnerge2) {
				cena = 300;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 400;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarTidy.setValue(tidy);

				}
			}

			if (e.getSource() == rmar.bEnerge3) {
				cena = 1000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 750;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarTidy.setValue(tidy);
					int zz = rand.nextInt(9);
					if (zz == 1 || zz == 3 || zz == 5 || zz == 7 || zz == 9) {
						prestige++;
					} else {
						prestige--;
					}

				}
			}

			if (e.getSource() == rmar.bEnerge4) {
				cena = 2000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 1250;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarTidy.setValue(tidy);
				}
			}

			if (e.getSource() == rmar.bEnerge5) {
				cena = 5000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 2500;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarTidy.setValue(tidy);
				}
			}

			if (e.getSource() == rmar.bEnerge6) {
				cena = 10000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 3750;
					money = money - cena;
					BarTidy.setValue(tidy);
					eat =(int) eat1;
					tidy = (int)tidy1;
					prestige = prestige + 12;
				}
			}

			if (e.getSource() == rmar.bEnerge7) {
				cena = 15000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 5000;
					money = money - cena;
					BarTidy.setValue(tidy);
					eat =(int) eat1;
					tidy = (int)tidy1;
					prestige = prestige + 25;
				}
			}

			if (e.getSource() == rmar.bEnerge8) {
				cena = 35000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 6250;
					money = money - cena;
					BarTidy.setValue(tidy);
					eat =(int) eat1;
					tidy = (int)tidy1;
					prestige = prestige + 50;
				}
			}

			if (e.getSource() == rmar.bEnerge9) {
				cena = 65000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 8000;
					money = money - cena;
					BarTidy.setValue(tidy);
					eat =(int) eat1;
					tidy = (int)tidy1;
					prestige = prestige + 95;
				}
			}

			if (e.getSource() == rmar.bEnerge10) {
				cena = 150000;
				if (money - cena >= 0) {
					tidy1 = tidy1 + 10000;
					money = money - cena;
							eat =(int) eat1;
					tidy = (int)tidy1;;
					BarTidy.setValue(tidy);
					prestige = prestige + 190;
				}
			}
			if (e.getSource() == rmar.bHelth2) {
				cena = 300;
				if (money - cena >= 0) {
					healthy = healthy + 200 + rand.nextInt(200);
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth3) {
				cena = 1000;
				if (money - cena >= 0) {
					healthy = healthy + 750;
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth4) {
				cena = 2750;
				if (money - cena >= 0) {
					healthy = healthy + 1000;
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth5) {
				cena = 10000;
				if (money - cena >= 0) {
					healthy = healthy + 2500;
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth6) {
				cena = 15000;
				if (money - cena >= 0) {
					healthy = healthy + 3250;
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth7) {
				cena = 30000;
				if (money - cena >= 0) {
					healthy = healthy + 4750;
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth8) {
				cena = 50000;
				if (money - cena >= 0) {
					healthy = healthy +6250 ;

					money = money - cena;

					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth9) {
				cena = 90000;
				if (money - cena >= 0) {
					healthy = healthy + 8000;
					money = money - cena;
					tidy = tidy + 1250;
					prestige = prestige + 80;
					BarTidy.setValue(tidy);
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bHelth10) {
				cena = 150000;
				if (money - cena >= 0) {
					healthy = healthy + 10000;
					tidy = tidy + 2000;
					prestige = prestige + 150;
					BarTidy.setValue(tidy);
					money = money - cena;
					BarHealth.setValue(healthy);
				}
			}
			if (e.getSource() == rmar.bFood2) {
				cena = 100;
				if (money - cena >= 0) {
					eat1 = eat1+ 400;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
					
				}

			}
			if (e.getSource() == rmar.bFood3) {
				cena = 300;
				if (money - cena >= 0) {
					eat1 = eat1 + 750;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}
			if (e.getSource() == rmar.bFood4) {
				cena = 1000;
				if (money - cena >= 0) {
					eat1 = eat1 + 1500;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}
			if (e.getSource() == rmar.bFood5) {
				cena = 2000;
				if (money - cena >= 0) {
					eat1 = eat1 + 2500;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}
			if (e.getSource() == rmar.bFood6) {
				cena = 3000;
				if (money - cena >= 0) {
					eat1 = eat1 + 3250;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}
			if (e.getSource() == rmar.bFood7) {
				cena = 7500;
				if (money - cena >= 0) {
					eat1 = eat1 + 4750;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}
			if (e.getSource() == rmar.bFood8) {
				cena = 15000;
				if (money - cena >= 0) {
					eat1 = eat1 + 6250;
					money = money - cena;
					eat =(int) eat1;
					tidy = (int)tidy1;
					BarFood.setValue(eat);
				}

			}
			if (e.getSource() == rmar.bFood9) {
				cena = 50000;
				if (money - cena >= 0) {
					eat1 = eat1 + 8000;
					money = money - cena;
					BarFood.setValue(eat);
					eat =(int) eat1;
					tidy = (int)tidy1;
					prestige=prestige+80;
				}

			}
			if (e.getSource() == rmar.bFood10) {
				cena = 300000;
				if (money - cena >= 0) {
					eat1 = eat1 + 10000;
					money = money - cena;
					BarFood.setValue(eat);
					eat =(int) eat1;
					tidy = (int)tidy1;
					prestige=prestige+150;
				}

			}

		}

	}

	public class TransportAction implements ActionListener {

	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==tsc.tran.bTrans1){
				cena=2500;
				if(money-cena>=0){
					money=money-cena;
					tr1=true;
					t1LiveS=day1;
					
					tsc.tran.bTrans1.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans2){
				cena=7500;
				if(money-cena>=0){
					money=money-cena;
					tr2=true;
					prestige=prestige+10;
					t2LiveS=day1;
					tsc.tran.bTrans2.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans3){
				cena=15000;
				if(money-cena>=0){
					money=money-cena;
					tr3=true;
					prestige=prestige+25;
					t3LiveS=day1;
					tsc.tran.bTrans3.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans4){
				cena=35000;
				if(money-cena>=0){
					money=money-cena;
					tr4=true;
					prestige=prestige+40;
					t4LiveS=day1;
					tsc.tran.bTrans4.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans5){
				cena=70000;
				if(money-cena>=0){
					money=money-cena;
					tr5=true;
					prestige=prestige+60;
					t5LiveS=day1;
					tsc.tran.bTrans5.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans6){
				cena=150000;
				if(money-cena>=0){
					money=money-cena;
					tr6=true;
					prestige=prestige+85;
					t6LiveS=day1;
					tsc.tran.bTrans6.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans7){
				cena=200000;
				if(money-cena>=0){
					money=money-cena;
					tr7=true;
					prestige=prestige+100;
					t7LiveS=day1;
					tsc.tran.bTrans7.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans8){
				cena=350000;
				if(money-cena>=0){
					money=money-cena;
					tr8=true;
					prestige=prestige+120;
					t8LiveS=day1;
					tsc.tran.bTrans8.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans9){
				cena=420000;
				if(money-cena>=0){
					money=money-cena;
					tr9=true;
					prestige=prestige+130;
					t9LiveS=day1;
					tsc.tran.bTrans9.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans10){
				cena=570000;
				if(money-cena>=0){
					money=money-cena;
					tr10=true;
					prestige=prestige+150;
					t10LiveS=day1;
					tsc.tran.bTrans10.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans11){
				cena=650000;
				if(money-cena>=0){
					money=money-cena;
					prestige=prestige+175;
					tr11=true;
					t11LiveS=day1;
					tsc.tran.bTrans11.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans12){
				cena=800000;
				if(money-cena>=0){
					money=money-cena;
					prestige=prestige+250;
					tr12=true;
					t12LiveS=day1;
					tsc.tran.bTrans12.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans13){
				cena=1000000;
				if(money-cena>=0){
					money=money-cena;
					tr13=true;
					prestige=prestige+390;
					t13LiveS=day1;
					tsc.tran.bTrans13.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans14){
				cena=1500000;
				if(money-cena>=0){
					money=money-cena;
					tr14=true;
					prestige=prestige+600;
					t14LiveS=day1;
					tsc.tran.bTrans14.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans15){
				cena=1800000;
				if(money-cena>=0){
					money=money-cena;
					prestige=prestige+725;
					tr15=true;
					t15LiveS=day1;
					tsc.tran.bTrans15.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans16){
				cena=2500000;
				if(money-cena>=0){
					money=money-cena;
					tr16=true;
					prestige=prestige+1150;
					t16LiveS=day1;
					tsc.tran.bTrans16.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans17){
				cena=4000000;
				if(money-cena>=0){
					money=money-cena;
					tr17=true;
					prestige=prestige+1600;
					t17LiveS=day1;
					tsc.tran.bTrans17.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans18){
				cena=4000000;
				if(money-cena>=0){
					money=money-cena;
					tr18=true;
					prestige=prestige+1600;
					t18LiveS=day1;
					tsc.tran.bTrans18.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans19){
				cena=5500000;
				if(money-cena>=0){
					money=money-cena;
					tr19=true;
					prestige=prestige+2100;
					t19LiveS=day1;
					tsc.tran.bTrans19.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans20){
				cena=7500000;
				if(money-cena>=0){
					money=money-cena;
					tr20=true;
					prestige=prestige+2500;
					t20LiveS=day1;
					tsc.tran.bTrans20.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans21){
				cena=12000*1000;
				if(money-cena>=0){
					money=money-cena;
					tr21=true;
					prestige=prestige+3000;
					t21LiveS=day1;
					tsc.tran.bTrans21.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans22){
				cena=18000*1000;
				if(money-cena>=0){
					money=money-cena;
					tr22=true;
					prestige=prestige+3600;
					t22LiveS=day1;
					tsc.tran.bTrans22.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans23){
				cena=25000*1000;
				if(money-cena>=0){
					tr23=true;
					money=money-cena;
					prestige=prestige+4250;
					t23LiveS=day1;
					tsc.tran.bTrans23.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans24){
				cena=50000*1000;
				if(money-cena>=0){
					tr24=true;
					money=money-cena;
					prestige=prestige+6000;
					t24LiveS=day1;
					tsc.tran.bTrans24.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans25){
				cena=130*1000*1000;
				if(money-cena>=0){
					money=money-cena;
					tr25=true;
					prestige=prestige+10000;
					t25LiveS=day1;
					tsc.tran.bTrans25.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans26){
				cena=1000*1000*400;
				if(money-cena>=0){
					money=money-cena;
					prestige=prestige+25000;
					tr26=true;
					t26LiveS=day1;
					tsc.tran.bTrans26.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans27){
				cena=1500000000L;
				if(money-cena>=0){
					money=money-cena;
					tr27=true;
					prestige=prestige+60000;
					t27LiveS=day1;
					tsc.tran.bTrans27.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans28){
				cena=12000000000L;
				if(money-cena>=0){
					money=money-cena;
					tr28=true;
					prestige=prestige+500000;
					t28LiveS=day1;
					tsc.tran.bTrans28.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans29){
				cena=50000000000L;
				if(money-cena>=0){
					money=money-cena;
					tr29=true;
					prestige=prestige+1000000;
					t29LiveS=day1;
					tsc.tran.bTrans29.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			if(e.getSource()==tsc.tran.bTrans30){
				cena=180000000000L;
				if(money-cena>=0){
					money=money-cena;
					tr30=true;
					prestige=prestige+2000000;
					t30LiveS=day1;
					tsc.tran.bTrans30.setBackground(Color.LIGHT_GRAY);
				}else{JOptionPane.showMessageDialog(null, "У вас недостаточно денег ");}
			}
			

		}

	}
	public class HouseAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==hsc.hause.bHause1){
				money=money-5000L;
				hsc.hause.bHause1.setBackground(Color.YELLOW);
				
				
			}
			if(e.getSource()==hsc.hause.bHause2){
				money=money-10000L;
				
				hsc.hause.bHause2.setBackground(Color.YELLOW);
				
			}
			if(e.getSource()==hsc.hause.bHause1 & hsc.hause.bHause1.getBackground()==Color.YELLOW & (hsc.hause.bHause2.getBackground()==Color.YELLOW||hsc.hause.bHause3.getBackground()==Color.YELLOW ||hsc.hause.bHause4.getBackground()==Color.YELLOW ||hsc.hause.bHause5.getBackground()==Color.YELLOW ||hsc.hause.bHause6.getBackground()==Color.YELLOW ||hsc.hause.bHause7.getBackground()==Color.YELLOW ||hsc.hause.bHause8.getBackground()==Color.YELLOW ||hsc.hause.bHause9.getBackground()==Color.YELLOW ||hsc.hause.bHause10.getBackground()==Color.YELLOW ||hsc.hause.bHause11.getBackground()==Color.YELLOW ||hsc.hause.bHause12.getBackground()==Color.YELLOW ||hsc.hause.bHause13.getBackground()==Color.YELLOW ||hsc.hause.bHause14.getBackground()==Color.YELLOW ||hsc.hause.bHause15.getBackground()==Color.YELLOW ||hsc.hause.bHause16.getBackground()==Color.YELLOW ||hsc.hause.bHause17.getBackground()==Color.YELLOW ||hsc.hause.bHause18.getBackground()==Color.YELLOW ||hsc.hause.bHause19.getBackground()==Color.YELLOW ||hsc.hause.bHause20.getBackground()==Color.YELLOW ||hsc.hause.bHause21.getBackground()==Color.YELLOW ||hsc.hause.bHause22.getBackground()==Color.YELLOW ||hsc.hause.bHause23.getBackground()==Color.YELLOW||hsc.hause.bHause24.getBackground()==Color.YELLOW ||hsc.hause.bHause25.getBackground()==Color.YELLOW )){
				
				hsc.hause.bHause1.setBackground(bStartTime.getBackground());
				
			}
if(e.getSource()==hsc.hause.bHause2 & hsc.hause.bHause2.getBackground()==Color.YELLOW & (hsc.hause.bHause1.getBackground()==Color.YELLOW||hsc.hause.bHause3.getBackground()==Color.YELLOW ||hsc.hause.bHause4.getBackground()==Color.YELLOW ||hsc.hause.bHause5.getBackground()==Color.YELLOW ||hsc.hause.bHause6.getBackground()==Color.YELLOW ||hsc.hause.bHause7.getBackground()==Color.YELLOW ||hsc.hause.bHause8.getBackground()==Color.YELLOW ||hsc.hause.bHause9.getBackground()==Color.YELLOW ||hsc.hause.bHause10.getBackground()==Color.YELLOW ||hsc.hause.bHause11.getBackground()==Color.YELLOW ||hsc.hause.bHause12.getBackground()==Color.YELLOW ||hsc.hause.bHause13.getBackground()==Color.YELLOW ||hsc.hause.bHause14.getBackground()==Color.YELLOW ||hsc.hause.bHause15.getBackground()==Color.YELLOW ||hsc.hause.bHause16.getBackground()==Color.YELLOW ||hsc.hause.bHause17.getBackground()==Color.YELLOW ||hsc.hause.bHause18.getBackground()==Color.YELLOW ||hsc.hause.bHause19.getBackground()==Color.YELLOW ||hsc.hause.bHause20.getBackground()==Color.YELLOW ||hsc.hause.bHause21.getBackground()==Color.YELLOW ||hsc.hause.bHause22.getBackground()==Color.YELLOW ||hsc.hause.bHause23.getBackground()==Color.YELLOW||hsc.hause.bHause24.getBackground()==Color.YELLOW ||hsc.hause.bHause25.getBackground()==Color.YELLOW )){
				
				hsc.hause.bHause2.setBackground(bStartTime.getBackground());
				
			}
			
			if(e.getSource()==hsc.hause.bHause3){
				cena=1300000L;
				if(money-cena>=0){
					money=money-cena;
					h3++;
					hau3=true;
					prestige=prestige+750;
					hsc.hause.bHause3.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause4){
				cena=2100000L;
				if(money-cena>=0){
					h4++;
					hau4=true;
					money=money-cena;
					prestige=prestige+1200;
					hsc.hause.bHause4.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause5){
				cena=3000000L;
				if(money-cena>=0){
					money=money-cena;
					h5++;
					hau5=true;
					prestige=prestige+1500;
					hsc.hause.bHause5.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause6){
				cena=4200000L;
				if(money-cena>=0){
					h6++;
					hau6=true;
					money=money-cena;
					prestige=prestige+2000;
					hsc.hause.bHause6.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause7){
				cena=1270000L;
				if(money-cena>=0){
					money=money-cena;
					h7++;
					hau7=true;
					prestige=prestige+700;
					hsc.hause.bHause7.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause8){
				cena=1450000L;
				if(money-cena>=0){
					money=money-cena;
					hau8=true;
					h8++;
					prestige=prestige+800;
					hsc.hause.bHause8.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause9){
				cena=3300000L;
				if(money-cena>=0){
					money=money-cena;
					h9++;
					hau9=true;
					prestige=prestige+1400;
					hsc.hause.bHause9.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause10){
				cena=3200000L;
				if(money-cena>=0){
					money=money-cena;
					h10++;
					hau10=true;
					prestige=prestige+1750;
					hsc.hause.bHause10.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause11){
				cena=4800000L;
				if(money-cena>=0){
					money=money-cena;
					h11++;
					hau11=true;
					prestige=prestige+2500;
					hsc.hause.bHause11.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause12){
				cena=3000000L;
				if(money-cena>=0){
					money=money-cena;
					h12++;
					hau12=true;
					prestige=prestige+2000;
					hsc.hause.bHause12.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause13){
				cena=9500000L;
				if(money-cena>=0){
					money=money-cena;
					h13++;
					hau13=true;
					prestige=prestige+2000;
					hsc.hause.bHause13.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause14){
				cena=18000000L;
				if(money-cena>=0){
					money=money-cena;
					h14++;
					hau14=true;
					prestige=prestige+2500;
					hsc.hause.bHause14.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause15){
				cena=29000000L;
				if(money-cena>=0){
					money=money-cena;
					h15++;
					hau15=true;
					prestige=prestige+3300;
					hsc.hause.bHause15.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause16){
				cena=35000000L;
				if(money-cena>=0){
					money=money-cena;
					h16++;
					hau16=true;
					prestige=prestige+4200;
					hsc.hause.bHause16.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause17){
				cena=42500000L;
				if(money-cena>=0){
					money=money-cena;
					h17++;
					hau17=true;
					prestige=prestige+5500;
					hsc.hause.bHause17.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause18){
				cena=25000000L;
				if(money-cena>=0){
					h18++;
					hau18=true;
					money=money-cena;
					prestige=prestige+7000;
					hsc.hause.bHause18.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause19){
				cena=47000000L;
				if(money-cena>=0){
					money=money-cena;
					h19++;
					hau19=true;
					prestige=prestige+10000;
					hsc.hause.bHause19.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause20){
				cena=18000000L;
				if(money-cena>=0){
					money=money-cena;
					h20++;
					hau20=true;
					prestige=prestige+12000;
					hsc.hause.bHause20.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause21){
				cena=30000000L;
				if(money-cena>=0){
					money=money-cena;
					h21++;
					hau21=true;
					prestige=prestige+15000;
					hsc.hause.bHause21.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause22){
				cena=85000000L;
				if(money-cena>=0){
					money=money-cena;
					h22++;
					hau22=true;
					prestige=prestige+20000;
					hsc.hause.bHause22.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause23){
				cena=250000000L;
				if(money-cena>=0){
					h23++;
					hau23=true;
					money=money-cena;
					prestige=prestige+30000;
					hsc.hause.bHause23.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause24){
				cena=500000000L;
				if(money-cena>=0){
					money=money-cena;
					h24++;
					hau24=true;
					prestige=prestige+45000;
					hsc.hause.bHause24.setBackground(Color.YELLOW);
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			if(e.getSource()==hsc.hause.bHause25){
				cena=950000000L;
				
				if(money-cena>=0){
					money=money-cena;
					hau25=true;
					prestige=prestige+80000;
					hsc.hause.bHause25.setBackground(Color.YELLOW);
					h25++;
				}else{JOptionPane.showMessageDialog(null, "У вас не хватает средств на эту покупку");}
				
			}
			
		}
		
	}
	
	public class DopRabAction implements ActionListener{

		
		public void actionPerformed(ActionEvent e0) {
			
			
		}
		
	}

	public class DopLernAction implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==dlsc.dl.bDL1){
				daydLS1=day1;
				dlb1=true;
				dlsc.dl.bDL1.setBackground(Color.yellow);
			}
			if(e.getSource()==dlsc.dl.bDL2){
				daydLS2=day1;
				dlb2=true;
				dlsc.dl.bDL2.setBackground(Color.yellow);
			}
			if(e.getSource()==dlsc.dl.bDL3){
				dlb3=true;
				daydLS3=day1;
				dlsc.dl.bDL3.setBackground(Color.yellow);
			}
			
		}
		
	}
	public class InvestAction implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==insc.inv.bInv1){
				insc.csInvpan.setViewportView(insc.ban);
			}
			if(e.getSource()==insc.ban.bbBack){
				insc.csInvpan.setViewportView(insc.inv);
			}
			if(e.getSource()==insc.ban.bPutMoney){
				y1=(long) insc.ban.tfMoney.getValue();
				if(money-y1>=0){
					money=money-y1;
					bancMoney=bancMoney+y1+0L;
					insc.ban.lMoneyInBank.setText("Сумма в банке = "+(long)bancMoney);
					
				}
			}
			if(e.getSource()==insc.ban.bTakeMoney){
				y1=(long) insc.ban.tfMoney.getValue();
				if((long)bancMoney-y1>=0){
					money=money+y1;
					bancMoney=bancMoney-y1;
					insc.ban.lMoneyInBank.setText("Сумма в банке = "+(long)bancMoney);
					
				}
			}
			if(e.getSource()==insc.ban.bTakeKredit){
				y2=(long) insc.ban.tfKreditMoney.getValue();
				if(allKreditMoney+y2<=canToCredit){
					allKreditMoney=allKreditMoney+y2;
					KreditMoney=y2;
					KreditTime=(int) insc.ban.tfKreditTime.getValue();
					if(KreditTime<26&KreditTime>0){
						money=money+KreditMoney;
						MoneyToPay=(long)( Math.pow(1.2,KreditTime )*KreditMoney);
						dTakeKredit=day1;
					}
					insc.ban.lMoneyYear.setText("Ежегодные выплаты = "+(MoneyToPay/KreditTime));
					insc.ban.lallKreditToPay.setText("Полная стоимость кредита = "+MoneyToPay);
				}
			}
			if(e.getSource()==insc.pi.bBack){
				insc.csInvpan.setViewportView(insc.inv);
			}
			if(e.getSource()==insc.inv.bInv2){
				insc.csInvpan.setViewportView(insc.pi);
			}
			if(e.getSource()==insc.pi.bInvest){
				piTakePutMoney=(long) insc.pi.pammMoney.getValue();
				if(money-piTakePutMoney>=0){
					money=money-piTakePutMoney;
					piMoney=piMoney+piTakePutMoney;
					insc.pi.lpiMoney.setText("На ПАММ счетах = "+(long)piMoney+"Р");
				}
			}
			if(e.getSource()==insc.pi.bTakeMoney){
				piTakePutMoney=(long) insc.pi.pammMoney.getValue();
				if((long)piMoney-piTakePutMoney>=0){
					money=money+piTakePutMoney;
					piMoney=piMoney-piTakePutMoney;
					insc.pi.lpiMoney.setText("На ПАММ счетах = "+(long)piMoney+"Р");
				}
			}

			
		}
		
	}

	public class BisnessAction implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bsc.bisn.bBisn1){
				bsc.spBisness.setViewportView(bsc.lar);
			}
			if(e.getSource()==bsc.lar.bBack){
				bsc.spBisness.setViewportView(bsc.bisn);
			}
			if(e.getSource()==bsc.lar.bStartComp){
				cena=60000L;
				if(money-cena>=0){
					money=money-cena;
				kolLarek++;
				bsc.lar.lKolLarek.setText("Количество ларьков "+kolLarek);
				}
			}
			if(e.getSource()==bsc.lar.bPlus1){
				larekToBild=(long)bsc.lar.larsBild.getValue();
				
				cena=50000*larekToBild;
				if(money-cena>=0){
					money=money-cena;
				kolLarek=kolLarek+larekToBild;
				bsc.lar.lKolLarek.setText("Количество ларьков "+kolLarek);
				}
			}
			if(e.getSource()==bsc.lar.bSellLarek){
				larekToSell=(long)bsc.lar.larsSell.getValue();
				if(kolLarek-larekToSell>=0){
				kolLarek=kolLarek-larekToSell;
				money=money+(1000*larekToSell);
				}
			}
			if(e.getSource()==bsc.bisn.bBisn4){
				bsc.spBisness.setViewportView(bsc.mSite);
			}
			if(e.getSource()==bsc.mSite.bBack){
				bsc.spBisness.setViewportView(bsc.bisn);
			}
			if(e.getSource()==bsc.mSite.bStartComp){
				cena=110000L;
				if(money-cena>=0){
					money=money-cena;
				kolSite++;
				bsc.mSite.lKolvo.setText("Количество сайтов "+kolSite);
				}
			}
			if(e.getSource()==bsc.mSite.bPlus1){
				siteToBay=(long) bsc.mSite.siteSToBay.getValue();
				
				cena=100000*siteToBay;
				if(money-cena>=0){
					money=money-cena;
				kolSite=kolSite+siteToBay;
				bsc.mSite.lKolvo.setText("Количество сайтов "+kolSite);
				}
			}
			if(e.getSource()==bsc.mSite.bSellSite){
				
				siteToSell=(long) bsc.mSite.siteSToSell.getValue();
				if(kolSite-siteToSell>=0){
				kolSite=kolSite-siteToSell;
				money=money+15000*siteToSell;
				}
			}
			if(e.getSource()==bsc.bisn.bBisn2){
				bsc.spBisness.setViewportView(bsc.shop);
			}
			if(e.getSource()==bsc.shop.bBack){
				bsc.spBisness.setViewportView(bsc.bisn);
			}
			if(e.getSource()==bsc.shop.bStartComp){
				cena=180000L;
				if(money-cena>=0){
					money=money-cena;
					kolShop++;
					bsc.shop.lKolvo.setText("Количество магазинов " + kolShop);
				}
			}
			if(e.getSource()==bsc.shop.bPlus1){
				shopToBay=(long)bsc.shop.shopSToBay.getValue();
				
				cena=150000*shopToBay;
				if(money-cena>=0){
					money=money-cena;
					kolShop=kolShop+shopToBay;
					bsc.shop.lKolvo.setText("Количество магазинов " + kolShop);
				}
			}
			if(e.getSource()==bsc.shop.bMinus1){
				
				shopToSell=(long)bsc.shop.shopSToSell.getValue();
				if(kolShop-shopToSell>=0){
					kolShop=kolShop-shopToSell;
					money=money+40000*shopToSell;
					bsc.shop.lKolvo.setText("Количество магазинов " + kolShop);
					
				}
			}
			if(e.getSource()==bsc.bisn.bBisn3){
				bsc.spBisness.setViewportView(bsc.hm);
			}
			if(e.getSource()==bsc.hm.bBack){
				bsc.spBisness.setViewportView(bsc.bisn);
			}
			if(e.getSource()==bsc.hm.bStartComp){
				cena=2750000L;
				if(money-cena>=0){
					hmKolvo++;
					money=money-cena;
					bsc.hm.lKolvo.setText("Количество "+hmKolvo);
				}
			}
			if(e.getSource()==bsc.hm.bBild){
				hmToBild=(long) bsc.hm.tfBild.getValue();
				cena=hmToBild*2300000;
				if(money-cena>=0){
					money=money-cena;
					hmKolvo=hmKolvo+hmToBild;
					bsc.hm.lKolvo.setText("Количество"+ hmKolvo);
				}
			}
			if(e.getSource()==bsc.hm.bSell){
				hmToSell=(long) bsc.hm.tfSell.getValue();
				if(hmKolvo-hmToSell>=0){
					hmKolvo=hmKolvo-hmToSell;
					money=money+1000000*hmKolvo;
					bsc.hm.lKolvo.setText("Количество"+ hmKolvo);
				}
			}
			
			
		}
		
	}

	public class TimeA implements ActionListener{
		long b,b1,b4;
		double b3;
		double b2;
		Timer time12=new Timer(1,tma);
		public void testMoney(){
			time12.start();
			b=(long) insc.ban.tfKreditMoney.getValue();
			b1=(long) insc.ban.tfKreditTime.getValue();
			b2= Math.pow(1.2,b1 )*b;
			b3=b2/b1;
			insc.ban.lMoneyYear.setText("Ежегодные выплаты = "+b3);
			insc.ban.lallKreditToPay.setText("Полная сумма кредита = "+b2);
		}
		public void actionPerformed(ActionEvent e) {
			testMoney();
			
			
		}
		
	}
}

