
public class Persona {
    public void Presentarse() {
        System.out.println("Persona: Buenos dias!!");
    }
}

class Estudiante extends Persona {
    @Override
    public void Presentarse() {
        System.out.println("Estudiante: Buenas dias profesor");
    }
}

class Profesor extends Persona {
    @Override
    public void Presentarse() {
        System.out.println("Profesor: Buenos dias alumnos");
    }
}

class Prueba3 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Estudiante e1 = new Estudiante();
        Profesor pro = new Profesor();
        p1.Presentarse();
        e1.Presentarse();
        pro.Presentarse();
    }
}