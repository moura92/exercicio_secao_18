package entidades;

public class Prestação {

	private Double dataVencimento;
	private Double valor;

	public Prestação() {
	}

	public Prestação(Double dataVencimento, Double valor) {
		super();
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Double getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Double dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
