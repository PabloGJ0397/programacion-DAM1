package ut1introducción.ejercicios2básicos;

import java.util.Scanner;

/*
Escribe un programa para que muestre tu dirección y tu número de teléfono. Asegúrate de que los datos se muestran en líneas separadas.
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe en dos líneas separadas tu dirección y tu número de teléfono: ");
        String direccion = scanner.nextLine();
        String telefono = scanner.nextLine();
        System.out.println("Mi dirección es: " + direccion);
        System.out.println("Mi número de teléfono es: " + telefono);
        scanner.close();


    }
}
