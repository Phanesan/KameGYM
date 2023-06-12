package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import main.java.exception.CredentialsException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class RealizarPago extends JPanel {

	/**
	 * Create the panel.
	 */
	public RealizarPago(Main main, UserCredential userCredential) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		lblBack.setOpaque(false);
		lblBack.setBorderPainted(false);
		add(lblBack);
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new LobbyCliente(main));	
			}
		});
		
		JLabel imagen = new JLabel();
		imagen.setIcon(new ImageIcon(Util.resizeImage(1200, 474, Util.getStream("main/resources/FondoTarifas.png"))));
		imagen.setBounds(0, 0, 1200, 309);
		add(imagen);
		
		JLabel iconLabel = new JLabel("");
		Image image = new ImageIcon(userCredential.icono).getImage();
		ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
		iconLabel.setIcon(icon);
		iconLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		iconLabel.setBounds(193, 420, 180, 180);
		add(iconLabel);
		
		JLabel lblCorreo = new JLabel(userCredential.correo);
		lblCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo.setFont(new Font("Arial", Font.BOLD, 22));
		lblCorreo.setBounds(139, 619, 295, 34);
		add(lblCorreo);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Arial", Font.BOLD, 30));
		comboBox.setBounds(602, 464, 326, 38);
		String[] nombreTarifas = ConnectionDB.getTarifasNombre();
		for(int i = 0; i < nombreTarifas.length; i++) {
			comboBox.addItem(nombreTarifas[i]);
		}
		add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Tarifa a pagar");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel_1.setBounds(655, 420, 220, 34);
		add(lblNewLabel_1);
		
		JButton btnPago = new JButton("Realizar Pago");
		btnPago.setFont(new Font("Arial", Font.BOLD, 24));
		btnPago.setBounds(657, 605, 211, 43);
		btnPago.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ConnectionDB.makePayment((String)comboBox.getSelectedItem(), userCredential.correo, ConnectionDB.loadTariff((String) comboBox.getSelectedItem()).precio);
					main.changePanel(main.frame, new LobbyCliente(main));
				} catch (CredentialsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		add(btnPago);
		
		JLabel lblPrecio = new JLabel();
		try {
			lblPrecio = new JLabel("$"+ConnectionDB.loadTariff((String) comboBox.getSelectedItem()).precio);
		} catch (CredentialsException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 32));
		lblPrecio.setBounds(653, 513, 220, 34);
		add(lblPrecio);
	}
}
