package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX;
    private int posY;
    private int digito;

    public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException,
            CoordenadaForaDosLimitesException, DigitoInvalidoException {
        this.posX = posX;
        this.posY = posY;
        this.digito = digito;

        if (posX < 0 || posY < 0) throw new CoordenadaNegativaException();
        if (posX > 30000 || posY > 30000) throw new CoordenadaForaDosLimitesException();
        if (digito < 0 || digito > 9) throw new DigitoInvalidoException();
        if (digito != (posX + posY) % 10) throw new DigitoInvalidoException();
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public double distancia(Coordenada coordenada) {
        double distanceX = Math.pow(coordenada.posX - posX, 2);
        double distanceY = Math.pow(coordenada.posY - posY, 2);
        return Math.sqrt(distanceX + distanceY);
    }

    public String toString() {
        return posX + ", " + posY;
    }


}
