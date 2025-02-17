public class Utilidades {

    public static double Suma(int a, int b) {
        return a + b;
    }

    public static double Resta(int a, int b) {
        return a - b;
    }

    public static double Multiplicacion(int a, int b) {
        return a * b;
    }

    public static double Division(int a, int b) {
        return a / b;
    }
}

class Prueba8 {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.Suma(5, 5));
        System.out.println("Resta: " + Utilidades.Resta(4, 9));
        System.out.println("Multiplicacion: " + Utilidades.Multiplicacion(65, 4));
        System.out.println("Division: " + Utilidades.Division(67, 34));
    }
}