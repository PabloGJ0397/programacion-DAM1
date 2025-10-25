package ut1introducción.ejercicios2básicos;

import java.util.Scanner;

/*
Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe aquí tu nombre por favor: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + " , bienvenido.");
        scanner.close();

    }
}
