package ec.ups.edu.appdis.g2.parqueadero.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g2.parqueadero.dao.FacturaDAO;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Factura;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Ticket;

@Stateless
public class GestionFacturaON {
	
	@Inject
	private FacturaDAO daoFactura;
	
	public boolean registrarFactura(Factura factura) {
		try {
			daoFactura.insert(factura);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
