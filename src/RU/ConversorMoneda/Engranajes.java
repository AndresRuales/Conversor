package RU.ConversorMoneda;

public class Engranajes {
	
	private Double dientes;
	
	
	public Engranajes(Double dientes) {
		this.dientes=dientes;
	}
	
	public Double getDientes() {
		return dientes;
	}

	public void setDientes(Double dientes) {
		this.dientes = dientes;
	}
	
	
	public Double calculoVelocidad (Double dientes1, Double dientes2) {
		return dientes1/dientes2;
	}
	
	

}
