package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Register extends JPanel {
	private JTextField textFieldCorreo;
	private JPasswordField passwordField;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JPasswordField repeatPasswordField;

	/**
	 * Create the panel.
	 */
	public Register() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBounds(52, 298, 661, 43);
		add(textFieldCorreo);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Arial", Font.BOLD, 32));
		lblCorreo.setBounds(52, 250, 193, 37);
		add(lblCorreo);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
		passwordField.setColumns(10);
		passwordField.setBounds(52, 400, 661, 43);
		add(passwordField);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Arial", Font.BOLD, 32));
		lblContraseña.setBounds(52, 352, 193, 37);
		add(lblContraseña);
		
		JButton btn = new JButton("Entrar");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(514, 652, 171, 55);
		add(btn);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre.setBounds(52, 46, 193, 37);
		add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(52, 94, 661, 43);
		add(textFieldNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.BOLD, 32));
		lblApellidos.setBounds(52, 148, 193, 37);
		add(lblApellidos);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(52, 196, 661, 43);
		add(textFieldApellidos);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contraseña");
		lblRepetirContrasea.setFont(new Font("Arial", Font.BOLD, 32));
		lblRepetirContrasea.setBounds(52, 454, 390, 37);
		add(lblRepetirContrasea);
		
		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setFont(new Font("Arial", Font.PLAIN, 18));
		repeatPasswordField.setColumns(10);
		repeatPasswordField.setBounds(52, 502, 661, 43);
		add(repeatPasswordField);
		
		JCheckBox newCheckBox = new JCheckBox("Acepto los terminos y condiciones");
		newCheckBox.setFont(new Font("Arial", Font.BOLD, 14));
		newCheckBox.setBounds(52, 552, 278, 28);
		newCheckBox.setBackground(Color.decode("#FF7121"));
		add(newCheckBox);
		
		JLabel lblImage = new JLabel("");
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.WHITE);
		lblImage.setBounds(810, 0, 390, 800);
		add(lblImage);
	}
}
