package ec.ups.edu.appdis.g2.parqueadero.modelo;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	private int color;
	private int marca;
	private String placa;
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getMarca() {
		return marca;
	}
	public void setMarca(int marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
