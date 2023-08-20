package entidades.serviço;

public interface PagamentoOnline {

	double taxaPagamento(Double valor);

	double juros(Double valor, Integer meses);
}
