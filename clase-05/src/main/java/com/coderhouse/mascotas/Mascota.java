package com.coderhouse.mascotas;

import com.coderhouse.PerroException;

public class Mascota {
	
    private static final int EDAD_MAXIMA = 15;
	
	String mensajeDeError = "La Mascota no vive mas de " + EDAD_MAXIMA + " anos de edad";

	private String nombres;
	private String color;
	private String tamanio;
	private int edad;
	
	
	// Constructor
	public Mascota() {
		this.nombres = nombres;
		this.edad = edad;
		
	}
	
	//Sobrecarga de constructores
	public Mascota(String nombres, String color, String tamanio, int edad) {
		super();
		this.nombres = nombres;
		this.color = color;
		this.tamanio = tamanio;
		this.edad = edad;
	}




	public void caminar() {
		System.out.println("La Mascota " + getNombres() + " esta caminando");
	}
	

	public void comer() {
		System.out.println("La Mascota " + getNombres() +  " esta comiendo en el parque!!! ");
		}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) throws PerroException {
		if(edad > EDAD_MAXIMA) {
			throw new PerroException(mensajeDeError);
		}
		this.edad = edad; 
	}

	@Override
	public String toString() {
		return "Mascota [nombres=" + nombres + ", color="
				+ color + ", tamanio=" + tamanio + ", edad=" + edad + "]";
	}
	
}
