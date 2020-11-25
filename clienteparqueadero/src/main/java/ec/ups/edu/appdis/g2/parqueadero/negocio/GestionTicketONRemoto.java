package ec.ups.edu.appdis.g2.parqueadero.negocio;

import ec.ups.edu.appdis.g2.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g2.parqueadero.modelo.Vehiculo;

public interface GestionTicketONRemoto {

	public boolean registrarCliente (Cliente cliente) throws Exception;
	public boolean registrarVehiculo (Vehiculo vehiculo) throws Exception;
}
