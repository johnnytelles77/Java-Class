package com.coderhouse;

public class Clase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Coder!!!");
		
		char espacio = ' ';
		
		//Declaracion de variables
		int variableA = 1000;
		double variableConDecimales = 16367474.50d;
		char miPrimerChar = 'N';
		
		String miSegundoChar = "Mi primer String";
		
		boolean verdadero = false;
		
		long numeroLargo = 1236474769383l;
		
		System.out.println(miSegundoChar);
		
		System.out.println(miSegundoChar + espacio + numeroLargo);
		
		int numeroUno = 123;
		int numeroDos = 456;
		
		double resultado = numeroUno + numeroDos;
		
		System.out.println(resultado);
		
		// Incrementar
		int contador = 0; //Definiendo variable e inicializandola (Azignandole un valor)
		System.out.println(contador);
		contador = 1;
		System.out.println(contador);
		contador = contador; ///se reasigna a si mismo, o sea que vale lo que valia antes
		System.out.println(contador);
		contador = contador + 1;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		
		
		int numeroA = 10;
		int numeroB = 10;
		
		System.out.println(numeroA == numeroB);
		
		final int NUMERO_CONSTANTE = 10000;
		System.out.println(NUMERO_CONSTANTE); /// nose les puede cambiar el valor remueve final para que si.

	}

}
