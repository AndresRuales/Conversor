package RU.ConversorMoneda;

public class Celcius extends Temperaturas{
	

	public Celcius (Double magnitud) {
		this.magnitud = magnitud;
	}
	
	
	@Override
	public Double deCelciusAFahrenheit(Double valor) {
		// TODO Auto-generated method stub
		return valor*1.8+32;
	}
	
	@Override
	public Double deCelciusAKelvin(Double valor) {
		// TODO Auto-generated method stub
		return valor+273.15;
	}
	
	@Override
	public Double deFahrenheitACelcius(Double valor) {
		// TODO Auto-generated method stub
		return (valor-32)/1.8;
	}
	 
	@Override
	public Double deKelvinACelcius(Double valor) {
		// TODO Auto-generated method stub
		return valor-273.15;
	}
	
	


}
