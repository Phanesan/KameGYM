package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.ClassCredential;
import main.java.ConnectionDB;
import main.java.Main;
import main.java.TextPrompt;
import main.java.Util;
import main.java.exception.DuplicateTarifaException;
import main.java.exception.InvalidHourFee;
import main.java.exception.InvalidNameClass;
import main.java.exception.InvalidNameFee;
import main.java.exception.InvalidTimeClass;

import javax.swing.JButton;

public class CrearClase extends JPanel {
	private JTextField textDuracion;
	private JTextField textInstructor;
	private TextPrompt tp;
	
	/**
	 * Create the panel.
	 */
	public CrearClase(Main main) {
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
			main.changePanel(main.frame, new LobbyClases(main));	
			}
		});
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre.setBounds(51, 162, 193, 37);
		add(lblNombre);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(51, 211, 607, 43);
		add(textField);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracion.setBounds(51, 265, 193, 37);
		add(lblDuracion);
		
		textDuracion = new JTextField();
		textDuracion.setFont(new Font("Arial", Font.PLAIN, 18));
		textDuracion.setColumns(10);
		textDuracion.setBounds(51, 313, 607, 43);
		tp = new TextPrompt("hrs", textDuracion);
		add(textDuracion);
		
		JLabel lblNombre_1_1 = new JLabel("Instructor");
		lblNombre_1_1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre_1_1.setBounds(51, 367, 193, 37);
		add(lblNombre_1_1);
		
		textInstructor = new JTextField();
		textInstructor.setFont(new Font("Arial", Font.PLAIN, 18));
		textInstructor.setColumns(10);
		textInstructor.setBounds(51, 415, 607, 43);
		tp = new TextPrompt("Dylan Ojeda", textInstructor);
		add(textInstructor);
		textInstructor.disable();
		
		JLabel lblImage = new JLabel("");
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.WHITE);
		lblImage.setBounds(810, 0, 390, 800);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(390, 800, Util.getStream("main/resources/image1.png"))));
		add(lblImage);
		
		JButton btn = new JButton("Crear");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(264, 617, 171, 55);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					try {
						validarNombre(textField);
						validarDuracion(textDuracion);
						ConnectionDB.createClassRequest("1", textField.getText(), textDuracion.getText());
						JOptionPane.showMessageDialog(null, "Clase creada exitosamente");
						main.changePanel(main.frame, new LobbyClases(main));
					} catch (InvalidNameClass e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, e1.getMessage());
					} catch (InvalidTimeClass e1) {
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
	
	public void validarNombre(JTextField textField) throws InvalidNameClass{
	    String texto = textField.getText();

	    // Verificar la longitud del texto
	    if (texto.length() > 15) {
	        	throw new InvalidNameClass("Nombre: Limite de caracteres excedido: 15");
	    }

	    // Verificar si el texto contiene caracteres no permitidos
	    if (!texto.matches("[A-Za-z\\s]+")) {
	        	throw new InvalidNameClass("Nombre: Solo se aceptan letras y espacios");
	    }
	}
	
	public void validarDuracion(JTextField textField) throws InvalidTimeClass{
	    String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

	    // Verificar si el texto cumple con el patrón deseado
	    if (!texto.matches("^\\d{1,2}$")) {
	        throw new InvalidTimeClass("Duracion: Solo se permiten dos digitos");
	    }
	}
	
	public void validarNombreInstructor(JTextField textField) throws InvalidNameClass{
	    String texto = textField.getText();

	    // Verificar la longitud del texto
	    if (texto.length() > 15) {
	        	throw new InvalidNameClass("Nombre: Limite de caracteres excedido: 45");
	    }

	    // Verificar si el texto contiene caracteres no permitidos
	    if (!texto.matches("[A-Za-z\\s]+")) {
	        	throw new InvalidNameClass("Nombre: Solo se aceptan letras y espacios");
	    }
	}
}
