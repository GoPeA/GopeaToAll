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
import javax.swing.UIManager;

public class WorkPane extends JPanel {

	JButton bPromouter = new JButton("\u041F\u0440\u043E\u043C\u043E\u0443\u0442\u0435\u0440");
	JButton bCurer = new JButton("\u041A\u0443\u0440\u044C\u0435\u0440");
	JButton bCliner = new JButton("\u0414\u0432\u043E\u0440\u043D\u0438\u043A(\u0423\u0431\u043E\u0440\u0449\u0438\u043A)");
	JButton bSaler = new JButton("\u041F\u0440\u043E\u0434\u0430\u0432\u0435\u0446");
	JButton bSekretar = new JButton("\u0421\u0435\u043A\u0440\u0435\u0442\u0430\u0440\u044C");
	JButton bAdmin = new JButton("\u0410\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440");
	JButton bSanitar = new JButton("\u0421\u0430\u043D\u0438\u0442\u0430\u0440(\u041C\u0435\u0434\u0441\u0435\u0441\u0442\u0440\u0430)");
	JButton bDriverB = new JButton("\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 B");
	JButton bDriverC = new JButton("\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 C");
	JButton bDriverD = new JButton("\u0412\u043E\u0434\u0438\u0442\u0435\u043B\u044C \u043A\u0430\u0442\u0435\u0433\u043E\u0440\u0438\u0438 D");
	JButton bSanteh = new JButton("\u0421\u0430\u043D\u0442\u0435\u0445\u043D\u0438\u043A");
	JButton bElek = new JButton("\u042D\u043B\u0435\u043A\u0442\u0440\u0438\u043A");
	JButton bWorkerZavod = new JButton("\u0420\u0430\u0431\u043E\u0447\u0438\u0439 \u043D\u0430 \u0437\u0430\u0432\u043E\u0434\u0435");
	JButton bInginer = new JButton("\u0418\u043D\u0436\u0438\u043D\u0435\u0440");
	JButton bDoc = new JButton("\u0412\u0440\u0430\u0447");
	JButton bPoliceman = new JButton("\u0421\u043E\u0442\u0440\u0443\u0434\u043D\u0438\u043A \u0441\u0438\u043B\u043E\u0432\u044B\u0445 \u0441\u0442\u0440\u0443\u043A\u0442\u0443\u0440");
	JButton bProgrammer = new JButton("\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0438\u0441\u0442");
	JButton bITSpec = new JButton("IT \u0441\u043F\u0435\u0446\u0438\u0430\u043B\u0438\u0441\u0442");
	JButton bUrist = new JButton("\u042E\u0440\u0438\u0441\u0442");
	JButton bMeneger = new JButton("\u041C\u0435\u043D\u0435\u0434\u0436\u0435\u0440");
	JButton bBossInginerProj = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0438\u043D\u0436\u0438\u043D\u0435\u0440\u043D\u043E\u0433\u043E \u043F\u0440\u043E\u0435\u043A\u0442\u0430");
	JButton bZamBoss = new JButton("\u0417\u0430\u043C\u0438\u0441\u0442\u0438\u0442\u0435\u043B\u044C \u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440\u0430");
	JButton bBoss = new JButton("\u0413\u0435\u043D\u0435\u0440\u0430\u043B\u044C\u043D\u044B\u0439 \u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440");
	JButton bBossOtdel = new JButton("\u0413\u043B\u0430\u0432\u0430 \u043E\u0442\u0434\u0435\u043B\u0430");
	JButton bBossZeh = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0446\u0435\u0445\u0430");
	JButton bBossDoc = new JButton("\u0413\u043B\u0430\u0432 \u0412\u0440\u0430\u0447");
	JButton bBossPolice = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A \u0432 \u0441\u0438\u043B\u043E\u0432\u044B\u0445 \u0441\u0442\u0440\u0443\u043A\u0442\u0443\u0440\u0430\u0445");
	JButton bBossIT = new JButton("\u041D\u0430\u0447\u0430\u043B\u044C\u043D\u0438\u043A IT \u043F\u0440\u043E\u0435\u043A\u0442\u0430");
	JButton bBossGov = new JButton("\u0413\u043B\u0430\u0432\u0430 \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u044F");
	private final JLabel lblNewLabel_8 = new JLabel("New label");
	private final JLabel lblNewLabel_9 = new JLabel("New label");
	private final JLabel lblNewLabel_10 = new JLabel("New label");
	private final JLabel lblNewLabel_11 = new JLabel("\u043D\u0435\u0442");
	private final JLabel label = new JLabel("16500");
	private final JLabel label_1 = new JLabel("18750");
	private final JLabel label_2 = new JLabel("19500");
	private final JLabel label_3 = new JLabel("22500");
	private final JLabel label_4 = new JLabel("24000");
	private final JLabel label_5 = new JLabel("42000");
	private final JLabel label_6 = new JLabel("45000");
	private final JLabel label_7 = new JLabel("45000");
	private final JLabel label_8 = new JLabel("30000");
	private final JLabel label_9 = new JLabel("30000");
	private final JLabel label_10 = new JLabel("45000");
	private final JLabel label_11 = new JLabel("55500");
	private final JLabel label_12 = new JLabel("57000");
	private final JLabel label_13 = new JLabel("58500");
	private final JLabel label_14 = new JLabel("69000");
	private final JLabel label_15 = new JLabel("60000");
	private final JLabel label_16 = new JLabel("54000");
	private final JLabel label_17 = new JLabel("49500\r\n");
	private final JLabel label_18 = new JLabel("New label");
	private final JLabel label_19 = new JLabel("New label");
	private final JLabel label_20 = new JLabel("New label");
	private final JLabel label_21 = new JLabel("New label");
	private final JLabel label_22 = new JLabel("New label");
	private final JLabel label_23 = new JLabel("New label");
	private final JLabel label_24 = new JLabel("New label");
	private final JLabel label_25 = new JLabel("New label");
	private final JLabel label_26 = new JLabel("New label");
	private final JLabel label_54 = new JLabel("New label");
	private final JLabel label_55 = new JLabel("New label");
	private final JLabel label_56 = new JLabel("New label");
	private final JLabel label_57 = new JLabel("New label");
	private final JLabel label_58 = new JLabel("New label");
	private final JLabel label_59 = new JLabel("New label");
	private final JLabel label_60 = new JLabel("New label");
	private final JLabel label_61 = new JLabel("New label");
	private final JLabel label_62 = new JLabel("New label");
	private final JLabel label_63 = new JLabel("New label");
	private final JLabel label_64 = new JLabel("New label");
	private final JLabel label_65 = new JLabel("New label");
	private final JLabel label_66 = new JLabel("New label");
	private final JLabel label_67 = new JLabel("New label");
	private final JLabel label_68 = new JLabel("New label");
	private final JLabel label_69 = new JLabel("New label");
	private final JLabel label_70 = new JLabel("New label");
	private final JLabel label_71 = new JLabel("New label");
	private final JLabel label_72 = new JLabel("New label");
	private final JLabel label_73 = new JLabel("New label");
	private final JLabel label_74 = new JLabel("New label");
	private final JLabel label_75 = new JLabel("New label");
	private final JLabel label_76 = new JLabel("New label");
	private final JLabel label_77 = new JLabel("New label");
	private final JLabel label_78 = new JLabel("New label");
	private final JLabel label_79 = new JLabel("New label");
	private final JLabel label_80 = new JLabel("New label");
	
	
	public WorkPane() {
		bCliner.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("10800");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("2-5");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("1-2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_4 = new JLabel("1-2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_5 = new JLabel("\u043D\u0435\u0442");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		bBossZeh.setEnabled(false);
		bBossDoc.setEnabled(false);
		bBossPolice.setEnabled(false);
		bBossIT.setEnabled(false);
		bBossIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		bBossGov.setEnabled(false);
		bSaler.setEnabled(false);
		bSekretar.setEnabled(false);
		bAdmin.setEnabled(false);
		bSanitar.setEnabled(false);
		bDriverB.setEnabled(false);
		bDriverC.setEnabled(false);
		bDriverD.setEnabled(false);
		bSanteh.setEnabled(false);
		bElek.setEnabled(false);
		bWorkerZavod.setEnabled(false);
		bInginer.setEnabled(false);
		bDoc.setEnabled(false);
		bPoliceman.setEnabled(false);
		bProgrammer.setEnabled(false);
		bITSpec.setEnabled(false);
		bUrist.setEnabled(false);
		bMeneger.setEnabled(false);
		bBossInginerProj.setEnabled(false);
		bZamBoss.setEnabled(false);
		bBoss.setEnabled(false);
		bBossOtdel.setEnabled(false);
		
		JLabel lblNewLabel_6 = new JLabel("15000");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_54.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_55.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_56.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_57.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_58.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_59.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_60.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_61.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_62.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_63.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_64.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_65.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_66.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_67.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_68.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_69.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_70.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_71.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_72.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_73.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_74.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_75.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_76.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_77.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_78.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_79.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_80.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_81 = new JLabel("New label");
		label_81.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_82 = new JLabel("New label");
		label_82.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_83 = new JLabel("New label");
		label_83.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_84 = new JLabel("New label");
		label_84.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_85 = new JLabel("New label");
		label_85.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_86 = new JLabel("New label");
		label_86.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_87 = new JLabel("New label");
		label_87.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_88 = new JLabel("New label");
		label_88.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_89 = new JLabel("New label");
		label_89.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_90 = new JLabel("New label");
		label_90.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_91 = new JLabel("New label");
		label_91.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_92 = new JLabel("New label");
		label_92.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_93 = new JLabel("New label");
		label_93.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_94 = new JLabel("New label");
		label_94.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_95 = new JLabel("New label");
		label_95.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_96 = new JLabel("New label");
		label_96.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_97 = new JLabel("New label");
		label_97.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_98 = new JLabel("New label");
		label_98.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_99 = new JLabel("New label");
		label_99.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_100 = new JLabel("New label");
		label_100.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_101 = new JLabel("New label");
		label_101.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_102 = new JLabel("New label");
		label_102.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_103 = new JLabel("New label");
		label_103.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_104 = new JLabel("New label");
		label_104.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_105 = new JLabel("New label");
		label_105.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_106 = new JLabel("New label");
		label_106.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_107 = new JLabel("New label");
		label_107.setFont(new Font("Tahoma", Font.BOLD, 14));
		bPromouter.setBackground(UIManager.getColor("Button.background"));
		
		JLabel label_27 = new JLabel("18 \u043B\u0435\u0442");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_28 = new JLabel("18 \u043B\u0435\u0442");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_29 = new JLabel("18 \u043B\u0435\u0442");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_30 = new JLabel("New label");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_31 = new JLabel("New label");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_32 = new JLabel("New label");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_33 = new JLabel("New label");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_34 = new JLabel("New label");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_35 = new JLabel("New label");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_36 = new JLabel("New label");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_37 = new JLabel("New label");
		label_37.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_38 = new JLabel("New label");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_39 = new JLabel("New label");
		label_39.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_40 = new JLabel("New label");
		label_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_41 = new JLabel("New label");
		label_41.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_42 = new JLabel("New label");
		label_42.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_43 = new JLabel("New label");
		label_43.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_44 = new JLabel("New label");
		label_44.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_45 = new JLabel("New label");
		label_45.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_46 = new JLabel("New label");
		label_46.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_47 = new JLabel("New label");
		label_47.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_48 = new JLabel("New label");
		label_48.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_49 = new JLabel("New label");
		label_49.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_50 = new JLabel("New label");
		label_50.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_51 = new JLabel("New label");
		label_51.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_52 = new JLabel("New label");
		label_52.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_53 = new JLabel("New label");
		label_53.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_108 = new JLabel("New label");
		label_108.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_109 = new JLabel("New label");
		label_109.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_110 = new JLabel("New label");
		label_110.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_111 = new JLabel("18 \u043B\u0435\u0442");
		label_111.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_112 = new JLabel("18 \u043B\u0435\u0442");
		label_112.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_113 = new JLabel("18 \u043B\u0435\u0442, \u0430\u0432\u0442\u043E\u0448\u043A\u043E\u043B\u0430");
		label_113.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_114 = new JLabel("18 \u043B\u0435\u0442, \u0430\u0432\u0442\u043E\u0448\u043A\u043E\u043B\u0430");
		label_114.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_115 = new JLabel("18 \u043B\u0435\u0442, \u0430\u0432\u0442\u043E\u0448\u043A\u043E\u043B\u0430");
		label_115.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_116 = new JLabel("18 \u043B\u0435\u0442,\u043A\u043E\u043B\u043B\u0435\u0434\u0436");
		label_116.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_117 = new JLabel("18 \u043B\u0435\u0442,\u043A\u043E\u043B\u043B\u0435\u0434\u0436");
		label_117.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_118 = new JLabel("18 \u043B\u0435\u0442,\u043A\u043E\u043B\u043B\u0435\u0434\u0436");
		label_118.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_119 = new JLabel("\u0418\u043D\u0436\u0438\u043D\u0435\u0440\u043D\u044B\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442");
		label_119.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_120 = new JLabel("\u041C\u0443\u0434\u0438\u0446\u0438\u043D\u0441\u043A\u0438\u0439 \u0438\u043D\u0441\u0442\u0438\u0442\u0443\u0442");
		label_120.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_121 = new JLabel("\u0410\u043A\u0430\u0434\u0435\u043C\u0438\u044F \u041C\u0412\u0414/\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439");
		label_121.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_122 = new JLabel("\u0418\u0422\u0438\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u044F ");
		label_122.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblIt = new JLabel("\u0418\u0441\u0442\u0438\u0442\u0443\u0442 \u043D\u0430 IT");
		lblIt.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_124 = new JLabel("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0439");
		label_124.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_125 = new JLabel("\u0418\u043D\u0441\u0442\u0438\u0442\u0443\u0442 \u041C\u0435\u043D\u0435\u0434\u0436\u0435\u043C\u0435\u043D\u0442\u0430");
		label_125.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_126 = new JLabel("New label");
		label_126.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_127 = new JLabel("New label");
		label_127.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_128 = new JLabel("New label");
		label_128.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_129 = new JLabel("New label");
		label_129.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_130 = new JLabel("New label");
		label_130.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_131 = new JLabel("New label");
		label_131.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_132 = new JLabel("New label");
		label_132.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_133 = new JLabel("New label");
		label_133.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_134 = new JLabel("New label");
		label_134.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bPromouter, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bCurer, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bCliner, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_81, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bSaler, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_82, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bSekretar, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bAdmin, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_111, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bSanitar, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_85, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_112, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bDriverB, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_86, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_113, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bDriverC, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_87, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_114, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bDriverD, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_61, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_88, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_115, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bSanteh, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_89, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_116, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bElek, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_117, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bWorkerZavod, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_118, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bInginer, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_92, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_119, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bDoc, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_93, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_120, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bPoliceman, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_94, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_121, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bProgrammer, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_95, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_44, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_122, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bITSpec, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_96, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_45, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblIt, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bUrist, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_97, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_124, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bMeneger, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_98, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_47, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_125, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossInginerProj, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_99, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_126, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossZeh, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_100, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_127, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossDoc, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_101, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_128, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossPolice, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_102, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_129, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossIT, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_103, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_130, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossGov, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_104, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_131, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBossOtdel, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_105, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_108, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_132, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bZamBoss, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_106, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_109, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_133, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bBoss, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_80, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_107, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_110, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_134, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bPromouter)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bCurer)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bCliner)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_81, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bSaler)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_82, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bSekretar)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bAdmin)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_111, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bSanitar)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_85, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_112, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bDriverB)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_86, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_113, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bDriverC)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_87, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_114, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bDriverD)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_61, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_88, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_115, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bSanteh)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_89, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_116, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bElek)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_117, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bWorkerZavod)
						.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_118, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bInginer)
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_92, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_119, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bDoc)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_93, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_120, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bPoliceman)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_94, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_121, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bProgrammer)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_95, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_44, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_122, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bITSpec)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_96, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_45, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIt, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bUrist)
						.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_97, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_124, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bMeneger)
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_98, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_47, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_125, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossInginerProj)
						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_99, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_126, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossZeh)
						.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_100, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_127, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossDoc)
						.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_101, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_128, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossPolice)
						.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_102, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_129, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossIT)
						.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_103, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_130, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossGov)
						.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_104, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_131, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBossOtdel)
						.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_105, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_108, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_132, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bZamBoss)
						.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_106, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_109, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_133, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bBoss)
						.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_80, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_107, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_110, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_134, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
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
