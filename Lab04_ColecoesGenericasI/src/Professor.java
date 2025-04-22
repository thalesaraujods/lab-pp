public class Professor {
    String titulacao;
    String nome;
    int matricula;

    Professor() {
        this("desconhecida", "desconhecido", 0000);
    }

    Professor(String titulacao, String nome, int matricula) {
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }

    String getDescricao() {
        return "Prof. " + titulacao + " " + nome + " - mat " + matricula;
    }
}
