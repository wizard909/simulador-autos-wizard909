package ar.edu.unahur.obj2;

public class Auto {
    //antidad de combustible,
    // kilometraje, consumo y velocidad máxima y
    // tipo de conducción

    private int cantidadDeCnbustible;
    private float kilometraje;
    private int consumo;
    private float velocidadMaxima;
    private TipoDeConduccion tipoDeCoduccion;

    public Auto (TipoDeConduccion tipoDeCoduccion){
        this.tipoDeCoduccion = tipoDeCoduccion
    }
}
