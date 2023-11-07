package ar.edu.unlam.pb2;

import java.util.Set;import java.util.HashSet;

public class Mapa {

	private String nombre;
	private Set<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new HashSet<>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCantidadDeVehiculos() {
		// TODO Auto-generated method stub
		return vehiculos.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		Integer posicionVehiculo1 = 1;
		Integer posicionVehiculo2 = 1;
		for (Vehiculo vehiculo : vehiculos) {
			for (Vehiculo vehiculo2 : vehiculos) {
				if(posicionVehiculo1!=posicionVehiculo2 && mismasCoordenadas(vehiculo, vehiculo2)) {
					throw new ColitionException("Hay Colision entre: "+vehiculo + " y "+vehiculo2);
				}
				++posicionVehiculo2;
			}
			posicionVehiculo2 = 1;
			++posicionVehiculo1;
		}
		return false;
	}
	
	public Boolean mismasCoordenadas(Vehiculo vehiculo1,Vehiculo vehiculo2) {
		if(vehiculo1.getLatitud().equals(vehiculo2.getLatitud())&&vehiculo1.getLongitud().equals(vehiculo2.getLongitud()))
			return true;
		return false;
	}

}
