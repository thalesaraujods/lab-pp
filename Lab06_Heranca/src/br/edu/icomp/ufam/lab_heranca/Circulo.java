package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
    public double raio;

    public Circulo(int posX, int posY, double raio){
        super(posX, posY);
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI * Math.pow(raio, 2); // ou raio * raio
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString(){
        return "Círculo na " + getPosString() + " com raio de " + raio +
                "cm (área=" + getArea() + "cm2, perímetro=" + getPerimetro()
                + "cm)";
    }

}
