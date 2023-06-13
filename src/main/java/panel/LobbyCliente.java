package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import main.java.exception.CredentialsException;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

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
		lblBack.setBorderPainted(false);
		add(lblBack);
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new Lobby(main, Lobby.userCredential));	
			}
		});
		
		JButton btnNewUser = new JButton("Crear Usuario");
		btnNewUser.setFont(new Font("Arial", Font.BOLD, 32));
		btnNewUser.setBounds(163, 536, 283, 55);
		add(btnNewUser);
		btnNewUser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new CrearCliente(main));
			}
		});
		
		JLabel lblImage = new JLabel("");
		lblImage.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblImage.setBackground(Color.WHITE);
		lblImage.setOpaque(false);
		lblImage.setBounds(217, 239, 180, 180);
		add(lblImage);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Arial", Font.BOLD, 30));
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					UserCredential userCredential = ConnectionDB.loadUserCredential((String) comboBox.getSelectedItem());
					Image image = new ImageIcon(userCredential.icono).getImage();
					ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
					lblImage.setIcon(icon);
				} catch (CredentialsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		//	CONSULTA LOS USUARIOS
		
		String[] correoClientes = ConnectionDB.getClientesCorreo();
		
		for(int i = 0; i < correoClientes.length; i++) {
			comboBox.addItem(correoClientes[i]);
		}
		
		///////////////////////////
		
		comboBox.setToolTipText("Usuarios");
		comboBox.setBounds(108, 120, 399, 43);
		add(comboBox);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 32));
		btnConsultar.setBounds(759, 90, 283, 55);
		add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					main.changePanel(main.frame, new ConsultarCliente(main, ConnectionDB.loadUserCredential((String) comboBox.getSelectedItem())));
				} catch (NullPointerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CredentialsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEditar.setBounds(759, 210, 283, 55);
		add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					main.changePanel(main.frame, new EditarCliente(main, ConnectionDB.loadUserCredential((String)comboBox.getSelectedItem())));

				} catch (NullPointerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CredentialsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEliminar.setBounds(759, 330, 283, 55);
		btnEliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ConnectionDB.deleteUser((String) comboBox.getSelectedItem());
				comboBox.removeItem(comboBox.getSelectedItem());
			}
		});
		add(btnEliminar);
		
		JButton btnRealizar = new JButton("Realizar pago");
		btnRealizar.setFont(new Font("Arial", Font.BOLD, 32));
		btnRealizar.setBounds(759, 450, 283, 55);
		add(btnRealizar);
		
		JButton btnMarcarAsistencia = new JButton("Marcar Asistencia");
		btnMarcarAsistencia.setFont(new Font("Arial", Font.BOLD, 28));
		btnMarcarAsistencia.setBounds(759, 570, 283, 55);
		add(btnMarcarAsistencia);
		btnMarcarAsistencia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new MarcarAsistencia(main));
			}
		});
	}
}
