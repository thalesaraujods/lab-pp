package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class CarroLuxuoso extends Carro implements Localizavel {
    public CarroLuxuoso(String placa) {
        super(placa);
    }

    public Posicao getPosicao() {
        Random r = new Random();

        double latitude = (-3.16) + ((-2.96) - (-3.16)) * r.nextDouble();
        double longitude = (-60.12) + ((-59.82) - (-60.12)) * r.nextDouble();
        double altitude = 15 + (100 - 15) * r.nextDouble();

        return new Posicao(latitude, longitude, altitude);
    }

    public double getErroLocalizacao() {
        return 15;
    }
}
