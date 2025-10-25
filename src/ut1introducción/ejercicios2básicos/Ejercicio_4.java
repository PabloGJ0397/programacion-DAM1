package ut1introducción.ejercicios2básicos;

import java.util.Scanner;

/*
Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero: ");
        int entero = scanner.nextInt();
        System.out.println("El doble de " + entero + " es igual a " + (entero * 2));
        System.out.println("El triple de " + entero + " es igual a " + (entero * 3));
        scanner.close();

    }
}
