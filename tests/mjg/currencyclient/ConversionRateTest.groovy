package mjg.currencyclient

import net.webservicex.Currency
import spock.lang.Specification

class ConversionRateTest extends Specification {
    ConversionRate cr = new ConversionRate()

    def "same currency should be rate of 1"() {
        when:
        double rate = cr.getConversionRate(Currency.USD, Currency.USD)

        then:
        rate == 1.0
    }

    def "rate from USD to INR is > 1"() {
        expect:
        cr.getConversionRate(Currency.USD, Currency.INR) >= 1 
    }
}
