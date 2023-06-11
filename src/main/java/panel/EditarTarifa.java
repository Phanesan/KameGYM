package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Main;
import main.java.Util;
import main.java.exception.InvalidHourFee;
import main.java.exception.InvalidNameFee;
import main.java.exception.InvalidPriceFee;

public class EditarTarifa extends JPanel {

	/**
	 * Create the panel.
	 */
	public EditarTarifa(Main main) {
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
		lblNombre.setBounds(107, 190, 193, 37);
		add(lblNombre);
		
		JTextField textField = new JTextField();
		textField.setText("Tarifa 1");
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(107, 238, 661, 43);
		add(textField);
		
		JLabel lblDuracion = new JLabel("Duracion (meses)");
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracion.setBounds(107, 292, 358, 37);
		add(lblDuracion);
		
		JTextField textDuracion = new JTextField();
		textDuracion.setText("60");
		textDuracion.setFont(new Font("Arial", Font.PLAIN, 18));
		textDuracion.setColumns(10);
		textDuracion.setBounds(107, 340, 661, 43);
		add(textDuracion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		lblPrecio.setBounds(107, 394, 193, 37);
		add(lblPrecio);
		
		JTextField textPrecio = new JTextField();
		textPrecio.setText("$123456789");
		textPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
		textPrecio.setColumns(10);
		textPrecio.setBounds(107, 442, 661, 43);
		add(textPrecio);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBackground(Color.WHITE);
		lblImage.setBounds(878, 0, 340, 800);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(340, 800, Util.getStream("main/resources/g2.jpg"))));
		add(lblImage);
		
		JButton btnNewButton = new JButton("Actualizar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setBounds(309, 564, 309, 65);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					validarNombre(textField);
					validarHora(textDuracion);
					validarPrecio(textPrecio);
				} catch (InvalidNameFee e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidHourFee e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidPriceFee e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
