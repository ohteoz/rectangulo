import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ancho del rectángulo: ");
        int ancho = scanner.nextInt();
        System.out.print("Ingrese el alto del rectángulo: ");
        int alto = scanner.nextInt();

        Rectangulo rectangulo = new Rectangulo(ancho, alto);
        System.out.println("Rectángulo inicial:");
        rectangulo.dibujar();

        System.out.print("Ingrese el nuevo ancho: ");
        ancho = scanner.nextInt();
        System.out.print("Ingrese el nuevo alto: ");
        alto = scanner.nextInt();

        rectangulo.setDimensiones(ancho, alto);
        System.out.println("Rectángulo modificado:");
        rectangulo.dibujar();

        scanner.close();
    }
}
