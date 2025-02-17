public class CuentaBancaria {
   String NumeroCuenta;
   int Saldo;
   String TipoDeCuenta; 

   public CuentaBancaria(){

    NumeroCuenta = "123456789";
    Saldo = 0;
    TipoDeCuenta = "Ahorros";

   }
   
   public CuentaBancaria(String numeroCuenta, String tipoDeCuenta){
    this.NumeroCuenta=numeroCuenta;
    this.TipoDeCuenta=tipoDeCuenta;
   }
   public CuentaBancaria(String numeroCuenta,int Saldo,String tipoDeCuenta){
    this( numeroCuenta , tipoDeCuenta);
    this.Saldo=Saldo;
   }
   public String toString() {
    return "Cuenta #" + NumeroCuenta + " (" + TipoDeCuenta + "), Saldo: $" + Saldo;
}
}
