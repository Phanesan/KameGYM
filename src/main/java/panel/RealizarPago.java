package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.Util;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class RealizarPago extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public RealizarPago() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		panel.setBackground(Color.decode("#FF7121"));
		add(panel);
		panel.setLayout(null);
		
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 35, 65, 65);
		lblBack.setBackground(Color.decode("#000000"));
		lblBack.setOpaque(true);
		panel.add(lblBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Util.resizeImage(150, 150, Util.getStream("main/resources/User2.jpg"))));
		lblNewLabel.setBounds(399, 335, 151, 150);
		lblNewLabel.setOpaque(true);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente 1");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(600, 345, 145, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:123456");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(600, 391, 145, 24);
		panel.add(lblNewLabel_1_1);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(399, 545, 346, 39);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Tarifa Actual:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_2.setBounds(500, 496, 172, 46);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1.setBounds(485, 630, 200, 51);
		panel.add(btnNewButton_1);
		
		JLabel Tarifas = new JLabel("");
		Tarifas.setIcon(new ImageIcon(Util.resizeImage(1200, 302, Util.getStream("main/resources/FondoTarifas.png"))));
		Tarifas.setBounds(0, 0, 1200, 302);
		panel.add(Tarifas);
		
		
		

	}
}
