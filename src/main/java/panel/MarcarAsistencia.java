package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Main;
import main.java.Util;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MarcarAsistencia extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public MarcarAsistencia(Main main) {
		setLayout(null);
	
		setBounds(0, 0, 1200, 800);
		
		setBackground(Color.decode("#FF7121"));
		
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
			main.changePanel(main.frame, new LobbyCliente(main));	
			}
		});
		
		JLabel Fondo = new JLabel();
		Fondo.setIcon(new ImageIcon(Util.resizeImage(1200, 400, Util.getStream("main/resources/Asistencias.jpg"))));
		Fondo.setBounds(0, 0, 1200, 300);
		add(Fondo);
		
		
		JLabel lblNewLabel_3 = new JLabel("Horas");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3.setBounds(509, 410, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Minutos");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(753, 410, 46, 14);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Horas");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_2.setBounds(509, 510, 46, 14);
		add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Minutos");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_3.setBounds(753, 510, 46, 14);
		add(lblNewLabel_3_3);
		
		textField = new JTextField();
		textField.setBounds(360, 400, 207, 34);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(605, 400, 207, 34);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(360, 500, 207, 34);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(605, 500, 207, 34);
		add(textField_3);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setBounds(576, 492, 19, 41);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel_1.setBounds(577, 400, 19, 41);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora de Salida");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_2.setBounds(350, 469, 207, 20);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hora de Entrada");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(350, 369, 207, 20);
		add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(497, 602, 207, 51);
		add(btnNewButton);
		
		

	}
}
