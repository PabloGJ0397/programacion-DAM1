package ut2estructurasdecontrol.ejerciciosbucles.ejerciciosavanzados;

import java.util.Scanner;

/*
Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
1
1 2
1 2 3
1 2 3 4
 1 2 3 4 5 ………….
 1 2 3 4 5 …..n
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduce un número entero mayor que 0: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("El número debe ser mayor que 0. Introduce un nuevo número:");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
