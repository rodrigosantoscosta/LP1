import model.Aluno;
import model.Professor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setIdade(40);
        p.setNome("Roberto");
        p.setEspecialização("Engenharia de Software");

        p.quem_sou_eu();
        System.out.println(p.toString());

        Aluno a = new Aluno();
        a.setNome("Alex");
        a.setIdade(25);
        a.setMatricula("20250035");

        System.out.println(a.toString());
        a.quem_sou_eu();
    }
}