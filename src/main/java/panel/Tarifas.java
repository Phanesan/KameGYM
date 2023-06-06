package main.java.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import main.java.Main;
import main.java.Util;
import javax.swing.JComboBox;

public class Tarifas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Tarifas(Main main) {
		setBackground(Color.decode("#FF7121"));
		setSize(1200,800);
		setLayout(null);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(Util.resizeImage(65, 65, Util.getStream("main/resources/back.png"))));
		lblBack.setBounds(10, 11, 65, 65);
		add(lblBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(380, 101, 439, 67);
		add(comboBox);
		
		JButton btnCrearTarifa = new JButton();
		btnCrearTarifa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new CrearTarifa());
			}
		});
		
		/*JButton btnConsultarTarifa = new JButton();
		btnConsultarTarifa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new ConsultarTarifa());
			}
		});*/
		
		/*JButton btnEditarTarifa = new JButton();
		btnEditarTarifa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.changePanel(main.frame, new EditarTarifa());
			}
		});*/
		
	}

}
