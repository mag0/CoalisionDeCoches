package ar.edu.unlam.pb2;

public class Vehiculo {
	private Double latitud;
	private Double longitud;

	public Vehiculo(Double latitud,
			Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return this.latitud;
	}

	public Double getLongitud() {
		return this.longitud;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
		
	}
}
