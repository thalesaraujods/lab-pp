import java.util.ArrayList;

public class EnsalamentoMain {
    public static void main(String [] args){
        Ensalamento ensalamento = new Ensalamento();

        // criando algumas salas
        Sala s1 = new Sala(6, 101, 50, true);
        Sala s2 = new Sala(6, 102, 100, true);
        Sala s3 = new Sala(6, 203, 50, false);
        Sala s4 = new Sala(6, 204, 100, false);

        // adicionando as salas ao ensalamento
        ensalamento.addSala(s1);
        ensalamento.addSala(s2);
        ensalamento.addSala(s3);
        ensalamento.addSala(s4);

        // criando algumas turmas
        Turma t1 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
        t1.addHorario(1);  // segunda 8h
        t1.addHorario(15); // quarta 8h
        t1.addHorario(29); // sexta 8h

        Turma t2 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
        t2.addHorario(4);  // segunda 14h
        t2.addHorario(18); // quarta 14h
        t2.addHorario(32); // sexta 14h

        Turma t3 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
        t3.addHorario(1);  // segunda 8h
        t3.addHorario(15); // quarta 8h
        t3.addHorario(29); // sexta 8h

        Turma t4 = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
        t4.addHorario(2);  // segunda 10h
        t4.addHorario(16); // quarta 10h

        // adicionando as turmas ao ensalamento
        ensalamento.addTurma(t1);
        ensalamento.addTurma(t2);
        ensalamento.addTurma(t3);
        ensalamento.addTurma(t4);

        // realiza o ensalamento
        ensalamento.alocarTodas();

        // Imprime relatórios
        System.out.println("\n===== RELATÓRIO TURMAS POR SALA =====\n");
        System.out.println(ensalamento.relatorioTurmasPorSala());

        System.out.println("\n===== RELATÓRIO SALAS POR TURMA =====\n");
        System.out.println(ensalamento.relatorioSalasPorTurma());
    }
}
