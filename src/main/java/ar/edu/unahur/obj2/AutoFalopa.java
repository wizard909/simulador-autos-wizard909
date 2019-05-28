package ar.edu.unahur.obj2;

public class AutoFalopa {

    private double combustible;
    private double kilometraje;

    private boolean ecologico;

    public AutoFalopa(double combustible, double kilometraje, boolean ecologico) {
        this.combustible = combustible;
        this.kilometraje = kilometraje;
        this.ecologico = ecologico;
    }

    public void avanzar(double kilometros) {
        double combustibleNecesario;

        // Calculo combustible necesario
        if (ecologico) {
            combustibleNecesario = (1/16) * kilometros;
        } else {
            combustibleNecesario = (1/5) * kilometros;
        }

        // Verifico cantidad de combustible
        if (combustible >= combustibleNecesario) {
            combustible-=combustibleNecesario;
            kilometraje+=kilometros;
        } else {
            double kilometrosPosibles;
            if (ecologico) {
                kilometrosPosibles = (1/16) * combustible;
            } else {
                kilometrosPosibles = (1/5) * combustible;
            }
            combustible = 0;
            kilometraje+=kilometrosPosibles;
            throw new RuntimeException("Combustible insuficiente, solo pude recorrer "+ kilometrosPosibles);
        }
    }

    public void setEcologico(boolean ecologico) {
        this.ecologico = ecologico;
    }
}
