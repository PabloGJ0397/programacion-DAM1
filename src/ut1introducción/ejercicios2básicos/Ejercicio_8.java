package ut1introducción.ejercicios2básicos;
/*
Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 */

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de 3 cifras: ");
        int numero1 = scanner.nextInt();
        int centena = numero1 / 100;
        int decena = (numero1 % 100) / 10;
        int unidad = numero1 % 10;
        System.out.println("centena:" + centena + "  decena:" + decena + "  unidad:" + unidad);
        scanner.close();


    }
}
