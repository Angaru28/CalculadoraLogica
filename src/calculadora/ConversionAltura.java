/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

public class ConversionAltura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Valor a convertir:");
            double cantidad = scanner.nextDouble();

            System.out.println("Seleccione la unidad de medida de entrada:");
            mostrarMenuUnidades();
            String unidadEntrada = seleccionarUnidad(scanner);

            System.out.println("Seleccione la unidad de medida a la que desea convertir:");
            mostrarMenuUnidades();
            String unidadSalida = seleccionarUnidad(scanner);

            double resultado = convertirUnidades(cantidad, unidadEntrada, unidadSalida);

            System.out.println("Resultado: " + resultado + " " + unidadSalida);

            // Menú de opciones para continuar o salir
            System.out.println("Menú de opciones:");
            System.out.println("1. Realizar otra conversión");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción (1-2): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Continuar con otra conversión
                    break;
                case 2:
                    // Salir del programa
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Seleccionando salir.");
                    salir = true;
                    break;
            }
        }
        scanner.close();
    }

    public static void mostrarMenuUnidades() {
        System.out.println("1. Milímetros (mm)");
        System.out.println("2. Centímetros (cm)");
        System.out.println("3. Metros (m)");
        System.out.println("4. Kilómetros (km)");
    }

    public static String seleccionarUnidad(Scanner scanner) {
        int opcion;
        do {
            System.out.print("Seleccione una opción (1-4): ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1:
                return "mm";
            case 2:
                return "cm";
            case 3:
                return "m";
            case 4:
                return "km";
            default:
                return "";
        }
    }

    public static double convertirUnidades(double cantidad, String unidadEntrada, String unidadSalida) {
        if (unidadEntrada.equals(unidadSalida)) {
            return cantidad;
        }

        double resultado = 0;
        switch (unidadEntrada) {
            case "mm":
                switch (unidadSalida) {
                    case "cm":
                        resultado = cantidad / 10;
                        break;
                    case "m":
                        resultado = cantidad / 1000;
                        break;
                    case "km":
                        resultado = cantidad / 1000000;
                        break;
                }
                break;
            case "cm":
                switch (unidadSalida) {
                    case "mm":
                        resultado = cantidad * 10;
                        break;
                    case "m":
                        resultado = cantidad / 100;
                        break;
                    case "km":
                        resultado = cantidad / 100000;
                        break;
                }
                break;
            case "m":
                switch (unidadSalida) {
                    case "mm":
                        resultado = cantidad * 1000;
                        break;
                    case "cm":
                        resultado = cantidad * 100;
                        break;
                    case "km":
                        resultado = cantidad / 1000;
                        break;  
                }
                break;
            case "km":
                switch (unidadSalida) {
                    case "mm":
                        resultado = cantidad * 1000000;
                        break;
                    case "cm":
                        resultado = cantidad * 100000;
                        break;
                    case "m":
                        resultado = cantidad * 1000;
                        break; 
                }
        }
        return resultado;
    }
}
