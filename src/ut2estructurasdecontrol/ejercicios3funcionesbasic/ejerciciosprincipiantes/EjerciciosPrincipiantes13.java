package ut2estructurasdecontrol.ejercicios3funcionesbasic.ejerciciosprincipiantes;

//Sobrecarga un método saludar que pueda recibir: sin parámetros, un nombre, un nombre y unos apellidos.
public class EjerciciosPrincipiantes13 {
    static void main(String[] args) {
        String nombre = "Juan Ramón";
        String apellidos = "Martínez López";
        System.out.println(saludar());
        System.out.println(saludar(nombre));
        System.out.println(saludar(nombre, apellidos));
    }

    public static String saludar() {
        return "No hay parámetros que mostrar";
    }

    public static String saludar(String name) {
        return "El nombre es: " + name;

    }

    public static String saludar(String name, String surname) {
        return "El nombre completo es: " + name + " " + surname;
    }
}
