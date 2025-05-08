package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;
    private int indiceAtual;

    public Caminho(int maxTam){
        this.tamanho = maxTam;
        this.caminho = new Coordenada[tamanho];
        this.indiceAtual = 0;
    }

    public int tamanho() {
        return indiceAtual;
    }

    public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException,
            DistanciaEntrePontosExcedidaException{
        if (indiceAtual >= tamanho) throw new TamanhoMaximoExcedidoException();

        if (indiceAtual > 0) {
            if (caminho[indiceAtual-1].distancia(coordenada) > 15) throw new DistanciaEntrePontosExcedidaException();
        }

        caminho[indiceAtual] = coordenada;
        indiceAtual++;
    }

    public void reset() {
        for (int i = 0; i < caminho.length; i++){
            caminho[i] = null;
        }
        indiceAtual = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do caminho:\n");
        sb.append("  - Quantidade de pontos: ").append(indiceAtual).append("\n");
        sb.append("  - Pontos:").append("\n");
        for (Coordenada coordenada: caminho){
            if (coordenada != null) sb.append("   -> ").append(coordenada.toString()).append("\n");
        }
        return sb.toString();
    }
}
