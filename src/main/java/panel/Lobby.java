package main.java.panel;
import java.awt.Color;

import javax.swing.JPanel;

import main.java.Main;
import main.java.Util;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lobby extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lobby(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		add(lblBack);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Arial", Font.BOLD, 32));
		btnClientes.setBounds(140, 322, 238, 55);
		add(btnClientes);
		btnClientes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new ClienteLobby(main));
			}
		});
		
		JButton btnTarifas = new JButton("Tarifas");
		btnTarifas.setFont(new Font("Arial", Font.BOLD, 32));
		btnTarifas.setBounds(140, 593, 238, 55);
		add(btnTarifas);
		btnTarifas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new Tarifas(main));
			}
		});
		
		JButton btnClases = new JButton("Clases");
		btnClases.setFont(new Font("Arial", Font.BOLD, 32));
		btnClases.setBounds(815, 322, 238, 55);
		add(btnClases);
		btnClases.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new Clases());
			}
		});
		
		JButton btnInstructores = new JButton("Instructores");
		btnInstructores.setFont(new Font("Arial", Font.BOLD, 32));
		btnInstructores.setBounds(815, 593, 238, 55);
		add(btnInstructores);
		/*btnInstructores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new Instructores(main));		
			}
		});*/
	}

}
