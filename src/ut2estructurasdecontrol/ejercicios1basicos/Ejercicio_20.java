package ut2estructurasdecontrol.ejercicios1basicos;
/*
Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 números
siguientes, mostrando el resultado en pantalla.
 */

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int imput = sc.nextInt();

        int suma = 0;
        for (int i = imput; i < imput + 100; i++) {
            suma += i;
            System.out.println("Sumamos" + i);
        }
        System.out.println("El total es" + suma);
        sc.close();

    }
}
