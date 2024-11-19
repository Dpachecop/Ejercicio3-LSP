public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta();
        bicicleta.acelerar(10);
        bicicleta.frenar(3);
        System.out.println("Velocidad de la bicicleta: " + bicicleta.consultarVelocidad() + " km/h");

        Transporte coche = new Coche();
        coche.acelerar(20);
        coche.frenar(5);
        System.out.println("Velocidad del coche: " + coche.consultarVelocidad() + "km/h");
    }
}
