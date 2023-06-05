package main.java.panel;

import javax.swing.JPanel;

import main.java.Util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Font;

public class InstructoresCredencial extends JPanel {

	/**
	 * Create the panel.
	 */
	public InstructoresCredencial() {
		setLayout(null);
		
		
		JLabel User = new JLabel("");
		User.setIcon(new ImageIcon(Util.resizeImage(150, 150, Util.getStream("main/resources/user2.jpg"))));
		User.setBounds(440, 155, 150, 150);
		add(User);
		
		
		JLabel Back = new JLabel("");
		Back.setIcon(new ImageIcon(Util.resizeImage(130, 110, Util.getStream("main/resources/back.png"))));
		Back.setBounds(10, 20, 130, 120);
		add(Back);
		
		JLabel lblNewLabel = new JLabel("Instructor 1");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setForeground(Color.black);
		lblNewLabel.setBounds(610, 180, 200, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("ID : 894810");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel2.setForeground(Color.black);
		lblNewLabel2.setBounds(610, 250, 200, 31);
		add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Cliente1@correo.com");
		lblNewLabel3.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel3.setForeground(Color.black);
		lblNewLabel3.setBounds(450, 350, 300, 31);
		add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Clases: Hipertrofia,");
		lblNewLabel4.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel4.setForeground(Color.black);
		lblNewLabel4.setBounds(450, 450, 300, 31);
		add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("aerobicos.");
		lblNewLabel5.setFont(new Font("Arial", Font.BOLD, 26));	
		lblNewLabel5.setForeground(Color.black);
		lblNewLabel5.setBounds(450, 480, 300, 31);
		add(lblNewLabel5);
		
		JLabel RecNegro = new JLabel("");
		RecNegro.setIcon(new ImageIcon(Util.resizeImage(800, 500, Util.getStream("main/resources/RecBlanco.png"))));
		RecNegro.setBounds(400, 100, 400, 600);
		add(RecNegro);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		
		panel.setBackground(Color.decode("#FF7121"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1190, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		menuBar.add(mnNewMenu_1);
	}
       
	
}
