package rr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TRRd extends JFrame {
	Panel pan=new Panel();
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRRd frame = new TRRd();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setSize(640,480);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TRRd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(pan);
	}

}
