package game;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.io.Serializable;

import javax.swing.UIManager;

public class WorkPane extends JPanel implements Serializable{
	static final long serialVersionUID=27L;

	JButton bPromouter = new JButton("\u041F\u0440\u043E\u043C\u043E\u0443\u0442\u0435\u0440 \u0417/\u041F 10500\u0420/\u043C\u0435\u0441");
	JButton bCurer = new JButton("\u041A\u0443\u0440\u044C\u0435\u0440  \u0417/\u041F 15000\u0420/\u043C\u0435\u0441");
	JButton bCliner = new JButton("\u0414\u0432\u043E\u0440\u043D\u0438\u043A(\u0423\u0431\u043E\u0440\u0449\u0438\u043A)  \u0417/\u041F 16'500\u0420/\u043C\u0435\u0441");
	JButton bSaler = new JButton("\u041F\u0440\u043E\u0434\u0430\u0432\u0435\u0446  \u0417/\u041F 18'750\u0420/\u043C\u0435\u0441");
	JButton bSekretar = new JButton("\u0421\u0435\u043A\u0440\u0435\u0442\u0430\u0440\u044C  \u0417/\u041F 19'500\u0420/\u043C\u0435\u0441");
	JButton bAdmin = new JButton("\u0410\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440  \u0417/\u041F 22'500\u0420/\u043C\u0435\u0441");
	JButton bSanitar = new JButton("\u0421\u0430\u043D\u0438\u0442\u0430\u0440(\u041C\u0435\u0434\u0441\u0435\u0441\u0442\u0440\u0430)  \u0417/\u041F 24'000\u0420/\u043C\u0435\u0441");
	JButton bDriverB = new JButton("\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 B  \u0417/\u041F 42'000\u0420/\u043C\u0435\u0441");
	JButton bDriverC = new JButton("\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 C  \u0417/\u041F 45'000\u0420/\u043C\u0435\u0441");
	JButton bDriverD = new JButton("\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 D  \u0417/\u041F 45'000\u0420/\u043C\u0435\u0441");
	JButton bSanteh = new JButton("\u0421\u0430\u043D\u0442\u0435\u0445\u043D\u0438\u043A  \u0417/\u041F 30'000\u0420/\u043C\u0435\u0441");
	JButton bElek = new JButton("\u042D\u043B\u0435\u043A\u0442\u0440\u0438\u043A \u0417/\u041F 30'0000\u0420/\u043C\u0435\u0441");
	JButton bWorkerZavod = new JButton("\u0420\u0430\u0431\u043E\u0447\u0438\u0439 \u043D\u0430 \u0437\u0430\u0432\u043E\u0434\u0435  \u0417/\u041F 45'000\u0420/\u043C\u0435\u0441");
	JButton bInginer = new JButton("\u0418\u043D\u0436\u0438\u043D\u0435\u0440  \u0417/\u041F 55'000\u0420/\u043C\u0435\u0441");
	JButton bDoc = new JButton("\u0412\u0440\u0430\u0447  \u0417/\u041F 57'000\u0420/\u043C\u0435\u0441");
	JButton bPoliceman = new JButton("\u0421\u043E\u0442\u0440\u0443\u0434\u043D\u0438\u043A \u0441\u0438\u043B\u043E\u0432\u044B\u0445 \u0441\u0442\u0440\u0443\u043A\u0442\u0443\u0440 \u0417/\u041F 58'500\u0420/\u043C\u0435\u0441");
	JButton bProgrammer = new JButton("\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0438\u0441\u0442  \u0417/\u041F 69'000\u0420/\u043C\u0435\u0441");
	JButton bITSpec = new JButton("IT \u0441\u043F\u0435\u0446\u0438\u0430\u043B\u0438\u0441\u0442  \u0417/\u041F 60'000\u0420/\u043C\u0435\u0441");
	JButton bUrist = new JButton("\u042E\u0440\u0438\u0441\u0442  \u0417/\u041F 54'000\u0420/\u043C\u0435\u0441");
	JButton bMeneger = new JButton("\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440  \u0417/\u041F 49'500\u0420/\u043C\u0435\u0441");
	JButton bBossInginerProj = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0438\u043D\u0436\u0438\u043D\u0435\u0440\u043D\u043E\u0433\u043E \u043F\u0440\u043E\u0435\u043A\u0442\u0430  \u0417/\u041F 75'000\u0420/\u043C\u0435\u0441");
	JButton bZamBoss = new JButton("\u0417\u0430\u043C\u0438\u0441\u0442\u0438\u0442\u0435\u043B\u044C \u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440\u0430  \u0417/\u041F 202'500\u0420/\u043C\u0435\u0441");
	JButton bBoss = new JButton("\u0413\u0435\u043D\u0435\u0440\u0430\u043B\u044C\u043D\u044B\u0439 \u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440  \u0417/\u041F 300'000\u0420/\u043C\u0435\u0441");
	JButton bBossOtdel = new JButton("\u0413\u043B\u0430\u0432\u0430 \u043E\u0442\u0434\u0435\u043B\u0430  \u0417/\u041F 141'000\u0420/\u043C\u0435\u0441");
	JButton bBossZeh = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0446\u0435\u0445\u0430  \u0417/\u041F 69'900\u0420/\u043C\u0435\u0441");
	JButton bBossDoc = new JButton("\u0413\u043B\u0430\u0432 \u0412\u0440\u0430\u0447  \u0417/\u041F 82'500\u0420/\u043C\u0435\u0441");
	JButton bBossPolice = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0432 \u0441\u0438\u043B\u043E\u0432\u044B\u0445 \u0441\u0442\u0440\u0443\u043A\u0442\u0443\u0440\u0430\u0445  \u0417/\u041F 90'000\u0420/\u043C\u0435\u0441");
	JButton bBossIT = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A IT \u043F\u0440\u043E\u0435\u043A\u0442\u0430  \u0417/\u041F 112'500\u0420/\u043C\u0435\u0441");
	JButton bBossGov = new JButton("\u0413\u043B\u0430\u0432\u0430 \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u044F  \u0417/\u041F 120'000\u0420/\u043C\u0435\u0441");
	
	
	
	public WorkPane() {
		bCliner.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1%-1.5%\u263A; 0.5%-1%\u2665. +1 xp/\u0434\u0435\u043D\u044C");
		bCliner.setEnabled(false);
		bBossZeh.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u0441\u043B\u0435\u0441\u0430\u0440\u044F, xp>=1800, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=500. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0.5%-1.5%\u2665.+ 4 xp/\u0434\u0435\u043D\u044C");
		
		
		bBossZeh.setEnabled(false);
		bBossDoc.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u041C\u0435\u0434\u0438\u0446\u0438\u043D\u0441\u043A\u0438\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442, xp>=1800, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=1000. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0.5%-1.5%\u2665. +4 xp/\u0434\u0435\u043D\u044C");
		bBossDoc.setEnabled(false);
		bBossPolice.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0410\u043A\u0430\u0434\u0435\u043C\u0438\u044F \u041C\u0412\u0414 \u0438\u043B\u0438 \u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442, xp>=1600, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=800. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0.5%-2%\u2665.+ 4xp/\u0434\u0435\u043D\u044C");
		bBossPolice.setEnabled(false);
		bBossIT.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442,\u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u0418\u0422\u0438\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u044F \u0438\u043B\u0438 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u043D\u0430 IT \u0441\u043F\u0435\u0446\u0438\u0430\u043B\u0438\u0441\u0442\u043E\u0432, xp>=1600, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=1100 . \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 0.5%-2%\u263A; 0,5%-1%\u2665. +4 xp/\u0434\u0435\u043D\u044C");
		bBossIT.setEnabled(false);
		bBossIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossGov.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u041C\u0435\u043D\u0435\u0434\u0436\u043C\u0435\u043D\u0442\u0430, xp>=1800, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=1250. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0,5%-1%\u2665. 4 xp/\u0434\u0435\u043D\u044C");
		
		
		bBossGov.setEnabled(false);
		bSaler.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1%-2%\u263A; 0.5%-1%\u2665. +1 xp/\u0434\u0435\u043D\u044C");
		bSaler.setEnabled(false);
		bSekretar.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18. \u043B\u0435\u0442 \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 0.5%-1.5%\u263A; 0.5%-1%\u2665. +1 xp/\u0434\u0435\u043D\u044C");
		bSekretar.setEnabled(false);
		bAdmin.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 0.5%-1.5%\u263A; 0.5%-1%\u2665.+ 2 xp/\u0434\u0435\u043D\u044C");
		bAdmin.setEnabled(false);
		bSanitar.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1%-2%\u263A;1%-1.5%\u2665.+ 1 xp/\u0434\u0435\u043D\u044C");
		bSanitar.setEnabled(false);
		bDriverB.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442,\u0430\u0432\u0442\u043E\u0448\u043A\u043E\u043B\u0430 \u043D\u0430 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u044E B. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1.5%-2.5%\u263A; 0.5%-2%\u2665.+2 xp/\u0434\u0435\u043D\u044C");
		bDriverB.setEnabled(false);
		bDriverC.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442, \u043F\u0440\u0430\u0432\u0430 \u043D\u0430 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u044E \u0421. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1.5%-3%\u263A; 1%-2.5%\u2665.+ 2 xp/\u0434\u0435\u043D\u044C");
		bDriverC.setEnabled(false);
		bDriverD.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F 18 \u043B\u0435\u0442, \u043F\u0440\u0430\u0432\u0430 \u043D\u0430 \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u044E D. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1.5%-3%\u263A; 1%-2.5%\u2665.+ 2 xp/\u0434\u0435\u043D\u044C");
		bDriverD.setEnabled(false);
		bSanteh.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u0441\u0430\u043D\u0442\u0435\u0445\u043D\u0438\u043A\u0430. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 1%-1.5%\u2665. +2 xp/\u0434\u0435\u043D\u044C");
		bSanteh.setEnabled(false);
		bElek.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u044D\u043B\u0435\u043A\u0442\u0440\u0438\u043A\u0430. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 1%-1.5%\u2665.+ 2 xp/\u0434\u0435\u043D\u044C");
		bElek.setEnabled(false);
		bWorkerZavod.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043A\u043E\u043B\u0435\u0434\u0436 \u043D\u0430 \u0441\u043B\u0435\u0441\u0430\u0440\u044F. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-3%F; 1%-2%\u263A; 1%-1.5%\u2665.+ 2 xp/\u0434\u0435\u043D\u044C");
		bWorkerZavod.setEnabled(false);
		bInginer.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0418\u043D\u0436\u0438\u043D\u0435\u0440\u043D\u044B\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-1.5%\u263A; 0,5%-1%\u2665.+ 3 xp/\u0434\u0435\u043D\u044C");
		bInginer.setEnabled(false);
		bDoc.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u041C\u0435\u0434\u0438\u0446\u0438\u043D\u0441\u043A\u0438\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0.5%-1.5%\u2665. +3 xp/\u0434\u0435\u043D\u044C");
		bDoc.setEnabled(false);
		bPoliceman.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0410\u043A\u0430\u0434\u0435\u043C\u0438\u044F \u041C\u0412\u0414 \u0438\u043B\u0438 \u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2.5%\u263A; 1%-2%\u2665.+ 3 xp/\u0434\u0435\u043D\u044C");
		bPoliceman.setEnabled(false);
		bProgrammer.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u0418\u0422\u0438\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u044F. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 0.5%-1.5%\u263A; 0,5%-1%\u2665. +3 xp/\u0434\u0435\u043D\u044C");
		bProgrammer.setEnabled(false);
		bITSpec.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442,\u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u0418\u0422\u0438\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u044F \u0438\u043B\u0438 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u043D\u0430 IT \u0441\u043F\u0435\u0446\u0438\u0430\u043B\u0438\u0441\u0442\u043E\u0432. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 0.5%-2%\u263A; 0,5%-1%\u2665. +3 xp/\u0434\u0435\u043D\u044C");
		bITSpec.setEnabled(false);
		bUrist.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0410\u043A\u0430\u0434\u0435\u043C\u0438\u044F \u041C\u0412\u0414 \u0438\u043B\u0438 \u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0,5%-1%\u2665. 3 xp/\u0434\u0435\u043D\u044C");
		bUrist.setEnabled(false);
		bMeneger.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u041C\u0435\u043D\u0435\u0434\u0436\u043C\u0435\u043D\u0442\u0430. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 0.5%-2%\u263A; 0,5%-1%\u2665. 3 xp/\u0434\u0435\u043D\u044C");
		bMeneger.setEnabled(false);
		bBossInginerProj.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u0418\u043D\u0436\u0438\u043D\u0435\u0440\u043D\u044B\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442,xp>=1500, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=1000. \u0417\u0430\u0442\u0440\u0430\u0442\u044B :1%-2.5%F; 1%-2%\u263A; 0,5%-1%\u2665. 4 xp/\u0434\u0435\u043D\u044C");
		bBossInginerProj.setEnabled(false);
		bZamBoss.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043E\u0434\u0438\u043D \u0438\u0437 \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442\u043E\u0432, \u0412\u044B\u0441\u0448\u0430\u044F \u0448\u043A\u043E\u043B\u0430 \u044D\u043A\u043E\u043D\u043E\u043C\u0438\u043A\u0438, xp>=6000, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=4250. \u0417\u0430\u0442\u0440\u0430\u0442\u044B: 1%-2.5%F, 1-2%\u263A, 0.5%-1%\u2665. +6xp/\u0434\u0435\u043D\u044C");
		bZamBoss.setEnabled(false);
		bBoss.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043E\u0434\u0438\u043D \u0438\u0437 \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442\u043E\u0432, \u0412\u044B\u0441\u0448\u0430\u044F \u0448\u043A\u043E\u043B\u0430 \u044D\u043A\u043E\u043D\u043E\u043C\u0438\u043A\u0438, xp>=8000, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=7000. \u0417\u0430\u0442\u0440\u0430\u0442\u044B: 1%-2.5%F, 1-2%\u263A, 0.5%-1%\u2665. +7xp/\u0434\u0435\u043D\u044C");
		bBoss.setEnabled(false);
		bBossOtdel.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F: 18 \u043B\u0435\u0442, \u043E\u0434\u0438\u043D \u0438\u0437 \u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442\u043E\u0432, \u0412\u044B\u0441\u0448\u0430\u044F \u0448\u043A\u043E\u043B\u0430 \u044D\u043A\u043E\u043D\u043E\u043C\u0438\u043A\u0438, xp>=4500, \u041F\u0440\u0435\u0441\u0442\u0438\u0436>=3000. \u0417\u0430\u0442\u0440\u0430\u0442\u044B: 1%-2.5%F, 1-2%\u263A, 0.5%-1%\u2665. +5xp/\u0434\u0435\u043D\u044C");
		bBossOtdel.setEnabled(false);
		bPromouter.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F \u043E\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u044E\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 0.5%-1%\u263A; 0.5%-1%\u2665.+ 1 xp/\u0434\u0435\u043D\u044C");
		bCurer.setToolTipText("\u0422\u0440\u0435\u0431\u043E\u0432\u0430\u043D\u0438\u044F \u043E\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u044E\u0442. \u0417\u0430\u0442\u0440\u0430\u0442\u044B 1%-2.5%F; 1%-1,5%\u263A; 0.5%-1%\u2665. +1 xp/\u0434\u0435\u043D\u044C");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bPromouter, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bCurer, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bCliner, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bSaler, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bSekretar, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bAdmin, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bSanitar, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bDriverB, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bDriverC, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bDriverD, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bSanteh, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bElek, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bWorkerZavod, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bInginer, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bDoc, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bPoliceman, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bProgrammer, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bITSpec, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bUrist, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bMeneger, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossInginerProj, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossZeh, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossDoc, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossPolice, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossIT, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossGov, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBossOtdel, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bZamBoss, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBoss, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(bPromouter)
					.addGap(11)
					.addComponent(bCurer)
					.addGap(11)
					.addComponent(bCliner)
					.addGap(11)
					.addComponent(bSaler)
					.addGap(11)
					.addComponent(bSekretar)
					.addGap(11)
					.addComponent(bAdmin)
					.addGap(11)
					.addComponent(bSanitar)
					.addGap(11)
					.addComponent(bDriverB)
					.addGap(11)
					.addComponent(bDriverC)
					.addGap(11)
					.addComponent(bDriverD)
					.addGap(11)
					.addComponent(bSanteh)
					.addGap(11)
					.addComponent(bElek)
					.addGap(11)
					.addComponent(bWorkerZavod)
					.addGap(11)
					.addComponent(bInginer)
					.addGap(11)
					.addComponent(bDoc)
					.addGap(11)
					.addComponent(bPoliceman)
					.addGap(11)
					.addComponent(bProgrammer)
					.addGap(11)
					.addComponent(bITSpec)
					.addGap(11)
					.addComponent(bUrist)
					.addGap(11)
					.addComponent(bMeneger)
					.addGap(11)
					.addComponent(bBossInginerProj)
					.addGap(11)
					.addComponent(bBossZeh)
					.addGap(11)
					.addComponent(bBossDoc)
					.addGap(11)
					.addComponent(bBossPolice)
					.addGap(11)
					.addComponent(bBossIT)
					.addGap(11)
					.addComponent(bBossGov)
					.addGap(11)
					.addComponent(bBossOtdel)
					.addGap(11)
					.addComponent(bZamBoss)
					.addGap(11)
					.addComponent(bBoss))
		);
		setLayout(groupLayout);
		
		bPromouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bSaler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bCurer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bCliner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bSekretar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bSanitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bDriverB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bDriverC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bDriverD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bSanteh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bElek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bWorkerZavod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bInginer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bPoliceman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bProgrammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bITSpec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bUrist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bMeneger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossInginerProj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bZamBoss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBoss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossOtdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossZeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossPolice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBossGov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
