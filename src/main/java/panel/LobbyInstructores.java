package main.java.panel;

import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

import main.java.Util;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;

public class LobbyInstructores extends JPanel {

	/**
	 * Create the panel.
	 */
	public LobbyInstructores() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1190, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		menuBar.add(mnNewMenu_1);
		
		JLabel Back = new JLabel("");
		Back.setIcon(new ImageIcon(Util.resizeImage(60, 60, Util.getStream("main/resources/back.png"))));
		Back.setBounds(10, 40, 60, 60);
		panel.add(Back);
		
		
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(384, 350, 439, 46);
		panel.add(comboBox);
		
		
		JButton Eliminar = new JButton("");
		Eliminar.setFont(new Font("Arial", Font.BOLD, 22));
		Eliminar.setBounds(370, 440, 200, 200);
		ImageIcon eliminar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_In.png")));
		ImageIcon eliminar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_Out.png")));
		Eliminar.setRolloverIcon(eliminar_in);
		Eliminar.setBorderPainted(false);
		Eliminar.setOpaque(false);
		Eliminar.setContentAreaFilled(false);
		Eliminar.setIcon(eliminar_out);
		Eliminar.setPressedIcon(eliminar_in);
		Eliminar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		panel.add(Eliminar);
		
		
		JButton Consultar = new JButton("");
		Consultar.setFont(new Font("Arial", Font.BOLD, 22));
		Consultar.setBounds(120, 440, 200, 200);
		ImageIcon consultar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_In.png")));
		ImageIcon consultar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_Out.png")));
		Consultar.setRolloverIcon(consultar_in);
		Consultar.setBorderPainted(false);
		Consultar.setOpaque(false);
		Consultar.setContentAreaFilled(false);
		Consultar.setIcon(consultar_out);
		Consultar.setPressedIcon(consultar_in);
		Consultar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		panel.add(Consultar);
		
		JButton Editar = new JButton("");
		Editar.setFont(new Font("Arial", Font.BOLD, 22));
		Editar.setBounds(620, 440, 200, 200);
		ImageIcon editar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_In.png")));
		ImageIcon editar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_Out.png")));
		Editar.setRolloverIcon(editar_in);
		Editar.setBorderPainted(false);
		Editar.setOpaque(false);
		Editar.setContentAreaFilled(false);
		Editar.setIcon(editar_out);
		Editar.setPressedIcon(editar_in);
		Editar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		panel.add(Editar);
		
		
		JButton Crear = new JButton("");
		Crear.setFont(new Font("Arial", Font.BOLD, 22));
		Crear.setBounds(870, 440, 200, 200);
		ImageIcon crear_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_In.png")));
		ImageIcon crear_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_Out.png")));
		Crear.setRolloverIcon(crear_in);
		Crear.setBorderPainted(false);
		Crear.setOpaque(false);
		Crear.setContentAreaFilled(false);
		Crear.setIcon(crear_out);
		Crear.setPressedIcon(crear_in);
		Crear.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		panel.add(Crear);
		
		
		JLabel lblBack2 = new JLabel("");
		lblBack2.setIcon(new ImageIcon(Util.resizeImage(1200, 300, Util.getStream("main/resources/TituloConsulta.png"))));
		lblBack2.setBounds(0, 0, 1200, 300);
		panel.add(lblBack2);
		
		panel.setBackground(Color.decode("#FF7121"));
		
		
		
	}
}
