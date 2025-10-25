package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Crea un programa que compruebe si un año es bisiesto.
“Año bisiesto es el divisible entre 4, salvo que sea año secular
-último de cada siglo, terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.”
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un año:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
