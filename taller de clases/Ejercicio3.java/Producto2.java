class Producto2 {
        String nombre;
        double precio;
        int stock;
    
        // Constructor con acceso de paquete
        Producto2(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }
    
        // Método para mostrar detalles del producto con acceso de paquete
        void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
        }
    }
    
    
