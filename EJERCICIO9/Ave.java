public interface Volador{
    void volar();
}

public interface Cantante {
void cantar();
    
}
public class Ave implements Volador,Cantante{
 @Override
 public void volar(){
    System.out.println("Las aves estan volando");
 }
 public void cantar(){
    System.out.println("La ave esta cantando");
 }
    
}
    public class Prueba {
    public static void main(String[] args) {
        Ave M = new Ave();
        M.cantar();
        M.volar();
    }
        
    }
