package Ejercicio7;

public abstract class Figura{
   public abstract double calcularArea();
   public void mostrarArea(){
    System.out.println("El area es:" + calcularArea());
   }

}
  class circulo extends Figura{
   double radio;

   public circulo(double radio){
    this.radio=radio;

   }
   @Override
   public double calcularArea(){
    return Math.PI *radio *radio;
   }
 }
  class rectangulo extends Figura{
    double base;
    double altura;
    
    public rectangulo( double base , double altura){
        this.base=base;
        this.altura=altura;

    }
    @Override
    public double calcularArea(){
     return base *altura;
    }
    
}