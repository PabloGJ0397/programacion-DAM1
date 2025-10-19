package ut2estructurasdecontrol.ejerciciosavanzados;

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
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
