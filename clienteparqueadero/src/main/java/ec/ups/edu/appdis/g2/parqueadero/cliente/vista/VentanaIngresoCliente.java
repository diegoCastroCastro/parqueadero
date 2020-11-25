package ec.ups.edu.appdis.g2.parqueadero.cliente.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g2.parqueadero.negocio.GestionTicketONRemoto;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.event.ActionEvent;

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
					//window.frame.referenciarONCliente();
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
		frame.setBounds(100, 100, 653, 455);
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
		btnGuardar.addActionListener(new ActionListener() {
			private GestionTicketONRemoto on;


			public void actionPerformed(ActionEvent e) {
				guardarCliente();
			}

			private void guardarCliente() {
				// TODO Auto-generated method stub
				Cliente c = new Cliente();
				c.setDni(txtdni.getText());
				c.setEmail(txtemail.getText());
				c.setNombre(txtNombre.getText());
				c.setTipoDocumento(1);
				
				try {
					on.registrarCliente(c);
					System.out.println("Guardado OK");
				} catch (Exception e) {
					System.out.println("Error al guardar " + e.getMessage());
					e.printStackTrace();
				}
				
			}
		
			
			public void referenciarONCliente() throws Exception{
				try {  
		            final Hashtable<String, Comparable> jndiProperties =  
		                    new Hashtable<String, Comparable>();  
		            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
		                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
		            jndiProperties.put("jboss.naming.client.ejb.context", true);  
		              
		            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
		            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejbremoto");  
		            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb01");  
		              
		            final Context context = new InitialContext(jndiProperties);  
		              
		            final String lookupName = "ejb:/parqueadero/GestionTicketON!ec.ups.edu.appdis.g2.parqueadero.negocio.GestionTicketONRemoto";  
		              
		            this.on = (GestionTicketONRemoto) context.lookup(lookupName);  
		              
		        } catch (Exception ex) {  
		            ex.printStackTrace();  
		            throw ex;  
		        }  
			}

		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(169, 216, 139, 37);
		frame.getContentPane().add(btnGuardar);
	}
}
