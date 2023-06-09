package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.Util;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Login extends JPanel {
	private JTextField textFieldCorreo;
	private JTextField fieldPassword;

	/**
	 * Create the panel.
	 */
	public Login() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldCorreo.setBounds(385, 414, 430, 43);
		add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		fieldPassword = new JPasswordField();
		fieldPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(385, 516, 430, 43);
		add(fieldPassword);
		
		JLabel lblNewLabel1 = new JLabel("Correo");
		lblNewLabel1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel1.setBounds(385, 366, 193, 37);
		add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Contraseña");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel2.setBounds(385, 468, 193, 37);
		add(lblNewLabel2);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(320, 623, 200, 55);
		add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 28));
		btnRegistrarse.setBounds(680, 623, 200, 55);
		add(btnRegistrarse);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(175, 0, 850, 428);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(850, 400, Util.getStream("main/resources/logoInicio.png"))));
		add(lblImage);
	}
}
