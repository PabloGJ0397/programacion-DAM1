package ut1introducción.ejercicios1básicos;

/*
Programa Java que declare una variable A de tipo entero y asígnale un valor.
A continuación, muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        int numeroEntero = 7;
        System.out.println((numeroEntero % 2 == 0)? "Es un número par": "Es un número impar");
    }
}
