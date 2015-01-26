package game;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ResourseMarket extends JPanel implements Serializable {
	static final long serialVersionUID=22L;
	Mouse m = new Mouse();
	JButton bFood1 = new JButton("\u0411\u0443\u0442\u0435\u0440\u0431\u0440\u043E\u0434\u044B +2%F  50\u0420");
	JButton bEnerge1 = new JButton("\u041F\u043E\u0433\u0443\u043B\u044F\u0442\u044C \u0441 \u0434\u0440\u0443\u0437\u044C\u044F\u043C\u0438 +2%\u263A 100\u0420");
	JButton bHelth1 = new JButton("\u041D\u0430\u0440\u043E\u0434\u043D\u044B\u0435 \u0441\u0440\u0435\u0434\u0441\u0442\u0432\u0430 +2%\u2665 100\u0420");
	JButton bFood2 = new JButton("\u0411\u043E\u043C\u0436-\u043F\u0430\u043A\u0435\u0442 +4%F 100\u0420");
	JButton bFood3 = new JButton("\u0425\u043E\u0442-\u0434\u043E\u0433 +7.5%F 300\u0420");
	JButton bFood4 = new JButton("\u0424\u0430\u0441\u0442\u0444\u0443\u0434 +15%F 1000\u0420   ");
	JButton bFood5 = new JButton("\u0421\u0442\u043E\u043B\u043E\u0432\u0430\u044F +25%F 2000\u0420");
	JButton bFood6 = new JButton("\u0417\u0430\u043A\u0430\u0437 \u041F\u0438\u0446\u0446\u044B +32.5%F 3000\u0420");
	JButton bFood7 = new JButton("\u041A\u0430\u0444\u0435 +47.5%F 7500\u0420");
	JButton bFood8 = new JButton("\u0428\u0432\u0435\u0434\u0441\u043A\u0438\u0439 \u0441\u0442\u043E\u043B +62.5%F 15000\u0420");
	JButton bFood9 = new JButton("Ресторан +80%F 50000Р");
	JButton bFood10 = new JButton("Банкет +100%F 300000Р");
	JButton bEnerge2 = new JButton("Сходить в кино +4%☺ 300Р");
	JButton bEnerge3 = new JButton("\u041F\u043E\u0439\u0442\u0438 \u0431\u0430\u0440 +7.5%\u263A 1000\u0420");
	JButton bEnerge4 = new JButton(" \u041D\u0430 \u0430\u0442\u0440\u0430\u043A\u0446\u0438\u043E\u043D\u044B +12.5%\u263A 2000\u0420");
	JButton bEnerge5 = new JButton("\u041A \u0448\u043B\u044E\u0445\u0430\u043C +25%\u263A 5000\u0420");
	JButton bEnerge6 = new JButton("\u042D\u043A\u0441\u0442\u0440\u0438\u043C +37.5%\u263A  10000\u0420");
	JButton bEnerge7 = new JButton("\u041F\u0443\u0442\u0438\u0448\u0435\u0441\u0442\u0432\u0438\u0435 +50%\u263A 15000\u0420");
	JButton bEnerge8 = new JButton("\u041C\u043E\u0440\u0441\u043A\u043E\u0439 \u043A\u0440\u0443\u0438\u0437 +72.5%\u263A 35000\u0420");
	JButton bEnerge9 = new JButton("\u041D\u0430 \u043A\u0440\u0430\u0439 \u0441\u0432\u0435\u0442\u0430 +80%\u263A 65000\u0420");
	JButton bEnerge10 = new JButton("\u0412\u0441\u0451 \u0412\u043A\u043B\u044E\u0447\u0435\u043D\u043D\u043E +100%\u263A 150000\u0420");
	JButton bHelth2 = new JButton("\u0421\u0430\u043C\u043E\u043B\u0435\u0447\u0435\u043D\u0438\u0435 +2%-4%\u2665 300\u0420");
	JButton bHelth3 = new JButton("\u0411\u0435\u0441\u043F\u043B\u0430\u0442\u043D\u044B\u0439 \u0432\u0440\u0430\u0447 +7.5%\u2665 1000\u0420");
	JButton bHelth4 = new JButton("\u0427\u0430\u0441\u0442\u043D\u044B\u0439 \u0432\u0440\u0430\u0447 +10%\u2665 2750\u0420");
	JButton bHelth5 = new JButton("\u0413\u043E\u0441. \u0411\u043E\u043B\u043D\u0438\u0446\u0430 +25%\u2665 10000\u0420");
	JButton bHelth6 = new JButton("\u041A\u043B\u0438\u043D\u0438\u043A\u0430 +32.5%\u2665 15000\u0420");
	JButton bHelth7 = new JButton("\u041B\u0435\u0447\u0435\u043D\u0438\u0435 +47.5%\u2665 30000\u0420");
	JButton bHelth8 = new JButton("\u041D\u0418\u0423 \u0412\u041C\u0410 +62.5%\u2665 50000\u0420");
	JButton bHelth9 = new JButton("\u041A\u0443\u0440\u043E\u0440\u0442 +80% \u2665 90000\u0420");
	JButton bHelth10 = new JButton(" \u0428\u0432\u0435\u0439\u0446\u0430\u0440\u0438\u044F +100%\u2665 150000\u0420");
	JTextPane resHelpPan = new JTextPane();
	 JLabel l1 = new JLabel("");
	public ResourseMarket() {
	
		bHelth1.setBounds(468, 50, 232, 23);
		bHelth1.setHorizontalAlignment(SwingConstants.LEFT);
		bFood10.setToolTipText("+100%F и +150 Престижа за 300'000Р");
		bFood10.setBounds(0, 356, 214, 23);
		bFood10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bEnerge10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bEnerge10.setBounds(225, 356, 233, 23);
		bEnerge10.setHorizontalAlignment(SwingConstants.LEFT);
		bHelth10.setBounds(468, 356, 232, 23);
		bHelth10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(null);
		bFood1.setBounds(0, 50, 214, 23);
		add(bFood1);
		bEnerge1.setBounds(225, 50, 233, 23);
		add(bEnerge1);
		add(bHelth1);
		bFood2.setBounds(0, 84, 214, 23);
		add(bFood2);
		bEnerge2.setBounds(225, 84, 233, 23);
		add(bEnerge2);
		bHelth2.setBounds(468, 84, 232, 23);
		add(bHelth2);
		bFood3.setBounds(0, 118, 214, 23);
		add(bFood3);
		bEnerge3.setBounds(225, 118, 233, 23);
		add(bEnerge3);
		bHelth3.setBounds(468, 118, 232, 23);
		add(bHelth3);
		bFood4.setBounds(0, 152, 214, 23);
		add(bFood4);
		bEnerge4.setBounds(225, 152, 233, 23);
		add(bEnerge4);
		bHelth4.setBounds(468, 152, 232, 23);
		add(bHelth4);
		bFood5.setBounds(0, 186, 214, 23);
		add(bFood5);
		bEnerge5.setBounds(225, 186, 233, 23);
		add(bEnerge5);
		bHelth5.setBounds(468, 186, 232, 23);
		add(bHelth5);
		bFood6.setBounds(0, 220, 214, 23);
		add(bFood6);
		bEnerge6.setBounds(225, 220, 233, 23);
		add(bEnerge6);
		bHelth6.setBounds(468, 220, 232, 23);
		add(bHelth6);
		bFood7.setBounds(0, 254, 214, 23);
		add(bFood7);
		bEnerge7.setBounds(225, 254, 233, 23);
		add(bEnerge7);
		bHelth7.setBounds(468, 254, 232, 23);
		add(bHelth7);
		bFood8.setBounds(0, 288, 214, 23);
		add(bFood8);
		bEnerge8.setBounds(225, 288, 233, 23);
		add(bEnerge8);
		bHelth8.setBounds(468, 288, 232, 23);
		add(bHelth8);
		bFood9.setToolTipText("+80%F  и +80 Престижа за 50'000Р ");
		
		bFood9.setBounds(0, 322, 214, 23);
		add(bFood9);
		bEnerge9.setBounds(225, 322, 233, 23);
		add(bEnerge9);
		bHelth9.setBounds(468, 322, 232, 23);
		add(bHelth9);
		add(bFood10);
		add(bEnerge10);
		add(bHelth10);
		resHelpPan.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		
		resHelpPan.setEditable(false);
		resHelpPan.setBounds(10, 401, 680, 78);
		add(resHelpPan);
		resHelpPan.setBackground(getBackground());
		l1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(59, 11, 581, 28);
		
		add(l1);
		l1.setText("Пополнение еды, бодрости  и здоровья");
		bFood9.addMouseListener(m);
		bFood10.addMouseListener(m);
		bEnerge9.addMouseListener(m);
		bEnerge10.addMouseListener(m);
		bHelth9.addMouseListener(m);
		bHelth10.addMouseListener(m);

	}
	public class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==bFood9){
				resHelpPan.setText("Добавляет 80%F и 80 Престижа за 50'000Р");
			}
			if(e.getSource()==bFood10){
				resHelpPan.setText("Добавляет 100%F и 150 Престижа за 300'000Р");
			}
			if(e.getSource()==bEnerge9){
				resHelpPan.setText("Добавляет 80%☺ и 95 Престижа за 65'000Р");
			}
			if(e.getSource()==bEnerge10){
				resHelpPan.setText("Добавляет 100%☺ и 190 Престижа за 150'000Р");
			}
			if(e.getSource()==bHelth9){
				resHelpPan.setText("Добавляет 80%♥, 12,5%☺ и 80 Престижа за 90'000Р");
			}
			if(e.getSource()==bHelth10){
				resHelpPan.setText("Добавляет 100%♥, 20%☺ и 150 Престижа за 150'000Р");
			}
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource()==bFood9){
				resHelpPan.setText("");
			}
			if(e.getSource()==bFood10){
				resHelpPan.setText("");
			}
			if(e.getSource()==bEnerge9){
				resHelpPan.setText("");
			}
			if(e.getSource()==bEnerge10){
				resHelpPan.setText("");
			}
			if(e.getSource()==bHelth9){
				resHelpPan.setText("");
			}
			if(e.getSource()==bHelth10){
				resHelpPan.setText("");
			}
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
