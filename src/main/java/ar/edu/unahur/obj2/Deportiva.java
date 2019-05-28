package ar.edu.unahur.obj2;

public class Deportiva implements TipoConduccion {

    @Override
    public double consumo() {
        return 5;
    }

    @Override
    public double velocidadMaxima() {
        return 180;
    }
}
