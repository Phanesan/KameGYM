package main.java.panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JToolBar;

public class Clientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public Clientes() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FF7121"));
		panel.setLocation(0, 0);
		panel.setSize(1200,800);
		add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(770, 130, 278, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1_2_1 = new JButton("Crear Usuario");
		btnNewButton_1_2_1.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton_1_2_1.setBounds(165, 584, 297, 55);
		panel.add(btnNewButton_1_2_1);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(240, 240, 240));
		label.setBounds(203, 210, 225, 225);
		label.setOpaque(true);
		panel.add(label);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton_1.setBounds(770, 235, 278, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Eliminar");
		btnNewButton_1_1.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton_1_1.setBounds(770, 340, 278, 50);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Realizar Pago");
		btnNewButton_1_1_1.setFont(new Font("Impact", Font.PLAIN, 23));
		btnNewButton_1_1_1.setBounds(770, 445, 278, 50);
		panel.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Cliente 1");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel.setBounds(274, 130, 100, 23);
		panel.add(lblNewLabel);

		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(165, 118, 297, 41);
		panel.add(comboBox);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1200, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Cuenta");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Clases");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Logout");
		menuBar.add(mnNewMenu_3);
		


	}
	
	 /*public static void main(String[] args) {
	        JFrame ventana = new JFrame("Cliente"); 
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        ventana.setSize(1200, 800); 
	        ventana.setLocationRelativeTo(null); 
	        Clientes v1 = new Clientes(); 
	        ventana.getContentPane().add(v1); 
	        ventana.setVisible(true); 
	    }*/
}
