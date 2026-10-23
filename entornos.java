import java.util.Scanner;

public class entornos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Escribe tu edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Escribe el color de tus ojos: ");
        String colorOjos = teclado.nextLine();
        System.out.print("Escribe el día de la semana: ");
        String dia = teclado.nextLine();
        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años, tus ojos son de color " + colorOjos + " y hoy es " + dia + ".");
        System.out.println("Tenga un buen dia");
    }
}
