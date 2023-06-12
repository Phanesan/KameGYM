package main.java;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import main.java.panel.ClientesPago;
import main.java.panel.ConsultarCliente;
import main.java.panel.LobbyInstructores;
import main.java.panel.CrearClase;
import main.java.panel.CrearCliente;
import main.java.panel.CrearTarifa;
import main.java.panel.EditarClase;
import main.java.panel.EditarCliente;
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

public class Main {

	public JFrame frame;

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
		frame = new JFrame();
		frame.setSize(1200,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		changePanel(frame,new Login(this));
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.setSize(frame.getWidth(), 20);
		frame.setJMenuBar(barraMenu);
		
		JMenu menu1 = new JMenu("Inicio");
		JMenu menu2 = new JMenu("Logout");
		JMenu menu3 = new JMenu("Creditos");
		
		barraMenu.add(menu1);
		barraMenu.add(menu2);
		barraMenu.add(menu3);
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
