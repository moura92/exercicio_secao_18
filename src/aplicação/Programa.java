package aplicação;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contratos;
import entidades.Parcela;
import entidades.serviço.ContratoServiço;
import entidades.serviço.Paypal;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();

		Contratos contrato = new Contratos(numero, data, valorContrato);

		System.out.print("Digite o numero de parcelas: ");
		int numeroParcelas = sc.nextInt();

		ContratoServiço contratoServiço = new ContratoServiço(new Paypal());

		contratoServiço.processoContrato(contrato, numeroParcelas);

		System.out.println("Parcelas:");

		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		sc.close();
	}

}
