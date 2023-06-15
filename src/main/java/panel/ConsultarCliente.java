package main.java.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicButtonUI;

import main.java.Main;
import main.java.UserCredential;
import main.java.Util;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class ConsultarCliente extends JPanel {
	
	public static UserCredential userCredential;
	
	/**
	 * Create the panel.
	 */
	public ConsultarCliente(Main main, UserCredential userCredential) {
		this.userCredential = userCredential;
		
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
			main.changePanel(main.frame, new LobbyCliente(main));	
			}
		});

		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(Util.resizeImage(1200, 340, Util.getStream("main/resources/ClientesConsulta.jpg"))));
		Fondo.setBounds(0, 0, 1200, 273);
		Fondo.setBackground(null);
		add(Fondo);
		
		JLabel lblNewLabel = new JLabel();
		Image image = new ImageIcon(userCredential.icono).getImage();
		ImageIcon icon = new ImageIcon(image.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setBounds(550, 305, 100, 100);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(userCredential.correo);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel_1.setBounds(409, 410, 381, 33);
		add(lblNewLabel_1);
		
		JButton Historial_Asistencia = new JButton("");
		ImageIcon editar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Historial_Asistencia_In.png")));
		ImageIcon editar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Historial_Asistencia_Out.png")));
		Historial_Asistencia.setRolloverIcon(editar_in);
		Historial_Asistencia.setBorderPainted(false);
		Historial_Asistencia.setOpaque(false);
		Historial_Asistencia.setContentAreaFilled(false);
		Historial_Asistencia.setIcon(editar_out);
		Historial_Asistencia.setPressedIcon(editar_in);
		Historial_Asistencia.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		Historial_Asistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changePanel(main.frame, new HistorialAsistencia(main));
			}
		});
		Historial_Asistencia.setFont(new Font("Arial", Font.BOLD, 32));
		Historial_Asistencia.setBounds(500, 479, 200, 200);
		add(Historial_Asistencia);

		////////////////////////////////
		JButton Historial_de_Pagos = new JButton("");
		ImageIcon editar_in1 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Historial_Pagos_In.png")));
		ImageIcon editar_out1 = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Historial_Pagos_Out.png")));
		Historial_de_Pagos.setRolloverIcon(editar_in1);
		Historial_de_Pagos.setBorderPainted(false);
		Historial_de_Pagos.setOpaque(false);
		Historial_de_Pagos.setContentAreaFilled(false);
		Historial_de_Pagos.setIcon(editar_out1);
		Historial_de_Pagos.setPressedIcon(editar_in1);
		Historial_de_Pagos.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		Historial_de_Pagos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changePanel(main.frame, new HistorialPagos(main));
			}
		});
		Historial_de_Pagos.setFont(new Font("Arial", Font.BOLD, 32));
		Historial_de_Pagos.setBounds(808, 479, 200, 200);
		add(Historial_de_Pagos);
		
		JButton Consultar_Datos = new JButton("");
		ImageIcon consultar_in = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_In.png")));
		ImageIcon consultar_out = new ImageIcon(Util.resizeImage(200, 200, Util.getStream("main/resources/UI/Consultar_Out.png")));
		Consultar_Datos.setRolloverIcon(consultar_in);
		Consultar_Datos.setBorderPainted(false);
		Consultar_Datos.setOpaque(false);
		Consultar_Datos.setContentAreaFilled(false);
		Consultar_Datos.setIcon(consultar_out);
		Consultar_Datos.setPressedIcon(consultar_in);
		Consultar_Datos.setUI(new BasicButtonUI() {
	        @Override
	        protected void paintButtonPressed(Graphics g, AbstractButton b) {}
	    });
		Consultar_Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changePanel(main.frame, new ConsultarClienteDatos(main));
			}
		});
		Consultar_Datos.setFont(new Font("Arial", Font.BOLD, 32));
		Consultar_Datos.setBounds(194, 479, 200, 200);
		add(Consultar_Datos);
		
		////////////////////////////////
	}
	
	
	
}
