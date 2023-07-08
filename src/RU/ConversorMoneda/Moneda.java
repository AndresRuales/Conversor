package RU.ConversorMoneda;

abstract class Moneda {
	
	//Atributo de valor para la moneda.
	protected Double valor;
	
	
	
	//Funciones para pasar de COP a la Moneda
	
	public abstract Double deCOPaDolar(Double valor);

	public abstract Double deCOPaEuro(Double valor);
	
	public abstract Double deCOPaLibras(Double valor);

	public abstract Double deCOPaYen(Double valor);
	
	public abstract Double deCOPaWou(Double valor);
	
	
	
	public abstract Double deDolaraCOP(Double valor);

	public abstract Double deEuroaCOP(Double valor);
	
	public abstract Double deLibrasaCOP(Double valor);

	public abstract Double deYenaCOP(Double valor);
	
	public abstract Double deWouaCOP(Double valor);
	
	
	
	
	/*
	public abstract Double deMondeaaCOP();
*/
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
	
	/*
	public Double deCOPaDolar() {
		return null;
	}
*/
	
	

}
