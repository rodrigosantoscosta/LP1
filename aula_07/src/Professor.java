//Java no dia menos verboso:
public final class Professor extends Pessoa implements Remuneravel{
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

    public Professor(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o professor" + getNome());
    }

    @Override
    public void minhAtividade() {
        System.out.println("Eu ministro aula, minha especialidade é " + getEspecialidade());
    }


    @Override
    public void calcularSalario() {
        System.out.println(getNome() + " tem um salário irado.");
    }

    @Override
    public void aplicarBonus() {
        System.out.println(getNome() +" recebeu um bonus bem sensacional.");
    }
}
