package ec.ups.edu.appdis.g2.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaIngresoCliente {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtdni;
	private JTextField txtemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresoCliente window = new VentanaIngresoCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaIngresoCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(47, 31, 115, 27);
		frame.getContentPane().add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNombre.setBounds(152, 26, 156, 34);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBounds(47, 84, 47, 27);
		frame.getContentPane().add(lblDni);
		
		txtdni = new JTextField();
		txtdni.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtdni.setColumns(10);
		txtdni.setBounds(152, 70, 156, 34);
		frame.getContentPane().add(txtdni);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(47, 139, 47, 27);
		frame.getContentPane().add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtemail.setColumns(10);
		txtemail.setBounds(152, 132, 156, 34);
		frame.getContentPane().add(txtemail);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(169, 216, 139, 37);
		frame.getContentPane().add(btnGuardar);
	}
}
