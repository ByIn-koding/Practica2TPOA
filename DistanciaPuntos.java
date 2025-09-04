package form;
import java.util.Scanner;

public class DistanciaPuntos {

    // Método para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Método para clasificar el triángulo
    public static String clasificarTriangulo(double ab, double bc, double ca) {
        if (ab == bc && bc == ca) {
            return "EQUILÁTERO";
        } else if (ab == bc || bc == ca || ab == ca) {
            return "ISÓSCELES";
        } else {
            return "ESCALENO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de coordenadas
        System.out.println("Ingrese las coordenadas del punto A:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del punto B:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del punto C:");
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();

        // Cálculo de distancias
        double ladoAB = calcularDistancia(x1, y1, x2, y2);
        double ladoBC = calcularDistancia(x2, y2, x3, y3);
        double ladoCA = calcularDistancia(x3, y3, x1, y1);

        // Redondeo a dos decimales
        ladoAB = Math.round(ladoAB * 100.0) / 100.0;
        ladoBC = Math.round(ladoBC * 100.0) / 100.0;
        ladoCA = Math.round(ladoCA * 100.0) / 100.0;

        // Clasificación
        String tipoTriangulo = clasificarTriangulo(ladoAB, ladoBC, ladoCA);

        // Salida
        System.out.println("\nLado AB = " + ladoAB);
        System.out.println("Lado BC = " + ladoBC);
        System.out.println("Lado CA = " + ladoCA);
        System.out.println("El triángulo es " + tipoTriangulo);
    }
}