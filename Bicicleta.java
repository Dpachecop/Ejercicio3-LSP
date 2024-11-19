class Bicicleta extends Transporte {

    @Override
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        } else {
           System.out.println("Tienen que ser valores positivos para acelerar");;
        }
    }

    @Override
    public void frenar(int decremento) {
        if (decremento > 0 && velocidad >= decremento) {
            velocidad -= decremento;
        } else {
           System.out.println("No se puede frenar a esa velocidad, baje el valor frenado a la velocidad actual");;
        }
    }
}
