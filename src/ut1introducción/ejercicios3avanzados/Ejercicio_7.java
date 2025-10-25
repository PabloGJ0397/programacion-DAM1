package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un carácter en mayúscula o minúscula");
        String entrada = sc.nextLine();
        sc.close();
        char A = entrada.charAt(0);
        System.out.println((A >= 65 && A <= 90) ? "El carácter está en mayúscula" : "El carácter está en minúscula");
    }
}
