package game;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.text.MaskFormatter;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;

public class Hipermarket extends JPanel implements ActionListener {
	Timer time1=new Timer(1,this);
	 JButton bBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
	 JLabel lblNewLabel = new JLabel("\u0421\u0435\u0442\u044C \u0433\u0438\u043F\u0435\u0440\u043C\u0430\u0440\u043A\u0435\u0442\u043E\u0432");
	 JButton bStartComp = new JButton("\u041E\u0441\u043D\u043E\u0432\u0430\u0442\u044C \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u044E 2'750'000\u0420");
	 JLabel lblNewLabel_1 = new JLabel("\u0413\u0438\u043F\u0435\u0440\u043C\u0430\u0440\u043A\u0435\u0442");
	 JLabel lblNewLabel_2 = new JLabel("+");
	 JButton bBild = new JButton("\u041F\u043E\u0441\u0442\u0440\u043E\u0438\u0442\u044C");
	 JLabel label = new JLabel("-");
	 JLabel label_1 = new JLabel("\u0413\u0438\u043F\u0435\u0440\u043C\u0430\u0440\u043A\u0435\u0442");
	 JButton bSell = new JButton("\u041F\u0440\u043E\u0434\u0430\u0442\u044C");
	 JLabel lKolvo = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E ");
	 JLabel lPribil = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C(\u0434\u0435\u043D\u044C) =");
	 JLabel lZatrat = new JLabel("\u0423\u0431\u044B\u0442\u043A\u0438 (\u0434\u0435\u043D\u044C) = ");
	 MaskFormatter f1,f2;
	 JSpinner tfBild = new JSpinner();
	 JSpinner tfSell = new JSpinner();
	 JLabel lblNewLabel_3 = new JLabel("\u041F\u0440\u0438\u0431\u044B\u043B\u044C \u043E\u0442 7000\u0420 \u0434\u043E 35000\u0420");
	public Hipermarket() {
		setLayout(null);
		
		bBack.setBounds(10, 391, 89, 23);
		add(bBack);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 11, 471, 23);
		add(lblNewLabel);
		bStartComp.setBounds(68, 45, 544, 23);
		add(bStartComp);
		lblNewLabel_1.setBounds(188, 79, 77, 23);
		add(lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(68, 79, 8, 23);
		add(lblNewLabel_2);
		bBild.setEnabled(false);
		bBild.setBounds(275, 78, 337, 23);
		add(bBild);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(68, 113, 8, 23);
		add(label);
		label_1.setBounds(188, 113, 77, 23);
		add(label_1);
		bSell.setEnabled(false);
		bSell.setBounds(275, 112, 337, 23);
		add(bSell);
		lKolvo.setBounds(68, 147, 544, 23);
		add(lKolvo);
		lPribil.setBounds(68, 181, 544, 23);
		add(lPribil);
		lZatrat.setBounds(68, 215, 544, 23);
		add(lZatrat);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(195, 249, 293, 23);
		add(lblNewLabel_3);
		tfBild.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		
		
		tfBild.setBounds(78, 80, 100, 20);
		add(tfBild);
		tfSell.setModel(new SpinnerNumberModel(new Long(1), new Long(0), null, new Long(1)));
		
		
		tfSell.setBounds(78, 113, 100, 20);
		add(tfSell);

	}
	public void format(){
		//try {
			//f1 = new MaskFormatter("#");
			//f2 = new MaskFormatter("#");
		//} catch (ParseException e) {
			
		//}
		//f1.setPlaceholderCharacter(' ');
		//tfBild = new JFormattedTextField(f1);
		//tfSell = new JFormattedTextField(f1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//format();
		
	}
}
