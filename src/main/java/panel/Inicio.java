package main.java.panel;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblEsfera = new JLabel("");
		lblEsfera.setIcon(new ImageIcon("C:\\Users\\ruben\\Documents\\GitHub\\KameGYM\\Esfera.png"));
		lblEsfera.setBounds(538, 341, 124, 122);
		add(lblEsfera);
		
		JLabel lblKame = new JLabel("");
		lblKame.setIcon(new ImageIcon("C:\\Users\\ruben\\Documents\\GitHub\\KameGYM\\kame.png"));
		lblKame.setBounds(123, 303, 405, 193);
		add(lblKame);
		
		JLabel lblGym = new JLabel("");
		lblGym.setIcon(new ImageIcon("C:\\Users\\ruben\\Documents\\GitHub\\KameGYM\\gym.png"));
		lblGym.setBounds(672, 303, 453, 193);
		add(lblGym);
		
		JLabel lblKameLogo = new JLabel("");
		lblKameLogo.setIcon(new ImageIcon("C:\\Users\\ruben\\Documents\\GitHub\\KameGYM\\kame logo.png"));
		lblKameLogo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKameLogo.setBounds(319, 104, 621, 621);
		add(lblKameLogo);
		
	}
}
