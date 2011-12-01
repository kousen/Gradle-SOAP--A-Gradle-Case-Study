package mjg.currencyclient;

import net.webservicex.Currency;

public class Money {
	private double amount;
	private Currency denomination;
	private ConversionRate converter = new ConversionRate();
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setDenomination(Currency denomination) {
		this.denomination = denomination;
	}
	
	public Currency getDenomination() {
		return denomination;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", denomination=" + denomination
				+ "]";
	}
	
	public Money plus(Money m) {
		Money money = new Money();
		double rate = converter.getConversionRate(m.denomination, denomination);
		money.setAmount(amount + rate*m.amount);
		money.setDenomination(denomination);
		return money;
	}
}
