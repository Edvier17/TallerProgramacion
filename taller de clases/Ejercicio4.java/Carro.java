
    public class Carro {
        private String marca;
        private String modelo;
        private double velocidadMaxima;
    
        public Carro(String marca, String modelo, double velocidadMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadMaxima = velocidadMaxima;
        }
       
        public void Acelerar(double incremento) {
            if (incremento > 0) {
                velocidadMaxima += incremento;
            }
        }
    }
    
    class prueba6 {
        public static void main(String[] args) {
            Carro coche1 = new Carro("Toyota", "Corolla", 180);

            coche1.Acelerar(20);
        }
    }
    

