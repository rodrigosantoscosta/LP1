package model;
import enums.Classificacao;

public final class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Aluno);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}