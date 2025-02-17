public class Vehiculo {
    public void Moverse() {
        System.out.println("El vehiculo se mueve");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void Moverse() {
        System.out.println("la bicicleta se esta moviendo");

    }
}

class Prueba4 {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Bicicleta b1 = new Bicicleta();
        v1.Moverse();
        b1.Moverse();
    }
}