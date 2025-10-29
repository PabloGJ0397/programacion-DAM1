package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;

import java.util.Scanner;

public class EjercicioEejemploExamen {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad del asegurado:");
        int edad = sc.nextInt();
        boolean accidentes;

        if (edad > 35) {
            System.out.println("Ha sufrido accidentes anteriormente? (true/false):");
            accidentes = sc.nextBoolean();
        } else {
            accidentes = false;
        }
        double precioInicial = 500;
        System.out.println("El precio del seguro será de  " +
                precioSeguro(precioInicial, edad, accidentes) + " euros");
        sc.close();

    }

    public static double precioSeguro(double precioInicial, int edad, boolean accidentes) {
        if (edad < 18) {
            System.out.println("Los menores de 18 años no pueden contratar un seguro de coche.");
        } else if (edad > 18 && edad < 25) {
            return precioInicial + (0.2 * precioInicial);
        } else if (edad > 35 && edad < 55 && !accidentes) {
            return precioInicial - (0.1 * precioInicial);

        } else if ((edad > 65) && !accidentes) {
            return precioInicial + (0.1 * precioInicial);
        } else if ((edad > 65) && accidentes) {
            return precioInicial + (0.3 * precioInicial);
        }
        return precioInicial;
    }
}
