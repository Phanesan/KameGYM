package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JButton;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.Util;
import javax.swing.JComboBox;

public class LobbyTarifas extends JPanel {

	/**
	 * Create the panel.
	 */
	public LobbyTarifas(Main main) {
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
			main.changePanel(main.frame, new Lobby(main, Lobby.userCredential));	
			}
		});
		
		JButton btnConsultar = new JButton("");
		ImageIcon editar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_In.png")));
		ImageIcon editar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_Out.png")));
		btnConsultar.setRolloverIcon(editar_in);
		btnConsultar.setBorderPainted(false);
		btnConsultar.setOpaque(false);
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setIcon(editar_out);
		btnConsultar.setPressedIcon(editar_in);
		btnConsultar.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 32));
		btnConsultar.setBounds(300, 240, 230, 200);
		add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changePanel(main.frame, new ConsultarTarifa(main));
			}
		});
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnEditar = new JButton("");
		ImageIcon editar_in1 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_In.png")));
		ImageIcon editar_out1 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_Out.png")));
		btnEditar.setRolloverIcon(editar_in1);
		btnEditar.setBorderPainted(false);
		btnEditar.setOpaque(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setIcon(editar_out1);
		btnEditar.setPressedIcon(editar_in1);
		btnEditar.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		btnEditar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEditar.setBounds(650, 240, 230, 200);
		add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new EditarTarifa(main));
			}
		});
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnCrear = new JButton("");
		ImageIcon editar_in2 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_In.png")));
		ImageIcon editar_out2 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_Out.png")));
		btnCrear.setRolloverIcon(editar_in2);
		btnCrear.setBorderPainted(false);
		btnCrear.setOpaque(false);
		btnCrear.setContentAreaFilled(false);
		btnCrear.setIcon(editar_out2);
		btnCrear.setPressedIcon(editar_in2);
		btnCrear.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		btnCrear.setFont(new Font("Arial", Font.BOLD, 32));
		btnCrear.setBounds(300, 500, 230, 200);
		add(btnCrear);
		btnCrear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new CrearTarifa(main));
			}
		});
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton Eliminar = new JButton("");
		ImageIcon editar_in3 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_In.png")));
		ImageIcon editar_out3 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_Out.png")));
		Eliminar.setRolloverIcon(editar_in3);
		Eliminar.setBorderPainted(false);
		Eliminar.setOpaque(false);
		Eliminar.setContentAreaFilled(false);
		Eliminar.setIcon(editar_out3);
		Eliminar.setPressedIcon(editar_in3);
		Eliminar.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Eliminar.setFont(new Font("Arial", Font.BOLD, 32));
		Eliminar.setBounds(650, 500, 230, 200);
		add(Eliminar);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(414, 101, 372, 48);
		comboBox.setFont(new Font("Arial", Font.BOLD, 32));
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		String[] tarifaNombres = ConnectionDB.getTarifasNombre();
		for(String nombre : tarifaNombres) {
			comboBox.addItem(nombre);
		}
		add(comboBox);
	
	}

}
