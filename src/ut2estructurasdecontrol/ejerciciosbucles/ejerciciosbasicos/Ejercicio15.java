package ut2estructurasdecontrol.ejerciciosbucles.ejerciciosbasicos;

//Mostrar la tabla de multiplicar de un número.

import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int n = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + n);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "  \tx     \t" + n + " = \t" + (n * i));
        }

        sc.close();
    }
}
