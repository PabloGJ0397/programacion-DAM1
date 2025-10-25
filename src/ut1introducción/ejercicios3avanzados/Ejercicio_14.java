package ut1introducción.ejercicios3avanzados;

/*
Realiza un programa que calcule cuántos billetes hay que darle a un cliente
que quiera sacar cierta cantidad de dinero de su banco.
Siempre calcularemos la mínima cantidad de billetes.

Ejemplo:

Teclea la cantidad de euros: 3475

La cantidad de billetes que te tengo que dar es:

6 billetes de 500€

2 billetes de 200€

0 billetes de 100€

1 billetes de 50€

1 billetes de 20€

0 billetes de 10€

1 billetes de 5€
 */

import java.util.Scanner;

/*
2125 / 500 = 4 ; 2125 % 500 = 125 ; 125 / 200 = 0 ; 125 % 200 = 25 ; 125 / 100 = 1 ; 125 % 100 = 25 ...
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de dinero que quiere sacar: ");
        int Cantidad = sc.nextInt();
        sc.close();

        int b500 = Cantidad / 500;
        Cantidad = Cantidad % 500;

        int b200 = Cantidad / 200;
        Cantidad = Cantidad % 200;

        int b100 = Cantidad / 100;
        Cantidad = Cantidad % 100;

        int b50 = Cantidad / 50;
        Cantidad = Cantidad % 50;

        int b20 = Cantidad / 20;
        Cantidad = Cantidad % 20;

        int b10 = Cantidad / 10;
        Cantidad = Cantidad % 10;

        int b5 = Cantidad / 5;
        Cantidad = Cantidad % 5;

        System.out.println(b500 + " billetes de 500€");
        System.out.println(b200 + " billetes de 200€");
        System.out.println(b100 + " billetes de 100€");
        System.out.println(b50 + " billetes de 50€");
        System.out.println(b20 + " billetes de 20€");
        System.out.println(b10 + " billetes de 10€");
        System.out.println(b5 + " billetes de 5€");


    }
}
