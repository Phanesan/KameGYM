package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import main.java.Util;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConsultarInstructores extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultarInstructores() {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1190, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Logout");
		menuBar.add(mnNewMenu_1);
		
		JLabel Back = new JLabel("");
		Back.setIcon(new ImageIcon(Util.resizeImage(120, 120, Util.getStream("main/resources/back.png"))));
		Back.setBounds(10, 40, 120, 120);
		panel.add(Back);
		
		
		
		JLabel lupa = new JLabel("");
		lupa.setIcon(new ImageIcon(Util.resizeImage(130, 99, Util.getStream("main/resources/Lupa.png"))));
		lupa.setBounds(400, 410, 130, 99);
		panel.add(lupa);
		
		
		JLabel Basura = new JLabel("");
		Basura.setIcon(new ImageIcon(Util.resizeImage(130, 99, Util.getStream("main/resources/Basura.png"))));
		Basura.setBounds(400, 590, 130, 99);
		panel.add(Basura);
		
		JLabel edit = new JLabel("");
		edit.setIcon(new ImageIcon(Util.resizeImage(130, 99, Util.getStream("main/resources/edit.png"))));
		edit.setBounds(680, 418, 130, 99);
		panel.add(edit);
		
		JLabel crear = new JLabel("");
		crear.setIcon(new ImageIcon(Util.resizeImage(130, 99, Util.getStream("main/resources/crear.png"))));
		crear.setBounds(680, 590, 130, 99);
		panel.add(crear);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(384, 350, 439, 46);
		panel.add(comboBox);
		
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton_1.setBounds(370, 700, 205, 46);
		panel.add(btnNewButton_1);
		
		
		JButton btnNewButton_3 = new JButton("Consultar");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton_3.setBounds(370, 520, 205, 46);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Editar");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton_4.setBounds(630, 520, 205, 46);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Crear");
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton_5.setBounds(630, 700, 205, 46);
		panel.add(btnNewButton_5);
		
		
		JLabel lblBack2 = new JLabel("");
		lblBack2.setIcon(new ImageIcon(Util.resizeImage(1200, 300, Util.getStream("main/resources/TituloConsulta.png"))));
		lblBack2.setBounds(0, 0, 1200, 300);
		panel.add(lblBack2);
		
		panel.setBackground(Color.decode("#FF7121"));
		
		
		
	}
}
