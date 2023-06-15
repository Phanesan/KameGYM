package main.java.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class InscribirClase extends JPanel {

	/**
	 * Create the panel.
	 */
	public InscribirClase(Main main, UserCredential userCredential) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JButton lblBack = new JButton("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		lblBack.setBackground(null);
		lblBack.setBorderPainted(false);
		lblBack.setOpaque(false);
		add(lblBack);
		
		JLabel lblImage = new JLabel(new ImageIcon(Util.resizeImage(1200, 500, Util.getStream("main/resources/imagen3.jpg"))));
		lblImage.setBounds(0, 0, 1200, 300);
		add(lblImage);
		
		JLabel iconLabel = new JLabel();
		Image image = new ImageIcon(userCredential.icono).getImage();
		ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
		iconLabel.setIcon(icon);
		iconLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		iconLabel.setBounds(170, 407, 180, 180);
		add(iconLabel);
		
		JLabel lblCorreo = new JLabel((String) userCredential.correo);
		lblCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo.setFont(new Font("Arial", Font.BOLD, 22));
		lblCorreo.setBounds(116, 606, 295, 34);
		add(lblCorreo);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Arial", Font.BOLD, 24));
		comboBox.setBounds(611, 460, 277, 34);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Elige una clase:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(611, 419, 261, 30);
		add(lblNewLabel);
		
		JButton btnInscribir = new JButton("Inscribir");
		btnInscribir.setFont(new Font("Arial", Font.BOLD, 24));
		btnInscribir.setBounds(515, 563, 180, 44);
		add(btnInscribir);
		
		btnInscribir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					ConnectionDB.registerUserClass(userCredential.correo, (String) comboBox.getSelectedItem());
					JOptionPane.showMessageDialog(InscribirClase.this, "Te has inscrito a la clase " + (String) comboBox.getSelectedItem());
				} catch (SQLException e1) {
					if(e1.getErrorCode() == 1062) {
						JOptionPane.showMessageDialog(InscribirClase.this, "Ya estas inscrito a esta clase");
					}
				}
			}
		});
		
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new LobbyCliente(main));	
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		obtenerClases(comboBox);
		
		JButton btnSalirClase = new JButton("Salir de la Clase");
		btnSalirClase.setFont(new Font("Arial", Font.BOLD, 24));
		btnSalirClase.setBounds(762, 563, 239, 44);
		add(btnSalirClase);
		
		btnSalirClase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ConnectionDB.terminateUserClass(userCredential.correo, (String) comboBox.getSelectedItem());
					JOptionPane.showMessageDialog(InscribirClase.this, "Te has salido de la clase " + (String) comboBox.getSelectedItem());
				} catch (SQLException e1) {
					if(e1.getErrorCode() == 1062) {
						JOptionPane.showMessageDialog(InscribirClase.this, "Ya estas inscrito a esta clase");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(InscribirClase.this, "Aun no estas inscrito a esta clase");
				}
			}
		});
	}
	
	public static void obtenerClases(JComboBox<String> comboBox) {
		comboBox.removeAllItems();
		String[] nombreClases = ConnectionDB.getClases();
		for(int i = 0; i < nombreClases.length;i++) {
			comboBox.addItem(nombreClases[i]);
		}
	}
}
