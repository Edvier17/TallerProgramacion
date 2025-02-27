
public interface Hablador {
  void Hablar();
    
}
public interface Trabajador {
  void trabajar();

    
}
public class Persona implements Hablador,Trabajador{
    @Override
    public void Hablar(){
    System.out.println("La persona esta hablando");
    }
    public void trabajar(){
        System.out.println("La persona le gusta trabajar");
    }
    
}
public class Funcion {
  public static void main(String[] args) {
    Persona O = new Persona();

    O.trabajar();
    O.Hablar();

  }
    
}