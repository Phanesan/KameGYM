package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;

import main.java.Util;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clases extends JPanel {

	/**
	 * Create the panel.
	 */
	public Clases() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		add(lblBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 11));
		comboBox.setBounds(391, 85, 417, 53);
		add(comboBox);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEditar.setBounds(100, 418, 238, 55);
		add(btnEditar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 32));
		btnConsultar.setBounds(300, 698, 238, 55);
		add(btnConsultar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEliminar.setBounds(700, 698, 238, 55);
		add(btnEliminar);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Arial", Font.BOLD, 32));
		btnCrear.setBounds(862, 418, 238, 55);
		add(btnCrear);
	}
}
