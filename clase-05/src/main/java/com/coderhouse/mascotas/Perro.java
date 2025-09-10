package com.coderhouse.mascotas;

public class Perro extends Mascota {
	
	private String raza;
	
	public void ladrar(){
		System.out.println("El perro " + getNombres() + " esta ladrando");
	}
	@Override  // sobreescribir --> polimorfismo
	public void caminar(){
		System.out.println("El perro " + getNombres() + " caminando en el paruqe!!!");
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}


}
