package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TempConvertorTest {
    @Test
public void instantiateClass(){
    TempConvertor tempConvertor = new TempConvertor();
}
@Test
public void callFahrenheitToCelsiusMethod(){
    TempConvertor tempConvertor = new TempConvertor();
    tempConvertor.fahrenheitToCelsius(20);
}
@Test
public void methodReturnsCelsiusFromFahrenheitInDouble(){
    //GIVEN
    TempConvertor tempConvertor = new TempConvertor();
    double temperature;

    //WHEN
    double result = tempConvertor.fahrenheitToCelsius(20);
    //THEN
    Assertions.assertThat(result).isEqualTo(-6.666666666666667);

}

@Test
    public void callCelsiusToFahrenheit(){
    TempConvertor tempConvertor = new TempConvertor();
    tempConvertor.celsiusToFahrenheit(20);


}
@Test
    public void methodReturnsFahrenheitFromCelsius(){
    //GIVEN
    TempConvertor tempConvertor = new TempConvertor();
    double temperature;

    //WHEN
    double result = tempConvertor.celsiusToFahrenheit(20);

    //THEN
    Assertions.assertThat(result).isEqualTo(68.0);
    }
@Test
    public void randomTestFromFahrenheitToCelsius(){

    //GIVEN
   /* TempConvertor tempConvertor = new TempConvertor();
    double temperature = 0;
    double expectedResult = -17.777777778;

    //WHEN
    double result = tempConvertor.fahrenheitToCelsius(temperature);

    //THEN
    Assertions.assertThat(result).isEqualTo(expectedResult);*/

}
}
