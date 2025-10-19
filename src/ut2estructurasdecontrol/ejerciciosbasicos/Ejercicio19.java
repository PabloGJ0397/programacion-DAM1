package ut2estructurasdecontrol.ejerciciosbasicos;

import java.util.Scanner;

/*
Escribir un programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.
    PROBLEMAS QUE VEO:
    - el imput del usuario puede ser negativo
    - los números negativos también son impares menores > necesito limitar el bucle a Integer.MIN_VALUE + 2 para que
    el bucle no haga overflow.
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");
        int input = sc.nextInt();
        if (input % 2 == 0) {
            input = input - 1;
        }
        for (int i = input; i >= Integer.MIN_VALUE + 2; i -= 2) {
            System.out.println(i);
        }
        sc.close();


    }
}
