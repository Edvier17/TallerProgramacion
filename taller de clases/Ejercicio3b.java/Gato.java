public class Gato {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Gatito extends Gato {
    public void hacerSonido(String tipo) {
        System.out.println("El gato maulla: " + tipo);
    }
}

class Prueba2 {
    public static void main(String[] args) {
        Gato purru = new Gato();
        purru.hacerSonido();
    }
}
