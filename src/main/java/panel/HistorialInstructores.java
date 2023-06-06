package main.java.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;

import main.java.Util;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTable;

public class HistorialInstructores extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public HistorialInstructores() {
		setForeground(new Color(255, 128, 64));
		setLayout(null);
		
		JLabel User = new JLabel("");
		User.setIcon(new ImageIcon(Util.resizeImage(120, 120, Util.getStream("main/resources/user2.jpg"))));
		User.setBounds(360, 80, 120, 120);
		add(User);
		
		JLabel lblNewLabel = new JLabel("Instructor 1");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setBounds(500, 150, 200, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("ID : 894810");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel2.setBounds(500, 90, 200, 31);
		add(lblNewLabel2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 1248, 800);
		add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(323, 208, 500, 36);
		panel.add(comboBox);
		
		table = new JTable();
		table.setBounds(323, 255, 500, 396);
		panel.add(table);
		
		JLabel Back = new JLabel("");
		Back.setBounds(10, 39, 130, 120);
		panel.add(Back);
		Back.setIcon(new ImageIcon(Util.resizeImage(130, 110, Util.getStream("main/resources/back.png"))));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1190, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		menuBar.add(mnNewMenu_1);
		panel.setBackground(Color.decode("#FF7121"));
	}
}
