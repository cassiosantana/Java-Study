package application;

import java.util.Date;
import java.util.Locale;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Contract contract = new Contract(8028, new Date(), 600.00);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, 3);

		System.out.println("Installments:");
		for (Installment i : contract.getInstallmentList()) {
			System.out.println(i);
		}
	}
}