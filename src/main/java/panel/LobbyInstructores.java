package main.java.panel;

import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

import main.java.Main;
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
	public LobbyInstructores(Main main) {
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
	
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(384, 350, 439, 46);
		add(comboBox);
		
		JButton eliminar = new JButton("");
		eliminar.setFont(new Font("Arial", Font.BOLD, 22));
		eliminar.setBounds(370, 440, 200, 200);
		ImageIcon eliminar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_In.png")));
		ImageIcon eliminar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Eliminar_Out.png")));
		eliminar.setRolloverIcon(eliminar_in);
		eliminar.setBorderPainted(false);
		eliminar.setOpaque(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setIcon(eliminar_out);
		eliminar.setPressedIcon(eliminar_in);
		eliminar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		add(eliminar);
		
		
		JButton consultar = new JButton("");
		consultar.setFont(new Font("Arial", Font.BOLD, 22));
		consultar.setBounds(120, 440, 200, 200);
		ImageIcon consultar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_In.png")));
		ImageIcon consultar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_Out.png")));
		consultar.setRolloverIcon(consultar_in);
		consultar.setBorderPainted(false);
		consultar.setOpaque(false);
		consultar.setContentAreaFilled(false);
		consultar.setIcon(consultar_out);
		consultar.setPressedIcon(consultar_in);
		consultar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new HistorialInstructores(main));
			}
		});
		add(consultar);
		
		JButton editar = new JButton("");
		editar.setFont(new Font("Arial", Font.BOLD, 22));
		editar.setBounds(620, 440, 200, 200);
		ImageIcon editar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_In.png")));
		ImageIcon editar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_Out.png")));
		editar.setRolloverIcon(editar_in);
		editar.setBorderPainted(false);
		editar.setOpaque(false);
		editar.setContentAreaFilled(false);
		editar.setIcon(editar_out);
		editar.setPressedIcon(editar_in);
		editar.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		editar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new EditarInstructor(main));
			}
		});
		add(editar);
		
		
		JButton crear = new JButton("");
		crear.setFont(new Font("Arial", Font.BOLD, 22));
		crear.setBounds(870, 440, 200, 200);
		ImageIcon crear_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_In.png")));
		ImageIcon crear_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_Out.png")));
		crear.setRolloverIcon(crear_in);
		crear.setBorderPainted(false);
		crear.setOpaque(false);
		crear.setContentAreaFilled(false);
		crear.setIcon(crear_out);
		crear.setPressedIcon(crear_in);
		crear.setUI(new BasicButtonUI() {
            @Override
            protected void paintButtonPressed(Graphics g, AbstractButton b) {}
        });
		crear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new CrearInstructor(main));
			}
		});
		add(crear);
		
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Util.resizeImage(1200, 300, Util.getStream("main/resources/TituloConsulta.png"))));
		lblImage.setBounds(0, 0, 1200, 300);
		add(lblImage);

	}
}
