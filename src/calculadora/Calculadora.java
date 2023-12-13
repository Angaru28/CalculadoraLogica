
package calculadora;
import calculadora.Temperatura;
import calculadora.Volumen;
import calculadora.Peso;
import calculadora.ConversionAltura;
import calculadora.TiempoVida;
import calculadora.TiempoViaje;
import java.util.Scanner;

    public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("Seleccione la opción:");
                System.out.println("1. Calcular Temperatura");
                System.out.println("2. Calcular Volumen");
                System.out.println("3. Calcular Peso en otro planeta");
                System.out.println("4. Conversion de altura");
                System.out.println("5. Calcular Tiempo de vida");
                System.out.println("6. Calcular Tiempo de viaje");
                System.out.println("7. Salir");
                
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        Temperatura.main(args);
                        break;
                    case 2:
                        Volumen.main(args);
                        break;
                    case 3:
                        Peso.main(args);
                        break;
                    case 4:
                        ConversionAltura.main(args);
                        break;
                    case 5:
                        TiempoVida.main(args);
                        break;
                    case 6:
                        TiempoViaje.main(args);
                        break;
                    case 7:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opcion valida(1-7)");
                }
            }
            
            System.out.println("Hasta luego. Gracias ");
        }
    }
}