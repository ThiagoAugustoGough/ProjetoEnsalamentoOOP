public class Aluno extends Pessoa{

    Curso curso;

    public Aluno(String name, Curso curso) {
        super(name);
        this.curso = curso;
    }
}
