
public interface Volador {
void volar();
    
}
public interface Nadador {
void nadar();
    
}
public class Animal implements Volador,Nadador{
    @Override
    public void volar(){
        System.out.println("El animal quiere volar");
    }
    public void nadar(){
        System.out.println("El animal quiere nadar");
    }
    

}
public class Prueba3 {
    public static void main(String[] args) {
        Animal I = new Animal();
        I.volar();
        I.nadar();

    }
}