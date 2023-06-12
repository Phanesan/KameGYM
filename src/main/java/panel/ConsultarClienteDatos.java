package main.java.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import main.java.ClassCredential;
import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import main.java.exception.CredentialsException;
import main.java.exception.DuplicateTarifaException;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class ConsultarClienteDatos extends JPanel {
	
	private JTextField textField;
	private JTextField textApellidos;
	private JTextField textCorreo;
	private JTextField textContraseña;
	private JTextField fieldPeso;
	private JTextField fieldAltura;
	private JTextField fieldYear;
	private JTextField fieldMonth;
	private JTextField fieldDay;
	// https://www.youtube.com/watch?v=dQw4w9WgXcQ
	/**
	 * Create the panel.
	 */
	public ConsultarClienteDatos(Main main) {
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
		lblBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			main.changePanel(main.frame, new ConsultarCliente(main, ConsultarCliente.userCredential));	
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_1.setBounds(665, 260, 334, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_2.setBounds(200, 485, 129, 22);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_3.setBounds(200, 374, 194, 22);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_4.setBounds(200, 260, 152, 22);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_5.setBounds(513, 46, 173, 172);
		Image image = new ImageIcon(ConsultarCliente.userCredential.icono).getImage();
		ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
		lblNewLabel_5.setIcon(icon);
		add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		textField.setBounds(200, 293, 335, 40);
		textField.setColumns(10);
		textField.setText(ConsultarCliente.userCredential.nombre);
		add(textField);
		
		textApellidos = new JTextField();
		textApellidos.setEnabled(false);
		textApellidos.setFont(new Font("Arial", Font.PLAIN, 24));
		textApellidos.setColumns(10);
		textApellidos.setBounds(200, 407, 335, 40);
		textApellidos.setText(ConsultarCliente.userCredential.apellidos);
		add(textApellidos);
		
		textCorreo = new JTextField();
		textCorreo.setFont(new Font("Arial", Font.PLAIN, 24));
		textCorreo.setColumns(10);
		textCorreo.setBounds(200, 518, 335, 40);
		textCorreo.setEnabled(false);
		textCorreo.setText(ConsultarCliente.userCredential.correo);
		add(textCorreo);
		
		textContraseña = new JTextField(ConsultarCliente.userCredential.password);
		textContraseña.setEnabled(false);
		textContraseña.setFont(new Font("Arial", Font.PLAIN, 24));
		textContraseña.setColumns(10);
		textContraseña.setBounds(665, 293, 335, 40);
		add(textContraseña);
		
		JLabel lblNewLabel_4_1 = new JLabel("Peso");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_4_1.setBounds(665, 374, 83, 22);
		add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Altura");
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_4_1_1.setBounds(870, 374, 83, 22);
		add(lblNewLabel_4_1_1);
		
		fieldPeso = new JTextField(String.valueOf(ConsultarCliente.userCredential.peso));
		fieldPeso.setFont(new Font("Arial", Font.PLAIN, 24));
		fieldPeso.setEnabled(false);
		fieldPeso.setBounds(665, 407, 112, 40);
		add(fieldPeso);
		fieldPeso.setColumns(10);
		
		fieldAltura = new JTextField(String.valueOf(ConsultarCliente.userCredential.estatura));
		fieldAltura.setFont(new Font("Arial", Font.PLAIN, 24));
		fieldAltura.setEnabled(false);
		fieldAltura.setColumns(10);
		fieldAltura.setBounds(870, 407, 112, 40);
		add(fieldAltura);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Fecha de nacimiento");
		lblNewLabel_4_1_2.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_4_1_2.setBounds(665, 485, 244, 22);
		add(lblNewLabel_4_1_2);
		
		String fecha = ConsultarCliente.userCredential.fechaDeNacimiento;
		String[] fechaSplit = fecha.split("-");
		
		fieldYear = new JTextField(fechaSplit[0]);
		fieldYear.setFont(new Font("Arial", Font.PLAIN, 24));
		fieldYear.setEnabled(false);
		fieldYear.setBounds(665, 518, 83, 40);
		add(fieldYear);
		fieldYear.setColumns(10);
		
		fieldMonth = new JTextField(fechaSplit[1]);
		fieldMonth.setFont(new Font("Arial", Font.PLAIN, 24));
		fieldMonth.setEnabled(false);
		fieldMonth.setColumns(10);
		fieldMonth.setBounds(786, 518, 83, 40);
		add(fieldMonth);
		
		fieldDay = new JTextField(fechaSplit[2]);
		fieldDay.setFont(new Font("Arial", Font.PLAIN, 24));
		fieldDay.setEnabled(false);
		fieldDay.setColumns(10);
		fieldDay.setBounds(905, 518, 83, 40);
		add(fieldDay);
	}
}
