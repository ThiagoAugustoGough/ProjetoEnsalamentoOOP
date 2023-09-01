public class Ensalamento {

    String[] nomeAlunos = new String[] {"Alfredo", "Peterson", "Wendel", "Ian", "Debra", "Luana", "Bruno", "Bruno", "Romeu", "Julieta", "Maria", "Capitu", "Bentinho"};

    //Criando os dois cursos
    Curso tech = new Curso("Tecnologia");
    Curso adm = new Curso("Administração");

    //Criando as Disciplinas
    Disciplina poo = new Disciplina(,"POO");
    Disciplina ed = new Disciplina("E.D");
    Disciplina bi = new Disciplina("B.I");


    //Criando os alunos
    for(int i = 0; i < nomeAlunos[].length; i++){
        if(i % 2 == 0) {
            alunos[i] = new Aluno(nomeAlunos[i], tech);
        }
        else{
            alunos[i] = new Aluno(nomeAlunos[i], adm);
        }
    }
}
