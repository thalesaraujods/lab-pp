public class TurmaMain {
    public static void main(String[] args) {
//        Aluno aluno1 = new Aluno();
//        Aluno aluno2 = new Aluno();
//        Aluno aluno3 = new Aluno();
//        System.out.println(aluno1.getDescricao());
//        System.out.println(aluno1.getIdade());
//
//        Professor professor1 = new Professor();
//        System.out.println(professor1.getDescricao());

        Turma turma = new Turma("Projeto de Programas", 2025, 1,
                new Professor("Dr.", "Horacio", 219001));

        Aluno aluno1 = new Aluno("Thales", 21950521, 2000);
        turma.addAluno(aluno1);

        Aluno aluno2 = new Aluno("Anne", 21950522, 1999);
        turma.addAluno(aluno2);

        turma.addAluno(aluno1);

        System.out.println(turma.getAluno(0000));
        System.out.println(turma.getAluno(21950521));
        System.out.println(turma.getMediaIdade());
        System.out.println(turma.getDescricao());
    }
}
