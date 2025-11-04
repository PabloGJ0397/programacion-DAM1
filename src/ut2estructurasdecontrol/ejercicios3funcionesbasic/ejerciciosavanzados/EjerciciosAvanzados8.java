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
        String cadenaCifrada = cifrar(input);
        System.out.println(cadenaCifrada);
        String cadenaDescifrada = descifrar(cadenaCifrada);
        System.out.println(cadenaDescifrada);

    }

    public static String cifrar(String cadena) {
        String cadenaCifrada = "";
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra >= 'A' && letra <= 'Z'){
                letra = (char) ('A' + (letra - 'A' + 2) % 26);
            } else if (letra >= 'a' && letra <= 'z') {
                letra = (char) ('a' + (letra - 'a' + 2) % 26);
            }
            cadenaCifrada += letra;
        }
        return cadenaCifrada;
    }
    public static String descifrar (String cadenaCifrada){
        String cadenaDescifrada = "";
        for ( int i = 0; i < cadenaCifrada.length(); i++){
            char letraCifrada = cadenaCifrada.charAt(i);
            if (letraCifrada >= 'A' && letraCifrada <= 'Z'){
                letraCifrada = (char) ('A' + (letraCifrada - 'A' - 2 + 26) % 26);
            } else if (letraCifrada >= 'a' && letraCifrada <= 'z') {
                letraCifrada = (char) ('a' + (letraCifrada - 'a' - 2 + 26) % 26);
            }
            cadenaDescifrada += letraCifrada;
        }
        return cadenaDescifrada;
    }



}
