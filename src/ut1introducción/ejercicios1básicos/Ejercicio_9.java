package ut1introducción.ejercicios1básicos;

/* Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
 A continuación, realiza las instrucciones necesarias para que:
 B tome el valor de C,
 C tome el valor de A,
 A tome el valor de D,
 D tome el valor de B.*/
public class Ejercicio_9 {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 5;
        int d = 7;
        int aux = 0;
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
    }
}
