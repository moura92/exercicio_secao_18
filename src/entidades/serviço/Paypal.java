package entidades.serviço;

public class Paypal implements PagamentoOnline {

	public double taxaPagamento(Double valor) {
		return valor * 0.02;
	}

	public double juros(Double valor, Integer meses) {
		return valor * 0.01 * meses;
	}
}
