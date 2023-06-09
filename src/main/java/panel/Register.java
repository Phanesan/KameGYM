package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Util;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
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
		lblImage.setIcon(new ImageIcon(Util.resizeImage(390, 800, Util.getStream("main/resources/gyv.jpg"))));
		lblImage.setBounds(810, 0, 390, 800);
		add(lblImage);
		
		JButton btn = new JButton("Entrar");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(514, 652, 171, 55);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				verificarNombre(textFieldNombre);
				verificarApellido(textFieldApellidos);
				verificarCorreo(textFieldCorreo);
				verificarContraseña(passwordField, repeatPasswordField);
				verificarCheckBox(newCheckBox);
			}
		});
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean verificarCorreo(JTextField textField) {
	    String texto = textField.getText();
	    
	    // Verificar si el correo contiene un "@" y un "."
	    if (!texto.contains("@") || !texto.contains(".")) {
	        try {
	        	throw new IllegalArgumentException("El correo electrónico debe contener obligatoriamente un '@' y un '.'");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }
	    
	    return true;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public boolean verificarNombre(JTextField textField) {
	    String texto = textField.getText();

	    // Verificar la longitud del texto
	    if (texto.length() > 40) {
	    	try {
	        	throw new IllegalArgumentException("Nombre: Limite de caracteres excedido: 40");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }

	    // Verificar si el texto contiene caracteres no permitidos
	    if (!texto.matches("[A-Za-z\\s]+")) {
	    	try {
	        	throw new IllegalArgumentException("Nombre: Solo se aceptan letras y espacios");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }
	    return true;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean verificarApellido(JTextField textField) {
	    String texto = textField.getText();

	    // Verificar la longitud del texto
	    if (texto.length() > 40) {
	    	try {
	        	throw new IllegalArgumentException("Apellido: Limite de caracteres excedido: 40");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }

	    // Verificar si el texto contiene caracteres no permitidos
	    if (!texto.matches("[A-Za-z\\s]+")) {
	    	try {
	        	throw new IllegalArgumentException("Apellido: Solo se aceptan letras y espacios");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }
	    return true;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean verificarContraseña(JPasswordField passwordField, JPasswordField confirmPaswordField) {
		String contra = new String(passwordField.getPassword());
		String confirmContra = new String(confirmPaswordField.getPassword());
		
		// Verificar si la contraseña es la misma en repetir contraseña
		if(!contra.equals(confirmContra)) {
			try {
	        	throw new IllegalArgumentException("Repita contraseña");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
		}
		// Verificar si el campo esta en blanco
		if(contra.isEmpty()) {
			try {
	        	throw new IllegalArgumentException("Contraseña: Espacio en blanco");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
		}
		// Verificar el limite de caracteres en el campo
		if (contra.length() > 40) {
	    	try {
	        	throw new IllegalArgumentException("Contraseña: Limite de caracteres excedido: 40");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }
		
		return true;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean verificarCheckBox(JCheckBox checkBox) {
		if(!checkBox.isSelected()) {
			JOptionPane.showMessageDialog(null, "Acepte terminos y condiciones");
		}
		return true;
	}
}
