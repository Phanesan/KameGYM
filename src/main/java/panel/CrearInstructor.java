package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import main.java.Main;
import main.java.Util;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearInstructor extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public CrearInstructor(Main main) {
		setBackground(Color.decode("#FF7121"));
		setBounds(0, 0, 1200, 800);
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
			main.changePanel(main.frame, new LobbyInstructores(main));	
			}
		});

		JLabel User = new JLabel("");
		User.setIcon(new ImageIcon(Util.resizeImage(160, 160, Util.getStream("main/resources/user2.jpg"))));
		User.setBounds(200, 100, 160, 160);
		add(User);
		
		JLabel lblNewLabel = new JLabel("Selecciona una ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setForeground(Color.orange);
		lblNewLabel.setBounds(380, 0, 290, 360);
		add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("foto de perfil");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel2.setForeground(Color.orange);
		lblNewLabel2.setBounds(380, 0, 290, 440);
		add(lblNewLabel2);

		JLabel lblNewLabel_4 = new JLabel("dd");
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4.setBounds(178, 670, 46, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("mm");
		lblNewLabel_4_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(302, 670, 46, 14);
		add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("yy");
		lblNewLabel_4_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(437, 662, 46, 31);
		add(lblNewLabel_4_2);
		
		textField = new JTextField();
		textField.setBounds(118, 543, 353, 45);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 417, 353, 45);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 655, 95, 45);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(247, 655, 95, 45);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(376, 655, 95, 45);
		add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(118, 383, 201, 23);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(118, 509, 224, 23);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3.setBounds(200, 621, 251, 23);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Estatura");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(850, 390, 95, 23);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Peso");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(675, 390, 95, 23);
		add(lblNewLabel_1_2);
		

		JLabel lblNewLabel_4_3 = new JLabel("kg");
		lblNewLabel_4_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(783, 444, 46, 20);
		add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("cm");
		lblNewLabel_4_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4_4.setBounds(953, 444, 46, 20);
		add(lblNewLabel_4_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(674, 429, 144, 45);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(850, 429, 144, 45);
		add(textField_6);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(804, 670, 201, 45);
		add(btnNewButton);

	}
}
