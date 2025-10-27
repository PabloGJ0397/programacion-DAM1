package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;

//Sobrecarga sumar: crea versiones que sumen dos, tres y cuatro enteros.
public class EjerciciosPrincipiantes10 {
    static void main(String[] args) {
        int num1 = 7;
        int num2 = 23;
        int num3 = -12;
        int num4 = 8;
        int suma = sumar(num1, num3);
        System.out.println(suma);
        suma = sumar(num3, num4, num2);
        System.out.println(suma);
        suma = sumar(num1, num2, num3, num4);
        System.out.println(suma);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
