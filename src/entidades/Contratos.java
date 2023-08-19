package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contratos {

	private Integer numero;
	private Date data;

	private List<Prestação> prestação = new ArrayList<>();

	public Contratos() {
	}

	public Contratos(Integer numero, Date data, List<Prestação> prestação) {
		this.numero = numero;
		this.data = data;
		this.prestação = prestação;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Prestação> getPrestação() {
		return prestação;
	}

	public void setPrestação(List<Prestação> prestação) {
		this.prestação = prestação;
	}

	public Double valorTotal() {
		return null;
	}
}
