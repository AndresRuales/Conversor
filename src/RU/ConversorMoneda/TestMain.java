package RU.ConversorMoneda;

import java.util.Scanner;

public class TestMain {
	
	/*- Convertir de la moneda de tu país a Dólar
    - Convertir de la moneda de tu país  a Euros
    - Convertir de la moneda de tu país  a Libras Esterlinas
    - Convertir de la moneda de tu país  a Yen Japonés
    - Convertir de la moneda de tu país  a Won sul-coreano
	*/
	
	public static void main(String[] args) {
		
		//BORRADOR DE COMO FUNCIONARÍA NUESTRO CONVERSOR
		
		//Se crea objeto de tipo Scanner que guarda la moneda del usuario
		Scanner entradaMoneda = new Scanner(System.in);
		
		//Solicita al usuario texto.
		System.out.println("Ingrese el valor de la moneda a convertir: ");
		Float moneda = entradaMoneda.nextFloat();
		
		System.out.println("Digito de moneda ingresada: "+moneda);

		
		//Se cierra el objeto moneda para  liberar los 
			//	recursos asociados a la entrada estándar del sistema.
		entradaMoneda.close();
		
		System.out.println("Fin del programa");
	}

}
