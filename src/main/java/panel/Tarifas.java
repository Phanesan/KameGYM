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

import main.java.Util;
import javax.swing.JComboBox;

public class Tarifas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Tarifas() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		add(lblBack);
		
		
		JButton Consultar = new JButton("");
		ImageIcon editar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_In.png")));
		ImageIcon editar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_Out.png")));
		Consultar.setRolloverIcon(editar_in);
		Consultar.setBorderPainted(false);
		Consultar.setOpaque(false);
		Consultar.setContentAreaFilled(false);
		Consultar.setIcon(editar_out);
		Consultar.setPressedIcon(editar_in);
		Consultar.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		Consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Consultar.setFont(new Font("Arial", Font.BOLD, 32));
		Consultar.setBounds(300, 240, 230, 200);
		add(Consultar);
		
		/////////////////
		JButton Editar = new JButton("");
		ImageIcon editar_in1 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_In.png")));
		ImageIcon editar_out1 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Editar_Out.png")));
		Editar.setRolloverIcon(editar_in1);
		Editar.setBorderPainted(false);
		Editar.setOpaque(false);
		Editar.setContentAreaFilled(false);
		Editar.setIcon(editar_out1);
		Editar.setPressedIcon(editar_in1);
		Editar.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		Consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Editar.setFont(new Font("Arial", Font.BOLD, 32));
		Editar.setBounds(650, 240, 230, 200);
		add(Editar);
		//////////
		JButton Crear = new JButton("");
		ImageIcon editar_in2 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_In.png")));
		ImageIcon editar_out2 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Crear_Out.png")));
		Crear.setRolloverIcon(editar_in2);
		Crear.setBorderPainted(false);
		Crear.setOpaque(false);
		Crear.setContentAreaFilled(false);
		Crear.setIcon(editar_out2);
		Crear.setPressedIcon(editar_in2);
		Crear.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Crear.setFont(new Font("Arial", Font.BOLD, 32));
		Crear.setBounds(300, 500, 230, 200);
		add(Crear);
		///////
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
		Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Eliminar.setFont(new Font("Arial", Font.BOLD, 32));
		Eliminar.setBounds(650, 500, 230, 200);
		add(Eliminar);
		/////
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(380, 101, 439, 67);
		add(comboBox);
		
		
	}

}
