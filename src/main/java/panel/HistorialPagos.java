package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import main.java.Util;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class HistorialPagos extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public HistorialPagos() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		panel.setBackground(Color.decode("#FF7121"));
		add(panel);
		panel.setLayout(null);
		
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 35, 65, 65);
		lblBack.setBackground(Color.decode("#FF7121"));
		panel.add(lblBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Util.resizeImage(150, 150, Util.getStream("main/resources/User2.jpg"))));
		lblNewLabel.setBounds(144, 102, 151, 150);
		lblNewLabel.setOpaque(true);
		panel.add(lblNewLabel);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Fecha", "Tarifa", "Monto", "Acciones"
			}
		));
		table.getColumnModel().getColumn(2).setMinWidth(22);
		table.getColumnModel().getColumn(3).setMinWidth(0);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(144, 306, 901, 350);
		panel.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente 1");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(305, 118, 145, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:123456");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(305, 160, 145, 24);
		panel.add(lblNewLabel_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1043, 306, 17, 350);
		panel.add(scrollBar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1200, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		menuBar.add(mnNewMenu_1);
		
		
		

	}
}
