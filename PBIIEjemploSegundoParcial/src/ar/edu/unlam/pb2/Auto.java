package ar.edu.unlam.pb2;

public class Auto extends Vehiculo{

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return this.patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return this.cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

}
