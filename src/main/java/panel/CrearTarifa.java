package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.TextPrompt;
import main.java.Util;
import main.java.exception.DuplicateTarifaException;
import main.java.exception.InvalidHeightException;
import main.java.exception.InvalidHourFee;
import main.java.exception.InvalidMonthException;
import main.java.exception.InvalidNameFee;
import main.java.exception.InvalidPriceFee;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearTarifa extends JPanel {
	
	private TextPrompt tp;
	
	/**
	 * Create the panel.
	 */
	public CrearTarifa(Main main) {
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
			main.changePanel(main.frame, new LobbyTarifas(main));	
			}
		});
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre.setBounds(269, 212, 193, 37);
		add(lblNombre);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(269, 260, 661, 43);
		add(textField);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracion.setBounds(269, 314, 193, 37);
		add(lblDuracion);
		
		JTextField textDuracion = new JTextField();
		textDuracion.setFont(new Font("Arial", Font.PLAIN, 18));
		textDuracion.setColumns(10);
		textDuracion.setBounds(269, 362, 661, 43);
		tp = new TextPrompt("meses", textDuracion);
		add(textDuracion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		lblPrecio.setBounds(269, 416, 193, 37);
		add(lblPrecio);
		
		JTextField textPrecio = new JTextField();
		textPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
		textPrecio.setColumns(10);
		textPrecio.setBounds(269, 464, 661, 43);
		add(textPrecio);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setBounds(469, 591, 309, 65);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					validarNombre(textField);
					validarHora(textDuracion);
					validarPrecio(textPrecio);
					
					String nombre = textField.getText();
					String duracion = textDuracion.getText();
					String precio = textPrecio.getText();
					
					ConnectionDB.createTarifaRequest(nombre, duracion, precio);
					main.changePanel(main.frame, new LobbyTarifas(main));
				} catch (InvalidNameFee e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch (InvalidHourFee e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch (InvalidPriceFee e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch (DuplicateTarifaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
	}
	
	public void validarNombre(JTextField textField) throws InvalidNameFee{
	    String texto = textField.getText();

	    // Verificar la longitud del texto
	    if (texto.length() > 15) {
	        	throw new InvalidNameFee("Nombre: Limite de caracteres excedido: 15");
	    }

	    // Verificar si el texto contiene caracteres no permitidos
	    if (!texto.matches("[A-Za-z\\s]+")) {
	        	throw new InvalidNameFee("Nombre: Solo se aceptan letras y espacios");
	    }
	}
	
	public void validarHora(JTextField textField) throws InvalidHourFee{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,2}$")) {
	        throw new InvalidHourFee("Duracion: Solo se permiten dos digitos");
	    }
	}
	
	public void validarPrecio(JTextField textField) throws InvalidPriceFee{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("[0-9]+(\\.[0-9]+)?")) {
	        throw new InvalidPriceFee("Precio: Solo se permite numeros y un punto decimal ");
	    }
	}
	
}
