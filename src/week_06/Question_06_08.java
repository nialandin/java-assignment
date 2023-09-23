package assignments.src.week_06;


public class Question_06_08 {
    public static void main(String[] args) {

        double fahrenheit = 120;
        System.out.printf("%s   %-10s  |   %-10s   %-10s", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("\n-----------------------------------------------");

        for (double celcius = 40; celcius > 30; celcius--) {
            System.out.printf("%-10.1f %-10.1f    |    %-10.2f %-10.2f\n", celcius, celsiusToFahrenheit(celcius), fahrenheit, fahrenheitToCelsius(fahrenheit));
            fahrenheit -= 10;
        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

