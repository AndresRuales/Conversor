package RU.ConversorMoneda;

abstract class Temperaturas {
	//Atributo de valor para la moneda.
		protected Double magnitud;
		
		
		
		//Funciones para pasar de COP a la Moneda
		
		public abstract Double deCelciusAFahrenheit(Double valor);

		public abstract Double deCelciusAKelvin(Double valor);
		
		
		
		public abstract Double deFahrenheitACelcius(Double valor);

		public abstract Double deKelvinACelcius(Double valor);
		

		public Double getMagnitud() {
			return magnitud;
		}

		public void setMagnitud(Double magnitud) {
			this.magnitud = magnitud;
		}
		
		
		
		
	
}
