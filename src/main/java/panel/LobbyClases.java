package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.Util;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class LobbyClases extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public static String claseSeleccionada;
	public static String[] nombreClases = ConnectionDB.getClases();
	
	public LobbyClases(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		lblBack.setBorderPainted(false);
		add(lblBack);
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			main.changePanel(main.frame, new Lobby(main, Lobby.userCredential));	
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 32));
		comboBox.setBounds(391, 85, 417, 53);
		obtenerClases(comboBox);
		add(comboBox);
		
		
		JButton btnEditar = new JButton("");
		ImageIcon editar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_In.png")));
		ImageIcon editar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_Out.png")));
		btnEditar.setRolloverIcon(editar_in);
		btnEditar.setBorderPainted(false);
		btnEditar.setOpaque(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setIcon(editar_out);
		btnEditar.setPressedIcon(editar_in);
		btnEditar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnEditar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEditar.setBounds(153, 233, 200, 200);
		add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				claseSeleccionada = (String) comboBox.getSelectedItem();
				main.changePanel(main.frame, new EditarClase(main));
			}
		});
		
		JButton btnConsultar = new JButton("");
		ImageIcon consultar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_In.png")));
		ImageIcon consultar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_Out.png")));
		btnConsultar.setIcon(consultar_out);
		btnConsultar.setRolloverIcon(consultar_in);
		btnConsultar.setBorderPainted(false);
		btnConsultar.setOpaque(false);
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setIcon(consultar_out);
		btnConsultar.setPressedIcon(consultar_in);
		btnConsultar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 32));
		btnConsultar.setBounds(313, 499, 200, 200);
		add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				claseSeleccionada = (String) comboBox.getSelectedItem();
				main.changePanel(main.frame, new ConsultarClases(main));
			}
		});
		
		JButton btnEliminar = new JButton("");
		ImageIcon eliminar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_In.png")));
		ImageIcon eliminar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_Out.png")));
		btnEliminar.setIcon(eliminar_out);
		btnEliminar.setRolloverIcon(eliminar_in);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setOpaque(false);
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setIcon(eliminar_out);
		btnEliminar.setPressedIcon(eliminar_in);
		btnEliminar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEliminar.setBounds(671, 499, 200, 200);
		add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConnectionDB.deleteClass((String)comboBox.getSelectedItem());
				obtenerClases(comboBox);
				revalidate();
				repaint();
			}
		});
		
		JButton btnCrear = new JButton("");
		ImageIcon crear_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_In.png")));
		ImageIcon crear_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_Out.png")));
		btnCrear.setIcon(crear_out);
		btnCrear.setRolloverIcon(crear_in);
		btnCrear.setBorderPainted(false);
		btnCrear.setOpaque(false);
		btnCrear.setContentAreaFilled(false);
		btnCrear.setIcon(crear_out);
		btnCrear.setPressedIcon(crear_in);
		btnCrear.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		btnCrear.setFont(new Font("Arial", Font.BOLD, 32));
		btnCrear.setBounds(827, 233, 200, 200);
		add(btnCrear);
		btnCrear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new CrearClase(main));
			}
		});
	}
	
	public static void obtenerClases(JComboBox comboBox) {
		comboBox.removeAllItems();
		nombreClases = ConnectionDB.getClases();
		for(int i = 0; i < nombreClases.length;i++) {
			comboBox.addItem(nombreClases[i]);
		}
	}
}
