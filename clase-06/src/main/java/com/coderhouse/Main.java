package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Gato;
import com.coderhouse.entidades.Perro;
import com.coderhouse.interfaces.SerVivoInterface;

public class Main {

	public static void main(String[] args) {
		
		Perro miPerro = new Perro();
		
		miPerro.setNombre("Lucho");
		miPerro.setEdad(10);
		miPerro.setRaza("Caniche");
		miPerro.setVivo(true);
		
		
		miPerro.comer();
		miPerro.emitirSonido();
		miPerro.estaVivo();
		miPerro.comer();
		miPerro.dormir();
		miPerro.jugar();
		miPerro.respirar();
		System.out.println("El Perro " + miPerro.getNombre() + " esta vivo? " + miPerro.estaVivo());
		
		System.out.println(miPerro);
		
		Gato miGato = new Gato();
		
		miGato.setNombre("Michi");
		miGato.comer();
		miGato.emitirSonido();
		miGato.estaVivo();
		miGato.comer();
		miGato.setRaza("Electrico");
		miGato.setEdad(2);
		miGato.dormir();
		miGato.jugar();
		
		System.out.println(miGato);
		
		Ave miAve = new Ave();
		
		miAve.comer();
		miAve.emitirSonido();
		miAve.estaVivo();
		miAve.setNombre("Tweeter");
		miAve.moverse();
	
		

		Auto miAuto = new Auto();
		
		miAuto.setMarca("Cadillac");
		miAuto.setModelo("F1");
		miAuto.setRuedas(4);
		miAuto.setColor("Rojo");
		miAuto.mostrarCantidadDeRuedas();
		System.out.println(miAuto);
		
		
		System.out.println("La ubicaion de " + miPerro.getNombre() + " es en " + SerVivoInterface.UBICACION);
		
	}

}
