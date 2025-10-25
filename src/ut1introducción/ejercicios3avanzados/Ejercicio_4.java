package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7.
 */
public class Ejercicio_4 {
    public static void main(String[] args) {

        //Solicitamos input al usuario.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int input = sc.nextInt();
        sc.close();

        //Comprobamos la condición
        System.out.println((input % 7 == 0) ? "es múltiplo de siete" : "no es múltiplo de siete");
    }
}
