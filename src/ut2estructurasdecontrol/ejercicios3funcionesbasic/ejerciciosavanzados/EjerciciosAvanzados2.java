package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;

import java.util.Scanner;

//Escribe un método recursivo para calcular la serie de Fibonacci hasta n.
public class EjerciciosAvanzados2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números de la secuencia de Fibonacci deseas mostrar?");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(calcularFibonacci(n));
        }


    }

    public static int calcularFibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);


    }
}
