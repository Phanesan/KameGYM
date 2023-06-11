package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.Main;
import main.java.UserCredential;
import main.java.exception.CredentialsException;
import main.java.exception.DuplicateMailException;
import main.java.sql.ConnectionDB;
import main.java.Util;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Login extends JPanel {

	/**
	 * Create the panel.
	 */
	public Login(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JTextField textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldCorreo.setBounds(385, 414, 430, 43);
		add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		JPasswordField fieldPassword = new JPasswordField();
		fieldPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(385, 516, 430, 43);
		add(fieldPassword);
		
		JLabel lblNewLabel1 = new JLabel("Correo");
		lblNewLabel1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel1.setBounds(385, 366, 193, 37);
		add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Contraseña");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel2.setBounds(385, 468, 193, 37);
		add(lblNewLabel2);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificarCorreo(textFieldCorreo);
				verificarContraseña(fieldPassword);
				try {
					UserCredential userCredential = ConnectionDB.loginRequest(textFieldCorreo.getText(), new String(fieldPassword.getPassword()));
					main.changePanel(main.frame, new Lobby(main, userCredential));
					main.barraMenu.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CredentialsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(320, 623, 200, 55);
		add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 28));
		btnRegistrarse.setBounds(680, 623, 200, 55);
		btnRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.changePanel(main.frame, new Register(main));
			}
		});
		add(btnRegistrarse);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(175, 0, 850, 428);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(850, 400, Util.getStream("main/resources/logoInicio.png"))));
		add(lblImage);
	}
	
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
	
	public boolean verificarContraseña(JPasswordField passwordField) {
		String contra = new String(passwordField.getPassword());
		//Verificar si el campo esta en blanco
		if(contra.isEmpty()) {
			try {
	        	throw new IllegalArgumentException("Contraseña: Espacio en blanco");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
		}
		// Verificar el limite de caracteres en el campo
		if(contra.length() > 40) {
	    	try {
	        	throw new IllegalArgumentException("Contraseña: Limite de caracteres excedido: 40");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
	    }
		
		return true;
	}
}
