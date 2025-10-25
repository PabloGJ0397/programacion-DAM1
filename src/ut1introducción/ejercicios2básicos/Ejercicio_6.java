package ut1introducción.ejercicios2básicos;

import java.util.Scanner;

/*
Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        int dato1 = scanner.nextInt(), dato2 = scanner.nextInt();

        System.out.println("Los números enteros elegidos son: " + dato1 + " y " + dato2);

        scanner.close();


    }
}
