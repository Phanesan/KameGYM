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

import main.java.Main;
import main.java.Util;

public class ConsultarClases extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultarClases(Main main) {
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
		lblNombre.setBounds(131, 219, 683, 37);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		add(lblNombre);
		
		JLabel lblDuracion = new JLabel("Duracion (mins)");
		lblDuracion.setBounds(131, 317, 683, 37);
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		add(lblDuracion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(131, 416, 193, 37);
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		add(lblPrecio);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Util.resizeImage(375, 800, Util.getStream("main/resources/g3.jpg"))));
		lblImage.setBounds(824, 0, 376, 800);
		add(lblImage);
		
		JLabel lblNameTarifa = new JLabel("Clase 1");
		lblNameTarifa.setOpaque(true);
		lblNameTarifa.setBackground(Color.WHITE);
		lblNameTarifa.setFont(new Font("Arial", Font.BOLD, 32));
		lblNameTarifa.setBounds(131, 267, 416, 37);
		add(lblNameTarifa);
		
		JLabel lblDuracionTarifa = new JLabel("60");
		lblDuracionTarifa.setOpaque(true);
		lblDuracionTarifa.setBackground(Color.WHITE);
		lblDuracionTarifa.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracionTarifa.setBounds(131, 368, 416, 37);
		add(lblDuracionTarifa);
		
		JLabel lblPrecioTarifa = new JLabel("$123456");
		lblPrecioTarifa.setOpaque(true);
		lblPrecioTarifa.setBackground(Color.WHITE);
		lblPrecioTarifa.setFont(new Font("Arial", Font.BOLD, 32));
		lblPrecioTarifa.setBounds(131, 464, 416, 37);
		add(lblPrecioTarifa);
	}

}
