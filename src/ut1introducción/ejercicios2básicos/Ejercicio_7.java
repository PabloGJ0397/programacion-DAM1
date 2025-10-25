package ut1introducción.ejercicios2básicos;

import java.util.Scanner;

/*
Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la velocidad en Km/h");
        double velocidadKmh = scanner.nextDouble();
        // Para pasar de km/h a m/s tenemos que multiplicar por 1000/3600 = 5/18//
        double velocidadMs = velocidadKmh * 5 / 18;
        System.out.println("La velocidad es de  " + velocidadMs + " m/s.");
        scanner.close();


    }
}
