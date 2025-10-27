package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosprincipiantes;
// Escribe un método para calcular el área de un rectángulo usando base y altura.

import java.util.Scanner;

public class EjerciciosPrincipiantes4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectángulo:");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del rectángulo:");
        int altura = sc.nextInt();
        int area = calculoArea(base, altura);
        System.out.println("El area es " + area);
        sc.close();


    }

    public static int calculoArea(int base, int altura) {
        return base * altura;
    }
}
