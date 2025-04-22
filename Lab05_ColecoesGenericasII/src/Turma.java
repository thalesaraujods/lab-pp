import java.util.ArrayList;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios;

    // Construtor padrão
    public Turma() {
        this("desconhecido", "desconhecido", 0, false);
    }

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<>();
    }

    public void addHorario(int horario) {
        if (!horarios.contains(horario)) {
            horarios.add(horario);
        }
    }

    public String getHorariosString() {
        StringBuilder sb = new StringBuilder();
        for (int hora : horarios) {
            sb.append(formatarHorario(hora)).append(", ");
        }
        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 2); // remove a última vírgula e espaço
        }
        return sb.toString();
    }

    private String formatarHorario(int cod) {
        String[] dias = {"segunda", "terça", "quarta", "quinta", "sexta"};
        int[] horas = {8, 10, 12, 14, 16, 18, 20};

        int linha = (cod - 1) % 7;
        int coluna = (cod - 1) / 7;

        return dias[coluna] + " " + horas[linha] + "hs";
    }

    public String getDescricao() {
        return "Turma: " + nome + "\n" +
                "Professor: " + professor + "\n" +
                "Número de Alunos: " + numAlunos + "\n" +
                "Horário: " + getHorariosString() + "\n" +
                "Acessível: " + (acessivel ? "sim" : "não");
    }
}

