package model;
import model.interfaces.Folha;
import enums.Classificacao;
import service.ProfessorService;

public final class Professor extends Pessoa implements Folha {
    private String especialização;

    public Professor(String especialização) {
        this.especialização = especialização;
    }

    public Professor(){}

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }
    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Professor);
    }
    @Override
    public String toString() {
        return super.toString()+ "Especialização: " + especialização;
    }
    @Override
    public void calculaSalario() {
        System.out.println("(horas trabalhadas x valor hora)");

    }
}