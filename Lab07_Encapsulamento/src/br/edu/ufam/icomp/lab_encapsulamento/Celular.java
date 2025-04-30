package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular implements Localizavel {
    private int codPais;
    private int codArea;
    private int numero;

    public Celular(int codPais, int codArea, int numero) {
        setCodPais(codPais);
        setCodArea(codArea);
        setNumero(numero);
    }

    public final void setCodPais(int codPais) {
        if (1 <= codPais && codPais <= 1999) this.codPais = codPais;
        else this.codPais = -1;
    }

    public int getCodPais() {
        return codPais;
    }

    public final void setCodArea(int codArea) {
        if (10 <= codArea && codArea <= 99) this.codArea = codArea;
        else this.codArea = -1;
    }

    public int getCodArea() {
        return codArea;
    }

    public final void setNumero(int numero) {
        if (10000000 <= numero && numero <= 999999999) this.numero = numero;
        else this.numero = -1;
    }

    public int getNumero() {
        return numero;
    }

    public Posicao getPosicao() {
        Random r = new Random();

        double latitude = (-3.16) + ((-2.96) - (-3.16)) * r.nextDouble();
        double longitude = (-60.12) + ((-59.82) - (-60.12)) * r.nextDouble();
        double altitude = 15 + (100 - 15) * r.nextDouble();

        return new Posicao(latitude, longitude, altitude);
    }

    public double getErroLocalizacao() {
        return 50;
    }
}
