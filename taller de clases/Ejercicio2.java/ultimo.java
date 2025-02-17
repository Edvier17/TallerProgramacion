public class ultimo {
    public class Producto {
        private static String nombre;
        private static double precio;
    
        // Constructor con parámetros
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    
        // Método estático que intenta utilizar `this` (esto causará un error de compilación)
        public static void mostrarInfoStatic() {
            // Esto generará un error porque `this` no puede ser usado en un método estático
            System.out.println("Producto: " + nombre);  // Error: `this` no puede ser usado en un método estático
            System.out.println("Precio: " + precio);   // Error: `this` no puede ser usado en un método estático
        }
    
        // Método main para probar la clase
        public static void main(String[] args) {
            Producto.mostrarInfoStatic();  // Intentamos llamar al método estático
        }

    }
 }
