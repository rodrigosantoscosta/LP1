import java.util.Scanner;
public class Questao_02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a matricula do funcionário: ");
        String matricula = scanner.nextLine();

        System.out.println("Digite o nome completo do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário bruto do funcionário: ");
        double salario = scanner.nextDouble();

        double desconto = 0.15 * salario;
        double salario_liquido = salario - desconto;

        System.out.printf("Matrícula: %s\nNome completo: %s\nSalário bruto: %.2f\nDedução INSS: %.2f\nSalário Líquido: %.2f", matricula, nome, salario, desconto, salario_liquido);
    }
}