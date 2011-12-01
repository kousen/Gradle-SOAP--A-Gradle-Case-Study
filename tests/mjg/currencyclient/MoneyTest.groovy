package mjg.currencyclient

import mjg.currencyclient.Money;
import net.webservicex.Currency;
import spock.lang.Specification;

class MoneyTest extends Specification {
	Money m1 = new Money(amount:1,denomination:Currency.USD)
	Money m2 = new Money(amount:2,denomination:Currency.USD)
	Money m3 = new Money(amount:1,denomination:Currency.INR)
	
	def "adding same currency should add amounts"() {
		when:
		Money sum = m1 + m2
		
		then:
		sum.amount == m1.amount + m2.amount
		sum.denomination == m1.denomination
	}
	
	def "adding different currencies should convert both to first denom"() {
		when:
		Money sum = m3 + m1
		
		then:
		sum.denomination == m3.denomination
		println sum
	}
	
}
