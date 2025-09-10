package com.coderhouse;

import com.coderhouse.mascotas.Mascota;
import com.coderhouse.mascotas.Perro;

public class Main {

	public static void main(String[] args) throws PerroException {
		
		Perro unPerro = new Perro();
		
		unPerro.setNombres("Firulay");
		unPerro.setColor("baige");
		unPerro.setTamanio("pequeno");
		try {
			unPerro.setEdad(16);
		}catch(PerroException error) {
			System.err.println("error, " + error.getMessage());
		} finally {
			System.out.println("Finalizo la validacion de la PerroException");
		}
		unPerro.setRaza("Electrico");
		
		unPerro.caminar();
		unPerro.comer();
		unPerro.ladrar();
		
		System.out.println(unPerro);
		
		Mascota unaMascota = new Mascota();
		unaMascota.setNombres("Pedro");
		unaMascota.setColor("Blaco");
		unaMascota.setTamanio("Grande");
		unaMascota.setEdad(2);
		
		unaMascota.comer();
		unaMascota.caminar(); 
		
		System.out.println(unPerro);
		
		Mascota nuevaMascota = new Mascota("Rex", "Verde", "Mediano", 7);
		
		nuevaMascota.caminar();
		nuevaMascota.comer();
		

	}

}
