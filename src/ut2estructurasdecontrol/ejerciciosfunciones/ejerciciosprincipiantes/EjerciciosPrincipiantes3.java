package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;
// Implementa un método que reciba un nombre y edad y muestre un mensaje personalizado.

import java.util.Scanner;

public class EjerciciosPrincipiantes3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();
        mensaje(nombre,edad);
        sc.close();

    }
    static void mensaje(String nombre, int edad) {
        System.out.println("Bienvenido " + nombre + ", es un placer conocerte. ¿Qué tal es tener " + edad + " años?");
    }
}
