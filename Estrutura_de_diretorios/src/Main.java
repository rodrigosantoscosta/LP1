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
    }
}