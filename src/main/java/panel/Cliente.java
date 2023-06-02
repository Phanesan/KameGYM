package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public Cliente() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 30));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4", "Cliente 5"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(108, 120, 399, 43);
		add(comboBox);
		
		JButton btnNewUser = new JButton("Crear Usuario");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewUser.setFont(new Font("Arial", Font.BOLD, 32));
		btnNewUser.setBounds(170, 538, 283, 55);
		add(btnNewUser);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBackground(Color.WHITE);
		lblImage.setOpaque(true);
		lblImage.setBounds(200, 250, 215, 214);
		add(lblImage);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 32));
		btnConsultar.setBounds(759, 133, 283, 55);
		add(btnConsultar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEditar.setBounds(759, 262, 283, 55);
		add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 32));
		btnEliminar.setBounds(759, 396, 283, 55);
		add(btnEliminar);
		
		JButton btnRealizar = new JButton("Realizar pago");
		btnRealizar.setFont(new Font("Arial", Font.BOLD, 32));
		btnRealizar.setBounds(759, 525, 283, 55);
		add(btnRealizar);
	}
}
