package main.java;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import main.java.panel.ClientesPago;
import main.java.panel.ConsultarClases;
import main.java.panel.ConsultarCliente;
import main.java.panel.ConsultarTarifa;
import main.java.panel.LobbyInstructores;
import main.java.panel.CrearClase;
import main.java.panel.CrearCliente;
import main.java.panel.CrearTarifa;
import main.java.panel.Creditos;
import main.java.panel.EditarClase;
import main.java.panel.EditarCliente;
import main.java.panel.EditarInstructor;
import main.java.panel.EditarTarifa;
import main.java.panel.MarcarAsistencia;
import main.java.panel.HistorialAsistencia;
import main.java.panel.HistorialInstructores;
import main.java.panel.HistorialPagos;
import main.java.panel.LobbyClases;
import main.java.panel.LobbyCliente;
import main.java.panel.RegisterDatos;
import main.java.panel.LobbyTarifas;
import main.java.panel.LobbyClases;
import main.java.panel.Inicio;
import main.java.panel.Lobby;
import main.java.panel.Login;
import main.java.panel.Register;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

// https://www.youtube.com/watch?v=dQw4w9WgXcQ

public class Main {

	public JFrame frame;
	public JMenuBar barraMenu = new JMenuBar();
	public Main main;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		main = this;
		frame = new JFrame();
		frame.setSize(1200,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		changePanel(frame,new MarcarAsistencia());
		
		barraMenu.setSize(frame.getWidth(), 20);
		frame.setJMenuBar(barraMenu);
		JMenuItem menu1 = new JMenuItem("Inicio");
		JMenuItem menu2 = new JMenuItem("Logout");
		JMenuItem menu3 = new JMenuItem("Creditos");
		menu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changePanel(frame, new Lobby(main, Lobby.userCredential));
				
			}
		});
		menu3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				changePanel(frame, new Creditos(main));
			}
		});
		barraMenu.add(menu1);
		barraMenu.add(menu2);
		barraMenu.add(menu3);
		barraMenu.setVisible(false);
		
	}
	
	public void changePanel(JFrame frame, JPanel panel) throws NullPointerException{
		if(panel == null) {
			throw new NullPointerException("Panel nulo");
		} else {
			if(frame.getContentPane().getComponents().length != 0) {
				frame.getContentPane().remove(0);
			}
			frame.getContentPane().add(panel);
		}
		frame.revalidate();
		frame.repaint();
	}
	
}
