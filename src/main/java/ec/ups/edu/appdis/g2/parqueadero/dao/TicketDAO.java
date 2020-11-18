package ec.ups.edu.appdis.g2.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g2.parqueadero.modelo.Ticket;

@Stateless
public class TicketDAO {
	
	@Inject
	private Connection con;
	public boolean insert (Ticket entity) {
		String sql = "INSERT INTO Cliente (codigo, fechaIngreso, fechaSalida, tiempo, valor, vehiculo)"
				+ " VALUES(?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getCodigo());
		ps.setDate(2, (java.sql.Date) entity.getFechaIngreso());
		ps.setDate(3, entity.getFechaSalida());
		ps.setInt(4, entity.getTiempo());
		ps.setDouble(5, entity.getValor());
		ps.setObject(4, entity.getVehiculo());
		
		ps.executeUpdate();
		ps.close();
		
		return true;
	}
	public boolean update (Ticket entify) {
		return true;
	}
	public Ticket read (int id) {
		return null;
	}
	public boolean delete (int id) {
		return true;
	}
}
