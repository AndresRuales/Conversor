package RU.ConversorMoneda;

import javax.swing.JOptionPane;

public class TestMain {
	/*- Convertir de la moneda de tu país a Dólar
    - Convertir de la moneda de tu país  a Euros
    - Convertir de la moneda de tu país  a Libras Esterlinas
    - Convertir de la moneda de tu país  a Yen Japonés
    - Convertir de la moneda de tu país  a Won sul-coreano
    
    - Convertir de Dólar a la moneda de tu país
        - Convertir de Euros a la moneda de tu país
        - Convertir de Libras Esterlinas a la moneda de tu país
        - Convertir de Yen Japonés a la moneda de tu país
        - Convertir de Won sul-coreano a la moneda de tu país
	*/
	
	public static void main(String[] args) {
		
		//BORRADOR DE COMO FUNCIONARÍA NUESTRO CONVERSOR
		boolean reiniciar = true;
		//CICLO INFINITO PARA REPETIR EL CODIGO HASTA QUE LE USUARIO LO DECIDA CERRAR
		while (reiniciar) {
			try {
				//Lista de tipo String con las opciones para convertir los COP a otra moneda
				String[] opcionesConversor = {"De COP a Dolar","De COP a Euros"
						,"De COP a Libras Esterlinas","De COP a Yen Japonés","De COP a Won sul-coreano"};
				
				//Lista de tipo String con las opciones para seleccionar la opcion de convertir
				String[] opcionesMonedas = {"Conversor de Moneda","Conversor de Temperatura"
						,"Relación de velocidades (Engranajes)"};
				
				//Input, con lista desplegable				//Devuelve un tipo Object
				String seleccionconvertir = (String) JOptionPane.showInputDialog(
						null,"Seleccione la opción que requiera: ", "Lista desplegable",JOptionPane.QUESTION_MESSAGE,
						null,opcionesMonedas,opcionesMonedas[0]);	
				//Condicional para cerrar el programa en caso de que el usuario dé click en CANCEL o X
				if (seleccionconvertir == null) {
					break;
				}
				
				
				String valorNumeroStr = (String)JOptionPane.showInputDialog(null,"Valor a convertir: ","0");
				if (valorNumeroStr == null) {
					break;
				}
				
				valorNumeroStr = valorNumeroStr.replace(",",".");
				
				
				Double numero = Double.parseDouble(valorNumeroStr);
				COP moneda = new COP(numero);
		
				//SELECCION CONVERSOR DE MONEDA:	
				if(seleccionconvertir == "Conversor de Moneda") {
					
					String seleccionModena = (String) JOptionPane.showInputDialog(
							null,"Seleccione la opción que requiera: ", "Lista desplegable",JOptionPane.QUESTION_MESSAGE,
							null,opcionesConversor,opcionesConversor[0]);
					
					if (seleccionModena == "De COP a Dolar") {
						
						String conversion = String.format("%.2f", moneda.deCOPaDolar(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" Dolares");
					}
					
				}
				
				int cerrar=JOptionPane.showConfirmDialog(null, "¿Cerrar el programa?");
				
				if (cerrar ==1) {
					reiniciar=true;
				} else if (cerrar ==2){
					reiniciar=true;
				}else {
					reiniciar = false;
				}
				
				
				
				

			}catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "El valor no es un número, digite un número.","Error",JOptionPane.ERROR_MESSAGE);
			}

		}

	}

}
