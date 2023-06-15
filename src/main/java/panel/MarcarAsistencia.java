package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import main.java.exception.InvalidDayException;
import main.java.exception.InvalidMonthException;
import main.java.exception.InvalidYearException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MarcarAsistencia extends JPanel {
	private JTextField horaEntrada;
	private JTextField minutosEntrada;
	private JTextField horaSalida;
	private JTextField minutosSalida;

	/**
	 * Create the panel.
	 */
	public MarcarAsistencia(Main main, UserCredential userCredential) {
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
		lblNewLabel_3.setBounds(360, 438, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Minutos");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(612, 438, 46, 14);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Horas");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_2.setBounds(361, 537, 46, 14);
		add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Minutos");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3_3.setBounds(612, 538, 46, 14);
		add(lblNewLabel_3_3);
		
		horaEntrada = new JTextField();
		horaEntrada.setBounds(360, 400, 207, 34);
		add(horaEntrada);
		horaEntrada.setColumns(10);
		
		minutosEntrada = new JTextField();
		minutosEntrada.setColumns(10);
		minutosEntrada.setBounds(605, 400, 207, 34);
		add(minutosEntrada);
		
		horaSalida = new JTextField();
		horaSalida.setColumns(10);
		horaSalida.setBounds(360, 500, 207, 34);
		add(horaSalida);
		
		minutosSalida = new JTextField();
		minutosSalida.setColumns(10);
		minutosSalida.setBounds(605, 500, 207, 34);
		add(minutosSalida);
		
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
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					validarHora(horaEntrada);
					validarMinutos(minutosEntrada);
					validarHora(horaSalida);
					validarMinutos(minutosSalida);
					
					StringBuilder sb = new StringBuilder();
					sb.append(horaEntrada.getText());
					sb.append(":");
					sb.append(minutosEntrada.getText());
					sb.append(":");
					sb.append("00");
					
					String horaEntradaSB = sb.toString();
					
					sb = new StringBuilder();
					sb.append(horaSalida.getText());
					sb.append(":");
					sb.append(minutosSalida.getText());
					sb.append(":");
					sb.append("00");
					
					String horaSalidaSB = sb.toString();
					
					ConnectionDB.addAssist(userCredential.correo, horaEntradaSB, horaSalidaSB);
					JOptionPane.showMessageDialog(MarcarAsistencia.this, "Asistencia marcada");
					main.changePanel(main.frame, new LobbyCliente(main));
				} catch(IllegalArgumentException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
			}
		});
		add(btnNewButton);

	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarHora(JTextField textField) throws IllegalArgumentException{
		String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

		// Verificar si el texto cumple con el patrón deseado
		if (!texto.matches("^\\d{1,2}$")) {
			throw new IllegalArgumentException("Formato de hora invalida");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void validarMinutos(JTextField textField) throws IllegalArgumentException{
		String texto = textField.getText().trim(); // Obtener el texto y eliminar espacios en blanco

		// Verificar si el texto cumple con el patrón deseado
		if (!texto.matches("^\\d{1,2}$")) {
			throw new IllegalArgumentException("Formato de minutos invalido");
		}
	}
}
