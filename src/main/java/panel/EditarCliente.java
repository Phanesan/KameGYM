package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.ClassCredential;
import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import main.java.exception.CredentialsException;
import main.java.exception.DuplicateTarifaException;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarCliente extends JPanel {
	
	private JTextField textField;
	private JTextField textApellidos;
	private JTextField textCorreo;
	private JPasswordField textContraseña;
	private JPasswordField textRepetirContraseña;
	private LobbyCliente cliente;
	UserCredential userCredential;
	Register register;
	// https://www.youtube.com/watch?v=dQw4w9WgXcQ
	/**
	 * Create the panel.
	 */
	public EditarCliente(Main main, UserCredential userCredential) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		lblBack.setBorderPainted(false);
		lblBack.setOpaque(false);
		add(lblBack);
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			main.changePanel(main.frame, new LobbyCliente(main));	
			}
		});
		
		JLabel lblNewLabel = new JLabel("Repetir Contraseña");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(665, 356, 334, 22);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_1.setBounds(665, 260, 334, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_2.setBounds(200, 458, 129, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_3.setBounds(200, 356, 194, 22);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_4.setBounds(200, 260, 152, 22);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(130, 38, 173, 172);
		lblNewLabel_5.setOpaque(true);
		Image image = new ImageIcon(userCredential.icono).getImage();
		ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
		lblNewLabel_5.setIcon(icon);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6_1 = new JLabel(userCredential.nombre + " " + userCredential.apellidos);
		lblNewLabel_6_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_6_1.setBounds(331, 38, 178, 53);
		add(lblNewLabel_6_1);
		
		textField = new JTextField();
		textField.setBounds(200, 293, 335, 40);
		textField.setColumns(10);
		textField.setText(userCredential.nombre);
		add(textField);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(200, 389, 335, 40);
		textApellidos.setText(userCredential.apellidos);
		add(textApellidos);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(200, 491, 335, 40);
		textCorreo.setEnabled(false);
		textCorreo.setText(userCredential.correo);
		add(textCorreo);
		
		textContraseña = new JPasswordField();
		textContraseña.setColumns(10);
		textContraseña.setBounds(665, 293, 335, 40);
		add(textContraseña);
		
		textRepetirContraseña = new JPasswordField();
		textRepetirContraseña.setColumns(10);
		textRepetirContraseña.setBounds(665, 389, 335, 40);
		add(textRepetirContraseña);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Arial", Font.BOLD, 23));
		btnActualizar.setBounds(463, 650, 273, 40);
		btnActualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				verificarNombre(textField);
				verificarApellido(textApellidos);
				verificarCorreo(textCorreo);
				verificarContraseña(textContraseña, textRepetirContraseña);
				
				try {
					ConnectionDB.editUserRequest(userCredential.correo, textField.getText(), textApellidos.getText(), new String(textContraseña.getPassword()));
					JOptionPane.showMessageDialog(null, "Usuario editado exitosamente");
					main.changePanel(main.frame, new LobbyCliente(main));
				} catch (DuplicateTarifaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		add(btnActualizar);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tarifa");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_3_1.setBounds(665, 458, 194, 22);
		add(lblNewLabel_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(665, 491, 273, 40);
		add(comboBox);
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
}
