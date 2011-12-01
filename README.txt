Source code for the article "Gradle SOAP: A Gradle Case Study", in the
December 2011 issue of Java Technical Journal.

The gradle build file contains a wsimport task that generates the stubs
necessary to access the Currency Convertor (spelled incorrectly in the
service itself) at the Microsoft site, 
http://www.webservicex.net/CurrencyConvertor.asmx .

To build the code and run the tests, execute:

> gradlew build

The gradlew script was generated from the build file based on 
Gradle version 1.0-milestone-6.

In addition to all the code from the article, the source also contains
a Money class in Java that implements operator overloading when used in Groovy.
The plus method in the Money class keeps track of denominations when two
currencies are added. See the associated MoneyTest groovy class for details.

Please send any questions or comments to me at ken.kousen@kousenit.com.

Thanks,

Ken Kousen
http://www.kousenit.com 