package main.java.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.java.Util;

public class EditarTarifa extends JPanel {

	/**
	 * Create the panel.
	 */
	public EditarTarifa() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		add(lblBack);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 32));
		lblNombre.setBounds(107, 190, 193, 37);
		add(lblNombre);
		
		JTextField txtTarifa = new JTextField();
		txtTarifa.setText("Tarifa 1");
		txtTarifa.setFont(new Font("Arial", Font.PLAIN, 18));
		txtTarifa.setColumns(10);
		txtTarifa.setBounds(107, 238, 661, 43);
		add(txtTarifa);
		
		JLabel lblDuracion = new JLabel("Duracion (mins)");
		lblDuracion.setFont(new Font("Arial", Font.BOLD, 32));
		lblDuracion.setBounds(107, 292, 258, 37);
		add(lblDuracion);
		
		JTextField textField_1 = new JTextField();
		textField_1.setText("60");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(107, 340, 661, 43);
		add(textField_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		lblPrecio.setBounds(107, 394, 193, 37);
		add(lblPrecio);
		
		JTextField textField_2 = new JTextField();
		textField_2.setText("$123456789");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(107, 442, 661, 43);
		add(textField_2);
		
		JButton btnNewButton = new JButton("Actualizar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setBounds(309, 564, 309, 65);
		add(btnNewButton);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBackground(Color.WHITE);
		lblImage.setBounds(878, 0, 340, 800);
		lblImage.setIcon(new ImageIcon(Util.resizeImage(340, 800, Util.getStream("main/resources/g2.jpg"))));
		add(lblImage);
	}

}
