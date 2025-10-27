package ut2estructurasdecontrol.ejerciciosbucles.ejerciciosbasicos;

import java.util.Scanner;

/*
Programa Java que lea un número entero y calcule si es par o impar.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un número entero:");
        Scanner sc = new Scanner(System.in);
        int entero = sc.nextInt();
        System.out.println((entero % 2 == 0) ? "Es par" : "Es impar");
        sc.close();
    }
}
