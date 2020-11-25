package ec.ups.edu.appdis.g2.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g2.parqueadero.modelo.Vehiculo;

@Stateless
public class VehiculoDAO {
	
	@Inject
	private Connection con;
	
	public boolean insert (Vehiculo entity) throws SQLException {
		
		String sql = "INSERT INTO Vehiculo (color, marca, placa)"
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getColor());
		ps.setInt(2, entity.getMarca());
		ps.setString(3, entity.getPlaca());
		
		ps.executeUpdate();
		ps.close();
		
		return true;
	}
	public boolean update (Vehiculo entify) {
		return true;
	}
	public Vehiculo read (int id) {
		return null;
	}
	public boolean delete (int id) {
		return true;
	}
}
