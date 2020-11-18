package ec.ups.edu.appdis.g2.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g2.parqueadero.modelo.Factura;

@Stateless
public class FacturaDAO {
	
	@Inject
	private Connection con;
	
	public boolean insert (Factura entity) throws SQLException {
		
		String sql = "INSERT INTO Factura (numero, fechaEmision, valorTotal, ticket, cliente )"
				+ "VALUES(?, ?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getNumero());
		ps.setDate(2, (Date)entity.getFechaEmision());
		ps.setDouble(3, entity.getValorTotal());
		ps.setObject(4, entity.getTicket());
		ps.setObject(5, entity.getCliente());
		
		ps.execute();
		ps.close();
		
		return true;
	}
	public boolean update (Factura entify) {
		return true;
	}
	public Factura read (int id) {
		return null;
	}
	public boolean delete (int id) {
		return true;
	}
}
