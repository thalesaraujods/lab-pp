public class TurmaEmSala {
    Turma turma;
    Sala sala;

    public TurmaEmSala(){
        this(new Turma(), new Sala());
    }

    public TurmaEmSala(Turma turma, Sala sala){
        this.turma = turma;
        this.sala = sala;
    }
}
