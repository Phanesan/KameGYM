package main.java.panel;

import javax.swing.JPanel;

import main.java.Util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Font;

public class ConsultarInstructoresCredencial extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultarInstructoresCredencial() {
		setLayout(null);
		
		
		
		
		
		JLabel User = new JLabel("");
		User.setIcon(new ImageIcon(Util.resizeImage(120, 120, Util.getStream("main/resources/user2.jpg"))));
		User.setBounds(320, 190, 120, 120);
		add(User);
		
		JLabel qr = new JLabel("");
		qr.setIcon(new ImageIcon(Util.resizeImage(220, 220, Util.getStream("main/resources/qr.png"))));
		qr.setBounds(670, 190, 220, 220);
		add(qr);
		
		JLabel Back = new JLabel("");
		Back.setIcon(new ImageIcon(Util.resizeImage(130, 110, Util.getStream("main/resources/back.png"))));
		Back.setBounds(10, 20, 130, 110);
		add(Back);
		
		JLabel lblNewLabel = new JLabel("Instructor 1");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setBounds(455, 200, 200, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("ID : 894810");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel2.setForeground(Color.white);
		lblNewLabel2.setBounds(455, 250, 200, 31);
		add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Cliente1@correo.com");
		lblNewLabel3.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel3.setForeground(Color.white);
		lblNewLabel3.setBounds(305, 380, 300, 31);
		add(lblNewLabel3);
		
		JLabel RecNegro = new JLabel("");
		RecNegro.setIcon(new ImageIcon(Util.resizeImage(800, 500, Util.getStream("main/resources/RecNegro.png"))));
		RecNegro.setBounds(200, 100, 800, 500);
		add(RecNegro);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		
		
		
	}
       
	
}
