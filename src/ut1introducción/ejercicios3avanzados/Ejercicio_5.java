package ut1introducción.ejercicios3avanzados;
/*
Programa que lea dos caracteres por teclado y compruebe si son iguales.
 */

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce DOS caracteres de teclado: ");
        String input = sc.nextLine();
        char num1 = input.charAt(0);
        char num2 = input.charAt(1);
        System.out.println((num1 == num2) ? "son iguales" : "no son iguales");

    }
}
