package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;

import java.util.Scanner;

public class EjerciciosAvanzados1 {
    static void main() {
        System.out.println("Introduce un número para averiguar si es primo:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(esPrimo(input));
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        return esPrimoDesde(numero, 2);
    }

    public static boolean esPrimoDesde(int num, int divisor) {
        if (divisor == num) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        divisor++;
        return esPrimoDesde(num, divisor);
    }
}
