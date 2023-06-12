package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.ClassCredential;
import main.java.ConnectionDB;
import main.java.Main;
import main.java.Util;
import main.java.exception.CredentialsException;

public class ConsultarClases extends JPanel {

	/**
	 * Create the panel.
	 */
	private LobbyClases clase;
	String nombreClase;
	ClassCredential classCredential;
	
	public ConsultarClases(Main main){
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		nombreClase = clase.claseSeleccionada;
		try {
			classCredential = ConnectionDB.loadClassCredential(nombreClase);
		} catch (CredentialsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(nombreClase);
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
		lblNombre.setBounds(131, 219, 683, 37);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		add(lblNombre);
		
		JLabel lblDuracion = new JLabel("Duracion (hrs)");
		lblDuracion.setBounds(131, 317, 683, 37);
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		add(lblDuracion);
		
		JLabel lblPrecio = new JLabel("Instructor");
		lblPrecio.setBounds(131, 416, 193, 37);
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		add(lblPrecio);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Util.resizeImage(375, 800, Util.getStream("main/resources/g3.jpg"))));
		lblImage.setBounds(824, 0, 376, 800);
		add(lblImage);
		
		JLabel lblNameTarifa = new JLabel(classCredential.getNombre());
		lblNameTarifa.setOpaque(true);
		lblNameTarifa.setBackground(Color.WHITE);
		lblNameTarifa.setFont(new Font("Arial", Font.BOLD, 32));
		lblNameTarifa.setBounds(131, 267, 416, 37);
		add(lblNameTarifa);
		
		JLabel lblDuracionClase = new JLabel(String.valueOf(classCredential.getDuracionHoras()));
		lblDuracionClase.setOpaque(true);
		lblDuracionClase.setBackground(Color.WHITE);
		lblDuracionClase.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracionClase.setBounds(131, 368, 416, 37);
		add(lblDuracionClase);
		
		JLabel lblNombreInstructor = new JLabel(classCredential.getInstructor());
		lblNombreInstructor.setOpaque(true);
		lblNombreInstructor.setBackground(Color.WHITE);
		lblNombreInstructor.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombreInstructor.setBounds(131, 464, 416, 37);
		add(lblNombreInstructor);
	}
	
}
