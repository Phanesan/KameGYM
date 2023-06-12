package main.java.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.TextPrompt;
import main.java.UserCredential;
import main.java.Util;
import main.java.UserCredential.UserCredentialBuilder;
import main.java.exception.DuplicateMailException;
import main.java.exception.InvalidDayException;
import main.java.exception.InvalidHeightException;
import main.java.exception.InvalidMonthException;
import main.java.exception.InvalidWeightException;
import main.java.exception.InvalidYearException;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

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
	private TextPrompt tp;
	private String pathIcon;

	/**
	 * Create the panel.
	 */
	public CrearCliente(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		lblBack.setBorderPainted(false);
		add(lblBack);
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			main.changePanel(main.frame, new LobbyCliente(main));	
			}
		});
		
		nombreField = new JTextField();
		nombreField.setBounds(88, 293, 325, 40);
		nombreField.setFont(new Font("Arial", Font.PLAIN, 18));
		add(nombreField);
		nombreField.setColumns(10);
		
		apellidosField = new JTextField();
		apellidosField.setColumns(10);
		apellidosField.setBounds(88, 377, 325, 40);
		apellidosField.setFont(new Font("Arial", Font.PLAIN, 18));
		add(apellidosField);
		
		correoField = new JTextField();
		correoField.setColumns(10);
		correoField.setBounds(88, 461, 325, 40);
		correoField.setFont(new Font("Arial", Font.PLAIN, 18));
		add(correoField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(88, 545, 325, 40);
		passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
		add(passwordField);
		
		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setColumns(10);
		repeatPasswordField.setBounds(88, 629, 325, 40);
		repeatPasswordField.setFont(new Font("Arial", Font.PLAIN, 18));
		add(repeatPasswordField);
		
		JLabel lblNewLabel = new JLabel("Repetir Contraseña");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setBounds(88, 596, 265, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_1.setBounds(88, 512, 207, 31);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_2.setBounds(88, 428, 107, 31);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_3.setBounds(88, 344, 194, 31);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_4.setBounds(86, 260, 152, 31);
		add(lblNewLabel_4);
		
		JLabel iconArea = new JLabel("");
		iconArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		iconArea.setBounds(459, 64, 173, 172);
		add(iconArea);
		
		JLabel lblNewLabel_6 = new JLabel("foto de perfil");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_6.setBounds(652, 84, 178, 53);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Selecciona una ");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_6_1.setBounds(652, 53, 214, 53);
		add(lblNewLabel_6_1);
		
		pesoField = new JTextField();
		pesoField.setColumns(10);
		pesoField.setBounds(740, 362, 162, 40);
		pesoField.setFont(new Font("Arial", Font.PLAIN, 18));
		tp = new TextPrompt("kg", pesoField);
		add(pesoField);
		
		estaturaField = new JTextField();
		estaturaField.setColumns(10);
		estaturaField.setBounds(966, 362, 162, 40);
		estaturaField.setFont(new Font("Arial", Font.PLAIN, 18));
		tp = new TextPrompt("m", estaturaField);
		add(estaturaField);
		
		dayField = new JTextField();
		dayField.setColumns(10);
		dayField.setBounds(740, 500, 107, 40);
		dayField.setFont(new Font("Arial", Font.PLAIN, 18));
		tp = new TextPrompt("dd", dayField);
		add(dayField);
		
		monthField = new JTextField();
		monthField.setColumns(10);
		monthField.setBounds(881, 500, 107, 40);
		monthField.setFont(new Font("Arial", Font.PLAIN, 18));
		tp = new TextPrompt("mm", monthField);
		add(monthField);
		
		yearField = new JTextField();
		yearField.setColumns(10);
		yearField.setBounds(1021, 500, 107, 40);
		yearField.setFont(new Font("Arial", Font.PLAIN, 18));
		tp = new TextPrompt("yy", yearField);
		add(yearField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Peso");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_3_1.setBounds(740, 329, 98, 31);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Estatura");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_3_2.setBounds(966, 329, 128, 31);
		add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Fecha de nacimiento");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_3_1_1.setBounds(808, 461, 265, 31);
		add(lblNewLabel_3_1_1);
		
		JButton btnNewButton = new JButton("Crear Cuenta");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 26));
		btnNewButton.setBounds(808, 625, 251, 40);
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
				
				byte[] iconBytes = Util.getImageBytes(pathIcon);
				
				if(iconBytes == null) {
					iconBytes = Util.getImageBytes(Util.getStream("main/resources/user.png"));
				}
				
				UserCredential userCredential = new UserCredentialBuilder(correoField.getText())
																	.setNombre(nombreField.getText())
																	.setApellidos(apellidosField.getText())
																	.setPassword(new String(passwordField.getPassword()))
																	.setPeso(Float.parseFloat(pesoField.getText()))
																	.setEstatura(Float.parseFloat(estaturaField.getText()))
																	.setFechaDeNacimiento(date)
																	.setIcono(iconBytes)
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
		
		JButton btnExaminar = new JButton("Examinar");
		btnExaminar.setFont(new Font("Arial", Font.BOLD, 22));
		btnExaminar.setBounds(652, 164, 152, 36);
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
		add(btnExaminar);
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
