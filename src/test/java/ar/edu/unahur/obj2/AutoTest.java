package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AutoTest {

    @Test
    public void auto1() {

        TipoConduccion ecologico = new Ecologica();
        Auto auto1 = new Auto(100, 0, ecologico);
        auto1.avanzar(16);
        Assert.assertEquals(auto1.getCombustible(),99.0);
        Assert.assertEquals(auto1.getKilometraje(),16.0);

        TipoConduccion deportivo = new Deportiva();

        auto1.setTipoConduccion(deportivo);

        auto1.avanzar(5);
        Assert.assertEquals(auto1.getCombustible(),98.0);
        Assert.assertEquals(auto1.getKilometraje(),21.0);

    }



}