package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Mostrar la tabla de multiplicar de un número.
 */
public class Ejercicio_16 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
