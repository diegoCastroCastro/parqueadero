package ec.ups.edu.appdis.g2.parqueadero.negocio;

import ec.ups.edu.appdis.g2.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Factura;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Ticket;

public class GestionFacturaON {
	
	public boolean registrarFactura(Factura factura) {
		return true;
	}
	
	public double calcularValorTotal(double valorTotal) {
		return 0;
	}
	
	public Cliente buscarCliente(String dni) {
		return null;
	}
	
	public Ticket buscarTicket(int codigo) {
		return null;
	}

}
