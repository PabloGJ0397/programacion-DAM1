package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
calcule el precio final con IVA.
El IVA será una constante del 21%.
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio sin IVA");
        double precioSinIVA = sc.nextDouble();
        final double IVA = 0.21; //IVA del 21%//
        System.out.println("El precio con IVA es = " + (precioSinIVA + (precioSinIVA * IVA)));
        sc.close();
    }
}
