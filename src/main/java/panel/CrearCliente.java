package main.java.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import main.java.UserCredential.UserCredentialBuilder;
import main.java.exception.DuplicateMailException;
import main.java.exception.InvalidDayException;
import main.java.exception.InvalidHeightException;
import main.java.exception.InvalidMonthException;
import main.java.exception.InvalidWeightException;
import main.java.exception.InvalidYearException;
import main.java.sql.ConnectionDB;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class CrearCliente extends JPanel {
	private JTextField nombreField;
	private JTextField apellidosField;
	private JTextField correoField;
	private JPasswordField passwordField;
	private JPasswordField repeatPasswordField;
	private JTextField pesoField;
	private JTextField estaturaField;
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;

	/**
	 * Create the panel.
	 */
	public CrearCliente(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBounds(0, 0, 1200, 22);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("Logout");
		menuBar.add(mnNewMenu_3);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 31, 65, 65);
		lblBack.setBackground(null);
		add(lblBack);
		
		nombreField = new JTextField();
		nombreField.setBounds(88, 293, 325, 40);
		add(nombreField);
		nombreField.setColumns(10);
		
		apellidosField = new JTextField();
		apellidosField.setColumns(10);
		apellidosField.setBounds(88, 393, 325, 40);
		add(apellidosField);
		
		correoField = new JTextField();
		correoField.setColumns(10);
		correoField.setBounds(88, 493, 325, 40);
		add(correoField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(88, 593, 325, 40);
		add(passwordField);
		
		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setColumns(10);
		repeatPasswordField.setBounds(88, 693, 325, 40);
		add(repeatPasswordField);
		
		JLabel lblNewLabel = new JLabel("Repetir Contraseña");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel.setBounds(88, 660, 194, 22);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(88, 560, 129, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(88, 460, 107, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(88, 360, 194, 22);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_4.setBounds(88, 260, 152, 22);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(88, 77, 173, 172);
		lblNewLabel_5.setOpaque(true);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("foto de perfil");
		lblNewLabel_6.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_6.setBounds(271, 123, 178, 53);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Selecciona una ");
		lblNewLabel_6_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_6_1.setBounds(270, 92, 178, 53);
		add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("kg");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_7.setBackground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(906, 395, 46, 38);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("cm");
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_8.setBackground(new Color(0, 0, 0));
		lblNewLabel_8.setBounds(1132, 395, 46, 38);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("dd");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_9.setBackground(Color.BLACK);
		lblNewLabel_9.setBounds(825, 567, 46, 38);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("mm");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_10.setBackground(Color.BLACK);
		lblNewLabel_10.setBounds(954, 567, 46, 38);
		add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("yy");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel_11.setBackground(Color.BLACK);
		lblNewLabel_11.setBounds(1102, 567, 46, 38);
		add(lblNewLabel_11);
		
		pesoField = new JTextField();
		pesoField.setColumns(10);
		pesoField.setBounds(740, 393, 162, 40);
		add(pesoField);
		
		estaturaField = new JTextField();
		estaturaField.setColumns(10);
		estaturaField.setBounds(966, 393, 162, 40);
		add(estaturaField);
		
		dayField = new JTextField();
		dayField.setColumns(10);
		dayField.setBounds(740, 567, 107, 40);
		add(dayField);
		
		monthField = new JTextField();
		monthField.setColumns(10);
		monthField.setBounds(881, 567, 107, 40);
		add(monthField);
		
		yearField = new JTextField();
		yearField.setColumns(10);
		yearField.setBounds(1021, 567, 107, 40);
		add(yearField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Peso");
		lblNewLabel_3_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1.setBounds(740, 360, 194, 22);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Estatura");
		lblNewLabel_3_2.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_2.setBounds(966, 360, 194, 22);
		add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Fecha de nacimiento");
		lblNewLabel_3_1_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_3_1_1.setBounds(827, 534, 225, 22);
		add(lblNewLabel_3_1_1);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton.setBounds(808, 671, 251, 40);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					verificarCorreo(correoField);
					verificarNombre(nombreField);
					verificarApellido(apellidosField);
					verificarContraseña(passwordField, repeatPasswordField);
					validarPeso(pesoField);
					validarEstatura(estaturaField);
					validarDia(dayField);
					validarMes(monthField);
					validarAño(yearField);
				} catch (InvalidWeightException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidHeightException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidDayException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidMonthException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidYearException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append(yearField.getText());
				sb.append("-");
				sb.append(monthField.getText());
				sb.append("-");
				sb.append(dayField.getText());
				
				String date = sb.toString();
				
				UserCredential userCredential = new UserCredentialBuilder(correoField.getText())
																	.setNombre(nombreField.getText())
																	.setApellidos(apellidosField.getText())
																	.setPassword(new String(passwordField.getPassword()))
																	.setPeso(Float.parseFloat(pesoField.getText()))
																	.setEstatura(Float.parseFloat(estaturaField.getText()))
																	.setFechaDeNacimiento(date)
																	.build();
				
				try {
					ConnectionDB.registerRequest(userCredential);
					
					main.changePanel(main.frame, new LobbyCliente(main));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DuplicateMailException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		add(btnNewButton);	
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
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarPeso(JTextField textField) throws InvalidWeightException{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,3}(\\.\\d{1,2})?$")) {
	    	JOptionPane.showMessageDialog(null, "Error Peso: Solo se acepta (3) numeros y (2) punto decimal");
	    	throw new InvalidWeightException();
	    }
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarEstatura(JTextField textField) throws InvalidHeightException{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1}(\\.\\d{1,2})?$")) {
	    	JOptionPane.showMessageDialog(null, "Error Estatura: Solo se acepta (1) numeros y (2) punto decimal");
	        throw new InvalidHeightException();
	    }
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarDia(JTextField textField) throws InvalidDayException{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,2}$")) {
	    	JOptionPane.showMessageDialog(null, "Error Dia: Solo se acepta (2) numeros");
	        throw new InvalidDayException();
	    }
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarMes(JTextField textField) throws InvalidMonthException{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,2}$")) {
	    	JOptionPane.showMessageDialog(null, "Error Mes: Solo se acepta (2) numeros");
	        throw new InvalidMonthException();
	    }
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarAño(JTextField textField) throws InvalidYearException{
		String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco
		
		// Verificar si el texto cumple con el patrón deseado
		if (!texto.matches("^\\d{4}$")) {
			JOptionPane.showMessageDialog(null, "Error Año: Solo se acepta (4) numeros");
			throw new InvalidYearException();
		}
	}
	
}
