package ut2estructurasdecontrol.ejerciciosavanzados;

/*
Muestra los números primos entre 1 y 100.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // recorre los números del 2 (el 1 no es primo) al 100//

        for (int i = 2; i < 100; i++) {
            // variable contador, cuando sea = 2 significará que el número es primo.
            int count = 0;
            // para el valor j = 1, mientras j sea menor que i, divide i entre j y si es 0 suma 1 al contador.
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            //si el contador solo ha contado 2 debe ser primo.
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}
