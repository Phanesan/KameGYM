package main.java.panel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.AssistModel;
import main.java.ConnectionDB;
import main.java.Main;
import main.java.UserCredential;
import main.java.Util;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

import java.util.ArrayList;

public class HistorialAsistencia extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public HistorialAsistencia(Main main) {
		setLayout(null);
		setBounds(0, 0, 1200, 800);
		setBackground(Color.decode("#FF7121"));
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Util.resizeImage(150, 150, Util.getStream("main/resources/User2.jpg"))));
		lblNewLabel.setBounds(151, 73, 151, 150);
		lblNewLabel.setOpaque(true);
		add(lblNewLabel);

		String[] columnNames = {"Fecha", "Hora de entrada", "Hora de salida"};
		 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        
        AssistModel[] assistModel = ConnectionDB.getAssist(ConsultarCliente.userCredential.correo);
        for (AssistModel assist : assistModel) {
			Object[] rows = new Object[3];
			rows[0] = assist.getFecha();
			rows[1] = assist.getHoraEntrada();
			rows[2] = assist.getHoraSalida();
			model.addRow(rows);
        }
        
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(118, 270, 964, 415);
        add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente 1");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(329, 85, 145, 24);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:123456");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(329, 121, 145, 24);
		add(lblNewLabel_1_1);

	}
}
