package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;

import java.util.Scanner;

//Crea un método para determinar si un número es par o impar.
public class EjerciciosPrincipiantes5 {
    //opción 1
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = sc.nextInt();
        String respuesta = paroimpar(numero);
        System.out.println(respuesta);
    }

    static String paroimpar(int n) {
        return (n % 2 == 0) ? "el número es par" : "el número es impar";
    }
    */
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int input = sc.nextInt();
        if (imparopar(input)) {
            System.out.println("el número " +
                    "" +
                    input +
                    " es par");
        } else {
            System.out.println("el número " +
                    input +
                    " es impar");
        }
        sc.close();
    }

    public static boolean imparopar(int n) {
        return n % 2 == 0;

    }

}
