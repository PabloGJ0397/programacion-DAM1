package ut2estructurasdecontrol.ejerciciosbasicos;

/*
Escribir un programa en Java que multiplique los 20 primeros números naturales (12345…). --> FACTORIAL 20!
 */
public class Ejercicio18 {
    static void main(String[] args) {
        /* i va a incrementarse cada vez (va a representar los números naturales del 1 al 20)
        number es la variable resultado (cambia cada vez que se multiplica por i)
        1 = 1 x 1 = 1
        1 = 1 x 2 = 2
        2 = 2 x 3 = 6
        6 = 6 x 4 = 24
        24= 24 x 5 = ...
         */
        long number = 1;

        for (int i = 1; i <= 20; i++) {
            number = number * i;
        }
        System.out.println("el resultado es: " + number);


    }
}
