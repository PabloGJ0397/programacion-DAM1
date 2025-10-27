package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;

import java.util.Scanner;

//Escribe un método que convierta grados Celsius a Fahrenheit.
public class EjerciciosPrincipiantes7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados celsius:");
        double imputC = sc.nextDouble();
        System.out.println(imputC + " grados Celsius son " + celsiusToFahrenheit(imputC) + " grados Fahrenheit.");
        System.out.println("Introduce los grados Fahrenheit:");
        double inputF = sc.nextDouble();
        System.out.println(inputF + " grados Fahrenheit son " + fahrenheitToCesius(inputF) + " grados Celsius");
        sc.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return ((double) (celsius * 9) / 5) + 32;
    }

    public static double fahrenheitToCesius(double fahrenheit) {
        return ((double) (fahrenheit - 32) * 5 / 9);
    }
}
