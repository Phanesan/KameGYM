package main.java.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class CrearCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	public CrearCliente() {
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
		
		JMenu mnNewMenu_3 = new JMenu("Logout");
		menuBar.add(mnNewMenu_3);
		
		textField = new JTextField();
		textField.setBounds(88, 293, 325, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 393, 325, 40);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 493, 325, 40);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 593, 325, 40);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(88, 693, 325, 40);
		panel.add(textField_4);
		
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
		lblNewLabel_5.setBounds(88, 77, 173, 172);
		lblNewLabel_5.setOpaque(true);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("foto de perfil");
		lblNewLabel_6.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_6.setBounds(271, 123, 178, 53);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Selecciona una ");
		lblNewLabel_6_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_6_1.setBounds(270, 92, 178, 53);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("kg");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_7.setBackground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(906, 395, 46, 38);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("cm");
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_8.setBackground(new Color(0, 0, 0));
		lblNewLabel_8.setBounds(1132, 395, 46, 38);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("dd");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_9.setBackground(Color.BLACK);
		lblNewLabel_9.setBounds(825, 567, 46, 38);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("mm");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_10.setBackground(Color.BLACK);
		lblNewLabel_10.setBounds(954, 567, 46, 38);
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("yy");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_11.setBackground(Color.BLACK);
		lblNewLabel_11.setBounds(1102, 567, 46, 38);
		panel.add(lblNewLabel_11);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(740, 393, 162, 40);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(966, 393, 162, 40);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(740, 567, 107, 40);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(881, 567, 107, 40);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(1021, 567, 107, 40);
		panel.add(textField_9);
		
		JLabel lblNewLabel_3_1 = new JLabel("Peso");
		lblNewLabel_3_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1.setBounds(740, 360, 194, 22);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Estatura");
		lblNewLabel_3_2.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_2.setBounds(966, 360, 194, 22);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Fecha de nacimiento");
		lblNewLabel_3_1_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1_1.setBounds(827, 534, 225, 22);
		panel.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton.setBounds(808, 671, 251, 40);
		panel.add(btnNewButton);
		
		
		
	}


}
