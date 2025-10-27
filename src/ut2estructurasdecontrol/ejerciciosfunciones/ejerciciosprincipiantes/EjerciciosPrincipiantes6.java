package ut2estructurasdecontrol.ejerciciosfunciones.ejerciciosprincipiantes;

// Implementa un método que calcule el máximo de 3 números.
public class EjerciciosPrincipiantes6 {
    public static void main() {
        int num1 = 4;
        int num2 = 12;
        int num3 = 322;
        int mayor = calculoMayor(num1, num2, num3);
        System.out.println("El mayor es " + mayor);

    }

    static int calculoMayor(int a, int b, int c) {
        if (a > b && b > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }

    }
}
