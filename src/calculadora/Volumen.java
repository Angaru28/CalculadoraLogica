/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import java.util.Scanner;

public class Volumen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        int opcion = 0;
        while (opcion != 2) {
            System.out.println("Menu de opciones:");
            System.out.println("1. Continuar");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    procesarCilindro();
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
            }
        }

        System.out.println("Hasta luego. Gracias ");
        
    }

    public static void procesarCilindro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese el diámetro: ");
        double diametro = scanner.nextDouble();

        double radio = calcularRadio(diametro);
        System.out.println("El radio según el diámetro ingresado es: " + radio);

        double altura = pedirAltura();
        double volumen = calcularVolumen(radio, altura);
        System.out.println("El volumen del cilindro es: " + volumen + " cm3");
    }

    public static double calcularRadio(double diametro) {
        return diametro / 2;
    }

    public static double pedirAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese la altura del cilindro: ");
        return scanner.nextDouble();
    }

    public static double calcularVolumen(double radio, double altura) {
        double radioCuadrado = radio * radio;
        return Math.PI * radioCuadrado * altura;
    }
}
