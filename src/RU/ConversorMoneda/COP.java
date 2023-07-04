package RU.ConversorMoneda;

public class COP extends Moneda{
	
	public COP(Double valor) {
		this.valor=valor;
	}

	@Override
	public Double deCOPaDolar(Double valor) {
		// TODO Auto-generated method stub
		return valor/4166;
	}

	@Override
	public Double deCOPaEuro(Double valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double deCOPaLibras(Double valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double deCOPaYen(Double valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double deCOPaWou(Double valor) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
