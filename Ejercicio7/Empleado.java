package Ejercicio7;

public abstract class Empleado {
    String nombre;
    double SalarioBase;

    public Empleado(String nombre , double SalarioBase){
        this.nombre=nombre;
        this.SalarioBase=SalarioBase;
    }
    public abstract  double calcularSalario();
    public void mostrarArea(){
        System.out.println("El nombre es:" + nombre);
        System.out.println("El salario es:" + calcularSalario());
    }
 }
class Gerente extends Empleado{
    double bono;


    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Implementación del método calcularSalario para Gerente
    @Override
    public double calcularSalario() {
        return SalarioBase + bono;
    }
}



class Vendedor extends Empleado {
    double comision;


    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }
        @Override
    public double calcularSalario() {
        return SalarioBase+ comision;
    }

}
