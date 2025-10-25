package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
Se debe comprobar que el divisor no puede ser cero.
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dividendo: ");
        double dividendo = sc.nextDouble();
        System.out.println("Introduce el divisor");
        double divisor = sc.nextDouble();
        double resultado = dividendo / divisor;

        if (divisor != 0) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir entre 0.");
        }
        sc.close();
    }
}