package Ejercicio7;

// Clase abstracta Figura
public abstract class Error {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método para mostrar el área
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}

// Clase derivada Circulo
class Circulo extends Error {
    double radio;

    // Constructor de la clase Circulo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea para el Circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área del círculo
    }
}

// Clase derivada Rectangulo
class Rectangulo extends Error {
    double base;
    double altura;

    // Constructor de la clase Rectangulo
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea para el Rectangulo
    @Override
    public double calcularArea() {
        return base * altura; // Fórmula del área del rectángulo
    }
}

// Clase principal con un ejemplo incorrecto de uso de clases abstractas
class Main {
    public static void main(String[] args) {
        // Ejemplo incorrecto: no se puede instanciar una clase abstracta directamente
        // Esto lanzará un error de compilación porque no se puede crear una instancia de Figura
        // Figura figura = new Figura(); // Esto está mal, Figura es abstracta y no puede ser instanciada
        
        // Corrección: Instanciamos las clases derivadas, que sí pueden ser creadas
        Error circulo = new Circulo(5); // Creamos un objeto Circulo
        Error rectangulo = new Rectangulo(4, 7); // Creamos un objeto Rectangulo

        // Mostrar el área de cada figura
        System.out.println("Área del Círculo:");
        circulo.mostrarArea(); // Muestra el área del círculo
        System.out.println("\nÁrea del Rectángulo:");
        rectangulo.mostrarArea(); // Muestra el área del rectángulo
    }
}
