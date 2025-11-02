package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosavanzados;

import java.util.Scanner;

/*
Haz programa que ordene alfabéticamente las letras de una frase. El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
    Ejemplo: Tecleando la palabra “hola”
    Escribirá “ahlo”
    El trabajo de ordenar la frase lo realizará un método llamado ordenar() al que se le pasará la frase y la retornará ordenada.
    Este método realizará el trabajo de la siguiente manera:
    Repetir tantas veces como letras tenga la frase
        {
        Obtener la letra menor
        Añadir esa letra al resultado
        Eliminar la letra de la frase original
        }
    El proceso de obtener la letra menor lo realizará un método llamado
    obtenerLetraMenor() al que se le pasa la frase y nos da la letra mas pequeña.

    Asimismo el trabajo de eliminar la letra de la frase original lo realizará otro
    método llamado eliminarLetra() al que se le pasa la frase y la letra a eliminar y nos da como resultado la frase modificada
 */
public class EjerciciosAvanzados10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase para ordenarla alfabéticamente:");
        String fraseOriginal = sc.nextLine();
        System.out.println(ordenar(fraseOriginal));
        sc.close();
    }

    public static String ordenar(String frase) {
        if (frase.length() == 0) {
            return "";
        }
        char letraMenor = obtenerLetraMenor(frase);
        String fraseSinLetra = eliminarLetra(frase, letraMenor);
        return letraMenor + ordenar(fraseSinLetra);
    }

    public static char obtenerLetraMenor(String frase) {
        if (frase.length() == 1) {
            return frase.charAt(0);
        }
        char primeraLetra = frase.charAt(0);
        String restoFrase = frase.substring(1);
        char menorResto = obtenerLetraMenor(restoFrase);
        if (primeraLetra < menorResto) {
            return primeraLetra;
        } else {
            return menorResto;
        }
    }

    public static String eliminarLetra(String frase, char letraAEliminar) {
        if (frase.isEmpty()) {
            return "";
        }
        char primeraLetra = frase.charAt(0);
        String restoFrase = frase.substring(1);

        if (primeraLetra == letraAEliminar) {
            return eliminarLetra(restoFrase, letraAEliminar);
        } else {
            return primeraLetra + eliminarLetra(restoFrase, letraAEliminar);
        }
    }
}
