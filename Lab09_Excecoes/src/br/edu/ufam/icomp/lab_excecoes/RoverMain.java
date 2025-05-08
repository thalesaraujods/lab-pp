package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        Caminho caminho = new Caminho(6);

        try {
            Coordenada c1 = new Coordenada(10, 10, 0);
            Coordenada c2 = new Coordenada(5, 5, 0); // distância válida
            Coordenada c3 = new Coordenada(3000, 3000, 0); // distância inválida (> 15)
            Coordenada c4 = new Coordenada(-5, 5, 0); // coordenada negativa
            Coordenada c5 = new Coordenada(50000, 200, 0); // fora dos limites
            Coordenada c6 = new Coordenada(10, 10, 9); // dígito inválido

            caminho.addCoordenada(c1);
            caminho.addCoordenada(c2);
            caminho.addCoordenada(c3);
            caminho.addCoordenada(c4);
            caminho.addCoordenada(c5);
            caminho.addCoordenada(c6);

            System.out.println(caminho);
        } catch (RoverException e) {
            System.out.println("Erro ao processar caminho: " + e.getMessage());
            caminho.reset();
        }
    }
}