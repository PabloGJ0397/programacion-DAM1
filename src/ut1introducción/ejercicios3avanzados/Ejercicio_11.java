package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Crea un programa que pida cuál es el radio de una circunferencia y
nos calcule cuál es la longitud y el área.

Longitud (o perímetro) de una circunferencia:
L=2πr
Área del círculo (la región delimitada por la circunferencia):
A=πr^2
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de un círculo:");
        double radio = sc.nextDouble();

        double pi = Math.PI;
        System.out.println("La longitud de la circunferencia es = " + (2 * pi * radio));
        System.out.println("El area del circulo es = " + (pi * radio * radio));
        sc.close();
    }
}
