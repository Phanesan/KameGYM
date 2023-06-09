package main.java.panel;

import javax.swing.JPanel;

import main.java.Util;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientesPago extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public ClientesPago() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FF7121"));
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		JLabel Back = new JLabel("");
		Back.setIcon(new ImageIcon(Util.resizeImage(60, 60, Util.getStream("main/resources/back.png"))));
		Back.setBounds(10, 40, 60, 60);
		panel.add(Back);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1200, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		menuBar.add(mnNewMenu_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(158, 85, 140, 140);
		lblNewLabel.setOpaque(true);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente 1");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1.setBounds(308, 99, 171, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:123456");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(308, 152, 171, 31);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(133, 350, 414, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 460, 414, 39);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 570, 414, 39);
		panel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(133, 680, 265, 39);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1_1_1.setBounds(133, 308, 171, 31);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Apellidos");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1_1_2.setBounds(133, 418, 171, 31);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Correo");
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1_1_3.setBounds(133, 528, 171, 31);
		panel.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Tarifa");
		lblNewLabel_1_1_4.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_1_1_4.setBounds(133, 638, 171, 31);
		panel.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("Sueldo a pagar");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_2.setBounds(871, 306, 191, 39);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("$120003.2323");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_2_1.setBounds(871, 364, 191, 39);
		panel.add(lblNewLabel_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(838, 468, 257, 31);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cantidad a aportar");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(859, 432, 255, 39);
		panel.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Realizar aporte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(873, 530, 199, 43);
		panel.add(btnNewButton);

	}
}
