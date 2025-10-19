package ut2estructurasdecontrol.ejerciciosbasicos;

import java.util.Scanner;

/*
Pedir un número entre 0 y 9.999, decir si es capicúa.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre el 0 y el 9.999");
        int input = sc.nextInt();
        sc.close();
        int cifras = 0;
        if (input < 10) {
            cifras = 1;
        } else if (input < 100) {
            cifras = 2;
        } else if (input < 1000) {
            cifras = 3;
        } else if (input < 9999) {
            cifras = 4;
        }
        switch (cifras) {
            case 1:
                System.out.println("El número es capicua");
                break;
            case 2:
                if (input / 10 == input % 10) {
                    System.out.println("Es capicúa");
                } else {
                    System.out.println("No es capicúa");
                }
                break;
            case 3:
                if (input / 100 == input % 10) {
                    System.out.println("Es capicúa");
                } else {
                    System.out.println("No es capicúa");
                }
                break;
            case 4:
                if (input / 1000 == input % 10 && (input / 100) % 10 == (input / 10) % 10) {
                    System.out.println("Es capicúa");
                } else {
                    System.out.println("No es capicúa");
                }
                break;
        }

    }
}
