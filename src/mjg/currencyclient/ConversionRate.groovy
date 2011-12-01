package mjg.currencyclient

import net.webservicex.Currency
import net.webservicex.CurrencyConvertor 
import net.webservicex.CurrencyConvertorSoap 

class ConversionRate {
    CurrencyConvertorSoap stub = new CurrencyConvertor().getCurrencyConvertorSoap()

    double getConversionRate(Currency from, Currency to) {
        return from == to ? 1.0 : stub.conversionRate(from, to)
    }
}
