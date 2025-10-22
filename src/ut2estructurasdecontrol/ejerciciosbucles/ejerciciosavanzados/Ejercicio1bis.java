package ut2estructurasdecontrol.ejerciciosbucles.ejerciciosavanzados;

import java.util.Scanner;

public class Ejercicio1bis {
    public static void main() {
        System.out.println("Introduce el ancho máximo de la figura: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("El número debe ser mayor que 0. Introduce un nuevo número:");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--){
            for (int j = 1; j >= i; j--) {
                System.out.println("*" + "  ");
            }
        }
        sc.close();
    }
}
/*
SOLUCION MEDU
package ProgramacionTema2.Pruebas;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int numVeces = sc.nextInt();


        for (int i = 1; i <= numVeces; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = numVeces - 1; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
 */
