package main.java.panel;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import main.java.ConnectionDB;
import main.java.Main;
import main.java.PaymentModel;
import main.java.Util;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class HistorialPagos extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public HistorialPagos(Main main) {
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
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblIcon.setBounds(510, 47, 180, 180);
		Image image = new ImageIcon(ConsultarCliente.userCredential.icono).getImage();
		ImageIcon icon = new ImageIcon(image.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
		lblIcon.setIcon(icon);
		add(lblIcon);
		
		JLabel lblNewLabel_1 = new JLabel(ConsultarCliente.userCredential.correo);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(312, 238, 576, 33);
		add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 339, 973, 281);
		add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		
		String[] columns = new String[4];
		columns[0] = "ID";
		columns[1] = "TARIFA";
		columns[2] = "FECHA DE PAGO";
		columns[3] = "MONTO";
		
		model.setColumnIdentifiers(columns);
		
		PaymentModel[] payments = ConnectionDB.getPayment(ConsultarCliente.userCredential.correo);
		for(PaymentModel pm : payments) {
			Object[] payment = new Object[4];
			payment[0] = pm.idPago;
			payment[1] = pm.tarifaNombre;
			payment[2] = pm.fechaPago;
			payment[3] = Float.valueOf(pm.monto);
			
			model.addRow(payment);
		}
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		
	}
}
