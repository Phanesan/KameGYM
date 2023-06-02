package main.java.panel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consultar extends JPanel {

	/**
	 * Create the panel.
	 */
	public Consultar() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 1212, 800);
		add(panel);
		panel.setBackground(Color.decode("#FF7121"));
		panel.setLayout(null);
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(550, 393, 100, 100);
		lblNewLabel.setOpaque(true);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente 1");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(560, 504, 129, 33);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Descargar Reporte");
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 15));
		btnNewButton.setBounds(70, 648, 173, 44);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Descargar Credencial");
		btnNewButton_1.setFont(new Font("Impact", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(380, 648, 173, 44);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Historial Asistencia");
		btnNewButton_2.setFont(new Font("Impact", Font.PLAIN, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(690, 648, 173, 44);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Historial de Pagos");
		btnNewButton_3.setFont(new Font("Impact", Font.PLAIN, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(970, 648, 173, 44);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 22, 1200, 292);
		lblNewLabel_2.setOpaque(true);
		panel.add(lblNewLabel_2);
	}
	/*public static void main(String[] args) {
        JFrame ventana = new JFrame("Consultar"); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1200, 800); 
        ventana.setLocationRelativeTo(null); 
        Consultar v1 = new Consultar(); 
        ventana.getContentPane().add(v1); 
        ventana.setVisible(true); 
    }*/
}
