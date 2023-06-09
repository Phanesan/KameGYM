package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import main.java.Main;
import main.java.Util;
import main.java.sql.ConectionDB;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LobbyCliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public LobbyCliente(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		add(lblBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 30));
		
		//	CONSULTA LOS USUARIOS
		
		ConectionDB.getClientesCorreo();
		
		///////////////////////////
		
		comboBox.setToolTipText("Usuarios");
		comboBox.setBounds(108, 120, 399, 43);
		add(comboBox);
		
		JButton btnNewUser = new JButton("Crear Usuario");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changePanel(main.frame, new CrearCliente());
			}
		});
		btnNewUser.setFont(new Font("Arial", Font.BOLD, 32));
		btnNewUser.setBounds(170, 538, 283, 55);
		add(btnNewUser);
		btnNewUser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new CrearCliente());
			}
		});
		
		JLabel lblImage = new JLabel("");
		lblImage.setBackground(Color.WHITE);
		lblImage.setOpaque(true);
		lblImage.setBounds(200, 250, 215, 214);
		add(lblImage);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 32));
		btnConsultar.setBounds(759, 133, 283, 55);
		add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new ConsultarCliente());
			}
		});
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEditar.setBounds(759, 262, 283, 55);
		add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new EditarCliente());
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEliminar.setBounds(759, 396, 283, 55);
		add(btnEliminar);
		
		JButton btnRealizar = new JButton("Realizar pago");
		btnRealizar.setFont(new Font("Arial", Font.BOLD, 32));
		btnRealizar.setBounds(759, 525, 283, 55);
		add(btnRealizar);
		btnRealizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//main.changePanel(main.frame, new pagoCliente());
			}
		});
	}
}
