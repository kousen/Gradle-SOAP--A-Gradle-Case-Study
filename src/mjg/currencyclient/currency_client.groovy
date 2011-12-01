package mjg.currencyclient

import net.webservicex.Currency
import net.webservicex.CurrencyConvertor
import net.webservicex.CurrencyConvertorSoap

CurrencyConvertorSoap stub = new CurrencyConvertor().getCurrencyConvertorSoap()
double USD2INR = stub.conversionRate(Currency.USD, Currency.INR)
double USD2CAD = stub.conversionRate(Currency.USD, Currency.CAD)
println "USD->INR = $USD2INR"
println "USD->CAD = $USD2CAD"