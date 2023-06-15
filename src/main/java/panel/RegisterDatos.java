package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.TextPrompt;
import main.java.UserCredential;
import main.java.UserCredential.UserCredentialBuilder;
import main.java.Util;
import main.java.exception.DuplicateMailException;
import main.java.exception.InvalidDayException;
import main.java.exception.InvalidHeightException;
import main.java.exception.InvalidMonthException;
import main.java.exception.InvalidWeightException;
import main.java.exception.InvalidYearException;

public class RegisterDatos extends JPanel {
	private JTextField textFieldPeso;
	private JTextField textFieldEstatura;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtYear;
	private TextPrompt tp;

	/**
	 * Create the panel.
	 */
	public RegisterDatos(Main main, UserCredentialBuilder builder) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Util.resizeImage(390, 800, Util.getStream("main/resources/gyv.jpg"))));
		lblImage.setBounds(810, 0, 390, 800);
		add(lblImage);
		
		JLabel lblPeso = new JLabel("Ingrese su peso:");
		lblPeso.setFont(new Font("Arial", Font.BOLD, 32));
		lblPeso.setBounds(34, 49, 257, 37);
		add(lblPeso);
		
		JLabel lblIngreseSuEstatura = new JLabel("Ingrese su estatura:");
		lblIngreseSuEstatura.setFont(new Font("Arial", Font.BOLD, 32));
		lblIngreseSuEstatura.setBounds(330, 49, 390, 37);
		add(lblIngreseSuEstatura);
		
		JLabel lblDate = new JLabel("Ingrese su fecha de nacimiento:");
		lblDate.setFont(new Font("Arial", Font.BOLD, 32));
		lblDate.setBounds(34, 192, 553, 37);
		add(lblDate);
		
		JLabel lblAviso = new JLabel("Usaremos esta información para ayudarlo durante su \r\nestancia.");
		lblAviso.setFont(new Font("Arial", Font.BOLD, 23));
		lblAviso.setBounds(34, 459, 728, 71);
		add(lblAviso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(34, 97, 257, 43);
		tp = new TextPrompt("kg", textFieldPeso);
		add(textFieldPeso);
		
		textFieldEstatura = new JTextField();
		textFieldEstatura.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldEstatura.setColumns(10);
		textFieldEstatura.setBounds(330, 97, 257, 43);
		tp = new TextPrompt("m", textFieldEstatura);
		add(textFieldEstatura);
		
		txtDay = new JTextField();
		txtDay.setFont(new Font("Arial", Font.PLAIN, 18));
		txtDay.setColumns(10);
		txtDay.setBounds(34, 268, 138, 43);
		tp = new TextPrompt("dd", txtDay);
		add(txtDay);
		
		txtMonth = new JTextField();
		txtMonth.setFont(new Font("Arial", Font.PLAIN, 18));
		txtMonth.setColumns(10);
		txtMonth.setBounds(216, 268, 138, 43);
		tp = new TextPrompt("mm", txtMonth);
		add(txtMonth);
		
		txtYear = new JTextField();
		txtYear.setFont(new Font("Arial", Font.PLAIN, 18));
		txtYear.setColumns(10);
		txtYear.setBounds(399, 268, 138, 43);
		tp = new TextPrompt("yy", txtYear);
		add(txtYear);
		
		JButton btn = new JButton("Crear Cuenta");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(255, 657, 287, 55);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					validarPeso(textFieldPeso);
					validarEstatura(textFieldEstatura);
					validarDia(txtDay);
					validarMes(txtMonth);
					validarAño(txtYear);
					
					StringBuilder sb = new StringBuilder();
					sb.append(txtYear.getText());
					sb.append("-");
					sb.append(txtMonth.getText());
					sb.append("-");
					sb.append(txtDay.getText());
					
					String date = sb.toString();
					
					UserCredential userCredential = builder.setPeso(Float.parseFloat(textFieldPeso.getText()))
									.setEstatura(Float.parseFloat(textFieldEstatura.getText()))
									.setFechaDeNacimiento(date)
									.build();
					
					ConnectionDB.registerRequest(userCredential);
					JOptionPane.showMessageDialog(RegisterDatos.this, "Su cuenta a sido registrada con exito!");
					main.changePanel(main.frame, new Login(main));
				} catch (InvalidWeightException e1) {
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
				} catch (InvalidHeightException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DuplicateMailException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
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
