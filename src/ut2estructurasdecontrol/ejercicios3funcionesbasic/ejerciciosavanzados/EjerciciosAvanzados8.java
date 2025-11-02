package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;

import java.util.Scanner;

/*Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c),
teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b.
El proceso de descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán ningún cambio.
 */
public class EjerciciosAvanzados8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase que deseas cifrar");
        String input = sc.nextLine();
        String cadenaCifrada = cifrar(input);
        String cadenaDescifrada = descifrar(cadenaCifrada);
        System.out.println("La cadena cifrada es: " + cadenaCifrada);
        System.out.println("La cadena descifrada es: " + cadenaDescifrada);


    }

    public static String cifrar(String original) {
        if (original.equals("")) // (original.isempty)//
        {
            return "";
        }
        char letra = original.charAt(0);

        if (letra >= 'a' && letra <= 'z') {
            letra = (char) ('a' + (letra - 'a' + 2) % 26);
        } else if (letra >= 'A' && letra <= 'Z') {
            letra = (char) ('A' + (letra - 'A' + 2) % 26);
        }
        return letra + cifrar(original.substring(1));
    }

    public static String descifrar(String cadenaCifrada) {
        if (cadenaCifrada.equals("")) {
            return "";
        }
        char letraCifrada = cadenaCifrada.charAt(0);

        if (letraCifrada >= 'a' && letraCifrada <= 'z') {
            letraCifrada = (char) ('a' + (letraCifrada - 'a' - 2 + 26) % 26);
        } else if (letraCifrada >= 'A' && letraCifrada <= 'Z') {
            letraCifrada = (char) ('A' + (letraCifrada - 'A' - 2 + 26) % 26);
        }
        return letraCifrada + descifrar(cadenaCifrada.substring(1));

    }
}