package ar.edu.unahur.obj2;

public class Auto {

    private double combustible;
    private double kilometraje;
    private TipoConduccion tipoConduccion;

    public Auto(double combustible, double kilometraje, TipoConduccion tipoConduccion) {
        this.combustible = combustible;
        this.kilometraje = kilometraje;
        this.tipoConduccion = tipoConduccion;
    }

    public void setTipoConduccion(TipoConduccion tipoConduccion) {
        this.tipoConduccion = tipoConduccion;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void avanzar(double kilometros) {
        double combustibleNecesario = (1/tipoConduccion.consumo())*kilometros;

        // Verifico cantidad de combustible
        if (combustible >= combustibleNecesario) {
            combustible-=combustibleNecesario;
            kilometraje+=kilometros;
        } else {
            double kilometrosPosibles = tipoConduccion.consumo()*combustible;
            combustible = 0;
            kilometraje+=kilometrosPosibles;
            throw new RuntimeException("Combustible insuficiente, solo pude recorrer "+ kilometrosPosibles);
        }
    }

}
