package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

	private LocalDate data;
	private Double valor;

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy)");

	public Parcela() {
	}

	public Parcela(LocalDate dataVencimento, Double valor) {
		this.data = dataVencimento;
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate dataVencimento) {
		this.data = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return data.format(dtf) 
				+ " - " 
				+ String.format("%.2f", valor);
	}

}
