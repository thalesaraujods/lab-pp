import java.util.ArrayList;

public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno>  alunos  = new ArrayList<Aluno>();

    Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
    }

    void addAluno(Aluno aluno) {
        Aluno alunoAux = getAluno(aluno.matricula);
        if (alunoAux == null) {
            alunos.add(aluno);
        }
    }

    Aluno getAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula == matricula) {
                return aluno;
            }
        }
        return null;
    }

    double getMediaIdade() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        int somaIdade = 0;
        for (Aluno aluno: alunos){
            somaIdade += aluno.getIdade();
        }
        return (double) somaIdade / alunos.size();
    }

    String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Turma ").append(disciplina).append(" - ").append(ano).append("/").append(semestre)
                .append(" (").append(professor.getDescricao()).append("):\n");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            descricao.append("  - Aluno ").append(i+1).append(": ").append(aluno.getDescricao()).append("\n");
        }
        return descricao.toString();
    }
}
