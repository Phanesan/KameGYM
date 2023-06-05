package main.java.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Util;
import javax.swing.JButton;

public class CrearClase extends JPanel {
	private JTextField textDuracion;
	private JTextField textInstructor;

	/**
	 * Create the panel.
	 */
	public CrearClase() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		add(lblBack);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre.setBounds(51, 162, 193, 37);
		add(lblNombre);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(51, 211, 607, 43);
		add(textField);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracion.setBounds(51, 265, 193, 37);
		add(lblDuracion);
		
		textDuracion = new JTextField();
		textDuracion.setFont(new Font("Arial", Font.PLAIN, 18));
		textDuracion.setColumns(10);
		textDuracion.setBounds(51, 313, 607, 43);
		add(textDuracion);
		
		JLabel lblNombre_1_1 = new JLabel("Instructor");
		lblNombre_1_1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre_1_1.setBounds(51, 367, 193, 37);
		add(lblNombre_1_1);
		
		textInstructor = new JTextField();
		textInstructor.setFont(new Font("Arial", Font.PLAIN, 18));
		textInstructor.setColumns(10);
		textInstructor.setBounds(51, 415, 607, 43);
		add(textInstructor);
		
		JLabel lblImage = new JLabel("");
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.WHITE);
		lblImage.setBounds(810, 0, 390, 800);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(390, 800, Util.getStream("main/resources/image1.png"))));
		add(lblImage);
		
		JButton btn = new JButton("Crear");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(264, 617, 171, 55);
		add(btn);
	}

}
