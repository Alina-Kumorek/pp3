// 11.	Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit.
// You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect.
// Then create a program that calculates and displays the temperature:
//     a.	25 degrees Celsius in Kelvin and Fahrenheit
//     b.	100 degrees Fahrenheit in Kelvin and Celsius
//     c.	0 degrees Kelvin in Celsius and Fahrenheit


public class Temperature {
    static private double celsiusToKelvin = 273.15;
    static private double celsiusToFahrenheit = 32;
    static private double degreeRate = 1.8;

    static double CelsiusToKelvin(double c) {
        return c + Temperature.celsiusToKelvin;
    }

    static double KelvinToCelsius(double k) {
        return k - Temperature.celsiusToKelvin;
    }

    static double CelsiusToFahrenheit(double c) {
        return c * Temperature.degreeRate + Temperature.celsiusToFahrenheit;
    }

    static double FahrenheitToCelsius(double f) {
        return (f - Temperature.celsiusToFahrenheit) / Temperature.degreeRate;
    }

    static double KelvinToFahrenheit(double k) {
        return CelsiusToFahrenheit(KelvinToCelsius(k));
    }

    static double FahrenheitToKelvin(double f) {
        return CelsiusToKelvin(FahrenheitToCelsius(f));
    }
}
