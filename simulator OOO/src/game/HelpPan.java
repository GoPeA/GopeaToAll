package game;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class HelpPan extends JPanel {
	
	JTextArea HelpText = new JTextArea();
	JButton bBack = new JButton("\u0412 \u043C\u0435\u043D\u044E");
	public HelpPan() {
		setLayout(null);
		
		
		bBack.setBounds(10, 565, 89, 23);
		add(bBack);
		
		
		HelpText.setEditable(false);
		HelpText.setBounds(10, 34, 766, 500);
		add(HelpText);
		HelpText.setBackground(getBackground());
		HelpText.setText("\n"+
						"\n"+
						"\n"+
						"\n"+
						"\n"+
						"\n"+
						"\n"+
						"\n"+
						"");

	}
	public void internet(){
		String url="http://gopea.hol.es/zyro/sitemap.xml";
		
		File furl = new File(url);

		try {
			Desktop.getDesktop().browse(furl.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
