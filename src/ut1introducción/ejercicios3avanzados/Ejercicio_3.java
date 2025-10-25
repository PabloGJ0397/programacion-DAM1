package ut1introducción.ejercicios3avanzados;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
Crea un programa que compruebe si eres mayor de edad.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        //Pedimos al usuario su fecha de nacimiento
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (yyyy-mm-dd):");
        String fechaTexto = sc.nextLine();
        sc.close();
        //Parseamos string a LocalDate
        LocalDate hoy = LocalDate.now();
        LocalDate fechaUsuario = LocalDate.parse(fechaTexto);
        //Comparamos fecha actual - fecha de nacimiento >= 18
        Period edad = Period.between(fechaUsuario, hoy);
        int edadUsuario = edad.getYears();
        if (edadUsuario >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
