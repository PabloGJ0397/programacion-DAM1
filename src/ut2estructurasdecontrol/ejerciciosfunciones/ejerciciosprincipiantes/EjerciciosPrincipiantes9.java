package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;

import java.util.Scanner;

/* Crea un método llamado operacion que reciba dos números y un código de operación (1 para suma, 2 para resta, 3 para
   multiplicación, 4 para división). Según el código, el método debe realizar la operación indicada y mostrar el
   resultado */
public class EjerciciosPrincipiantes9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los dos operandos:");
        int operando1 = sc.nextInt();
        int operando2 = sc.nextInt();
        System.out.println("¿Quieres sumar (1), restar (2), multiplicar (3) o dividir (4) los operandos?:");
        int operador = sc.nextInt();
        sc.close();
        System.out.println(resultado(operando1, operando2, operador));


    }

    public static String resultado(int op1, int op2, int codOperacion) {
        switch (codOperacion) {
            case 1:
                return "El resultado de sumar los operandos es " + (op1 + op2);
            case 2:
                return "El resultado de restar los operandos es " + (op1 - op2);
            case 3:
                return "El resultado de multiplicar los operandos es " + (op1 * op2);
            case 4:
                if (op2 == 0) {
                    return "No es posible dividir entre 0";
                } else {
                    return "El resultado de dividir los operandos es " + (op1 / op2);
                }
            default:
                return "Código de operación no válido";
        }

    }

}
