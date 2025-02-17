
public class CuentaBank {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBank(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostarDetalles() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}

class Acceso {
    public static void main(String[] args) {
        CuentaBank cb = new CuentaBank("1893", 3000, "corriente");
        // System.out.println("Numero de cuenta: " + cb.numeroCuenta);
    }
}