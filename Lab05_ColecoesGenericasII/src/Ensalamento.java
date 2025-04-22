import java.util.ArrayList;
import java.util.Comparator;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    public Ensalamento() {
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento = new ArrayList<TurmaEmSala>();
    }

    public void addSala(Sala sala) {
        if (!salas.contains(sala)) {
            salas.add(sala);
        }
    }

    public void addTurma(Turma turma) {
        if (!turmas.contains(turma)) {
            turmas.add(turma);
        }
    }

    public Sala getSala(Turma turma) {
        for (TurmaEmSala ensalamento : ensalamento) {
            if (ensalamento.turma == turma) {
                return ensalamento.sala;
            }
        }
        return null;
    }

    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala ensalamento : ensalamento) {
            if (ensalamento.sala == sala) {
                if (ensalamento.turma.horarios.contains(horario)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (TurmaEmSala ensalamento : ensalamento) {
            if (ensalamento.sala == sala) {
                for (int horario : horarios) {
                    if (!salaDisponivel(ensalamento.sala, horario)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean alocar(Turma turma, Sala sala) {
        if (turma.acessivel && !sala.acessivel) return false;
        if (turma.numAlunos > sala.capacidade) return false;
        if (!salaDisponivel(sala, turma.horarios)) return false;

        ensalamento.add(new TurmaEmSala(turma, sala));
        return true;
    }

    public void alocarTodas() {
        for (Turma turma : turmas) {
            boolean alocada = false;
            for (Sala sala : salas) {
                if (alocar(turma, sala)) {
                    alocada = true;
                    break; // encontrou uma sala válida, passa para a próxima turma
                }
            }
        }
    }

    public int getTotalTurmasAlocadas() {
        int soma = 0;

        for (TurmaEmSala ensalamento : ensalamento) {
            if (ensalamento.sala != null) {
                soma += 1;
            }
        }

        return soma;
    }

    public int getTotalEspacoLivre() {
        int soma = 0;

        for (TurmaEmSala ensalamento : ensalamento) {
            soma += (ensalamento.sala.capacidade - ensalamento.turma.numAlunos);
        }

        return soma;
    }

    public String relatorioResumoEnsalamento() {
        return "Total de Salas: " + salas.size() + "\n" +
                "Total de Turmas: " + turmas.size() + "\n" +
                "Turmas Alocadas: " + ensalamento.size() + "\n" +
                "Espaços Livres: " + getTotalEspacoLivre();
    }

    public String relatorioTurmasPorSala() {
        StringBuilder sb = new StringBuilder();
        sb.append(relatorioResumoEnsalamento()).append("\n \n");

        for (Sala sala : salas){
            sb.append("--- ").append(sala.getDescricao()).append(" --- \n \n");

            for (TurmaEmSala ens : ensalamento) {
                if (ens.sala.equals(sala)) {
                    sb.append(ens.turma.getDescricao()).append("\n\n");
                }
            }
        }

        return sb.toString();
    }

    public String relatorioSalasPorTurma() {
        StringBuilder sb = new StringBuilder();
        sb.append(relatorioResumoEnsalamento()).append("\n \n");

        for (Turma turma : turmas) {
            sb.append(turma.getDescricao()).append("\n");

            Sala sala = getSala(turma);
            if (sala != null) {
                sb.append("Sala: ").append(sala.getDescricao()).append("\n\n");
            } else {
                sb.append("Sala: SEM SALA\n\n");
            }
        }

        return sb.toString();
    }
}
