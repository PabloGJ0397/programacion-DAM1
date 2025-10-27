package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosprincipiantes;

//Crea un método mostrar para imprimir: un String, un int, un double.

public class EjerciciosPrincipiantes12 {
    static void main(String[] args) {
        String mensaje = "inputA e inputB son variables numéricas";
        int inputA = 1521;
        double inputB = 13.12;
        mostrar(mensaje, inputA, inputB);
    }

    static void mostrar(String s, int a, double b) {
        System.out.println("mensaje entrante: " + s +
                ", A es igual a " + a +
                ", B es igual a " + b);
    }

}
