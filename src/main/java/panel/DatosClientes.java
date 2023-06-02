package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class DatosClientes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtDd;
	private JTextField txtMm;
	private JTextField txtYy;

	/**
	 * Create the panel.
	 */
	public DatosClientes() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.WHITE);
		lblImage.setBounds(810, 0, 390, 800);
		add(lblImage);
		
		JLabel lblPeso = new JLabel("Ingrese su peso:");
		lblPeso.setFont(new Font("Arial", Font.BOLD, 32));
		lblPeso.setBounds(34, 49, 257, 37);
		add(lblPeso);
		
		JLabel lblIngreseSuEstatura = new JLabel("Ingrese su estatura (cm):");
		lblIngreseSuEstatura.setFont(new Font("Arial", Font.BOLD, 32));
		lblIngreseSuEstatura.setBounds(330, 49, 390, 37);
		add(lblIngreseSuEstatura);
		
		JLabel lblDate = new JLabel("Ingrese su fecha de nacimiento:");
		lblDate.setFont(new Font("Arial", Font.BOLD, 32));
		lblDate.setBounds(34, 192, 553, 37);
		add(lblDate);
		
		JLabel lblIDM = new JLabel("Su IDM es de \" \" por lo que usted");
		lblIDM.setFont(new Font("Arial", Font.BOLD, 32));
		lblIDM.setBounds(34, 357, 636, 55);
		add(lblIDM);
		
		JLabel lblAviso = new JLabel("Usaremos esta información para ayudarlo durante su \r\nestancia.");
		lblAviso.setFont(new Font("Arial", Font.BOLD, 23));
		lblAviso.setBounds(34, 469, 728, 71);
		add(lblAviso);
		
		JButton btn = new JButton("Entrar");
		btn.setFont(new Font("Arial", Font.BOLD, 32));
		btn.setBounds(286, 656, 171, 55);
		add(btn);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(34, 97, 257, 43);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(330, 97, 257, 43);
		add(textField_1);
		
		txtDd = new JTextField();
		txtDd.setText("dd");
		txtDd.setFont(new Font("Arial", Font.PLAIN, 18));
		txtDd.setColumns(10);
		txtDd.setBounds(34, 268, 138, 43);
		add(txtDd);
		
		txtMm = new JTextField();
		txtMm.setText("mm");
		txtMm.setFont(new Font("Arial", Font.PLAIN, 18));
		txtMm.setColumns(10);
		txtMm.setBounds(216, 268, 138, 43);
		add(txtMm);
		
		txtYy = new JTextField();
		txtYy.setText("yy");
		txtYy.setFont(new Font("Arial", Font.PLAIN, 18));
		txtYy.setColumns(10);
		txtYy.setBounds(399, 268, 138, 43);
		add(txtYy);
		
		JLabel lblTiene = new JLabel("tiene: \" \"");
		lblTiene.setFont(new Font("Arial", Font.BOLD, 32));
		lblTiene.setBounds(34, 403, 636, 55);
		add(lblTiene);
		
	}

}
