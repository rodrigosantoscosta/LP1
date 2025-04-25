import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor p = new Professor(30, "Bob", "Engenharia de Software");
        System.out.println("Informações do professor:");
        System.out.println(p);

        Aluno a = new Aluno(21, "Roberto", "202510035");
        System.out.println("Informações do aluno:");
        System.out.println(a);

        Disciplina d = new Disciplina();
        System.out.print("Digite o nome da disciplina: ");
        d.setNome(sc.next());
        sc.close();

        d.cadastrarAluno(a);
        d.ministrarDisciplina(p);

        System.out.println(d);

        p.setCargo(CARGO.Professor);
        System.out.println("O cargo de "+ p.getNome()+ " é " + p.getCargo());

        p.calcularSalario();
        p.aplicarBonus();

    }
}


