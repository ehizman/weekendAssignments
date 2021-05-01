import java.util.Scanner;

public class CelsiusToFarenheitConverterApp {

    public static void main (String ... args) {
        
        double tempInCelsius;
        double farenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        tempInCelsius = input.nextDouble();
        System.out.println();

        farenheit = (9.0/5) * tempInCelsius + 32;

        System.out.printf("%f Celsius is %f Farenheit%n", tempInCelsius, farenheit);
    }
}
