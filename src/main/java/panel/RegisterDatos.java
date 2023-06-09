package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import main.java.Util;

public class RegisterDatos extends JPanel {
	private JTextField textFieldPeso;
	private JTextField textFieldEstatura;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtYear;

	/**
	 * Create the panel.
	 */
	public RegisterDatos() {
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
		
		JLabel lblIngreseSuEstatura = new JLabel("Ingrese su estatura (m):");
		lblIngreseSuEstatura.setFont(new Font("Arial", Font.BOLD, 32));
		lblIngreseSuEstatura.setBounds(330, 49, 390, 37);
		add(lblIngreseSuEstatura);
		
		JLabel lblDate = new JLabel("Ingrese su fecha de nacimiento:");
		lblDate.setFont(new Font("Arial", Font.BOLD, 32));
		lblDate.setBounds(34, 192, 553, 37);
		add(lblDate);
		
		JLabel lblIDM = new JLabel("Su IDM es de \" \" por lo que usted");
		lblIDM.setFont(new Font("Arial", Font.BOLD, 32));
		lblIDM.setBounds(34, 357, 636, 55);
		add(lblIDM);
		
		JLabel lblAviso = new JLabel("Usaremos esta información para ayudarlo durante su \r\nestancia.");
		lblAviso.setFont(new Font("Arial", Font.BOLD, 23));
		lblAviso.setBounds(34, 469, 728, 71);
		add(lblAviso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(34, 97, 257, 43);
		add(textFieldPeso);
		
		textFieldEstatura = new JTextField();
		textFieldEstatura.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldEstatura.setColumns(10);
		textFieldEstatura.setBounds(330, 97, 257, 43);
		add(textFieldEstatura);
		
		txtDay = new JTextField();
		txtDay.setText("dd");
		txtDay.setFont(new Font("Arial", Font.PLAIN, 18));
		txtDay.setColumns(10);
		txtDay.setBounds(34, 268, 138, 43);
		add(txtDay);
		
		txtMonth = new JTextField();
		txtMonth.setText("mm");
		txtMonth.setFont(new Font("Arial", Font.PLAIN, 18));
		txtMonth.setColumns(10);
		txtMonth.setBounds(216, 268, 138, 43);
		add(txtMonth);
		
		txtYear = new JTextField();
		txtYear.setText("yy");
		txtYear.setFont(new Font("Arial", Font.PLAIN, 18));
		txtYear.setColumns(10);
		txtYear.setBounds(399, 268, 138, 43);
		add(txtYear);
		
		JLabel lblTiene = new JLabel("tiene: \" \"");
		lblTiene.setFont(new Font("Arial", Font.BOLD, 32));
		lblTiene.setBounds(34, 403, 636, 55);
		add(lblTiene);
		
		JButton btn = new JButton("Entrar");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(286, 656, 171, 55);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			validarPeso(textFieldPeso);
			validarEstatura(textFieldEstatura);
			validarDia(txtDay);
			validarMes(txtMonth);
			validarAño(txtYear);
			}
		});
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean validarPeso(JTextField textField) {
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,3}(\\.\\d{1,2})?$")) {
	    	JOptionPane.showMessageDialog(null, "Error Peso: Solo se acepta (3) numeros y (2) punto decimal");
	        return false;
	    }
	    return true;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean validarEstatura(JTextField textField) {
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1}(\\.\\d{1,2})?$")) {
	    	JOptionPane.showMessageDialog(null, "Error Estatura: Solo se acepta (1) numeros y (2) punto decimal");
	        return false;
	    }
	    return true;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean validarDia(JTextField textField) {
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,2}$")) {
	    	JOptionPane.showMessageDialog(null, "Error Dia: Solo se acepta (2) numeros");
	        return false;
	    }

	    return true;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean validarMes(JTextField textField) {
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,2}$")) {
	    	JOptionPane.showMessageDialog(null, "Error Mes: Solo se acepta (2) numeros");
	        return false;
	    }

	    return true;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean validarAño(JTextField textField) {
		String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco
		
		// Verificar si el texto cumple con el patrón deseado
		if (!texto.matches("^\\d{4}$")) {
			JOptionPane.showMessageDialog(null, "Error Año: Solo se acepta (4) numeros");
			return false;
		}
		
		return true;
	}
}
