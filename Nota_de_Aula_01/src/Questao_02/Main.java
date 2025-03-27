package Questao_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        Matematica m = new Matematica();

        int key = -1;

        while(key != 5){
            System.out.println("""
                    1 - Somar os dois numeros
                    2 - Subtrair os dois numeros
                    3 - Dividir dois numeros
                    4 - Multiplicar os dois numeros
                    5 - Sair do programa""");

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
                    System.out.print("Saindo do programa!");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }
        sc.close();
    }
}
