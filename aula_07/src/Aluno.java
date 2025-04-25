public class Aluno extends Pessoa{
    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public CARGO cargo;

    public Aluno(int idade, String nome, String matricula) {
        super(idade, nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private String matricula;



    @Override
    public String toString() {
        return "Aluno{" +
                "Matrícula='" + matricula + '\'' +
                '}';
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou um aluno, meu nome é" + getNome());
    }

    @Override
    public void minhAtividade() {
        System.out.println("Eu só faço estudar.");
    }
}
