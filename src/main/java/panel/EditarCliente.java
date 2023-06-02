package main.java.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarCliente extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public EditarCliente() {
		
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setBackground(Color.decode("#FF7121"));
		panel.setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBounds(0, 0, 1200, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Cuenta");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Clases");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Logout");
		menuBar.add(mnNewMenu_3);
		
		JLabel lblNewLabel = new JLabel("Repetir Contraseña");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel.setBounds(88, 660, 194, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(88, 560, 129, 22);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(88, 460, 107, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(88, 360, 194, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_4.setBounds(88, 260, 152, 22);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(219, 77, 173, 172);
		lblNewLabel_5.setOpaque(true);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ID:123456");
		lblNewLabel_6.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_6.setBounds(402, 141, 178, 53);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Cliente 1");
		lblNewLabel_6_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_6_1.setBounds(402, 77, 178, 53);
		panel.add(lblNewLabel_6_1);
		
		
		
		JButton btnNewButton = new JButton("Eliminar Cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton.setBounds(830, 687, 251, 40);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(87, 293, 335, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 389, 335, 40);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 491, 335, 40);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 593, 335, 40);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(87, 687, 335, 40);
		panel.add(textField_4);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Impact", Font.PLAIN, 23));
		btnActualizar.setBounds(519, 687, 251, 40);
		panel.add(btnActualizar);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tarifa");
		lblNewLabel_3_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1.setBounds(670, 339, 194, 22);
		panel.add(lblNewLabel_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(670, 366, 273, 40);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Instructor");
		lblNewLabel_3_1_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1_1.setBounds(670, 470, 194, 22);
		panel.add(lblNewLabel_3_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(670, 500, 273, 40);
		panel.add(comboBox_1);
		
		

	}
}
