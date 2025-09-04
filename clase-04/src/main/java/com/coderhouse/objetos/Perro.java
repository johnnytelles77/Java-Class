package com.coderhouse.objetos;

public class Perro {
	
	//Definir una constante estatica
	private static final int EDAD_MAXIMA = 15;
	
	String mensajeDeError = "El peroo no vive mas de " + EDAD_MAXIMA + " anos de edad";
	
	// Variables de instancia o Atributos del objeto
	private String nombres;
	private String raza;
	private String color;
	private String tamanio;
	private int edad;
	
	// Metodos
	public void ladrar() {
		System.out.println("El peroo esta ladrando");
	}
	
	public void caminar() {
		System.out.println("El peroo esta caminando");
	}
	
	public void comer() {
		System.out.println("El peroo esta comiendo");
		}
	
	// Getters and Setters

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if(edad > EDAD_MAXIMA) {
			throw new Exception(mensajeDeError);
		} else {
		this.edad = edad; 
	}}

	@Override
	public String toString() {
		return "Perro [nombres=" + nombres + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", edad="
				+ edad + "]";
	}
	
	
	


}
