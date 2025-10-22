package ut2estructurasdecontrol.ejerciciosbucles.ejerciciosavanzados;

import java.util.Scanner;

/*
Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado.
El juego deberá indicarte si el número introducido es mayor o menor.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        int secretnum = (int) (Math.random() * 100) + 1;
        int apuesta;
        System.out.println("Bienvenido al juego de adivinar el número.");
        System.out.println("Estoy pensando un número del 1 al 100. ¿Puedes adivinarlo?");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el número por el que apuestas:");
            apuesta = sc.nextInt();

            if (apuesta < secretnum) {
                System.out.println("Demasiado bajo");
            } else if (apuesta > secretnum) {
                System.out.println("Demasiado alto");
            } else {
                System.out.println("Correcto, el número era: " + secretnum);
            }
        } while (secretnum != apuesta);
        sc.close();
    }
}
