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
						,"De COP a Libras Esterlinas","De COP a Yen Japonés",
						"De COP a Won sul-coreano","De Dolar a COP","De Euros a COP","De Libras a COP"
						,"De Yen Japonés a COP","De Won sul-coreano a COP"};
				
				//Lista de tipo String con las opciones para seleccionar la opcion de convertir
				String[] opcionesMonedas = {"Conversor de Moneda","Conversor de Temperatura"
						,"Relación de velocidades (Engranajes)"};
				
				String[] opcionesTemperatura = {"De Celcius a Fahrenheit","De Celcius a Kelvin",
						"De Fahrenheit a Celcius","De Kelvin a Celcius"};
				
				//Input, con lista desplegable				//Devuelve un tipo Object
				String seleccionconvertir = (String) JOptionPane.showInputDialog(
						null,"Seleccione la opción que requiera: ", "Lista desplegable",JOptionPane.QUESTION_MESSAGE,
						null,opcionesMonedas,opcionesMonedas[0]);	
				//Condicional para cerrar el programa en caso de que el usuario dé click en CANCEL o X
				if (seleccionconvertir == null) {
					break;
				}
				
				/*
				String valorNumeroStr = (String)JOptionPane.showInputDialog(null,"Valor a convertir: ","0");
				if (valorNumeroStr == null) {
					break;
				}
				
				valorNumeroStr = valorNumeroStr.replace(",",".");
				Double numero = Double.parseDouble(valorNumeroStr);*/
				
				//SELECCION CONVERSOR DE MONEDA:	
				if(seleccionconvertir == "Conversor de Moneda") {
					String valorNumeroStr = (String)JOptionPane.showInputDialog(null,"Valor a convertir: ","0");
					if (valorNumeroStr == null) {
						break;
					}
					valorNumeroStr = valorNumeroStr.replace(",",".");
					Double numero = Double.parseDouble(valorNumeroStr);
					
					COP moneda = new COP(numero);
					String seleccionModena = (String) JOptionPane.showInputDialog(
							null,"Seleccione la opción que requiera: ", "Lista desplegable",JOptionPane.QUESTION_MESSAGE,
							null,opcionesConversor,opcionesConversor[0]);
					if (seleccionModena == "De COP a Dolar") {
						String conversion = String.format("%.2f", moneda.deCOPaDolar(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" Dolares");
					} else if (seleccionModena == "De COP a Euros") {
						String conversion = String.format("%.2f", moneda.deCOPaEuro(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" Euros");
					} else if (seleccionModena == "De COP a Libras Esterlinas") {
						String conversion = String.format("%.2f", moneda.deCOPaLibras(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" Libras Esterlinas");
					} else if (seleccionModena == "De COP a Yen Japonés") {
						String conversion = String.format("%.2f", moneda.deCOPaYen(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" Yen Japonés");
					} else if (seleccionModena == "De COP a Won sul-coreano") {
						String conversion = String.format("%.2f", moneda.deCOPaWou(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" Won sul-coreano");
					} 
					
					else if (seleccionModena == "De Dolar a COP") {
						String conversion = String.format("%.2f", moneda.deDolaraCOP(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" COP");
					} else if (seleccionModena == "De Euros a COP") {
						String conversion = String.format("%.2f", moneda.deEuroaCOP(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" COP");
					} else if (seleccionModena == "De Libras a COP") {
						String conversion = String.format("%.2f", moneda.deLibrasaCOP(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" COP");
					} else if (seleccionModena == "De Yen Japonés a COP") {
						String conversion = String.format("%.2f", moneda.deYenaCOP(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" COP");
					} else if (seleccionModena == "De Won sul-coreano a COP") {
						String conversion = String.format("%.2f", moneda.deWouaCOP(moneda.getValor()));
						JOptionPane.showMessageDialog(null, conversion+" COP");
					}
				}
				
				//CONVERSOR DE TEMPERATURA
				if(seleccionconvertir == "Conversor de Temperatura") {
					String valorNumeroStr = (String)JOptionPane.showInputDialog(null,"Valor a convertir: ","0");
					if (valorNumeroStr == null) {
						break;
					}
					valorNumeroStr = valorNumeroStr.replace(",",".");
					Double numero = Double.parseDouble(valorNumeroStr);
					
					Celcius magnitud = new Celcius(numero);
					String seleccionTemperatura = (String) JOptionPane.showInputDialog(
							null,"Seleccione la opción que requiera: ", "Lista desplegable",JOptionPane.QUESTION_MESSAGE,
							null,opcionesTemperatura,opcionesTemperatura[0]);
					
					if(seleccionTemperatura == "De Celcius a Fahrenheit") {
						String conversion = String.format("%.2f", magnitud.deCelciusAFahrenheit(magnitud.getMagnitud()));
						JOptionPane.showMessageDialog(null, conversion+" ºF");
					} else if (seleccionTemperatura == "De Celcius a Kelvin") {
						String conversion = String.format("%.2f", magnitud.deCelciusAKelvin(magnitud.getMagnitud()));
						JOptionPane.showMessageDialog(null, conversion+" ºK");
					} else if (seleccionTemperatura == "De Fahrenheit a Celcius") {
						String conversion = String.format("%.2f", magnitud.deFahrenheitACelcius(magnitud.getMagnitud()));
						JOptionPane.showMessageDialog(null, conversion+" ºC");
					} else if (seleccionTemperatura == "De Kelvin a Celcius") {
						String conversion = String.format("%.2f", magnitud.deKelvinACelcius(magnitud.getMagnitud()));
						JOptionPane.showMessageDialog(null, conversion+" ºC");
					}
				}
				
				//RELACION VELOCIDADES (ENGRANAJES)
				if(seleccionconvertir == "Relación de velocidades (Engranajes)") {
					
					String valorDientes1 = (String)JOptionPane.showInputDialog(null,"Digite el número de dientes del \nengranaje de entrada del movimiento: ","0");
					if (valorDientes1 == null) {
						break;
					}
					valorDientes1 = valorDientes1.replace(",",".");
					Double numero = Double.parseDouble(valorDientes1);
					
					String valorDientes2 = (String)JOptionPane.showInputDialog(null,"Digite el número de dientes \ndel engranaje conducido: ","0");
					if (valorDientes2 == null) {
						break;
					}
					valorDientes2 = valorDientes2.replace(",",".");
					Double numero2 = Double.parseDouble(valorDientes2);

					Engranajes dientes1 = new Engranajes(numero);
					Engranajes dientes2 = new Engranajes(numero2);

					String relacionVelocidad = String.format("%.2f", dientes1.calculoVelocidad(dientes1.getDientes(),dientes2.getDientes()));
					JOptionPane.showMessageDialog(null, "Mientras el engranaje motriz gira "+relacionVelocidad+" veces, \nel engranaje conducido gira 1 vez.");
					
				}

				int cerrar=JOptionPane.showConfirmDialog(null, "¿Cerrar el programa?");
				
				if (cerrar ==1) {
					reiniciar=true;
				} else if (cerrar ==2){
					reiniciar=false;
				}else {
					reiniciar = false;
				}
				
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "El valor no es un número, digite un número. \nEl programa se reiniciará.","Error",JOptionPane.ERROR_MESSAGE);
				
			}

		}

	}

}
