package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Desarrolla un programa que indique el peso que tienes en la luna.
Gravedad en la tierra 9,8 y en la luna 1,62.
P = masa * gravedad
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu masa: ");
        double masa = sc.nextDouble();
        double pesoTierra = masa * 9.8;
        double pesoLuna = masa * 1.62;
        System.out.println("Tu peso en la tierra es de " + pesoTierra + "Newtons");
        System.out.println("Tu peso en la luna es de " + pesoLuna + "Newtons");
    }
}
