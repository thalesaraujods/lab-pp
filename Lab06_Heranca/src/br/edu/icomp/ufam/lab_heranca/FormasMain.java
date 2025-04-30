package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
    public static void main (String [] args) {
        FormaGeometrica formas[] = new FormaGeometrica[3];

        Circulo circ = new Circulo(3, 4, 5);
        Retangulo ret = new Retangulo(10, 11, 5, 6);
        Quadrado quad = new Quadrado(5, 6, 9);

        formas[0] = circ;
        formas[1] = ret;
        formas[2] = quad;

        for (FormaGeometrica forma: formas){
            System.out.println(forma);
        }

    }
}
