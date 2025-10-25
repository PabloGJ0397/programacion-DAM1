package ut1introducción.ejercicios3avanzados;

import java.util.Scanner;

/*
Realiza un programa que nos pida cuantos segundos duró un concierto,
y nos calcule cuántas horas, minutos y segundos son.
Ejemplo:
Cuantos segundos duró el concierto: 8479
Equivale a 2:21:19
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos segundos duró el concierto? ");
        int totalSegundos = sc.nextInt();
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = (totalSegundos % 3600) % 60;
        System.out.println("Equivale a " + horas + ":" + minutos + ":" + segundos);

    }
}
