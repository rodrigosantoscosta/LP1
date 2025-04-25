public final class Professor extends Pessoa{
    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public CARGO cargo;
    public Professor(int idade, String nome, String especialidade) {
        super(idade, nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    private String especialidade;

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o professor" + getNome());
    }

    @Override
    public void minhAtividade() {
        System.out.println("Eu ministro aula, minha especialidade é " + getEspecialidade());
    }

}
