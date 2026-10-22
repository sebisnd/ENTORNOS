import java.util.Scanner;

public class entornos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Escribe tu edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Escribe el día de la semana: ");
        String dia = teclado.nextLine();
        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años. Hoy es " + dia + ".");
    }
}
