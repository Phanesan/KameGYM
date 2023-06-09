package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.Main;
import main.java.exception.CredentialsException;
import main.java.exception.DuplicateMailException;
import main.java.sql.ConectionDB;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	private JTextField textFieldCorreo;
	private JPasswordField fieldPassword;

	/**
	 * Create the panel.
	 */
	public Login(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Arial", Font.PLAIN, 18));
		textFieldCorreo.setBounds(269, 414, 661, 43);
		add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		fieldPassword = new JPasswordField();
		fieldPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(269, 516, 661, 43);
		add(fieldPassword);
		
		JLabel lblNewLabel1 = new JLabel("Correo");
		lblNewLabel1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel1.setBounds(269, 366, 193, 37);
		add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Contraseña");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel2.setBounds(267, 468, 193, 37);
		add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("¿No tienes cuenta?");
		lblNewLabel3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel3.setBounds(269, 564, 158, 21);
		add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Click Aqui!");
		lblNewLabel4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel4.setBounds(431, 564, 158, 21);
		add(lblNewLabel4);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					ConectionDB.loginRequest(textFieldCorreo.getText(), new String(fieldPassword.getPassword()));
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CredentialsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(514, 655, 171, 55);
		add(btnNewButton);
	}
}
