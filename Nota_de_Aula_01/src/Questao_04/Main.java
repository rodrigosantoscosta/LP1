package Questao_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();
        int key = 0;

        while(key != 5){
            System.out.println("1 - Consultar saldo\n" +
                    "2 - Depositar\n" +
                    "3 - Sacar\n" +
                    "4 - Transferir\n" +
                    "5 - Sair do programa ");

            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("O saldo atual é de " + c.consultaSaldo());
                    break;
                case 2 :
                    System.out.println("Digite o valor que voce quer depositar: ");
                    c.depositar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Digite o valor que voce quer sacar: ");
                    c.sacar(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Digite o valor que voce quer transferir: ");
                    c.transferir(sc.nextDouble());
                    break;
                case 5:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Digite um valor válido no menu");
            }
        }
    }
}
