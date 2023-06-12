package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;

import main.java.Util;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.Font;

public class Creditos extends JPanel {

	/**
	 * Create the panel.
	 */
	public Creditos() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FF7121"));
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Este Programa fue programado y diseñado por:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(232, 52, 809, 211);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Util.resizeImage(201, 201, Util.getStream("main/resources/yuan.jpg"))));
		lblNewLabel_1.setBounds(95, 299, 201, 201);
		lblNewLabel_1.setOpaque(true);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Util.resizeImage(201, 201, Util.getStream("main/resources/rube.jpg"))));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBounds(840, 299, 201, 201);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Util.resizeImage(201, 201, Util.getStream("main/resources/abel.jpg"))));
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setBounds(471, 299, 201, 201);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Yahir Emmanuel Romo Palomino");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(81, 511, 237, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ruben Abdel Junco Jauregui");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(471, 511, 213, 37);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ruben Aleksey Unzon Melchor");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(840, 511, 218, 37);
		panel.add(lblNewLabel_2_2);

		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 35, 65, 65);
		lblBack.setBackground(Color.decode("#FF7121"));
		panel.add(lblBack);
		
		

	}

}
