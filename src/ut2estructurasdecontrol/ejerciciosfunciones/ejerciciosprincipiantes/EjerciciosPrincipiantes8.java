package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;

import java.util.Scanner;

//Define un método que retorne el valor absoluto de un número entero.
public class EjerciciosPrincipiantes8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero, positivo o negativo:");
        int input = sc.nextInt();
        System.out.println("El valor absoluto de " + input + " es " + valorAbsoluto(input));
    }

    public static int valorAbsoluto(int n) {
        return (n >= 0) ? n : -n;
    }
}


