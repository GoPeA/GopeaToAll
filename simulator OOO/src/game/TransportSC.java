package game;

import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TransportSC extends JPanel implements Serializable {
	static final long serialVersionUID=26L;
	Transport tran=new Transport();
	JScrollPane scrollPane = new JScrollPane();
	JLabel LToplivo = new JLabel("\u0422\u043E\u043F\u043B\u0438\u0432\u043E \u0437\u0430 \u0433\u043E\u0434 ");
	 JLabel lTransportTrat = new JLabel("\u0412\u0441\u0435 \u0442\u0440\u0430\u0442\u044B = ");
	public TransportSC() {
		
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(LToplivo, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lTransportTrat, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
						.addComponent(TrSP, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lTransportTrat, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(LToplivo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(TrSP, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
