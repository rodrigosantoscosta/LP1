import java.util.Scanner;
public class Questao_01{
    public static void main(String[] args){
        int controle = -1;
        Scanner scanner = new Scanner(System.in);
        while(controle != 2) {
            System.out.printf("1 - Digite seu nome, idade e altura para exibir no terminal: \n" +
                    "2 - Sair do programa\n");
            controle = scanner.nextInt();
            scanner.nextLine();

            switch(controle){
                case 1:

                    System.out.println("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite sua idade: ");
                    int idade = scanner.nextInt();

                    System.out.println("Digite sua altura em metros: ");
                    double altura = scanner.nextDouble();

                    System.out.printf("Seu nome é %s, voce tem %d, e sua altura é %.2f\n metros.", nome, idade, altura);
                    break;
                case 2:
                    System.out.println("Saindo do programa!");
                    break;
            }

        }
    }
}