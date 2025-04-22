public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    public Sala() {
        this(0, 0, 0, false);
    }

    public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    public String getDescricao() {
        return "Bloco " + bloco + ", Sala " + sala + " (" + capacidade + " lugares, "
                + (acessivel ? "acessível" : "não acessível") + ")";
    }
}
