package ut1introducción.ejercicios2básicos;

/*
Programa Java que declare una variable C de tipo entero y asígnale un valor.
A continuación, muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        int C = 55;
        System.out.println((C >= 0) ? "C es un número positivo" : " C es un número negativo");
        System.out.println((C % 2 == 0) ? "C es un número par" : "C es un número impar");
        System.out.println((C % 5 == 0) ? "C es múltiplo de 5" : "C no es múltiplo de 5");
        System.out.println((C % 10 == 0) ? "C es múltiplo de 10" : "C no es múltiplo de 10");
        System.out.println((C > 100) ? "C es mayor que 100" : "C es menor que 100");
    }
}
