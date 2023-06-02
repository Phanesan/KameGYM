package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class Lobby extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lobby() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Arial", Font.BOLD, 32));
		btnClientes.setBounds(140, 322, 238, 55);
		add(btnClientes);
		
		JButton btnTarifas = new JButton("Tarifas");
		btnTarifas.setFont(new Font("Arial", Font.BOLD, 32));
		btnTarifas.setBounds(140, 593, 238, 55);
		add(btnTarifas);
		
		JButton btnClases = new JButton("Clases");
		btnClases.setFont(new Font("Arial", Font.BOLD, 32));
		btnClases.setBounds(815, 322, 238, 55);
		add(btnClases);
		
		JButton btnInstructores = new JButton("Instructores");
		btnInstructores.setFont(new Font("Arial", Font.BOLD, 32));
		btnInstructores.setBounds(815, 593, 238, 55);
		add(btnInstructores);
	}

}
