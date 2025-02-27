
public interface Nadador {
void nadar();
    
}
public interface Respirador {
void respirar();
    
}
public class Pez implements Nadador,Respirador{
    @Override
    public void nadar(){
        System.out.println("Los pez estan nadando");

    }
    public void respirar(){
        System.out.println("El pez respira");
    }
    
}
public class prueba2 {

    public static void main(String[] args) {
        Pez L = new Pez();
        L.nadar();
        L.respirar();
    }
}
