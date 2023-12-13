/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

public class TiempoViaje{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese la distancia recorrida (en kilómetros): ");
        double distancia = scanner.nextDouble();

        System.out.println("Por favor, ingrese la velocidad (en kilómetros por hora): ");
        double velocidad = scanner.nextDouble();

        double tiempoViaje = calcularTiempoViaje(distancia, velocidad);
        System.out.println("El tiempo de viaje es: " + tiempoViaje + " horas");
    }

    public static double calcularTiempoViaje(double distancia, double velocidad) {
        return distancia / velocidad;
    }
}