package RU.ConversorMoneda;

public class COP extends Moneda{
	
	public COP(Double valor) {
		this.valor=valor;
	}

	@Override
	public Double deCOPaDolar(Double valor) {
		// TODO Auto-generated method stub
		return valor/4195.73;
	}

	@Override
	public Double deCOPaEuro(Double valor) {
		// TODO Auto-generated method stub
		return valor/4604.62;
	}

	@Override
	public Double deCOPaLibras(Double valor) {
		// TODO Auto-generated method stub
		return valor/5386.68;
	}

	@Override
	public Double deCOPaYen(Double valor) {
		// TODO Auto-generated method stub
		return valor/29.52;
	}

	@Override
	public Double deCOPaWou(Double valor) {
		// TODO Auto-generated method stub
		return valor/3.23;
	}
	

	

}
