package ut1introducción.ejercicios1básicos;

/* Declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor.
A continuación realiza y muestra por pantalla una serie de operaciones entre ellas.  */
public class Ejercicio_7 {
    public static void main(String[] args) {
        int x, y;
        double n, m;
        x = 2;
        y = 4;
        n = 6;
        m = 8;
        System.out.println(" x * y = " + (x * y));
        System.out.println("x + n = " + (x + n));
        System.out.println("m / n = " + (m / n));
        System.out.println("x - m = " + (x - m));
        System.out.println("m * n = " + (m * n));
        System.out.println("x / y = " + ((float) x / y));
    }
}
