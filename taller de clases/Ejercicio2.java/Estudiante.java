public class Estudiante {
        String nombre;
        int edad;

        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public Estudiante() {
            this("Desconocido", 0);
        }
    
        public void imprimirDetalles() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    
        public static void main(String[] args) {
            Estudiante estudiante1 = new Estudiante();
            Estudiante estudiante2 = new Estudiante("Carlos", 20);
            
            estudiante1.imprimirDetalles();
            estudiante2.imprimirDetalles();
        }
    }
    
