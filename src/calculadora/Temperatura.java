/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Angie Natalia
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la opción de conversión:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ConversionCelsiusaFahrenheit();
                    break;
                case 2:
                    ConversionFahrenheitaCelsius();
                    break;
                case 3:
                    ConversionCelsiusaKelvin();
                    break;
                case 4:
                    ConversionKelvinaCelsius();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione 1, 2, 3, 4 o 5.");
            }
        }

        System.out.println("Hasta luego. Gracias ");
        scanner.close();
    }

    private static void ConversionCelsiusaFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("La temperatura equivalente en grados Fahrenheit es: " + fahrenheit);
    }

    private static void ConversionFahrenheitaCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("La temperatura equivalente en grados Celsius es: " + celsius);
    }

    private static void ConversionCelsiusaKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("La temperatura equivalente en grados Kelvin es: " + kelvin);
    }

    private static void ConversionKelvinaCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("La temperatura equivalente en grados Celsius es: " + celsius);
    }
}
    