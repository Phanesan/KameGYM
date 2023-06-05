package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.Util;
import javax.swing.JComboBox;

public class Tarifas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Tarifas() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		add(lblBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(380, 101, 439, 67);
		add(comboBox);
		
		
	}

}
