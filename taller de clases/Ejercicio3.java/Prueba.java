// Definimos todas las clases en un solo archivo, sin usar paquetes

// Clase Vehiculo
class Vehiculos {
    // Hacemos que la propiedad tipo sea protected para poder acceder desde la clase Moto
    protected String tipo;

    // Constructor
    public Vehiculos(String tipo) {
        this.tipo = tipo;
    }

    // Método para obtener el tipo
    public String getTipo() {
        return tipo;
    }

    // Método para establecer el tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método de presentación
    public void mostrarInfo() {
        System.out.println("Este es un vehículo de tipo: " + tipo);
    }
}

// Clase Moto, que hereda de Vehiculo
class Moto extends Vehiculos {

    // Constructor que llama al constructor de la clase padre (Vehiculo)
    public Moto(String tipo) {
        super(tipo);
    }

    // Método adicional para mostrar información específica de la moto
    @Override
    public void mostrarInfo() {
        System.out.println("Esta es una moto de tipo: " + getTipo());
    }
}

// Clase de prueba para crear objetos y probar las clases anteriores
public class Prueba {
    public static void main(String[] args) {
        // Crear un objeto de la clase Vehiculo
        Vehiculos vehiculo = new Vehiculos("Coche");

        // Crear un objeto de la clase Moto
        Moto moto = new Moto("Deportiva");

        // Usar los métodos de las clases
        vehiculo.mostrarInfo();  // Imprime información del vehículo
        moto.mostrarInfo();      // Imprime información de la moto

        // Accediendo a la propiedad tipo a través del getter y setter
        vehiculo.setTipo("Camión"); // Usamos el setter para cambiar el tipo
        moto.setTipo("Cruiser");    // Usamos el setter para cambiar el tipo

        // Mostramos la información actualizada
        System.out.println("Después de actualizar el tipo:");
        vehiculo.mostrarInfo();  // Imprime la nueva información del vehículo
        moto.mostrarInfo();      // Imprime la nueva información de la moto
    }
}
