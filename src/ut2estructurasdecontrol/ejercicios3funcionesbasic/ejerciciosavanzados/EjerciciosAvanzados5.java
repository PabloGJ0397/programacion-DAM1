package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;
/*
Método factorial(), que calculará el factorial del número que se le pasa como parámetro.
Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo,
y un -2 en caso de que el parámetro pasado sea cero.
*/

import java.util.Scanner;

public class EjerciciosAvanzados5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del que desea conocer el factorial");
        int input = sc.nextInt();
        System.out.println(factorial(input));
        sc.close();
    }

    public static int factorial(int num) {
        if (num < 0) return -1;
        if (num == 0) return -2;
        if (num == 1) return 1;
        return num * factorial(num - 1);

    }
}

