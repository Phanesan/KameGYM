package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Main;
import main.java.UserCredential.UserCredentialBuilder;
import main.java.Util;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends JPanel {
	private JTextField textFieldCorreo;
	private JPasswordField passwordField;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JPasswordField repeatPasswordField;
	private String pathIcon;

	/**
	 * Create the panel.
	 */
	public Register(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBounds(52, 298, 358, 43);
		add(textFieldCorreo);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Arial", Font.BOLD, 32));
		lblCorreo.setBounds(52, 250, 193, 37);
		add(lblCorreo);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
		passwordField.setColumns(10);
		passwordField.setBounds(52, 400, 358, 43);
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
		textFieldNombre.setBounds(52, 94, 358, 43);
		add(textFieldNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.BOLD, 32));
		lblApellidos.setBounds(52, 148, 193, 37);
		add(lblApellidos);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(52, 196, 358, 43);
		add(textFieldApellidos);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contraseña");
		lblRepetirContrasea.setFont(new Font("Arial", Font.BOLD, 32));
		lblRepetirContrasea.setBounds(52, 454, 390, 37);
		add(lblRepetirContrasea);
		
		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setFont(new Font("Arial", Font.PLAIN, 18));
		repeatPasswordField.setColumns(10);
		repeatPasswordField.setBounds(52, 502, 358, 43);
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
		
		JLabel iconArea = new JLabel("");
		iconArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		iconArea.setBounds(538, 94, 180, 180);
		add(iconArea);
		
		JButton btnExaminar = new JButton("Examinar");
		btnExaminar.setFont(new Font("Arial", Font.BOLD, 22));
		btnExaminar.setBounds(538, 298, 180, 37);
		add(btnExaminar);
		btnExaminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setMultiSelectionEnabled(false);
				fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter());
				fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivo de imagen", "png", "jpg"));
				int code = fc.showOpenDialog(main.frame);
				
				if(code == JFileChooser.APPROVE_OPTION) {
					pathIcon = fc.getSelectedFile().getAbsolutePath();
					Image image = new ImageIcon(pathIcon).getImage();
					ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
					iconArea.setIcon(icon);
				}
			}
		});
		
		JButton btn = new JButton("Continuar");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(283, 655, 271, 55);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					verificarNombre(textFieldNombre);
					verificarApellido(textFieldApellidos);
					verificarCorreo(textFieldCorreo);
					verificarContraseña(passwordField, repeatPasswordField);
					verificarCheckBox(newCheckBox);
					
					byte[] iconBytes = Util.getImageBytes(pathIcon);
					
					if(iconBytes == null) {
						iconBytes = Util.getImageBytes(Util.getStream("main/resources/user.png"));
					}
					
					UserCredentialBuilder builder = new UserCredentialBuilder(textFieldCorreo.getText())
																			.setNombre(textFieldNombre.getText())
																			.setApellidos(textFieldApellidos.getText())
																			.setPassword(new String(passwordField.getPassword()))
																			.setIcono(iconBytes);
					
					main.changePanel(main.frame, new RegisterDatos(main,builder));
				} catch(IllegalArgumentException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean verificarCorreo(JTextField textField) throws IllegalArgumentException{
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
	public boolean verificarNombre(JTextField textField) throws IllegalArgumentException{
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
	public boolean verificarApellido(JTextField textField) throws IllegalArgumentException{
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
	public boolean verificarContraseña(JPasswordField passwordField, JPasswordField confirmPaswordField) throws IllegalArgumentException{
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
	public boolean verificarCheckBox(JCheckBox checkBox) throws Exception{
		if(!checkBox.isSelected()) {
			throw new Exception("Acepte los terminos y condiciones");
		}
		return true;
	}
}
