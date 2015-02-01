package game;

import java.io.Serializable;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

public class TransportSC extends JPanel implements Serializable {
	static final long serialVersionUID=26L;
	Transport tran=new Transport();
	JScrollPane scrollPane = new JScrollPane();
	JLabel LToplivo = new JLabel("\u0422\u043E\u043F\u043B\u0438\u0432\u043E \u0437\u0430 \u0433\u043E\u0434 ");
	 JLabel lTransportTrat = new JLabel("\u0412\u0441\u0435 \u0442\u0440\u0430\u0442\u044B = ");
	 JLabel lHelp = new JLabel("Справка");
	public TransportSC() {
		lHelp.setHorizontalAlignment(SwingConstants.CENTER);
		lHelp.setForeground(Color.BLUE);
		lHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JScrollPane TrSP = new JScrollPane();
		TrSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		TrSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		TrSP.setEnabled(true);
		
		
		TrSP.setViewportView(tran);
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(LToplivo, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lTransportTrat, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lHelp, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addComponent(TrSP, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LToplivo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lTransportTrat, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lHelp, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(TrSP, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		lHelp.addMouseListener(new HelpA());
	}
	public class HelpA implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lHelp){
			JOptionPane.showMessageDialog(null,"Здесь Вы можете купить транспорт.\n"+
												"Транспорт понижает затраты Бодрости(☺)");
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
