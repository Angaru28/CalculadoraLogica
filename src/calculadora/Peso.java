/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

public class Peso {

    private static final double PESO_MAXIMO = 2000; // kg

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione un planeta: ");
            System.out.println("1. Marte");
            System.out.println("2. Júpiter");
            System.out.println("3. Saturno");
            System.out.println("4. Urano");
            System.out.println("5. Neptuno");
            System.out.println("6. Venus");
            System.out.println("7. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 7:
                    System.out.println("Hasta luego. Gracias");
                    continuar = false;
                    break;
                default:
                    System.out.println("Por favor, ingrese su peso en la Tierra (en kg): ");
                    double pesoTierra = scanner.nextDouble();

                    double pesoPlaneta = calcularPesoPlaneta(opcion, pesoTierra);
                    System.out.println("Su peso en " + obtenerNombrePlaneta(opcion) + " es: " + pesoPlaneta + " kg");

                    if (pesoPlaneta > PESO_MAXIMO) {
                        System.out.println("Advertencia: Su peso en " + obtenerNombrePlaneta(opcion) + " supera el límite de " + PESO_MAXIMO + " kg");
                    }
                    break;
            }
        }

        scanner.close(); // Cerrar el scanner al final del programa
    }

    public static double calcularPesoPlaneta(int opcion, double pesoTierra) {
        switch (opcion) {
            case 1:
                return pesoTierra * 0.38; // Marte
            case 2:
                return pesoTierra * 2.64; // Júpiter
            case 3:
                return pesoTierra * 1.17; // Saturno
            case 4:
                return pesoTierra * 1.19; // Urano
            case 5:
                return pesoTierra * 1.21; // Neptuno
            case 6:
                return pesoTierra * 0.91; // Venus
            default:
                return -1; // Opción no válida
        }
    }

    public static String obtenerNombrePlaneta(int opcion) {
        switch (opcion) {
            case 1:
                return "Marte";
            case 2:
                return "Júpiter";
            case 3:
                return "Saturno";
            case 4:
                return "Urano";
            case 5:
                return "Neptuno";
            case 6:
                return "Venus";
            default:
                return "Opción no válida";
        }
    }
}