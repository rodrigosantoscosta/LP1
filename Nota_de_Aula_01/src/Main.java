import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Aluno a = new Aluno();
//        System.out.println("Digite o nome do aluno: ");
//        a.setNome(sc.next());
//
//        System.out.print("Digite a primeira nota do aluno: ");
//        a.nota1 = sc.nextFloat();
//
//        System.out.print("Digite a segunda nota do aluno: ");
//        a.nota2 = sc.nextFloat();
//
//        System.out.print("Digite a terceira nota do aluno: ");
//        a.nota3 = sc.nextFloat();
//
//        System.out.println(a.calculaMedia(a.nota1,a.nota2,a.nota3));

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        Matematica m = new Matematica();

        int key = -1;

        while(key != 5){
            System.out.print("1 - Somar os dois numeros\n2 - Subtrair os dois numeros\n3 - Dividir dois numeros\n" +
                    "4 - Multiplicar os dois numeros\n 5- Sair do progama");
            int escolha = sc.nextInt();

            switch(escolha){
                case 1:
                    System.out.println("A soma dos dois numeros é: " + m.soma(num1, num2));
                    break;
                case 2:
                    System.out.println("A subtração dos dois numeros é: " + m.subtracao(num1, num2));
                    break;
                case 3:
                    System.out.println("A divisao dos dois numeros é: " + m.divisao(num1, num2));
                    break;
                case 4:
                    System.out.println("A multiplicação dos dois numeros é: " + m.multiplicacao(num1, num2));
                    break;
                case 5:
                    key = 5;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }
    }
}
