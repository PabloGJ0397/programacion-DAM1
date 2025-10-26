package ut2estructurasdecontrol.ejercicios1basicos;

import java.util.Scanner;

/*
Realiza un programa que permita la entrada de varios números y calcule su media.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números vas a ingresar? ");
        int n = sc.nextInt();

        //n deben ser al menos dos números, de otra forma es imposible calcular una media.

        if (n <= 1) {
            System.out.println("Debes ingresar como mínimo dos números para calcular una media");
        } else {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Introduzca un número: ");
                double input = sc.nextDouble();
                suma += input;
            }
            System.out.println("La media de los números introducidos es = " + suma / n);
        }
        sc.close();
    }

}

