package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosprincipiantes;

//Implementa dos métodos llamados multiplicar:
//    •Uno que reciba dos enteros y devuelva la multiplicación.
//    •Otro que reciba tres enteros y devuelva la multiplicación.
//    •Llama a ambos desde el main y muestra los resultados.

public class EjerciciosPrincipiantes11 {
    static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;
        int num3 = -46;
        int producto = multiplicar(num1, num3);
        System.out.println(producto);
        producto = multiplicar(num1, num2, num3);
        System.out.println(producto);
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

}
