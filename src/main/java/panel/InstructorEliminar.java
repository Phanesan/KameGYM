package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;

import main.java.Util;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class InstructorEliminar extends JPanel {

	/**
	 * Create the panel.
	 */
	public InstructorEliminar() { 
		
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1200, 800);
		add(panel);
		panel.setBackground(Color.decode("#FF7121"));
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
		
		JButton btnNewButton = new JButton("Seguro!!");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(476, 459, 266, 43);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("¿Seguro que desea eliminar este instructor? ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(347, 243, 549, 49);
		panel.add(lblNewLabel);
		
		JLabel lblInstructor = new JLabel("");
		lblInstructor.setFont(new Font("Arial", Font.BOLD, 24));
		lblInstructor.setBounds(529, 243, 200, 49);
		panel.add(lblInstructor);
	}
}
