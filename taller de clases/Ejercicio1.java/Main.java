import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //libro
        System.out.print("Título del libro: ");
        String Titulo = sc.nextLine();
        System.out.print("Autor del libro: ");
        String Autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        int numPaginas = Integer.parseInt(sc.nextLine());
        Libro libro = new Libro(Titulo, Autor, numPaginas);

        //CuentaBancaria
        System.out.print("\nNúmero de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Tipo de cuenta: ");
        String TipoDecuenta = sc.nextLine();
        System.out.print("Saldo: ");
        int Saldo = sc.nextInt();
        CuentaBancaria cuenta = new CuentaBancaria (numeroCuenta, TipoDecuenta);

        //Estudiante
        System.out.print("\nNombre del estudiante: ");
        String Nombre = sc.nextLine();
        System.out.print("Edad: ");
        int Edad = Integer.parseInt(sc.nextLine());
        System.out.print("Curso: ");
        String Curso = sc.nextLine();
        //Estudiante estudiante = new Estudiante(Nombre, Edad, Curso);

        // Mostrar detalles de cada objeto usando toString()
        System.out.println("\nDetalles del Libro: " + libro);
        System.out.println("Detalles de la Cuenta Bancaria: " + cuenta);
        //System.out.println("Detalles del Estudiante: " + estudiante);

        sc.close();
    }
}
