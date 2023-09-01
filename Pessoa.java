public class Pessoa {
    String nome;

    private void setNome(String name){
        this.nome = name;
    }

    private String getNome(){
        return this.nome;
    }

    public Pessoa(String name) {
        this.nome = name;
    }
}
