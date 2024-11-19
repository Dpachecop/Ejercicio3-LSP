abstract class Transporte {
    protected int velocidad;

    public Transporte() {
        this.velocidad = 0;
    }

    public abstract void acelerar(int incremento);

    public abstract void frenar(int decremento);

    public int consultarVelocidad() {
        return velocidad;
    }
}