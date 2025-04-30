package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain2 {
    public static void main (String [] args) {
        Celular cel1 = new Celular(1, 10, 10000000);
        Celular cel2 = new Celular(15, 15, 15000000);

        Localizavel[] objects = new Localizavel[3];
        objects[0] = new Celular(7, 45, 10001000);
        objects[1] = new Celular(5, 3, 15600000);
        objects[2] = new CarroLuxuoso("ABC-43I9");

        for (Localizavel objeto: objects) {
            Posicao posObj = objeto.getPosicao();
            System.out.println(posObj.toString());
        }
    }
}
