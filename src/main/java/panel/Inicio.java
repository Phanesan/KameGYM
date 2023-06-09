package main.java.panel;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import main.java.Util;

public class Inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblKameLogo = new JLabel("");
		lblKameLogo.setIcon(new ImageIcon(Util.resizeImage(1186, 621, Util.getStream("main/resources/logoInicio.png"))));
		lblKameLogo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKameLogo.setBounds(7, 65, 1186, 621);
		add(lblKameLogo);
	}
}
