package services;

public class BrazilInterestService implements InterestService {

	private static final Double INTEREST_RATE = 2.0;
	
	@Override
	public double getInterestRate() {
		return INTEREST_RATE;
	}
}