package org.fasttrackit;

public class TempConvertor {
    public static double fahrenheitToCelsius(double temperature){

        double result = (temperature - 32) *5/9;

        return result;
    }
    public static double celsiusToFahrenheit(double temperature){
        double result = temperature*9/5+32;
        return  result;

    }
}
