package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		
		Perro primerPerro = new Perro();
		
		primerPerro.setNombres("Firulais");
		primerPerro.setColor("Gris");
		primerPerro.setRaza("Electrico");
		primerPerro.setTamanio("Chico");
		primerPerro.setEdad(11);
		
		System.out.println(primerPerro.getNombres());
		System.out.println(primerPerro.getEdad());
		System.out.println(primerPerro.getColor());
		System.out.println(primerPerro.getRaza());
		
		String[] nombres = new String[] {
				"Gabriel",
				"Mateo",
				"Johnny",
				"Daniel"
			};
		int radio = 3;  // variable local dentro del main
		impirmiListaDeNombres(nombres);
		System.out.println("Area del circulo con radio " + radio + " cm, es de " + calcularAreaDelCirculo(radio));
		
	}

	
	private static void impirmiListaDeNombres(String[] nombreDePersonas) {
		for(String nombre : nombreDePersonas) {
			System.out.println("Nombre: " + nombre);
		}
	}

	static final double PI;
	
	
	static {
		PI = 3.141592653589793;
	}
	
	private static double calcularAreaDelCirculo(int radio) {
		return PI * Math.pow(radio, 2);
	}
	
}
