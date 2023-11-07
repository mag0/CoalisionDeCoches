package ar.edu.unlam.pb2;

public class Moto extends Vehiculo{

	private String patente;
	private Integer velocidadMaxima;

	public Moto(String patente, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return this.patente;
	}

	public Integer getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

}
