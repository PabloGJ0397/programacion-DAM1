package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;

import java.util.Scanner;

/*Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c),
teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b.
El proceso de descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán ningún cambio.
 */
public class EjerciciosAvanzados8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase que deseas cifrar");
        String input = sc.nextLine();
        System.out.println(cifrar(input));


    }

    public static String cifrar(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            letra = (char) (letra + 2);


        }
    }

    public static String descifrar(String) {

    }

}
