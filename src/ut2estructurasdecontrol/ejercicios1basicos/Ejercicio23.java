package ut2estructurasdecontrol.ejercicios1basicos;

import java.util.Scanner;

/*
Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
Da como salida: 33
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números enteros. El programa se detendrá cuando hayas introducido cinco ceros.");
        int contador = 0;
        int suma = 0;
        while (contador < 5) {
            System.out.println("Introduce un nuevo número");
            int input = sc.nextInt();
            suma += input;
            if (input == 0) {
                contador += 1;
            }
        }
        System.out.println("Se han introducido cinco ceros. Fin del programa");
        sc.close();

    }
}
