package ut2estructurasdecontrol.ejerciciosbasicos;

/*
Programa Java que lea un número entero y calcule si es par o impar.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int entero = 27;
        System.out.println((entero % 10 == 0) ? "Es múltiplo de 10" : "No es múltiplo de 10");
    }
}
