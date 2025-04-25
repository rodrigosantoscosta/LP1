
public abstract class  Pessoa  {


    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String nome;
    protected int idade;

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public abstract void quemSouEu();
    public abstract void minhAtividade();
}
