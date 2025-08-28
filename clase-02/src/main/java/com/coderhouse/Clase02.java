/**
 * 
 */
package com.coderhouse;

/**
 * 
 */
public class Clase02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numeroA = 1;
		int numeroB = 2;
		
		if(numeroA > numeroB) {
			System.out.println("El numero " + numeroA + " es mayor que numero " + numeroB );
		} else {
			System.out.println("El numero " + numeroB + " es mayor que numero " + numeroA );
		}
		
		System.out.println("si llegamos aqui es por el se ejecuto el if");
		
		// Calculadora
		
		float numeroAA = 1.5f;
		float numeroBB = 5.0f;
		
		float resultado = numeroAA / numeroBB;
		
		if (numeroBB != 0) {
			System.out.println("El resultado es: " + resultado);
		} else {
			System.err.println("Error, No se puede dividir por cero.!");
		}
		
		// 2
		
		int ingreseUnNumero = 2;
		
		if (ingreseUnNumero > 0) {
			System.out.println("El Numero Ingresado es Positivo");
		} else if (ingreseUnNumero < 0){
			System.out.println("El Numero Ingresado es Negativo");
		} else if (ingreseUnNumero == 0) {
			System.out.println("El Numero Ingresado es Cero.!");
		} else {
			System.out.println("El dato ingresado no es un numero");
		}
		
		/// Dia de la semana
		
		int diaDeLaSemana = 7;
		
		if (diaDeLaSemana == 1) {
			System.out.println("Hoy es Lunes");
		} else if(diaDeLaSemana == 2) {
			System.out.println("Hoy es martes");
		} else if(diaDeLaSemana == 3) {
			System.out.println("Hoy es miercoles");
		} else if(diaDeLaSemana == 4) {
			System.out.println("Hoy es jueves");
		} else if(diaDeLaSemana == 5) {
			System.out.println("Hoy es viernes");
		} else if(diaDeLaSemana == 6) {
			System.out.println("Hoy es sabado");
		} else if(diaDeLaSemana == 7) {
			System.out.println("Hoy es Domingo");
		} else {
			System.err.println("El Dia Ingresado es Incorrecto.!");
		}
		
		/// Edad
		
		int ingreseSuEdad = 18;
		
		if (ingreseSuEdad >= 18 && ingreseSuEdad <= 100) {
			System.out.println("Usted puede ingresar.!!");
		} else if (ingreseSuEdad > 0 && ingreseSuEdad <18){
			System.out.println("Usted. es menor de Edad y no puede ingresar.");
		} else {
			System.out.println("Usted ingreso una Edad incorrecta.");
		}
		
		int diaDeLaSemana2 = 31;
		String nombredelDiaDeLaSemana = null;
		
		switch(diaDeLaSemana2) {
		
		case 1:
			nombredelDiaDeLaSemana = "Lunes";
			break;
		case 2:
			nombredelDiaDeLaSemana = "Martes";
			break;
		case 3:
			nombredelDiaDeLaSemana = "Miercoles";
			break;	
		case 4:
			nombredelDiaDeLaSemana = "Jueves";
			break;
		case 5:
			nombredelDiaDeLaSemana = "Viernes";
			break;
		case 6:
			nombredelDiaDeLaSemana = "Sabado";
			break;
		case 7:
			nombredelDiaDeLaSemana = "Domingo";
			break;	
		default:
			nombredelDiaDeLaSemana = "Dia Incorrecto";
		}
		System.out.println("El dia de la semana es " + diaDeLaSemana2 + " el " + nombredelDiaDeLaSemana);
		
		
		String dia = "MARTESs";
		
		switch(dia.toLowerCase()) {  //Lo convierte en minuscula
		case "lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;	
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;	
		default:
			System.err.println("Ingrese un dia correcto");	
		}
		
		// Operador Ternario
		
		int numeroC = 1;
		int numeroD = 2;
		
		boolean condicion = numeroC > numeroD;
		
		boolean resultado2 = condicion ? true : false;
		
		String resultado3 = condicion ? "El numero " + numeroC + " es menor que " + numeroD : "El numero " + numeroC + " Es menor que " + numeroD;
		
		
		System.out.println(resultado3);
		
		/// Datos Aleatorios
		
		double randon = 0.0d;
		int randon2 = 0;
		
		randon = Math.random();
		
		System.out.println(randon);
		
		int minimo = 1;
		int maximo = 100;
		
		int rango = maximo - minimo + 1;
		randon2 = ( int ) (Math.random() * rango) + minimo;
		System.out.println(randon2);
		
	}

}
