package com.coderhouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Clase03 {

	public static void main(String[] args) {
		
		int[] numerosEnteros  = new int[6];
		
		numerosEnteros[0] = 10; // estoy guardando en la pocision 0 el numero 10.
		
		numerosEnteros[1] = 5;
		numerosEnteros[2] = 3;
		numerosEnteros[3] = 12;
		numerosEnteros[4] = 9;
		numerosEnteros[5] = 8;
		
		System.out.println("Posicion de memoria " + numerosEnteros);
		System.out.println("El array numeroEnteros tiene: " + numerosEnteros.length + " Elementos");
		
		System.out.println("El elemento con indice 0 es: " + numerosEnteros[0]);
		System.out.println("El elemento con indice 1 es: " + numerosEnteros[1]);
		System.out.println("El elemento con indice 2 es: " + numerosEnteros[2]);
		System.out.println("El elemento con indice 3 es: " + numerosEnteros[3]);
		System.out.println("El elemento con indice 4 es: " + numerosEnteros[4]);
		System.out.println("El elemento con indice 5 es: " + numerosEnteros[5]);
		
		System.out.println(Arrays.toString(numerosEnteros));
		
		String[] palabras = {
				"Hola",
				"Mundo",
				"Coder",
				"Java",
				"Johnny"
		};
		
		System.out.println("El Array palabras tiene " + palabras.length + " Elementos");
		
		System.out.println(Arrays.toString(palabras));
		
		
		// Listas
		
		List<String> listaDeNombres = new ArrayList<>();
		List<String> listaDeNombres2 = new ArrayList<>();
		
		listaDeNombres.add("Alejandro");
		listaDeNombres.add("Roberto");
		listaDeNombres.add("Sara");
		listaDeNombres.add("Marcelo");
		
		
		listaDeNombres2.add("Hola");
		listaDeNombres2.add("prima");
		
		
		listaDeNombres.addAll(listaDeNombres2);
		
		System.out.println("La lsita listaDeNombres contiene a listaDeNombres2 " + listaDeNombres.containsAll(listaDeNombres2));
		
		listaDeNombres.removeAll(listaDeNombres2);
		
		listaDeNombres.remove(3);
		
		System.out.println("La lista listaDeNombres tiene " + listaDeNombres.size());
		
		System.out.println("La lsita listaDeNombres contiene a listaDeNombres2 " + listaDeNombres.containsAll(listaDeNombres2));
		
		for (String nombre : listaDeNombres) {
			System.out.println("Nombre : " + nombre);
		}
		
		for(int i = 0; i < listaDeNombres.size(); i++) {
			System.out.println("Nombres: " + listaDeNombres.get(i));
		}
		
		listaDeNombres.removeAll(listaDeNombres);/// vacia nombres de una lista adentro de otra lista
		listaDeNombres.clear();/// vaciar lista
		
		System.out.println(listaDeNombres.isEmpty());
		
		if(listaDeNombres.isEmpty()) {
			System.out.println("La lista Esta vacia");
		} else {
			System.out.println(listaDeNombres);
		}
		
//		
//		int posicion = 4;
//		System.out.println("El elemento con la posicion Nro " + posicion + " es: " 
//				+ listaDeNombres.get(posicion)); 
//		
//		listaDeNombres.set(posicion, "Sara");
//		System.out.println(listaDeNombres);
//		System.out.println("El elemento con la posicion Nro " + posicion + " es: " 
//				+ listaDeNombres.get(posicion));
//		
//		String nombre = "Sara";
//		
//		System.out.println("El indice del nombre " + nombre + " es: " 
//							+ listaDeNombres.indexOf(nombre));

		List<String> listaDeNombres3 = new ArrayList<>();

		listaDeNombres3.add("Alejandro"); // 0
		listaDeNombres3.add("Roberto"); // 1
		listaDeNombres3.add("Sara"); // 2
		listaDeNombres3.add("Marcelo"); // 3
		listaDeNombres3.add("Nicolas"); // 4

		Iterator<String> iterator = listaDeNombres.iterator();
//		
//		// Ciclos por condicion
		while(iterator.hasNext()){// Existe un elementos siguiente??
			String nombre = iterator.next(); // Si exite lo asigna a la variable
			System.out.println("Nombress : " + nombre);
			iterator.remove();
	}

	do {
			System.out.println("Al menos 1 vez");
		} while (false);
		
		listaDeNombres3.forEach(nombre -> {
			System.out.println("Nombre : " + nombre);
		});
		
		
		
		
		
	}

}
