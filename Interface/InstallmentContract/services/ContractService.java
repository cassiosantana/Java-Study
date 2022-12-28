package services;

import java.util.Calendar;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double installmentBaseValue = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);

			double interest = onlinePaymentService.interest(installmentBaseValue, i);
			double paymentFee = onlinePaymentService.paymentFee(installmentBaseValue + interest);
			double installmentAmount = installmentBaseValue + interest + paymentFee;
			contract.getInstallmentList().add(new Installment(cal.getTime(), installmentAmount));
		}
	}
}