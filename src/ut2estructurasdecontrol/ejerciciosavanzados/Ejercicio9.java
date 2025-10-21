package ut2estructurasdecontrol.ejerciciosavanzados;

import java.util.Scanner;

/*
Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        //Pedimos n al usuario:
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números de la secuencia de Fibonacci quieres que muestre?");
        int n = sc.nextInt();

        //Creamos las variables de arranque a y b, correspondientes a los dos primeros números de la serie. Creamos un bucle for, de duración concreta = N
        int a = 1;
        int b = 2;
        System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");

        //Creamos un bucle for, de duración concreta = N
        for (int i = 1; i <= n; i++) {
            System.out.println(a + "  "); // mientras i < n, SE IMPRIME a.
            int nextnumber = a + b; // calculas número siguiente de la serie (a+b)
            a = b; //cambias el valor de a (1er numero) por el de b (2º numero)
            b = nextnumber; //cambias el valor de b por el de nextnumber.

            // Ahora tu a es 2, tu b es 2+1=3. (nextnumber sera 2 + 3 = 5)
            // Repites el bucle tantas veces mande n con los valores actualizados cada vez.
            // Cuando i alcanza n el programa se detiene.
        }


    }
}
