/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

public class TiempoVida{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la edad en años:");
        int edad = scanner.nextInt();

        int anios = edad;
        int meses = anios * 12;
        int semanas = anios * 52;
        int dias = anios * 365;
        int horas = dias * 24;
        int minutos = horas * 60;

        System.out.println("Su edad en la siguientes equvalencias es:");
        System.out.println(meses + " meses");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
    }
}