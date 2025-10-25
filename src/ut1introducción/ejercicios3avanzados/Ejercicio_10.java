package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Desarrolla un programa que solicite 3 números y compruebe si están ordenados.
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres enteros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los números están ordenados de menor a mayor");
        } else if (num1 >= num2 && num2 >= num3) {
            System.out.println("Los números están ordenados de mayor a menor");
        } else {
            System.out.println("Los números no están ordenados");
        }
    }
}
