package entidades.serviço;

import java.time.LocalDate;

import entidades.Contratos;
import entidades.Parcela;

public class ContratoServiço {

	private PagamentoOnline pagamentoOnline;

	public ContratoServiço(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	public void processoContrato(Contratos contrato, int meses) {

		double parcelaBasica = contrato.getValorTotal() / meses;

		for (int i = 1; i <= meses; i++) {
			LocalDate dataVencimento = contrato.getData().plusMonths(i); // plusMonths() = acrescenta mais uma mes na
																			// datas seguintes.

			double juro = pagamentoOnline.juros(parcelaBasica, i);
			double taxa = pagamentoOnline.taxaPagamento(parcelaBasica + juro);
			double quota = parcelaBasica + juro + taxa;

			contrato.getParcelas().add(new Parcela(dataVencimento, quota));
		}
	}
}
