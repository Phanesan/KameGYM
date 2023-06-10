package main.java.panel;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

import main.java.Main;
import main.java.UserCredential;
import main.java.Util;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Lobby extends JPanel {
	
	public UserCredential userCredential;
	
	/**
	 * Create the panel.
	 */
	public Lobby(Main main, UserCredential userCredential) {
		this.userCredential = userCredential;
		
		System.out.println(userCredential.correo);
		System.out.println(userCredential.nombre);
		System.out.println(userCredential.apellidos);
		System.out.println(userCredential.password);
		System.out.println(userCredential.peso);
		System.out.println(userCredential.estatura);
		System.out.println(userCredential.fechaDeNacimiento);
		
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		add(lblBack);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnClientes = new JButton("");
		btnClientes.setBounds(224, 110, 200, 200);
		add(btnClientes);
		ImageIcon clientes_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Clientes_In.png")));
		ImageIcon clientes_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Clientes_Out.png")));
		btnClientes.setRolloverIcon(clientes_in);
		btnClientes.setBorderPainted(false);
		btnClientes.setOpaque(false);
		btnClientes.setContentAreaFilled(false);
		btnClientes.setIcon(clientes_out);
		btnClientes.setPressedIcon(clientes_in);
		btnClientes.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnClientes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new LobbyCliente(main));
			}
		});
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		JButton btnTarifas = new JButton("");
		btnTarifas.setBounds(224, 432, 200, 200);
		add(btnTarifas);
		ImageIcon tarifas_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Tarifas_In.png")));
		ImageIcon tarifas_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Tarifas_Out.png")));
		btnTarifas.setRolloverIcon(tarifas_in);
		btnTarifas.setBorderPainted(false);
		btnTarifas.setOpaque(false);
		btnTarifas.setContentAreaFilled(false);
		btnTarifas.setIcon(tarifas_out);
		btnTarifas.setPressedIcon(tarifas_in);
		btnTarifas.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnTarifas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new LobbyTarifas(main));
			}
		});
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnClases = new JButton("");
		btnClases.setBounds(771, 110, 200, 200);
		add(btnClases);
		ImageIcon clases_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Clases_In.png")));
		ImageIcon clases_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Clases_Out.png")));
		btnClases.setRolloverIcon(clases_in);
		btnClases.setBorderPainted(false);
		btnClases.setOpaque(false);
		btnClases.setContentAreaFilled(false);
		btnClases.setIcon(clases_out);
		btnClases.setPressedIcon(clases_in);
		btnClases.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnClases.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new LobbyClases(main));
			}
		});
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnInstructores = new JButton("");
		btnInstructores.setBounds(771, 432, 200, 200);
		add(btnInstructores);
		ImageIcon instructores_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Instructores_In.png")));
		ImageIcon instructores_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Instructores_Out.png")));
		btnInstructores.setRolloverIcon(instructores_in);
		btnInstructores.setBorderPainted(false);
		btnInstructores.setOpaque(false);
		btnInstructores.setContentAreaFilled(false);
		btnInstructores.setIcon(instructores_out);
		btnInstructores.setPressedIcon(instructores_in);
		btnInstructores.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(560, 360, 80, 80);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(80, 80, Util.getStream("main/resources/Esfera.png"))));
		add(lblImage);
	}
}
