package RU.ConversorMoneda;

public class COP extends Moneda{
	
	//Valor de las monedas al dia de hoy 1000 COP = ......
	
	private Double dolar = 4195.73;
	private Double euro = 4604.62;
	private Double libras = 5386.68;
	private Double yen = 29.52;
	private Double wou = 3.23;
	
	
	public COP(Double valor) {
		this.valor=valor;
	}

	@Override
	public Double deCOPaDolar(Double valor) {
		// TODO Auto-generated method stub
		return valor/dolar;
	}

	@Override
	public Double deCOPaEuro(Double valor) {
		// TODO Auto-generated method stub
		return valor/euro;
	}

	@Override
	public Double deCOPaLibras(Double valor) {
		// TODO Auto-generated method stub
		return valor/libras;
	}

	@Override
	public Double deCOPaYen(Double valor) {
		// TODO Auto-generated method stub
		return valor/yen;
	}

	@Override
	public Double deCOPaWou(Double valor) {
		// TODO Auto-generated method stub
		return valor/wou;
	}
	
	
	

	@Override
	public Double deDolaraCOP(Double valor) {
		// TODO Auto-generated method stub
		return valor*dolar;
	}

	@Override
	public Double deEuroaCOP(Double valor) {
		// TODO Auto-generated method stub
		return valor*euro;
	}

	@Override
	public Double deLibrasaCOP(Double valor) {
		// TODO Auto-generated method stub
		return valor*libras;
	}

	@Override
	public Double deYenaCOP(Double valor) {
		// TODO Auto-generated method stub
		return valor*yen;
	}

	@Override
	public Double deWouaCOP(Double valor) {
		// TODO Auto-generated method stub
		return valor*wou;
	}
	

	

}
