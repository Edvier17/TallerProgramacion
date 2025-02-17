
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("No hay nombre");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("No hay edad/No puede ser negativo");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("No hay nota promedio");
        }
    }

}

class Prueba5 {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan Jose", 1, 5);
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Nota Promedio: " + e1.getNotaPromedio());
    }
}