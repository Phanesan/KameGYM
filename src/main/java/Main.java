package main.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.java.panel.Cliente;
import main.java.panel.DatosClientes;
import main.java.panel.Inicio;
import main.java.panel.Lobby;
import main.java.panel.Login;
import main.java.panel.Register;

public class Main {

	private JFrame frame;

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
		changePanel(new DatosClientes());
	}
	
	public void changePanel(JPanel panel) throws NullPointerException{
		if(panel == null) {
			throw new NullPointerException("Panel nulo");
		} else {
			if(frame.getContentPane().getComponents().length != 0) {
				frame.getContentPane().remove(0);
			}
			frame.getContentPane().add(panel);
		}
	}

}
