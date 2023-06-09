package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.Util;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearTarifa extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public CrearTarifa() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		add(lblBack);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre.setBounds(269, 212, 193, 37);
		add(lblNombre);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(269, 260, 661, 43);
		add(textField);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracion.setBounds(269, 314, 193, 37);
		add(lblDuracion);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(269, 362, 661, 43);
		add(textField_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		lblPrecio.setBounds(269, 416, 193, 37);
		add(lblPrecio);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(269, 464, 661, 43);
		add(textField_2);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setBounds(469, 591, 309, 65);
		add(btnNewButton);
		
	}
}
