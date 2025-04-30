package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main (String [] args) {
        Celular cel1 = new Celular(1, 10, 10000000);
        Celular cel2 = new Celular(15, 15, 15000000);
        Posicao pos = new Posicao(10, 20, 30);

        Posicao pos1 = cel1.getPosicao();
        Posicao pos2 = cel2.getPosicao();

        StringBuilder sb = new StringBuilder();
        sb.append("Celular 1 \n").append(pos1.toString()).append("\n");
        sb.append("Celular 2 \n").append(pos2.toString()).append("\n");

        System.out.println(sb.toString());

        Localizavel[] objetos = new Localizavel[4];
        objetos[0] = cel1;
        objetos[1] = cel2;
        objetos[2] = new CarroLuxuoso("NDO-4I16");
        objetos[3] = new CarroLuxuoso("NOM-5637");

        for (Localizavel objeto: objetos) {
            Posicao posObj = objeto.getPosicao();
            System.out.println(posObj.toString());
        }
    }
}
