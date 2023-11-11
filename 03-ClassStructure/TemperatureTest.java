public class TemperatureTest {
    public static void main(String[] args) {
        double a = 25;
        double b = 100;
        double c = 0;
        System.out.printf("%.2f °C = %.2f K = %.2f °F\n",
            a, Temperature.CelsiusToKelvin(a), Temperature.CelsiusToFahrenheit(a));
        System.out.printf("%.2f °F = %.2f K = %.2f °C\n",
            b, Temperature.FahrenheitToKelvin(b), Temperature.FahrenheitToCelsius(b));
        System.out.printf("%.2f K = %.2f °C = %.2f °F\n",
            c, Temperature.KelvinToCelsius(c), Temperature.KelvinToFahrenheit(c));
    }
}
